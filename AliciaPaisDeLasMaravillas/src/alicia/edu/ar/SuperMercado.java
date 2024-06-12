package alicia.edu.ar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SuperMercado {
String nombre;
ArrayList<Alimento>alimentos;
HashSet<Personaje>clientes;
HashSet<Compra>comprasRealizadas;
public SuperMercado(String nombre) {
	super();
	this.nombre = nombre;
	this.alimentos= new ArrayList<>();
	this.clientes= new HashSet<>();
	this.comprasRealizadas= new HashSet<>();
}
public boolean agregarAlimentoASuperMercado(Alimento alimento) {
	// TODO Auto-generated method stub
	return alimentos.add(alimento);
}
public void agregarCliente(Personaje alicia) {
	clientes.add(alicia);
	
}
public void comprarAlimento(Compra compra) throws Exception {
	
	if(compra.getAlicia().getDineroDisponible()>compra.getAlimento().getPrecio()) {
		compra.comprarAlimento(compra);
		compra.getAlicia().setDineroDisponible(compra.getAlicia().getDineroDisponible()-compra.getAlimento().getPrecio());
		compra.getAlimento().setStock(compra.getAlimento().getStock()-compra.getCantidad());
		comprasRealizadas.add(compra);
	}else {
		throw new Exception("Dinero No Disponible");
	}
		
	
	
}
public void ConsumirAlimento(Compra compra) {
	
		if(comprasRealizadas.contains(compra)) {
			compra.getAlicia().consumirAlimento(compra.getAlimento());
			compra.setCantidad(compra.getCantidad()-1);
		}
	
	
}
public TreeSet<Alimento> ordenarAlimentosDeManeraDescendente() {
	TreeSet<Alimento>ordenados= new TreeSet<>();
	
		ordenados.addAll(this.alimentos);
	
	return ordenados;
}

	
}



