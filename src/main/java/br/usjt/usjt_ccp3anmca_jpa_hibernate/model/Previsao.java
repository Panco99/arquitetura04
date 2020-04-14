package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_previsao")
public class Previsao implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private Double tempMin;
	@Column
	private Double tempMax;
	@Column
	private int umidade;
	@Column
	private String descricao;
	@Column
	private String latitude;
	@Column
	private String longitude;
	@Column
	private String hora;
	
	@OneToOne(optional=false)
	@JoinColumn(name="id_dos_dias")
	private DiasDaSemana diasDaSemana;
	
	@OneToMany (mappedBy = "previsao", cascade=CascadeType.ALL)
	private List <Cidades> cidades;

	private Cidades cidade;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getTempMin() {
		return tempMin;
	}
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}
	public Double getTempMax() {
		return tempMax;
	}
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}
	public int getUmidade() {
		return umidade;
	}
	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public DiasDaSemana getDiasDaSemana() {
		return diasDaSemana;
	}
	public void setDiasDaSemana(DiasDaSemana diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
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
		Previsao other = (Previsao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Previsao [id=" + id + ", tempMin=" + tempMin + ", tempMax=" + tempMax + ", umidade=" + umidade
				+ ", descricao=" + descricao + ", latitude=" + latitude + ", longitude=" + longitude + ", hora=" + hora
				+ ", diasDaSemana=" + diasDaSemana + "]";
	}
	public List <Cidades> getCidades() {
		return cidades;
	}
	public void setCidades(List <Cidades> cidades) {
		this.cidades = cidades;
	}

}
