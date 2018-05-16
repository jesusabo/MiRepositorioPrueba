package es.adama.spring.controladores.conversores;

public class Anidado {
	
	private Integer numero;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Anidado ["+(numero !=null? "numero=" + numero : "")+"]";
	}
	
	

}
