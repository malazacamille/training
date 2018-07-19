package idv.camille;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private static String name;
	private static int age;
	private static List<String> info = new ArrayList<String>();
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Person.name = name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Person.age = age;
	}
}
