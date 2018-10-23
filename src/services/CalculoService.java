package services;

import java.util.ArrayList;
import java.util.List;

public class CalculoService<T> {
	
	public static Integer max(List<Integer> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("A lista está vazia.");
		}
		Integer max = list.get(0);
		for(Integer item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
	
}