package services;

import java.util.List;

public class CalculationService {

	// por ser uma operação estática, não é preciso instanciar o CalculationService
	public static <T extends Comparable<T>> T max(List<T> list) { // função retorna qualquer tipo T e trabalha com qualquer tipo T desde que T seja qualquer subtipo de Comparable<T> (indicado por <T extends Comparable<T>>)
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}