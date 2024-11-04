
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Departamento;
import com.example.demo.repositories.DepartamentoRepository;



@Service
public class DepartamentoService {

	private final DepartamentoRepository departamentoRepository;

	@Autowired
	public DepartamentoService(DepartamentoRepository departamentoRepository) {
		this.departamentoRepository = departamentoRepository;
	}

	public Departamento salvarDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

	public Departamento buscarDepartamentoPorId(Long id) {
		return departamentoRepository.findById(id).orElse(null);
	}

	public List<Departamento> buscarTodosDepartamentos() {
		return departamentoRepository.findAll();
	}

	public void excluirDepartamento(Long id) {
		departamentoRepository.deleteById(id);
	}
}

