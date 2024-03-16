package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.config.ConexaoBancoConfig;

import lombok.extern.slf4j.Slf4j;

@Component 
@Slf4j
public class UsuarioRepository {

	@Autowired
	private  ConexaoBancoConfig conexao;
	
	public UsuarioRepository() {
		log.info("Iniciando o bean");
		
	}

	public String findAll() {
		return "Clieton,Erick url = " + conexao.getUrl();
	}
	
	
	
}
