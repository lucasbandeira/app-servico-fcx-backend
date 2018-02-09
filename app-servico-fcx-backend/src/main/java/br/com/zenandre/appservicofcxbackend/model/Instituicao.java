package br.com.zenandre.appservicofcxbackend.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

@Entity
@Table(name="instituicao")
public class Instituicao {

	@Id
	@SequenceGenerator(name="seq_id_instituicao",initialValue=1,sequenceName="seq_id_instituicao")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_instituicao")
	private Long id;
	
	@Column(nullable=false,length=200)
	private String nome;
	private String descricao;
	
	@Column(nullable=false,name="data_cadastro")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime dataCadastro;
	
	@Column(nullable=true,name="data_alteracao")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime dataAlteracao;
	
	@Column(nullable=false)
	private boolean ativo;
	
	@OneToOne
	@JoinColumn(name="id_usuario_criador")
	private Usuario usuarioCriador;
	
	@ManyToMany
	@JoinTable(name="vinculo_instituicao_administradores")
	private Collection<Usuario> administradores;
	
	@ManyToMany
	@JoinTable(name="vinculo_campanha_instiruicoes_participantes")
	private Collection<Campanha> campanhas;
	
	@OneToMany
	@JoinTable(name="vinculo_instituicao_enderecos")
	private Collection<Endereco> enderecos;
	
}
