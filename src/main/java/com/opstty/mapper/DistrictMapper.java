package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class DistrictMapper extends Mapper<Object, Text, Text, NullWritable> {
    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {
        int c = 0;
        if (c != 0){
            context.write(new Text(value.toString().split(";")[1]), NullWritable.get());
        }
        c++;
    }
}
