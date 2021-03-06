package accesseur;

public interface ActeurSQL {

	public static final String SQL_LISTER_ACTEUR_PAR_FILM = "SELECT * FROM acteur WHERE id_film = ?;";
	public static final String SQL_AJOUTER_ACTEUR = "INSERT INTO acteur(nom, naissance, taille, nationalite, id_film) VALUES(?, ?, ?, ?, ?);";
	public static final String SQL_MODIFIER_ACTEUR = "UPDATE acteur SET nom = ?, naissance = ?, taille = ?, nationalite = ? WHERE id = ?;";
	public static final String SQL_SUPPRIMER_ACTEUR = "DELETE FROM acteur WHERE id = ?;";
	public static final String SQL_RAPPORTER_ACTEUR = "SELECT * FROM acteur WHERE id = ?;";
	
}
