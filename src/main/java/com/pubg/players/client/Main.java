package com.pubg.players.client;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.pubg.players.entity.Profile;
import com.pubg.players.service.ProfileService;

@Component
public class Main {

	@Autowired
	ProfileService service;

//	@Autowired
//	ApplicationContext applicationContext;

	public void method() {

		System.out.println("Enter Choice");
		System.out.println(
				"1:Create Player\n2:Get All Players\n3:Get Player With Highest Kills\n4:Modify The Best Players Highest Kills\n5:Delete Player\n6:Exit\n\n");
		System.out.println("Enter Choice:");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
//		System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));
		do {
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter User Name and Highest Kills");
				Profile profile = new Profile(sc.next(), sc.nextInt());
				service.createProfile(profile);
				System.out.println("Profile Created With Details :");
				break;
			}
			case 2: {
				service.getAllProfiles().forEach(i -> System.out.println(i));
				break;
			}
			case 3: {
				System.out.println(service.getProfileWithHighestKills());
				break;
			}
			case 4: {
				System.out.println("Enter User Name To Modify");
				String userName = sc.next();
				Profile profile = service.getProfileByName(userName);
				System.out.println("Enter New Kills");
				int newKills = sc.nextInt();
				profile.setHighestKills(newKills);
				service.modifyProfile(profile);
				System.out.println("Profile Modified \n Proof:-" + service.createProfile(profile));
				break;
			}
			case 5: {
				System.out.println("Enter User Name To Delete");
				String userName = sc.next();
				service.deleteProfile(userName);
				break;
			}

			default: {
				System.out.println("You Had One Job, Shame On You\n\n\n");
				System.exit(0);
				break;
			}
			}
		} while (choice != 6);
	}

}
