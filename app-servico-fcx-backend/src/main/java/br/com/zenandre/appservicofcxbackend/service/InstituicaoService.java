package br.com.zenandre.appservicofcxbackend.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.zenandre.appservicofcxbackend.model.Instituicao;
import br.com.zenandre.appservicofcxbackend.repository.InstituicaoRepository;

public class InstituicaoService {
	
	@Autowired
	InstituicaoRepository repository;
	
	public void novaInstituicao(Instituicao instituicao) {
		repository.save(instituicao);
	}
	public void alterarInstituicao(Instituicao instituicao) {
		repository.save(instituicao);
	}
	public void excluirInstituicao(Instituicao instituicao) {
		repository.delete(instituicao);
	}
	public Collection<Instituicao> buscaTodasInstituicoes(){
		return repository.findAll();
	}
	public Instituicao buscaInstituicaoPorId(Long id) {
		return repository.findOne(id);
	}

}
