package entidades;

import java.util.Date;

public class ContratoPorHora {
	private Date data;
	private Double valorPorHora;
	private Integer Horas;

	public ContratoPorHora() {

	}

	public ContratoPorHora(Date data, Double valorPorHora, Integer horas) {

		this.data = data;
		this.valorPorHora = valorPorHora;
		Horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return Horas;
	}

	public void setHoras(Integer horas) {
		Horas = horas;
	}

}
