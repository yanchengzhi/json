package com.ycz.gson;

import java.lang.reflect.Field;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ycz.json.pojo.Person;

public class GsonCreateSample {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("鄢承志");
		person.setAge(25);
		person.setBirth("1995-09-18");
		person.setAddress("湖北");
		person.setHas_girlfriend(false);
		person.setLike(new String[] { "唱歌", "登山", "旅行", "阅读" });
		person.setCar(null);
		person.setHouse(null);
		person.setComment("JSON中是没有注释的");
		// 实例化一个Gson对象
		/*
		 * Gson gson = new Gson(); System.out.println(gson.toJson(person).toString());
		 */

		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();//美化
		// 解析JSON时进行定制
		gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {

			@Override
			public String translateName(Field arg0) {
				if (arg0.getName().equals("name")) {//如果是小写的name，将其变为大写
					return "NAME";
				}
				return arg0.getName();
			}
		});
		Gson gson = gsonBuilder.create();// 通过GsonBuilder实例产生Gson实例
		System.out.println(gson.toJson(person).toString());

	}

}
