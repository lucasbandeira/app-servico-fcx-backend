package br.com.zenandre.appservicofcxbackend.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.zenandre.appservicofcxbackend.model.Trabalho;
import br.com.zenandre.appservicofcxbackend.repository.TrabalhoRepository;

public class TrabalhoService {
	@Autowired
	TrabalhoRepository repository;
	
	public void novoTrabalho(Trabalho trabalho) {
		repository.save(trabalho);
	}

	public Collection<Trabalho> buscarTodosTrabalhos(){
		return repository.findAll();
	}
	
	public void deletarTrabalho(Trabalho trabalho) {
		repository.delete(trabalho);
	}
	
	public Trabalho buscarPorId(Integer id) {
		return repository.findOne(id);
	}
	
	public void alterarTrabalho(Trabalho trabalho) {
		repository.save(trabalho);
	}
	
}
