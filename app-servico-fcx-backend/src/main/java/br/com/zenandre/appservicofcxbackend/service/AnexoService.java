package br.com.zenandre.appservicofcxbackend.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.zenandre.appservicofcxbackend.model.Anexo;
import br.com.zenandre.appservicofcxbackend.model.Foto;
import br.com.zenandre.appservicofcxbackend.repository.AnexoRepository;
import br.com.zenandre.appservicofcxbackend.repository.FotoRepository;

public class AnexoService {
	
	@Autowired
	AnexoRepository repository;
	
	public void novoAnexo(Anexo anexo) {
		repository.save(anexo);
	}
	public void alterarAnexo(Anexo anexo) {
		repository.save(anexo);
	}
	public void excluirAnexo(Anexo anexo) {
		repository.delete(anexo);
	}
	public Collection<Anexo> buscaTodosAnexos(){
		return repository.findAll();
	}
	public Anexo buscaAnexoPorId(Long id) {
		return repository.findOne(id);
	}

}
