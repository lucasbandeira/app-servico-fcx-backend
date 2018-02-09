package br.com.zenandre.appservicofcxbackend.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.zenandre.appservicofcxbackend.model.Usuario;
import br.com.zenandre.appservicofcxbackend.repository.UsuarioRepository;

public class UsuarioService {
	
	@Autowired
	UsuarioRepository repository;
	
	public void novoUsuario(Usuario usuario) {
		repository.save(usuario);
	}
	public void alterarUsuario(Usuario usuario) {
		repository.save(usuario);
	}
	public void excluirUsuario(Usuario usuario) {
		repository.delete(usuario);
	}
	public Collection<Usuario> buscaTodosUsuarios(){
		return repository.findAll();
	}
	public Usuario buscaUsuarioPorId(Long id) {
		return repository.findOne(id);
	}
	
}
