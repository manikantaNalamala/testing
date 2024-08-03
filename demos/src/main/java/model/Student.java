package model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "kas")
public class Student {

	private int id;
	private String name;
	private int age;
	private String gender;
	private List<String> friends;

	public Student(int id, String name, int age, String gender, List<String> friends) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.friends = friends;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", friends=" + friends
				+ "]";
	}

}
