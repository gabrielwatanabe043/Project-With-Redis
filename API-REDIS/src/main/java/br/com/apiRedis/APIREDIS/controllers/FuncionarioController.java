package br.com.apiRedis.APIREDIS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiRedis.APIREDIS.models.Funcionario;
import br.com.apiRedis.APIREDIS.repository.FuncionarioRepository;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository repository;

	@PostMapping("/criarfuncionario")
	@Operation(summary = "Cria funcionário")
	public ResponseEntity<Funcionario> criarFuncionario(@RequestBody Funcionario funcionario) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(funcionario));
	}
	@GetMapping
	@Operation(summary = "Busca funcionário")
	public ResponseEntity<Iterable<Funcionario>> buscarFuncionarios(){
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}
}
