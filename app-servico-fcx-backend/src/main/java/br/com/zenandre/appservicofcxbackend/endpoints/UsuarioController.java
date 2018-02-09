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

import br.com.zenandre.appservicofcxbackend.model.Usuario;
import br.com.zenandre.appservicofcxbackend.service.UsuarioService;

@RestController("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/lista_todos_usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Usuario>> buscaTodosUsuarios() {
		Collection<Usuario> usuarios = service.buscaTodosUsuarios();
		return new ResponseEntity<>(usuarios, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/novo_usuario", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void novoUsuario(@RequestBody Usuario usuario) {
		service.novoUsuario(usuario);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/excluir_trabalho")
	public void excluiUsuario(@RequestBody Usuario usuario) {
		service.excluirUsuario(usuario);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/alterar_trabalho", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void alterarTrabalho(@RequestBody Usuario usuario) {
		service.alterarUsuario(usuario);
	}
	
	
}
