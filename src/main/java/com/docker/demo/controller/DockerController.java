package com.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/test")
	public String getDockerInfo() {
		return "Docker is Runnig- rev1 16:21";
	}
}
