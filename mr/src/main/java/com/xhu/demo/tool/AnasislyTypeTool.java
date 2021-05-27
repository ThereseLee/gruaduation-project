package com.xhu.demo.tool;

import com.xhu.demo.format.MySQLTextOutputFormat;
import com.xhu.demo.mapper.AnasislyTypeMapper;
import com.xhu.demo.reducer.AnasislyTypeReducer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

/**
 * Created by Administrator on 2019/3/27.
 */
public class AnasislyTypeTool {

    public static void main(String[] args) throws Exception {

        //args = new String[]{"E:\\input\\demoinput\\hello.txt"};
        Configuration conf = new Configuration();
        //获取job对象
        Job job = Job.getInstance(conf);

        //设置jar包
        job.setJarByClass(AnasislyTypeTool.class);

        //关联mapper和reducer
        job.setMapperClass(AnasislyTypeMapper.class);
        job.setReducerClass(AnasislyTypeReducer.class);

        //设置map输出数据类型
        job.setMapOutputKeyClass(IntWritable.class);
        job.setMapOutputValueClass(IntWritable.class);

        //设置最终输出数据类型kv
        job.setOutputKeyClass(IntWritable.class);
        job.setOutputValueClass(IntWritable.class);

        //outputformat      输出到mysql中，自定义输出类
        job.setOutputFormatClass(MySQLTextOutputFormat.class);

        //添加mysql驱动到类路径下
        //job.addArchiveToClassPath(new Path("/lib/mysql/mysql-connector-java-5.1.27-bin.jar"));

        //设置输入输出文件路径
        FileInputFormat.setInputPaths(job, new Path(args[0]));
        //因为要输出到mysql中所以不用配置输出路径
        //FileOutputFormat.setOutputPath(job, new Path(args[1]));

        //提交到yarn集群
        job.waitForCompletion(true);
    }
}
