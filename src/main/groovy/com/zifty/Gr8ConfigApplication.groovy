package com.zifty

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.ConfigServerApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class Gr8ConfigApplication {

	static void main(String[] args) {
		SpringApplication.run Gr8ConfigApplication, args
	}
}
