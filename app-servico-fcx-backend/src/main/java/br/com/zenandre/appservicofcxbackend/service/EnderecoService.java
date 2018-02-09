package br.com.zenandre.appservicofcxbackend.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.zenandre.appservicofcxbackend.model.Endereco;
import br.com.zenandre.appservicofcxbackend.repository.EnderecoRepository;

public class EnderecoService {

	
	@Autowired
	EnderecoRepository repository;
	
	public void novoEndereco(Endereco endereco) {
		repository.save(endereco);
	}
	public void alterarEndereco(Endereco endereco) {
		repository.save(endereco);
	}
	public void excluirEndereco(Endereco endereco) {
		repository.delete(endereco);
	}
	public Collection<Endereco> buscaTodosEnderecos(){
		return repository.findAll();
	}
	public Endereco buscaEnderecoPorId(Long id) {
		return repository.findOne(id);
	}
}
