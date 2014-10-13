package be.vdab.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Spel implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final int MAX_BEURTEN = 10;
	private String saus;
	private Set<Character> geprobeerdeLetters;
	private int verkeerdeBeurten;
	private StringBuilder sausMetPuntjes;
	private boolean gewonnen;
	private boolean verloren;

	public Spel(String saus) {
		this.saus = saus;
		sausMetPuntjes = new StringBuilder(saus.length());
		for (int teller = 0; teller < saus.length(); teller++) {
			sausMetPuntjes.append(".");
		}
		geprobeerdeLetters = new HashSet();
	}
}
