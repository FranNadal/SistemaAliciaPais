package alicia.edu.ar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

import org.junit.Test;

public class TestFiesta {
@Test
public void queSePuedaAgregarAlimentosAlSuperMercado() {
	SuperMercado chino= new SuperMercado("ArgenChino");
	Integer idAlimento=1;
	TipoAlimento tipoAlimento = TipoAlimento.masitas;
	Integer precio=100;
	Integer stock=2;
	Alimento alimento = new Achicador(idAlimento,tipoAlimento,precio,stock);
	
	Integer idAlimento2=2;
	TipoAlimento tipoAlimento2 = TipoAlimento.gomitas;
	Integer precio2=200;
	Alimento alimento2 = new Agrandador(idAlimento2,tipoAlimento2,precio2,stock);
	
	assertTrue(chino.agregarAlimentoASuperMercado(alimento));
	assertTrue(chino.agregarAlimentoASuperMercado(alimento2));
}


@Test
public void queAlComprarUnAlimentoSeDescuenteElDineroDisponible() throws Exception {
	SuperMercado chino= new SuperMercado("ArgenChino");
	Integer idAlimento=1;
	TipoAlimento tipoAlimento = TipoAlimento.masitas;
	Integer precio=100;
	Integer stock=6;
	Alimento alimento = new Achicador(idAlimento,tipoAlimento,precio,stock);
	
	Integer idAlimento2=2;
	TipoAlimento tipoAlimento2 = TipoAlimento.gomitas;
	Integer precio2=200;
	Alimento alimento2 = new Agrandador(idAlimento2,tipoAlimento2,precio2,stock);
	
	chino.agregarAlimentoASuperMercado(alimento);
	chino.agregarAlimentoASuperMercado(alimento2);
	
	Integer altura=180;
	String nombre="alicia";
	Integer peso=70;
	Integer dinero=1000;
	Integer edad=20;
	Personaje alicia = new Personaje(nombre, altura, dinero, peso, edad);
	chino.agregarCliente(alicia);
	
	
	Compra compra = new Compra(alimento, alicia, 2, 1);
	
	chino.comprarAlimento(compra);
	
	int dineroEsperado=900;
	int dineroActual=alicia.getDineroDisponible();
	
	assertEquals(dineroEsperado, dineroActual);
	

	
}
	

@Test (expected = Exception.class)

public void queSiSeExcedeLaCantidadDeDineroDisponibleMeArrojeUnaExcepcion() throws Exception {
	SuperMercado chino= new SuperMercado("ArgenChino");
	Integer idAlimento=1;
	TipoAlimento tipoAlimento = TipoAlimento.masitas;
	Integer precio=300;
	Integer stock=6;
	Alimento alimento = new Achicador(idAlimento,tipoAlimento,precio,stock);
	
	Integer idAlimento2=2;
	TipoAlimento tipoAlimento2 = TipoAlimento.gomitas;
	Integer precio2=200;
	Alimento alimento2 = new Agrandador(idAlimento2,tipoAlimento2,precio2,stock);
	
	chino.agregarAlimentoASuperMercado(alimento);
	chino.agregarAlimentoASuperMercado(alimento2);
	
	Integer altura=180;
	String nombre="alicia";
	Integer peso=70;
	Integer dinero=100;
	Integer edad=20;
	Personaje alicia = new Personaje(nombre, altura, dinero, peso, edad);
	chino.agregarCliente(alicia);
	
	
	Compra compra = new Compra(alimento, alicia, 2, 1);
	
	chino.comprarAlimento(compra);
}

@Test

public void queAlConsumirAlimentoDeTipoAgrandadorAliciaCrezca() throws Exception {
	
	SuperMercado chino= new SuperMercado("ArgenChino");
	Integer idAlimento2=2;
	TipoAlimento tipoAlimento2 = TipoAlimento.gomitas;
	Integer precio2=200;
	Integer stock=6;
	Alimento alimento2 = new Agrandador(idAlimento2,tipoAlimento2,precio2,stock);
	chino.agregarAlimentoASuperMercado(alimento2);
	Integer altura=180;
	String nombre="alicia";
	Integer peso=70;
	Integer dinero=1000;
	Integer edad=20;
	Personaje alicia = new Personaje(nombre, altura, dinero, peso, edad);
	chino.agregarCliente(alicia);
	
Compra compra = new Compra(alimento2, alicia, 2, 1);
	
	chino.comprarAlimento(compra);
	
	chino.ConsumirAlimento(compra);
		
	int valorEsperado=220;
	int valorActual=alicia.getAltura();
	
	assertEquals(valorEsperado, valorActual);
	
}
@Test
public void queAlConsumirAlimentoDeTipoAchicadorAliciaSeEncoja() throws Exception {
	SuperMercado chino= new SuperMercado("ArgenChino");
	Integer idAlimento2=2;
	TipoAlimento tipoAlimento2 = TipoAlimento.gomitas;
	Integer precio2=200;
	Integer stock=6;
	Alimento alimento2 = new Achicador(idAlimento2,tipoAlimento2,precio2,stock);
	chino.agregarAlimentoASuperMercado(alimento2);
	Integer altura=180;
	String nombre="alicia";
	Integer peso=70;
	Integer dinero=1000;
	Integer edad=20;
	Personaje alicia = new Personaje(nombre, altura, dinero, peso, edad);
	chino.agregarCliente(alicia);
	
Compra compra = new Compra(alimento2, alicia, 2, 1);
	
	chino.comprarAlimento(compra);
	
	chino.ConsumirAlimento(compra);
	int valorEsperado=130;
	int valorActual=alicia.getAltura();
	
	assertEquals(valorEsperado, valorActual);
}


@Test

public void queAlConsumirAlimentoNoCrezcaMasDe280cm() throws Exception {
	SuperMercado chino= new SuperMercado("ArgenChino");
	Integer idAlimento2=2;
	TipoAlimento tipoAlimento2 = TipoAlimento.gomitas;
	Integer precio2=200;
	Integer stock=6;
	Alimento alimento2 = new Agrandador(idAlimento2,tipoAlimento2,precio2,stock);
	chino.agregarAlimentoASuperMercado(alimento2);
	Integer altura=270;
	String nombre="alicia";
	Integer peso=70;
	Integer dinero=1000;
	Integer edad=20;
	Personaje alicia = new Personaje(nombre, altura, dinero, peso, edad);
	chino.agregarCliente(alicia);
	
Compra compra = new Compra(alimento2, alicia, 2, 1);
	
	chino.comprarAlimento(compra);
	
	chino.ConsumirAlimento(compra);
		
	int valorEsperado=280;
	int valorActual=alicia.getAltura();
	
	assertEquals(valorEsperado, valorActual);
}

@Test

public void queAlConsumirAlimentoNoSeEncojaMasDe50cm() throws Exception {
	SuperMercado chino= new SuperMercado("ArgenChino");
	Integer idAlimento2=2;
	TipoAlimento tipoAlimento2 = TipoAlimento.gomitas;
	Integer precio2=200;
	Integer stock=6;
	Alimento alimento2 = new Achicador(idAlimento2,tipoAlimento2,precio2,stock);
	chino.agregarAlimentoASuperMercado(alimento2);
	Integer altura=70;
	String nombre="alicia";
	Integer peso=70;
	Integer dinero=1000;
	Integer edad=20;
	Personaje alicia = new Personaje(nombre, altura, dinero, peso, edad);
	chino.agregarCliente(alicia);
	
Compra compra = new Compra(alimento2, alicia, 2, 1);
	
	chino.comprarAlimento(compra);
	
	chino.ConsumirAlimento(compra);
	int valorEsperado=50;
	int valorActual=alicia.getAltura();
	
	assertEquals(valorEsperado, valorActual);
}
@Test
public void obtenerColeccionDeAlimentosOrdenadasPorNombreDeManeraDescendente() {
	SuperMercado chino= new SuperMercado("ArgenChino");
	Integer idAlimento=1;
	TipoAlimento tipoAlimento = TipoAlimento.masitas;
	Integer precio=100;
	Integer stock=2;
	Alimento alimento = new Achicador(idAlimento,tipoAlimento,precio,stock);
	
	Integer idAlimento2=2;
	TipoAlimento tipoAlimento2 = TipoAlimento.gomitas;
	Integer precio2=200;
	Alimento alimento2 = new Agrandador(idAlimento2,tipoAlimento2,precio2,stock);
	Alimento alimento3 = new Agrandador(3,TipoAlimento.alfajores,precio2,stock);
	Alimento alimento4= new Agrandador(4,TipoAlimento.caramelos,precio2,stock);
	
	chino.agregarAlimentoASuperMercado(alimento);
	chino.agregarAlimentoASuperMercado(alimento2);
	chino.agregarAlimentoASuperMercado(alimento3);
	chino.agregarAlimentoASuperMercado(alimento4);
	
	
	
	LinkedList<Alimento> alimentosEsperados = new LinkedList<>();
	
	alimentosEsperados.add(alimento3);
	alimentosEsperados.add(alimento4);
	alimentosEsperados.add(alimento2);
	alimentosEsperados.add(alimento);

	LinkedList<Alimento> alimentosOrdenados = new LinkedList<>(chino.ordenarAlimentosDeManeraDescendente());

	assertEquals(alimentosEsperados, alimentosOrdenados);

}
}
