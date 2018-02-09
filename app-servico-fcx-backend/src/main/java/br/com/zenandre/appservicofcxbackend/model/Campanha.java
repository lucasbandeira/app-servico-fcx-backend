package br.com.zenandre.appservicofcxbackend.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;


public class Campanha {
	
	@Id
	@SequenceGenerator(name="seq_id_campanha",initialValue=1,sequenceName="seq_id_campanha")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_campanha")
	private Long id;
	
	@Column(nullable=false)
	private TipoCampanha tipo;
	
	@Column(nullable=false,length=200)
	private String titulo;
	
	@Column(nullable=true,length=1000)
	private String descricao;
	
	@Column(name="data_hora_criacao")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime dataHoraCriacao;
	
	@Column(name="data_hora_encerramento")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime dataHoraEnceramento;
	
	@Column(name="data_hora_atualizacao")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime dataHoraAtualizacao;
	
	@Column(name="usuario_criador")
	private Usuario usuarioCriador;
	
	@Column(name="instituicao_criacao")
	private Instituicao instituicaoCriacao;
	
	@ManyToMany
	@JoinTable(name="vinculo_campanha_instiruicoes_participantes")
	private Collection<Instituicao> instituicoesParticipantes;
	
	@ManyToMany
	@JoinTable(name="vinculo_campanha_administradores")
	private Collection<Usuario> administradores;
	
	@ManyToMany
	@JoinTable(name="vinculo_campanha_participantes")
	private Collection<Usuario> participantes;
	
	private boolean ativo;
	
	@OneToOne
	@JoinColumn(name="id_endereco")
	private Endereco endereco;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Collection<Foto> fotos;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Collection<Anexo> anexos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoCampanha getTipo() {
		return tipo;
	}

	public void setTipo(TipoCampanha tipo) {
		this.tipo = tipo;
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

	public LocalDateTime getDataHoraCriacao() {
		return dataHoraCriacao;
	}

	public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
		this.dataHoraCriacao = dataHoraCriacao;
	}

	public LocalDateTime getDataHoraEnceramento() {
		return dataHoraEnceramento;
	}

	public void setDataHoraEnceramento(LocalDateTime dataHoraEnceramento) {
		this.dataHoraEnceramento = dataHoraEnceramento;
	}

	public LocalDateTime getDataHoraAtualizacao() {
		return dataHoraAtualizacao;
	}

	public void setDataHoraAtualizacao(LocalDateTime dataHoraAtualizacao) {
		this.dataHoraAtualizacao = dataHoraAtualizacao;
	}

	public Usuario getUsuarioCriador() {
		return usuarioCriador;
	}

	public void setUsuarioCriador(Usuario usuarioCriador) {
		this.usuarioCriador = usuarioCriador;
	}

	public Instituicao getInstituicaoCriacao() {
		return instituicaoCriacao;
	}

	public void setInstituicaoCriacao(Instituicao instituicaoCriacao) {
		this.instituicaoCriacao = instituicaoCriacao;
	}

	public Collection<Instituicao> getInstituicoesParticipantes() {
		return instituicoesParticipantes;
	}

	public void setInstituicoesParticipantes(Collection<Instituicao> instituicoesParticipantes) {
		this.instituicoesParticipantes = instituicoesParticipantes;
	}

	public Collection<Usuario> getAdministradores() {
		return administradores;
	}

	public void setAdministradores(Collection<Usuario> administradores) {
		this.administradores = administradores;
	}

	public Collection<Usuario> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Collection<Usuario> participantes) {
		this.participantes = participantes;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Collection<Foto> getFotos() {
		return fotos;
	}

	public void setFotos(Collection<Foto> fotos) {
		this.fotos = fotos;
	}

	public Collection<Anexo> getAnexos() {
		return anexos;
	}

	public void setAnexos(Collection<Anexo> anexos) {
		this.anexos = anexos;
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
		Campanha other = (Campanha) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
