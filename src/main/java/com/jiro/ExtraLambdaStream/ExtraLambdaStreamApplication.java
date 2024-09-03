package com.jiro.ExtraLambdaStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExtraLambdaStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtraLambdaStreamApplication.class, args);
		Walkable obj=(steps,isEnabled)->{
			System.out.println("Walking fast "+steps +" steps.");
			return 2+steps;
		};
		Walkable obj2=(steps,isEnabled)->2+steps;
		obj.walk(4,true);
		System.out.println(obj2.walk(4,true));
	}

}

interface Walkable{
	int walk(int steps,boolean isEnabled);
}

