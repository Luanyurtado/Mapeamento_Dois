
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;



@Service
public class FuncionarioService {

	private final FuncionarioRepository funcionarioRepository;

	@Autowired
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}

	public Funcionario salvarFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	public Funcionario buscarFuncionarioPorId(Long id) {
		return funcionarioRepository.findById(id).orElse(null);
	}

	public List<Funcionario> buscarTodosFuncionarios() {
		return funcionarioRepository.findAll();
	}

	public void excluirFuncionario(Long id) {
		funcionarioRepository.deleteById(id);
	}
}

