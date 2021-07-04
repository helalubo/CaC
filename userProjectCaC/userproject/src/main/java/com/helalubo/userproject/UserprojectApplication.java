package com.helalubo.userproject;

import java.util.Scanner;

//clases
import com.helalubo.userproject.mook.user.domain.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ok");

		User user = new User();

		Scanner scanner = new Scanner(System.in);
		System.out.println("introduce your First name:");
		user.setFirstName(scanner.nextLine());
		System.out.println("introduce your Last name:");
		user.setLastName(scanner.nextLine());
		System.out.println("How old are you?");
		user.setAge(Integer.parseInt(scanner.nextLine()));
		System.out.println("what about your hobbies?:");
		user.setHobbie(scanner.nextLine());
		System.out.println("introduce your favorite IDE:");
		user.setFavoriteIDE(scanner.nextLine());
		System.out.println("introduce your opering system:");
		user.setOS(scanner.nextLine());
		scanner.close();
		System.out.println(user.toString());

		System.exit(0);
	}

}
