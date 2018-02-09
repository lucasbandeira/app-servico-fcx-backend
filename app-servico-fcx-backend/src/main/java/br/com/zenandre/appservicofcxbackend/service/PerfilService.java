package br.com.zenandre.appservicofcxbackend.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.zenandre.appservicofcxbackend.model.Anexo;
import br.com.zenandre.appservicofcxbackend.model.Perfil;
import br.com.zenandre.appservicofcxbackend.repository.AnexoRepository;
import br.com.zenandre.appservicofcxbackend.repository.PerfilRepository;

public class PerfilService {
	
	@Autowired
	PerfilRepository repository;
	
	public void novoPerfil(Perfil perfil ) {
		repository.save(perfil);
	}
	public void alterarPerfil(Perfil perfil) {
		repository.save(perfil);
	}
	public void excluirPerfil(Perfil perfil) {
		repository.delete(perfil);
	}
	public Collection<Perfil> buscaTodosPerfis(){
		return repository.findAll();
	}
	public Perfil buscaPerfilPorId(Long id) {
		return repository.findOne(id);
	}

}
