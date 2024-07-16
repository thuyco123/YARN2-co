package com.opstty.reducer;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class OldestTreeDistrictReducer extends Reducer<NullWritable, MapWritable, IntWritable, IntWritable> {
    public void reduce(NullWritable key, Iterable<MapWritable> values, Context context)
            throws IOException, InterruptedException {

        ArrayList<Integer[]> district_years = (ArrayList<Integer[]>) StreamSupport.stream(values.spliterator(), false)
                .map( mw ->  (new Integer[] { ((IntWritable) mw.keySet().toArray()[0]).get(), ((IntWritable) mw.get(mw.keySet().toArray()[0])).get() }))
                .collect(Collectors.toList());
        int min_year = district_years.stream().map((arr) -> arr[1]).min(Integer::compare).get();
        district_years.stream().filter(arr -> arr[1] == min_year).map(arr -> arr[0]).distinct().forEach((district) -> { try {
            context.write(new IntWritable(min_year), new IntWritable(district));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } });
    }
}
