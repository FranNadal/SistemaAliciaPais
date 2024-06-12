package alicia.edu.ar;

public  class Alimento implements Comparable<Alimento>{
Integer id;
TipoAlimento tipoalimento;
Integer precio;
Integer stock;
public Alimento(Integer id, TipoAlimento tipoalimento, Integer precio,Integer stock) {
	super();
	this.id = id;
	this.tipoalimento = tipoalimento;
	this.precio = precio;
	this.stock=stock;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public TipoAlimento getTipoalimento() {
	return tipoalimento;
}
public void setTipoalimento(TipoAlimento tipoalimento) {
	this.tipoalimento = tipoalimento;
}
public Integer getPrecio() {
	return precio;
}
public void setPrecio(Integer precio) {
	this.precio = precio;
}

public Integer getStock() {
	return stock;
}
public void setStock(Integer stock) {
	this.stock = stock;
}

@Override
public String toString() {
	return "Alimento [id=" + id + ", tipoalimento=" + tipoalimento + ", precio=" + precio + ", stock=" + stock + "]";
}
public int compareTo(Alimento a) {
	return this.tipoalimento.toString().compareTo(a.getTipoalimento().toString());
	
}
}
