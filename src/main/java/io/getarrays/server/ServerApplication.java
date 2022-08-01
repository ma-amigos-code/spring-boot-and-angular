package io.getarrays.server;

import io.getarrays.server.enumeration.Status;
import io.getarrays.server.model.Server;
import io.getarrays.server.repo.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository repository) {
		return args -> {
			repository.save(
				new Server(
						null,
						"192.168.1.0",
						"Ubuntu linux",
						"16 GB",
						"Personal PC",
						"http://localhost:8080/image/server1.png",
						Status.SERVER_UP
				)
			);
		};
	}

}
