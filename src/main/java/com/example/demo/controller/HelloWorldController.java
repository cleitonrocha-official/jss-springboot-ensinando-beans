package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

	private final UsuarioRepository usuarioRepository;
	
	@GetMapping
	public String inciando() {
		return usuarioRepository.findAll();
	}
	
}