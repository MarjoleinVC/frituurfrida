package be.vdab.entities;

import java.util.ArrayList;
import java.util.List;

public class Saus {
	private long nummer;
	private String naam;
	private List<String> ingredienten = new ArrayList<>();

	public Saus(long nummer, String naam, Iterable<String> ingredienten) {
		this.nummer = nummer;
		this.naam = naam;
		for (String ingrediënt : ingredienten)
			this.ingredienten.add(ingrediënt);
	}

	public Iterable<String> getIngredienten() {
		return ingredienten;
	}

	public void addIngredient(String ingrediënt) {
		ingredienten.add(ingrediënt);
	}

	public long getNummer() {
		return nummer;
	}

	public String getNaam() {
		return naam;
	}

}
