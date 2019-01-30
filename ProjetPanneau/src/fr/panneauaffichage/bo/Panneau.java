package fr.panneauaffichage.bo;

import java.util.Date;

public class Panneau {
	
	private int noPanneau;
	private String titre;
	private Integer nbHabitants;
	private String texte;
	private Date dateConseil ;
	
	
	//Constructeur vide
	public Panneau() {
	}


	//Constructeur avec tous les champs de la TABLE appelant une méthode
	public Panneau(int noPanneau, String titre, Integer nbHabitants, String texte, Date dateConseil){
		super();//permet d'hériter d'objet
		setNoPanneau(noPanneau);
		setTitre(titre);
		setNbHabitants(nbHabitants);
		setTexte(texte);
		setDateConseil(dateConseil);		
	}
	
	/*
	 * //Constructeur old scool
	public Panneau(int noPanneau, String titre, int nbHabitants, String texte, String dateConseil){
		
		this.noPanneau = noPanneau;
		this.titre = titre;
		this.nbHabitants = nbHabitants;
		this.texte = texte;
		this.dateConseil = dateConseil;
		
	}
	 */
	
	//Constructeur sans Id
public Panneau(String titre, int nbHabitants, String texte, Date dateConseil) {
		
		setTitre(titre);
		setNbHabitants(nbHabitants);
		setTexte(texte);
		setDateConseil(dateConseil);
	}




	public int getNoPanneau() {
		return noPanneau;
	}



	public void setNoPanneau(int noPanneau) {
		this.noPanneau = noPanneau;
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre){
		
		this.titre = titre.trim().toLowerCase();
		
	}

/*
 * public void setTitre(String titre) throws Exception {
		boolean num = false;
		if(titre.contains("1"))
			num = true;
		if (titre != null || titre != "" || !num) {
		this.titre = titre.trim().toLowerCase();
		}else {
			this.titre = "valeur par defaut";
			System.out.println("erreur du nom");
			throw new Exception("nom invalide");
		}
	}

 */
	


	public int getNbHabitants() {
		return nbHabitants;
	}



	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}



	public String getTexte() {
		return texte;
	}



	public void setTexte(String texte) {
		this.texte = texte;
	}



	public Date getDateConseil() {
		return dateConseil;
	}



	public void setDateConseil(Date dateConseil) {
		this.dateConseil = dateConseil;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Panneau [noPanneau=");
		builder.append(noPanneau);
		builder.append(", titre=");
		builder.append(titre);
		builder.append(", nbHabitants=");
		builder.append(nbHabitants);
		builder.append(", texte=");
		builder.append(texte);
		builder.append(", dateConseil=");
		builder.append(dateConseil);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
