package br.com.zenandre.appservicofcxbackend.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.zenandre.appservicofcxbackend.model.Campanha;
import br.com.zenandre.appservicofcxbackend.model.Usuario;
import br.com.zenandre.appservicofcxbackend.repository.CampanhaRepository;

public class CampanhaService {
	
	@Autowired
	CampanhaRepository repository;
	
	public void novaCampanha(Campanha campanha) {
		repository.save(campanha);
	}
	public void alterarCampanha(Campanha campanha) {
		repository.save(campanha);
	}
	public void excluirCampanha(Campanha campanha) {
		repository.delete(campanha);
	}
	public Collection<Campanha> buscaTodasCampanhas(){
		return repository.findAll();
	}
	public Campanha buscaCampanhaPorId(Long id) {
		return repository.findOne(id);
	}

}
