package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// positivo se primeiro maior que segundo; 0 se forem iguais; negativo se primeiro menor que segundo
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}
