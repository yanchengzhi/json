package com.ycz.json;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJSONSample {

	public static void main(String[] args) throws IOException {
		// 先获取路径
		File file = new File(ReadJSONSample.class.getResource("/yanchengzhi.json").getFile());
		// 获取文件内容
		String content = FileUtils.readFileToString(file);
		JSONObject jsonObj = new JSONObject(content);// 基于内容实例化一个JSONObject对象
		System.out.println("姓名：" + jsonObj.getString("name"));
		System.out.println("年龄：" + jsonObj.getInt("age"));
		System.out.println("生日：" + jsonObj.getString("birth"));
		System.out.println("地址：" + jsonObj.getString("address"));
		System.out.println("有没有女朋友？" + jsonObj.getBoolean("has_girlfriend"));
		JSONArray likeArray = jsonObj.getJSONArray("like");
		for (int i = 0; i < likeArray.length(); i++) {
			String m = (String) likeArray.get(i);
			System.out.println("爱好" + (i + 1) + ":" + m);
		}
		//判断字段是否为空
		if(!jsonObj.isNull("car")) {
			System.out.println("有车吗？"+":"+jsonObj.getString("car"));
		}
		if(!jsonObj.isNull("house")) {
			System.out.println("有房子吗？"+":"+jsonObj.getString("house"));
		}
	}

}
