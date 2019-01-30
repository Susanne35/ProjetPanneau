package fr.panneauaffichage.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.panneauaffichage.bo.Panneau;
import fr.panneauaffichage.util.DbbConnexion;

public class PanneauDAO {

	private static final String ENREGISTRER = "INSERT INTO panneau_affichage(titre,nb_habitants,texte,date_conseil_mun) VALUES (?,?,?,?)";

	/**
	 * Enregistrer un panneau dans la dbb
	 * 
	 * @param panneau
	 * @throws SQLException
	 */
	public static void enregistrer(Panneau panneau) throws DALException {
		Connection cnx = null;
		PreparedStatement pstmt = null;

		try {
			cnx = DbbConnexion.getConnection();
			pstmt = cnx.prepareStatement(ENREGISTRER);

			pstmt.setString(1, panneau.getTitre());
			pstmt.setInt(2, panneau.getNbHabitants());
			pstmt.setString(3, panneau.getTexte());
			//à revoir
			pstmt.setDate(4,new java.sql.Date(panneau.getDateConseil().getTime()));

			pstmt.executeUpdate();

		} catch (Exception e) {
			throw new DALException(e.getMessage());
		} finally {
			try {
				if (pstmt != null)pstmt.close();
				if (cnx != null)cnx.close();
			} catch (SQLException e) {
				throw new DALException(e.getMessage());
			}

		}

	}
}