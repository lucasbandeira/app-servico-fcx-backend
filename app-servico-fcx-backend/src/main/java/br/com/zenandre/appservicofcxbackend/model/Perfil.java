package br.com.zenandre.appservicofcxbackend.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="perfil")
public class Perfil {
	
	@Id
	@SequenceGenerator(name="seq_id_perfil",initialValue=1,sequenceName="seq_id_perfil")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_perfil")
	private Long id;
	private String nome;
	
	@ManyToMany
	@JoinTable(name="vinculo_perfil_funcionalidade")
	private Collection<Funcionalidade> funcionalidades;
	private boolean ativo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Collection<Funcionalidade> getFuncionalidades() {
		return funcionalidades;
	}
	public void setFuncionalidades(Collection<Funcionalidade> funcionalidades) {
		this.funcionalidades = funcionalidades;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
