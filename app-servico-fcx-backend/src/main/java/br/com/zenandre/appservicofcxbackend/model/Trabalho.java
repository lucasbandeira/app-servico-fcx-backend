package br.com.zenandre.appservicofcxbackend.model;

import java.util.Collection;

public class Trabalho {
	
	private Integer id;
	private String titulo;
	private String descricao;
	private Usuario usuarioCadastro;
	private Instituicao instituicaoCadastro;
	private Collection<Instituicao> instituicoesParticipantes;
	private Collection<Endereco> enderecos;
	private boolean ativo;
	private String observacao;
	private Collection<Foto> fotos;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getUsuarioCadastro() {
		return usuarioCadastro;
	}
	public void setUsuarioCadastro(Usuario usuarioCadastro) {
		this.usuarioCadastro = usuarioCadastro;
	}
	public Instituicao getInstituicaoCadastro() {
		return instituicaoCadastro;
	}
	public void setInstituicaoCadastro(Instituicao instituicaoCadastro) {
		this.instituicaoCadastro = instituicaoCadastro;
	}
	public Collection<Instituicao> getInstituicoesParticipantes() {
		return instituicoesParticipantes;
	}
	public void setInstituicoesParticipantes(Collection<Instituicao> instituicoesParticipantes) {
		this.instituicoesParticipantes = instituicoesParticipantes;
	}
	public Collection<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Collection<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Collection<Foto> getFotos() {
		return fotos;
	}
	public void setFotos(Collection<Foto> fotos) {
		this.fotos = fotos;
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
		Trabalho other = (Trabalho) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	

}
