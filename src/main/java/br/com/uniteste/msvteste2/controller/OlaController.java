package br.com.uniteste.msvteste2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OlaController {

	@GetMapping
	public ResponseEntity<String> ola(){
		return ResponseEntity.ok("Olá, né que esse trem funciona");
	}
}
