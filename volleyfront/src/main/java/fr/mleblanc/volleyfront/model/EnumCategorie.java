package fr.mleblanc.volleyfront.model;

public enum EnumCategorie {
	POUSSIN("poussin"), BENJAMIN("poussin"), TREIZE_AN("poussin"), QUINZE_AN("poussin"), DIXSEPT_AN("poussin"), SENIOR(
			"poussin"), VETERAN("poussin");

	private String value;

	private EnumCategorie(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
