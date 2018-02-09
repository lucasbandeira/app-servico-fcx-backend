package br.com.zenandre.appservicofcxbackend.model;

import java.io.File;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.joda.time.LocalDateTime;

@Entity
@Table(name="anexo")
public class Anexo {

	@Id
	@SequenceGenerator(name="seq_id_anexo",initialValue=1,sequenceName="seq_id_anexo")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_anexo")
	private Long id;
	private String descricao;
	
	@Column(name="nome_anexo")
	private String nomeAnexo;
	
	@Lob
	private Blob arquivo;
	
		
	private LocalDateTime dataInclusao;
	
	
	public LocalDateTime getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(LocalDateTime dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNomeAnexo() {
		return nomeAnexo;
	}
	public void setNomeAnexo(String nomeAnexo) {
		this.nomeAnexo = nomeAnexo;
	}
	public Blob getArquivo() {
		return arquivo;
	}
	public void setArquivo(Blob arquivo) {
		this.arquivo = arquivo;
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
		Anexo other = (Anexo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
