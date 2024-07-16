# hadoop-examples-mapreduce


# Hadoop MapReduce Examples

This repository contains examples of MapReduce jobs implemented in Java for processing data with Apache Hadoop. 

## Table of Contents

- [Overview](#overview)
- [Requirements](#requirements)
- [Setup](#setup)
- [Upload the dataset to HDFS](#upload-the-dataset-to-hdfs)
- [Running the Jobs](#running-the-jobs)
- [Results](#results)

## Overview

This project demonstrates several MapReduce jobs including:
- Listing distinct districts containing trees
- Showing all existing species
- Counting the number of trees by kind
- Calculating the maximum height per kind of tree

## Requirements

- Java 8
- Apache Hadoop 3.x
- Maven 3.x
- Git


## Upload the dataset to HDFS

Ensure you have the dataset `trees.csv` in your local directory. Then, upload it to HDFS in FileZilla

## Running the jobs
# Hadoop MapReduce Examples

This repository contains examples of MapReduce jobs implemented in Java for processing data with Apache Hadoop.

## Running the Jobs

### Districts Containing Trees

This job lists distinct districts that contain trees.

1. **Run the job:**

   ```sh
   yarn jar /home/<username>/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar com.opstty.job.District /user/<username>/trees/trees.csv /user/<username>/output_districts
   ```

2. **Check the output:**

   ```sh
   hdfs dfs -cat /user/<username>/output_districts/part-r-00000
   ```

### Existing Species

This job displays the list of different species trees in the file.

1. **Run the job:**

   ```sh
   yarn jar /home/<username>/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar com.opstty.job.Species /user/<username>/trees/trees.csv /user/<username>/output_species
   ```

2. **Check the output:**

   ```sh
   hdfs dfs -cat /user/<username>/output_species/part-r-00000
   ```

### Number of Trees by Kind

This job calculates the number of trees of each kind.

1. **Run the job:**

   ```sh
   yarn jar /home/<username>/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar com.opstty.job.Treeskind /user/<username>/trees/trees.csv /user/<username>/output_treeskind
   ```

2. **Check the output:**

   ```sh
   hdfs dfs -cat /user/<username>/output_treeskind/part-r-00000
   ```

### Maximum Height per Kind of Tree

This job calculates the height of the tallest tree of each kind.

1. **Run the job:**

   ```sh
   yarn jar /home/<username>/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar com.opstty.job.Maxheightkind /user/<username>/trees/trees.csv /user/<username>/output_maxheight
   ```

2. **Check the output:**

   ```sh
   hdfs dfs -cat /user/<username>/output_maxheight/part-r-00000
   ```

## Results
Here's the provided text formatted in Markdown with instructions and details on how to run the jobs and show the results:

```markdown
## Execution of MapReduce Jobs and Results

### WordCount Job

#### Command
```bash
yarn jar /home/thuylinh.co/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar wordcount /user/thuylinh.co/input /user/thuylinh.co/output_dir2
```

#### Result
```bash
[thuylinh.co@bigdata01 ~]$ hadoop fs -cat /user/thuylinh.co/output_dir2/part-r-00000  
plant.  1
plantain 1
plants, 1
plate.  1
plats 1
play 6
play, 1
play.  1
playing 1
plays 1
plays, 1
pleading 1
pleasant 1
please 3
please; 1
pleasure 2
pleasure! 1
pleasure, 1
pleasure; 1
pluck 2
plucks 1
point 2
point! 1
point, 1
point.  1
points, 1
poison 7
poison, 5
pois’d 1
pomegranate 1
poor 11
poor, 1
poor. 1
poperin 1
portentous 1
porter 1
portly 1
possess, 1
possessed 1
possession. 1
possess’d 1
possess’d, 1
post 2
post-horses. 1
posted 4
posterity. 1
potion, 1
potion’s 1
pots, 1
poultice 1
poverty, 2
powder 2
```

### District Job

#### Command
```bash
yarn jar /home/thuylinh.co/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar district /user/thuylinh.co/trees.csv /user/thuylinh.co/districtoutput1
```

#### Result
```bash
[thuylinh.co@bigdata01 ~]$ hdfs dfs -cat /user/thuylinh.co/districtoutput1/part-r-00000
3       1
4       1
5       2
6       1
7       3
8       5
9       1
11      1
12      29
13      2
14      3
15      1
16      36
17      1
18      1
19      6
20      3
```

### Species Job

#### Command
```bash
yarn jar /home/thuylinh.co/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar species /user/thuylinh.co/trees.csv /user/thuylinh.co/species_output1
```

#### Result
```bash
[thuylinh.co@bigdata01 ~]$ hdfs dfs -cat /user/thuylinh.co/species_output1/part-r-00000
araucana
atlantica
australis
baccata
bignonioides
biloba
bungeana
cappadocicum
carpinifolia
colurna
coulteri
decurrens
dioicus
distichum
excelsior
fraxinifolia
giganteum
giraldii
glutinosa
grandiflora
hippocastanum
ilex
involucrata
japonicum
kaki
libanii
monspessulanum
nigra
nigra laricio
opalus
orientalis
papyrifera
petraea
pomifera
pseudoacacia
sempervirens
serrata
stenoptera
suber
sylvatica
tomentosa
tulipifera
ulmoides
virginiana
x acerifolia
```

### TreesKind Job

#### Command
```bash
yarn jar /home/thuylinh.co/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar treeskind /user/thuylinh.co/trees.csv /user/thuylinh.co/treeskind_output
```

#### Result
```bash
[thuylinh.co@bigdata01 ~]$ hdfs dfs -cat /user/thuylinh.co/treeskind_output/part-r-00000
araucana 1
atlantica 4
australis 8
baccata 14
bignonioides 21
biloba 33
bungeana 46
cappadocicum 60
carpinifolia 78
colurna 99
coulteri 121
decurrens 144
dioicus 168
distichum 195
excelsior 223
fraxinifolia 253
giganteum 288
giraldii 324
glutinosa 361
grandiflora 399
hippocastanum 440
ilex 482
involucrata 525
japonicum 569
kaki 615
libanii 663
monspessulanum 712
nigra 764
nigra laricio 817
opalus 871
orientalis 933
papyrifera 996
petraea 1061
pomifera 1127
pseudoacacia 1194
sempervirens 1262
serrata 1331
stenoptera 1401
suber 1472
sylvatica 1551
tomentosa 1632
tulipifera 1715
ulmoides 1799
virginiana 1885
x acerifolia 1982
```

### MaxHeightKind Job

#### Command
```bash
yarn jar /home/thuylinh.co/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar maxheightkind /user/thuylinh.co/trees.csv /user/thuylinh.co/maxheightkind_output
```

#### Result
```bash
[thuylinh.co@bigdata01 ~]$ hdfs dfs -cat /user/thuylinh.co/maxheightkind_output/part-r-00000
araucana 9.0
atlantica 25.0
australis 16.0
baccata 13.0
bignonioides 15.0
biloba 33.0
bungeana 10.0
cappadocicum 16.0
carpinifolia 30.0
colurna 20.0
coulteri 14.0
decurrens 20.0
dioicus 10.0
distichum 35.0
excelsior 30.0
fraxinifolia 27.0
giganteum 35.0
giraldii 35.0
glutinosa 16.0
grandiflora 12.0
hippocastanum 30.0
ilex 15.0
involucrata 12.0
japonicum 10.0
kaki 14.0
libanii 30.0
monspessulanum 12.0
nigra 30.0
nigra laricio 30.0
opalus 15.0
orientalis 34.0
papyrifera 12.0
petraea 31.0
pomifera 13.0
pseudoacacia 11.0
sempervirens 30.0
serrata 18.0
stenoptera 30.0
suber 10.0
sylvatica 30.0
tomentosa 20.0
tulipifera 35.0
ulmoides 12.0
virginiana 14.0
x acerifolia 45.0
```

### SortTrees Job

#### Command
```bash
yarn jar /home/thuylinh.co/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar sortTrees /user/thuylinh.co/trees.csv /user/thuylinh.co/sorttrees_output
```

#### Result
```bash
[thuylinh.co@bigdata01 ~]$ hdfs dfs -cat /user/thuylinh.co/sorttrees_output/part-r-00000
3 - Fagus sylvatica (Fagaceae) 2.0
89 - Taxus baccata (Taxaceae) 5.0
62 - Cedrus atlantica (Pinaceae) 6.0
39 - Araucaria araucana (Araucariaceae) 9.0
44 - Styphnolobium japonicum (Fabaceae) 10.0
32 - Quercus suber (Fagaceae) 10.0
95 - Pinus bungeana (Pinaceae) 10.0
61 - Gymnocladus dioicus (Fabaceae) 10.0
63 - Fagus sylvatica (Fagaceae) 10.0
4 - Robinia pseudoacacia (Fabaceae)

 11.0
93 - Diospyros virginiana (Ebenaceae) 12.0
66 - Magnolia grandiflora (Magnoliaceae) 12.0
50 - Zelkova carpinifolia (Ulmaceae) 12.0
7 - Eucommia ulmoides (Eucomiaceae) 12.0
48 - Acer monspessulanum (Sapindacaees) 12.0
58 - Diospyros kaki (Ebenaceae) 12.0
33 - Broussonetia papyrifera (Moraceae) 12.0
71 - Davidia involucrata (Cornaceae) 12.0
36 - Taxus baccata (Taxaceae) 13.0
6 - Maclura pomifera (Moraceae) 13.0
68 - Diospyros kaki (Ebenaceae) 14.0
96 - Pinus coulteri (Pinaceae) 14.0
94 - Diospyros virginiana (Ebenaceae) 14.0
91 - Acer opalus (Sapindaceae) 15.0
5 - Catalpa bignonioides (Bignoniaceae) 15.0
70 - Fagus sylvatica (Fagaceae) 15.0
2 - Ulmus carpinifolia (Ulmaceae) 15.0
98 - Quercus ilex (Fagaceae) 15.0
28 - Alnus glutinosa (Betulaceae) 16.0
78 - Acer cappadocicum (Sapindaceae) 16.0
75 - Zelkova carpinifolia (Ulmaceae) 16.0
16 - Celtis australis (Cannabaceae) 16.0
64 - Ginkgo biloba (Ginkgoaceae) 18.0
83 - Zelkova serrata (Ulmaceae) 18.0
23 - Aesculus hippocastanum (Sapindaceae) 18.0
60 - Fagus sylvatica (Fagaceae) 18.0
34 - Corylus colurna (Betulaceae) 20.0
51 - Platanus x acerifolia (Platanaceae) 20.0
43 - Tilia tomentosa (Malvaceae) 20.0
15 - Corylus colurna (Betulaceae) 20.0
11 - Calocedrus decurrens (Cupressaceae) 20.0
1 - Corylus colurna (Betulaceae) 20.0
8 - Platanus orientalis (Platanaceae) 20.0
20 - Fagus sylvatica (Fagaceae) 20.0
35 - Paulownia tomentosa (Paulowniaceae) 20.0
12 - Sequoiadendron giganteum (Taxodiaceae) 20.0
87 - Taxodium distichum (Taxodiaceae) 20.0
13 - Platanus orientalis (Platanaceae) 20.0
10 - Ginkgo biloba (Ginkgoaceae) 22.0
47 - Aesculus hippocastanum (Sapindaceae) 22.0
86 - Platanus orientalis (Platanaceae) 22.0
14 - Pterocarya fraxinifolia (Juglandaceae) 22.0
88 - Liriodendron tulipifera (Magnoliaceae) 22.0
18 - Fagus sylvatica (Fagaceae) 23.0
24 - Cedrus atlantica (Pinaceae) 25.0
31 - Ginkgo biloba (Ginkgoaceae) 25.0
92 - Platanus x acerifolia (Platanaceae) 25.0
49 - Platanus orientalis (Platanaceae) 25.0
97 - Pinus nigra (Pinaceae) 25.0
84 - Ginkgo biloba (Ginkgoaceae) 25.0
73 - Platanus orientalis (Platanaceae) 26.0
65 - Pterocarya fraxinifolia (Juglandaceae) 27.0
42 - Platanus orientalis (Platanaceae) 27.0
85 - Juglans nigra (Juglandaceae) 28.0
76 - Pinus nigra laricio (Pinaceae) 30.0
19 - Quercus petraea (Fagaceae) 30.0
72 - Sequoiadendron giganteum (Taxodiaceae) 30.0
54 - Pterocarya stenoptera (Juglandaceae) 30.0
29 - Zelkova carpinifolia (Ulmaceae) 30.0
27 - Sequoia sempervirens (Taxodiaceae) 30.0
25 - Fagus sylvatica (Fagaceae) 30.0
41 - Platanus x acerifolia (Platanaceae) 30.0
77 - Taxodium distichum (Taxodiaceae) 30.0
55 - Platanus x acerifolia (Platanaceae) 30.0
69 - Pinus nigra (Pinaceae) 30.0
38 - Fagus sylvatica (Fagaceae) 30.0
59 - Sequoiadendron giganteum (Taxodiaceae) 30.0
52 - Fraxinus excelsior (Oleaceae) 30.0
37 - Cedrus libanii (Pinaceae) 30.0
22 - Cedrus libanii (Pinaceae) 30.0
30 - Aesculus hippocastanum (Sapindaceae) 30.0
80 - Quercus petraea (Fagaceae) 31.0
9 - Platanus orientalis (Platanaceae) 31.0
82 - Platanus x acerifolia (Platanaceae) 32.0
46 - Ginkgo biloba (Ginkgoaceae) 33.0
45 - Platanus orientalis (Platanaceae) 34.0
56 - Taxodium distichum (Taxodiaceae) 35.0
81 - Liriodendron tulipifera (Magnoliaceae) 35.0
17 - Platanus x acerifolia (Platanaceae) 35.0
53 - Ailanthus giraldii (Simaroubaceae) 35.0
57 - Sequoiadendron giganteum (Taxodiaceae) 35.0
26 - Platanus x acerifolia (Platanaceae) 40.0
74 - Platanus x acerifolia (Platanaceae) 40.0
40 - Platanus x acerifolia (Platanaceae) 40.0
90 - Platanus x acerifolia (Platanaceae) 42.0
21 - Platanus x acerifolia (Platanaceae) 45.0
```

### OldestTreeDistrict Job

#### Command
```bash
yarn jar /home/thuylinh.co/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar oldestTreeDistrict /user/thuylinh.co/trees.csv /user/thuylinh.co/oldesttreedistrict_output
```

#### Result
```bash
[thuylinh.co@bigdata01 ~]$ hdfs dfs -cat /user/thuylinh.co/oldesttreedistrict_output/part-r-00000
1601 5
```

### MaxTreesDistrict Job

#### Command
```bash
yarn jar /home/thuylinh.co/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar districtmaxtrees /user/thuylinh.co/trees.csv /user/thuylinh.co/maxtreesdistrict_output
```

#### Result
```bash
[thuylinh.co@bigdata01 ~]$ hdfs dfs -cat /user/thuylinh.co/maxtreesdistrict_output/part-r-00000
16 36
```
```

