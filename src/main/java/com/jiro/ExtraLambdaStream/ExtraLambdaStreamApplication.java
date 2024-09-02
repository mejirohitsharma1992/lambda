package com.jiro.ExtraLambdaStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExtraLambdaStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtraLambdaStreamApplication.class, args);
		Walkable obj=new WalkFast();
		obj.walk(4);
	}

}
interface Walkable{
	int walk(int steps);
}
class WalkFast implements Walkable{

	@Override
	public int walk(int steps) {
		System.out.println("Walking fast "+steps +" steps.");
		return 2+steps;
	}
}
