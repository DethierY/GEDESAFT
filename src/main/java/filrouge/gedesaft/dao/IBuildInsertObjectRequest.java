package filrouge.gedesaft.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Interface pour les classes construisant une requête d'insertaion d'un objet dans une table de la base de données
public interface IBuildInsertObjectRequest {
	
	// Signature du getter de la requête SQL
	/**
	 * @return
	 */
	public String getRequest();
	
	// Signature des méthodes pour donner une valeur aux données dynamiques de la requête SQL du PrepareStatement en fonction de l'Objet en paramêtre
	/**
	 * @param pstmt
	 * @param object
	 * @throws Exception
	 */
	public void buildRequest(PreparedStatement pstmt, Object object) throws Exception;
	
	// Signature du getter de la clé auto-incrémentée en fonction du ResultSet
	/**
	 * @param rs
	 * @param object
	 * @throws SQLException
	 */
	public void setGeneratedKey(ResultSet rs, Object object) throws SQLException;

}
