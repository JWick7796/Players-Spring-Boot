package com.pubg.players;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.pubg.players.client.Main;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class PlayersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayersApplication.class, args);
		Main main = new Main();
		main.method();
	}

}
