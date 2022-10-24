package basic.core;

import basic.core.member.Grade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CoreApplication.class, args);
		Grade g = Grade.valueOf("VIP");
		System.out.println(g);
	}

}
