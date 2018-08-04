package br.com.sixcare.reusoapi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Solicitacao {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long codigo;

	@Column(name = "data_abertura")
	private LocalDate dataAbertura;

	@Column(name = "data_finalizacao")
	private LocalDate dataFinalizacao;

	@ManyToOne
	@JoinColumn(name = "cod_regional")
	private Regional regional;

	@Column
	private String localidade;

	@Column
	private String roteiro;

	@Column
	private Integer microrregiao;

	@Column
	private Boolean plantao;

	@Column
	private String latitude;

	@Column
	private String longitude;

	@Column
	private Boolean vitimas;

	@Column(name = "vitimas_fatais")
	private Boolean vitimasFatais;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(LocalDate dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public Regional getRegional() {
		return regional;
	}

	public void setRegional(Regional regional) {
		this.regional = regional;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}

	public Integer getMicrorregiao() {
		return microrregiao;
	}

	public void setMicrorregiao(Integer microrregiao) {
		this.microrregiao = microrregiao;
	}

	public Boolean getPlantao() {
		return plantao;
	}

	public void setPlantao(Boolean plantao) {
		this.plantao = plantao;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Boolean getVitimas() {
		return vitimas;
	}

	public void setVitimas(Boolean vitimas) {
		this.vitimas = vitimas;
	}

	public Boolean getVitimasFatais() {
		return vitimasFatais;
	}

	public void setVitimasFatais(Boolean vitimasFatais) {
		this.vitimasFatais = vitimasFatais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Solicitacao other = (Solicitacao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
