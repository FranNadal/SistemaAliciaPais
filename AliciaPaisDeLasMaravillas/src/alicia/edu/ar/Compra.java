package alicia.edu.ar;

import java.util.HashSet;

public class Compra {
Alimento alimento;
Personaje alicia;
Integer cantidad;
Integer id;
HashSet<Compra>compras;
public Compra(Alimento alimento, Personaje alicia, Integer cantidad, Integer id) {
	super();
	this.alimento = alimento;
	this.alicia = alicia;
	this.cantidad = cantidad;
	this.id = id;
	this.compras= new HashSet<>();
}
public Alimento getAlimento() {
	return alimento;
}
public void setAlimento(Alimento alimento) {
	this.alimento = alimento;
}
public Personaje getAlicia() {
	return alicia;
}
public void setAlicia(Personaje alicia) {
	this.alicia = alicia;
}
public Integer getCantidad() {
	return cantidad;
}
public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Boolean comprarAlimento(Compra compra) {
	return compras.add(compra);
	
}
@Override
public String toString() {
	return "Compra [alimento=" + alimento + ", alicia=" + alicia + ", cantidad=" + cantidad + ", id=" + id
			+ ", compras=" + compras + "]";
}

}
