package top.macondo.patterns.designpatterns.structural.filter;

import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: designpatterns
 * @description:
 * @author: Zhang Chong
 * @create: 2019/10/17 20:57
 **/
public class Java8FilterTest {

	@Test
	public void test() {
		List<Person> list = Arrays.asList(
				new Person("小伟", 22),
				new Person("xiaowu", 24),
				new Person("xiaowu", 23)
		);
		Person result1 = list.stream()
				.filter(p -> "xiaowu".equals(p.getName()))
				.findAny()
				.orElse(null);
		System.out.println(result1);

		List<Person> list1 = list.stream()
				.filter(line -> "xiaowu".equals(line.getName()))
				.collect(Collectors.toList());
		list1.forEach(System.out::println);


	}

	@Data
	class Person {

		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
}
