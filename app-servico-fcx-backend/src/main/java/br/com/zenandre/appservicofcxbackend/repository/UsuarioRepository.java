package br.com.zenandre.appservicofcxbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zenandre.appservicofcxbackend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
