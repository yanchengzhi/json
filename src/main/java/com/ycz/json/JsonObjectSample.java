package com.ycz.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.ycz.json.pojo.Person;

public class JsonObjectSample {

	public static void main(String[] args) {
		JSONObjectSample();
		CreateJSONByMap();
		CreateJSONByBean();
	}

	/**
	 * 使用JSONObject来构建JSON对象
	 */
	private static void JSONObjectSample() {
		JSONObject yanchengzhi = new org.json.JSONObject();// 实例化一个JSONObject实例
		Object nullObj = null;
		try {
			yanchengzhi.put("name", "鄢承志");
			yanchengzhi.put("age", 25);
			yanchengzhi.put("birth", "1995-09-18");
			yanchengzhi.put("address", "湖北");
			yanchengzhi.put("has_girlgriend", false);
			yanchengzhi.put("like", new String[] { "唱歌", "登山", "旅行", "阅读" });
			yanchengzhi.put("car", nullObj);
			yanchengzhi.put("house", nullObj);// null会压缩掉不显示
			yanchengzhi.put("comment", "JSON中是没有注释的");
			System.out.println(yanchengzhi.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 通过Map来构建JSON对象
	 */
	private static void CreateJSONByMap() {
		Map<String, Object> yanchengzhi = new HashMap<String, Object>();
		Object nullObj = null;
		yanchengzhi.put("name", "鄢承志");
		yanchengzhi.put("age", 25);
		yanchengzhi.put("birth", "1995-09-18");
		yanchengzhi.put("address", "湖北");
		yanchengzhi.put("has_girlgriend", false);
		yanchengzhi.put("like", new String[] { "唱歌", "登山", "旅行", "阅读" });
		yanchengzhi.put("car", nullObj);
		yanchengzhi.put("house", nullObj);// null会压缩掉不显示
		yanchengzhi.put("comment", "JSON中是没有注释的");
		System.out.println(new JSONObject(yanchengzhi).toString());
	}

	/**
	 * 通过JavaBean来构建JSON对象
	 */
	private static void CreateJSONByBean() {
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
		System.out.println(new JSONObject(person));
	}

}
