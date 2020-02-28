package com.ycz.gson;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ycz.json.pojo.Person;

public class GsonReadSample {

	public static void main(String[] args) throws IOException {
		// 获取文件路径
		File file = new File(GsonReadSample.class.getResource("/yanchengzhi.json").getFile());
		String content = FileUtils.readFileToString(file);
//		Gson gson = new Gson();
//		Person per = gson.fromJson(content, Person.class);// 转换成实体bean
//		System.out.println("姓名：" + per.getName() + "\n" + "年龄：" + per.getAge() + "\n" + "地址：" + per.getAddress());
		// 进行日期格式转换
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		Person per = gson.fromJson(content, Person.class);
		System.out.println("生日：" + per.getBirthday().toLocaleString());
		// 获取集合
		System.out.println("特征：" + per.getFeatrue());
		System.out.println("类型：" + per.getFeatrue().getClass());
		System.out.println("喜欢的人：" + per.getLove());
		System.out.println("类型：" + per.getLove().getClass());
	}

}
