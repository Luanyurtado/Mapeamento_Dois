package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Funcionario;
import com.example.demo.services.FuncionarioService;


@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {

	private final FuncionarioService funcionarioService;

	@Autowired
	public FuncionarioController(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}
	
	@PostMapping("/criar")
	public Funcionario salvar(@RequestBody Funcionario funcionario) {
		return funcionarioService.salvarFuncionario(funcionario);
	}


	@GetMapping
	public List<Funcionario> buscarTodos() {
		return funcionarioService.buscarTodosFuncionarios();
	}

	@GetMapping("/{id}")
	public Funcionario buscarPorId(@PathVariable Long id) {
		return funcionarioService.buscarFuncionarioPorId(id);
	}
}
