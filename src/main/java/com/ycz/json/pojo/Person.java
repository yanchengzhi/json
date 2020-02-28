package com.ycz.json.pojo;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Person {
	
//	@SerializedName("name")//注解在属性前面，用于改名
	private String name;
	private Integer age;
	private String birth;
	private String address;
	private transient Boolean has_girlfriend;//解析时该属性字段隐藏，不会暴露给用户
	private String[] like;
	private Object car;
	private Object house;
	private String comment;
	private Date birthday;
	private List<String> featrue;
	private Set<String> love;
	
	public Set<String> getLove() {
		return love;
	}
	public void setLove(Set<String> love) {
		this.love = love;
	}
	public List<String> getFeatrue() {
		return featrue;
	}
	public void setFeatrue(List<String> featrue) {
		this.featrue = featrue;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getHas_girlfriend() {
		return has_girlfriend;
	}
	public void setHas_girlfriend(Boolean has_girlfriend) {
		this.has_girlfriend = has_girlfriend;
	}

	public String[] getLike() {
		return like;
	}
	public void setLike(String[] like) {
		this.like = like;
	}
	public Object getCar() {
		return car;
	}
	public void setCar(Object car) {
		this.car = car;
	}
	public Object getHouse() {
		return house;
	}
	public void setHouse(Object house) {
		this.house = house;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	

}
