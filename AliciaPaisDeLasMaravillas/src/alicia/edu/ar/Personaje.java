package alicia.edu.ar;

import java.util.ArrayList;

public class Personaje {

String nombre;
Integer altura;
Integer alturaMax=280;
Integer alturaMin=50;
Integer dineroDisponible;
Integer peso;
Integer edad;

public Personaje(String nombre, Integer altura, Integer dineroDisponible, Integer peso, Integer edad) {
	super();
	this.nombre = nombre;
	this.altura = altura;
	this.dineroDisponible = dineroDisponible;
	this.peso = peso;
	this.edad = edad;
	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}



public Integer getAltura() {
	return altura;
}

public void setAltura(Integer altura) {
	this.altura = altura;
}

public Integer getAlturaMax() {
	return alturaMax;
}

public void setAlturaMax(Integer alturaMax) {
	this.alturaMax = alturaMax;
}

public Integer getAlturaMin() {
	return alturaMin;
}

public void setAlturaMin(Integer alturaMin) {
	this.alturaMin = alturaMin;
}

public Integer getDineroDisponible() {
	return dineroDisponible;
}

public void setDineroDisponible(Integer dineroDisponible) {
	this.dineroDisponible = dineroDisponible;
}

public Integer getPeso() {
	return peso;
}

public void setPeso(Integer peso) {
	this.peso = peso;
}

public Integer getEdad() {
	return edad;
}

public void setEdad(Integer edad) {
	this.edad = edad;
}

public void consumirAlimento(Alimento alimento) {
	if(alimento instanceof Agrandador&&this.altura<this.alturaMax) {
	Integer nuevaAltura=this.altura+=40;
	if(nuevaAltura> 280) {
		this.altura=this.alturaMax;
	}
	}else if(alimento instanceof Achicador&&this.altura>this.alturaMin) {
	Integer nuevaAltura=this.altura-=50;
	if(nuevaAltura<50) {
		this.altura=this.alturaMin;
	}
	}
	
}



	
}



