package services;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class CalculoService<T> {
	
	public static Produto max(List<Produto> lista) {
		if(lista.isEmpty()) {
			throw new IllegalStateException("A lista está vazia.");
		}
		
		Produto max = lista.get(0);
		Double maxPreco = 0.0;
		
		for(Produto item : lista) {
			Double valor = item.getPreco();
			if(item.getPreco() > maxPreco) {
				maxPreco = item.getPreco();
				max = item;
			}
		}
		return max;
	}
	
	
}