package com.Jenkins;

import java.time.LocalDate;

public class EmployeVente extends Employe {
	
	double CA;

	public EmployeVente(String nom, String prenom, String telephone, LocalDate dateNaissance, LocalDate dateEmbauche,
			double cA) {
		super(nom, prenom, telephone, dateNaissance, dateEmbauche);
		CA = cA;
	}

	@Override
	public void calculSalaire() {
		// TODO Auto-generated method stub
		salaire = 0.25 * CA + 400;
	}

}
