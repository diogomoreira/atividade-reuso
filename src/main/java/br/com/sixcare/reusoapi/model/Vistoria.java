package br.com.sixcare.reusoapi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VISTORIA")
public class Vistoria extends Solicitacao {

	@Column(name = "data_vistoria")
	private LocalDate dataVistoria;

	@Column
	private String risco;

	@Column
	private String localidade;

	@Column
	private String setor;

	@Column
	private String avaliador;

	public LocalDate getDataVistoria() {
		return dataVistoria;
	}

	public void setDataVistoria(LocalDate dataVistoria) {
		this.dataVistoria = dataVistoria;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getAvaliador() {
		return avaliador;
	}

	public void setAvaliador(String avaliador) {
		this.avaliador = avaliador;
	}

}
