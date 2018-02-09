package br.com.zenandre.appservicofcxbackend.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.zenandre.appservicofcxbackend.model.Anexo;
import br.com.zenandre.appservicofcxbackend.model.Funcionalidade;
import br.com.zenandre.appservicofcxbackend.repository.AnexoRepository;
import br.com.zenandre.appservicofcxbackend.repository.FuncionalidadeRepository;

public class FuncionalidadeService {
	
	@Autowired
	FuncionalidadeRepository repository;
	
	public void novaFuncionalidade(Funcionalidade funcionalidade) {
		repository.save(funcionalidade);
	}
	public void alterarFuncionalidade(Funcionalidade funcionalidade) {
		repository.save(funcionalidade);
	}
	public void excluirFuncionalidade(Funcionalidade funcionalidade) {
		repository.delete(funcionalidade);
	}
	public Collection<Funcionalidade> buscaTodasFuncionalidades(){
		return repository.findAll();
	}
	public Funcionalidade buscaFuncionalidadePorId(Long id) {
		return repository.findOne(id);
	}

}
