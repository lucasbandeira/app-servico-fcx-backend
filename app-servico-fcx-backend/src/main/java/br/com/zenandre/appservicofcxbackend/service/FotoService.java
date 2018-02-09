package br.com.zenandre.appservicofcxbackend.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.zenandre.appservicofcxbackend.model.Foto;
import br.com.zenandre.appservicofcxbackend.repository.FotoRepository;

public class FotoService {
	
	@Autowired
	FotoRepository repository;
	
	public void novaFoto(Foto foto) {
		repository.save(foto);
	}
	public void alterarFoto(Foto foto) {
		repository.save(foto);
	}
	public void excluirFoto(Foto foto) {
		repository.delete(foto);
	}
	public Collection<Foto> buscaTodosUsuarios(){
		return repository.findAll();
	}
	public Foto buscaUsuarioPorId(Long id) {
		return repository.findOne(id);
	}

}
