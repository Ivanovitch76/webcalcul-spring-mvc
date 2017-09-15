package be.steformations.it.javaweb.spring.calcul.modele;

import be.steformations.pc.javaweb.calcul.modele.Calcul;
import be.steformations.pc.javaweb.calcul.modele.GestionnaireCalcul;

@org.springframework.stereotype.Service //specialisation de @Component
@org.springframework.context.annotation.Scope("application") // singleton + dur�e de vie �gale � l'application)
public class SpringGestionnaireCalcul {

	private GestionnaireCalcul gestionnaireCalcul;
	
	public SpringGestionnaireCalcul(){
		System.out.println("SpringGestionnaireCalcul.SpringGestionnaireCalcul()");
		this.gestionnaireCalcul = new GestionnaireCalcul(10);
	}

	public Calcul genererCalcul(){
		return gestionnaireCalcul.genererCalcul();		
	}
	
	public void verifierSolution(Calcul calcul, int proposition){
		gestionnaireCalcul.verifierSolution(calcul,  proposition);		
	}
	
}
