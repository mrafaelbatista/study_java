package entities;

import entities.enums.Color;

public class Quadrado extends Forma{
	
	private Double largura;
	private Double altura;
	
	public Quadrado() {
		
	}

	public Quadrado(
			Color color,
			Double largura,
			Double altura) {
		super(color);
		this.largura = largura;
		this.altura = altura;
	}
	

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
	
	

}
