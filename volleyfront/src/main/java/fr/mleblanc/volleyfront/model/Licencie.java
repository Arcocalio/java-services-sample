package fr.mleblanc.volleyfront.model;

public class Licencie {

	private String nom;
	private String prenom;
	private EnumCategorie categorie;
	private String numLicence;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the categorie
	 */
	public EnumCategorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie
	 *            the categorie to set
	 */
	public void setCategorie(EnumCategorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the numLicence
	 */
	public String getNumLicence() {
		return numLicence;
	}

	/**
	 * @param numLicence
	 *            the numLicence to set
	 */
	public void setNumLicence(String numLicence) {
		this.numLicence = numLicence;
	}

}
