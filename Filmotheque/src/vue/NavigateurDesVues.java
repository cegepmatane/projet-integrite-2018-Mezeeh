package vue;

import action.ControleurFilm;
import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDesVues extends Application{
	
	private Stage stade;

	private VueAjouterFilm vueAjouterFilm;
	private VueEditerFilm vueEditerFilm;
	private VueListeFilm vueListeFilm;
	private VueAjouterActeur vueAjouterActeur;
	private VueEditerActeur vueEditerActeur;
	
	private ControleurFilm controleur;
	
	public NavigateurDesVues() 
	{		
		this.vueAjouterFilm = new VueAjouterFilm();
		this.vueEditerFilm = new VueEditerFilm();
		this.vueListeFilm = new VueListeFilm();
		
		this.vueAjouterActeur = new VueAjouterActeur();
		this.vueEditerActeur = new VueEditerActeur();
	}
	
	@Override
	public void start(Stage stade) throws Exception {
		this.stade = stade;
		stade.setScene(null);
		stade.show();
		
		this.controleur = ControleurFilm.getInstance();
		this.controleur.activerVues(this);
		
		this.vueAjouterFilm.setControleur(controleur);
		this.vueEditerFilm.setControleur(controleur);
		this.vueListeFilm.setControleur(controleur);
		
		this.vueAjouterActeur.setControleur(controleur);
		this.vueEditerActeur.setControleur(controleur);
	}

	public VueAjouterFilm getVueAjouterFilm() {
		return vueAjouterFilm;
	}
	
	public VueEditerFilm getVueEditerFilm() {
		return vueEditerFilm;
	}

	public VueListeFilm getVueListeFilm() {
		return vueListeFilm;
	}

	public VueAjouterActeur getVueAjouterActeur() {
		return vueAjouterActeur;
	}

	public VueEditerActeur getVueEditerActeur() {
		return vueEditerActeur;
	}

	public void naviguerVersVueAjouterFilm() {
		stade.setScene(this.vueAjouterFilm);
		stade.show();
	}
	
	public void naviguerVersVueAjouterActeur() {
		stade.setScene(this.vueAjouterActeur);
		stade.show();
	}
	
	public void naviguerVersVueEditerFilm() {
		stade.setScene(this.vueEditerFilm);
		stade.show();
	}
	
	public void naviguerVersVueEditerActeur() {
		stade.setScene(this.vueEditerActeur);
		stade.show();
	}

	public void naviguerVersVueListeFilm() {
		stade.setScene(this.vueListeFilm);
		stade.show();
	}
}
