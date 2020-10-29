package br.com.nossobancodigital.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ContaPFController {
	
	@Autowired
	@GetMapping("/clientes")
	public String listaClientes() {
		return "Ainda não implementado";
	}
}
