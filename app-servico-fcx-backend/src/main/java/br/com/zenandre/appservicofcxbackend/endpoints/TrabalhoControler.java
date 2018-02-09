package br.com.zenandre.appservicofcxbackend.endpoints;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.zenandre.appservicofcxbackend.model.Trabalho;
import br.com.zenandre.appservicofcxbackend.repository.TrabalhoRepository;
import br.com.zenandre.appservicofcxbackend.service.TrabalhoService;

@RestController
public class TrabalhoControler {
	
	@Autowired
	TrabalhoService service;

	@RequestMapping(method = RequestMethod.GET, value = "/lista_todos_trabalhos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Trabalho>> listaTodos() {
		Collection<Trabalho> listaDeTrabalhos = service.buscarTodosTrabalhos();
		return new ResponseEntity<>(listaDeTrabalhos, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/novo_trabalho", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void novoTrabalho(@RequestBody Trabalho trabalho) {

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deleta_trabalho/{id}")
	public void deleteTrabalho(@PathVariable Integer id) {

	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/novo_trabalho", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void alterarTrabalho(@RequestBody Trabalho trabalho) {

	}
	
}
