package be.vdab.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import be.vdab.entities.Saus;

public class SausDAO {
	private static final Map<Long, Saus> sauzen = new ConcurrentHashMap<>();

	static {
		sauzen.put(
				3L,
				new Saus(3, "cocktail", Arrays.asList("mayonaise", "ketchup",
						"cognac")));
		sauzen.put(6L, new Saus(6, "mayonaise", Arrays.asList("ei", "mosterd")));
		sauzen.put(
				7L,
				new Saus(7, "mosterd", Arrays.asList("mosterd", "azijn",
						"witte wijn")));
		sauzen.put(
				12L,
				new Saus(12, "tartare", Arrays.asList("mayonaise", "augurk",
						"tabasco")));
		sauzen.put(
				44L,
				new Saus(44, "vinaigrette", Arrays.asList("olijfolie",
						"mosterd", "azijn")));
	}

	public Iterable<Saus> findAll() {
		return sauzen.values();
	}

	public Iterable<Saus> findByIngredient(String ingredient) {
		List<Saus> resultaat = new ArrayList<>();
		for (Saus saus : sauzen.values()) {
			for (String sausIngredient : saus.getIngredienten()) {
				if (sausIngredient.equalsIgnoreCase(ingredient)) {
					resultaat.add(saus);
				}
			}
		}
		return resultaat;
	}

	public void delete(long nummer) {
		sauzen.remove(nummer);
	}
}
