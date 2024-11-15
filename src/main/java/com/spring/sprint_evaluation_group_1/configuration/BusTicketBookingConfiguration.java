package com.spring.sprint_evaluation_group_1.configuration;

import java.util.List;



import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;



import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Contact;

import io.swagger.v3.oas.models.info.Info;

import io.swagger.v3.oas.models.info.License;

import io.swagger.v3.oas.models.servers.Server;


@Configuration

public class BusTicketBookingConfiguration 

{
		@Bean //managed by spring container
		public OpenAPI BusMicroserviceOpenAPI() {
			Server localhost = new Server();
			localhost.setUrl("http://localhost:7080");
			localhost.setDescription("Development environment");
			Contact contact = new Contact();

			contact.setEmail("busticketbookingportal@ty.in");

			contact.setName("Bus Ticket Booking Portal ");

			contact.setUrl("https://busticketbookingportal.in");

			License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");
			Info info = new Info().title("Bus Ticket Booking Portal documentation").version("1.0").contact(contact)

					.description("This API exposes endpoints to manage UserApp.")

					.termsOfService("https://userapp.in/terms").license(mitLicense);
			return new OpenAPI().info(info).servers(List.of(localhost));
		}
	}