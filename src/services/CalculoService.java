package services;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class CalculoService<T> {
	
	//T extends Comparable T, terá uma lista de um objeto T que seja subtipo de Comparable
	public static <T extends Comparable <T>> T max(List<T> lista) {
		if(lista.isEmpty()) {
			throw new IllegalStateException("A lista está vazia.");
		}
		
		T max = lista.get(0);		
		for(T item : lista) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
	
}