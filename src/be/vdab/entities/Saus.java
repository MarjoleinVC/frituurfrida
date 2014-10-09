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
		for (String ingredi�nt : ingredienten)
			this.ingredienten.add(ingredi�nt);
	}

	public Iterable<String> getIngredienten() {
		return ingredienten;
	}

	public void addIngredient(String ingredi�nt) {
		ingredienten.add(ingredi�nt);
	}

	public long getNummer() {
		return nummer;
	}

	public String getNaam() {
		return naam;
	}

}
