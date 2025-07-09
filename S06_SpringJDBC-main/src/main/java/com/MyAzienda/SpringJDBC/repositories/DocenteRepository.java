package com.MyAzienda.SpringJDBC.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.MyAzienda.SpringJDBC.models.Docente;
import com.mysql.cj.jdbc.MysqlDataSource;

//CRUD -> Create - Read - Update - Delete

@Repository
public class DocenteRepository implements IRepositoryRead<Docente>, IRepositoryWrite<Docente> {

	@Override
	public List<Docente> getAll() {
		List<Docente> elenco = new ArrayList<Docente>();
		
		try {	
			Connection conn = ConnectionSingleton.getInstance().getConnection();
			
			String query = "SELECT docenteId, nome, cognome, materia FROM Docente";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Docente d = new Docente();
				d.setId( rs.getInt("docenteId") );
				d.setNome( rs.getString("nome") );
				d.setCognome( rs.getString("cognome") );
				d.setMateria( rs.getString("materia") );
				
				elenco.add(d);
			}
			conn.close();
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		return elenco;
	}   
	
	@Override
	public Docente getById(int id) {
		Docente d = null;
		
		try {	
			Connection conn = ConnectionSingleton.getInstance().getConnection();
			
			String query = "SELECT docenteId, nome, cognome, materia "
					+ "FROM Docente WHERE docenteId = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				d = new Docente();
				d.setId( rs.getInt("docenteId") );
				d.setNome( rs.getString("nome") );
				d.setCognome( rs.getString("cognome") );
				d.setMateria( rs.getString("materia") );
			}
			conn.close();
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return d;
	}
	
	@Override
	public boolean create(Docente obj) {
		boolean result = false;
		
		try {	
			Connection conn = ConnectionSingleton.getInstance().getConnection();
			// INSERT INTO Studente (nome, cognome, matricola, dataNascita) VALUES
			// ('Mario', 'Rossi', 'S000000001', '2000-05-15'),
			
			String query = "INSERT INTO Docente (nome, cognome, materia) VALUES "
					+ "(?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, obj.getNome());
			ps.setString(2, obj.getCognome());
			ps.setString(3, obj.getMateria());
			
			int rowsReturned = ps.executeUpdate();
			
			if (rowsReturned > 0) {
				result = true;
			}

			conn.close();
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}

	@Override
	public boolean update(Docente obj) {
		boolean result = false;
		
		try {	
			Connection conn = ConnectionSingleton.getInstance().getConnection();
						
			int id = obj.getId();
			Docente d = this.getById(id);
			
			if (d != null) {
				d.setNome(obj.getNome() == null ? d.getNome() : obj.getNome());
				// d.setNome(obj.getNome());
				d.setCognome(obj.getCognome());
				d.setMateria(obj.getMateria());
			
				String query = "UPDATE Docente SET "
													+ "nome = ?, "
													+ "cognome = ?, "
													+ "materia = ? "
													+ "WHERE docenteId = ? ";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, d.getNome());
				ps.setString(2, d.getCognome());
				ps.setString(3, d.getMateria());
				ps.setInt(4, d.getId());
				
				int rowsReturned = ps.executeUpdate();
				
				if (rowsReturned > 0) {
					result = true;
				}
			}

			conn.close();
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}

	@Override
	public boolean delete(int id) {
		boolean result = false;
		
		try {	
			Connection conn = ConnectionSingleton.getInstance().getConnection();
						
			String query = "DELETE FROM Docente WHERE docenteId = ? ";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			int rowsReturned = ps.executeUpdate();
			
			if (rowsReturned > 0) {
				result = true;
			}

			conn.close();
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}
	
}
