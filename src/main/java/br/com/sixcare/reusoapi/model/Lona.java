package br.com.sixcare.reusoapi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LONA")
public class Lona extends Solicitacao{

	
	@Column
	private Boolean situacao;

	@Column(name = "data_colocacao")
	private LocalDate dataColocacao;

	@Column
	private String justificativa;

	@Column
	private Integer metragem;

	@Column(name = "qtde_pontos")
	private Integer quantidadePontos;

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public LocalDate getDataColocacao() {
		return dataColocacao;
	}

	public void setDataColocacao(LocalDate dataColocacao) {
		this.dataColocacao = dataColocacao;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public Integer getMetragem() {
		return metragem;
	}

	public void setMetragem(Integer metragem) {
		this.metragem = metragem;
	}

	public Integer getQuantidadePontos() {
		return quantidadePontos;
	}

	public void setQuantidadePontos(Integer quantidadePontos) {
		this.quantidadePontos = quantidadePontos;
	}


}
