package be.vdab.entities;

import java.io.Serializable;
import java.util.Set;

public class Spel implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final int MAX_BEURTEN = 10;
	private String saus;
	private Set<Character> gepropeerdeLetters;
	private int verkeerdeBeurten;
}
