package edu.eci.cvds.servlet.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.Random;

import javax.faces.bean.ApplicationScoped;

@ManagedBean(name = "guessBean")
@SessionScoped
public class Bean {

	private int numero;
	private int numeroIntentos;
	private int premio;
	private String estado;
	
	public Bean() {
		restart();
	}
	
	public void guess(int valor) {
		numeroIntentos+=1;
		if(valor==numero){
			estado="gano con premio de" + premio;
		}else {
			premio-=10000;
		}
	}
	
	public void restart() {
		Random r=new Random();
		numero=r.nextInt(10);
		numeroIntentos=0;
		premio=100000;
		estado="No ha ganado";
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroIntentos() {
		return numeroIntentos;
	}

	public void setNumeroIntentos(int numeroIntentos) {
		this.numeroIntentos = numeroIntentos;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
