package be.steformations.it.javaweb.spring.calcul.session;

import be.steformations.pc.javaweb.calcul.modele.Calcul;

@org.springframework.stereotype.Component //instanciation par le framework Spring
@org.springframework.context.annotation.Scope("session") //durée de vie égale à une seule requête
public class SessionCalcul {
	public SessionCalcul(){
		
	}
	
	private Calcul courant;
	private java.util.List<Calcul> anciens;
	
	public Calcul getCourant(){
		return this.courant;
	}
	
	public void setCourant(Calcul courant){
		this.courant = courant;
	}

	public java.util.List<Calcul> getAnciens() {
		if (this.anciens == null){
			this.anciens = new java.util.ArrayList<>();
		}
		return this.anciens;
	}
		
}
