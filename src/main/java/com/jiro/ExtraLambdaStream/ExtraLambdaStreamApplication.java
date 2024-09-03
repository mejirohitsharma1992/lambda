package com.jiro.ExtraLambdaStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ExtraLambdaStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtraLambdaStreamApplication.class, args);
//		Walkable obj=(steps,isEnabled)->{
//			System.out.println("Walking fast "+steps +" steps.");
//			return 2+steps;
//		};
//		Walkable obj2=(steps,isEnabled)->2+steps;
//		obj.walk(4,true);
//		System.out.println(obj2.walk(4,true));
		List<String> fruits=List.of("Apple","Orange","Banana");
		Map<String,Integer> fruitsList=fruits.stream()
//				.map(fruit->fruit.length())
				.collect(Collectors.toMap(
						fruit->fruit,
                        String::length
				));
		System.out.println(fruitsList);

		Stream<String>stream=fruits.stream();
//		stream.forEach((fruit)->{
//			System.out.println(fruit);
//		});
//		stream.sorted().forEach(fruit-> System.out.println(fruit));
	stream
			.filter(fruit->fruit.length()<6)
			.sorted()
			.map(String::length)
//			.map(fruitLength->2+fruitLength)
			.forEach(System.out::println);

	}

}

interface Walkable{
	int walk(int steps,boolean isEnabled);
}

