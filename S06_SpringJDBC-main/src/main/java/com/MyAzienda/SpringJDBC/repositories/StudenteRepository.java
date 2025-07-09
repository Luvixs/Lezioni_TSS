package com.MyAzienda.SpringJDBC.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.MyAzienda.SpringJDBC.models.Studente;
import com.mysql.cj.jdbc.MysqlDataSource;

//CRUD -> Create - Read - Update - Delete

@Repository
public class StudenteRepository implements IRepositoryRead<Studente>, IRepositoryWrite<Studente> {

	// Posso cmq creare un metodo personalizzato....
	public Studente getByMatricola(String matricola) {
		return null;
	}
	
	@Override
	public List<Studente> getAll() {
		List<Studente> elenco = new ArrayList<Studente>();
		
		try {	
			Connection conn = ConnectionSingleton.getInstance().getConnection();
			
			String query = "SELECT studenteId, nome, cognome, matricola, dataNascita FROM Studente";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Studente s = new Studente();
				s.setId( rs.getInt("studenteId") );
				s.setNome( rs.getString("nome") );
				s.setCognome( rs.getString("cognome") );
				s.setMatricola( rs.getString("matricola") );
				s.setDataNascita( rs.getDate("dataNascita") );
				
				elenco.add(s);
			}
			conn.close();
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		return elenco;
	}   
	
	@Override
	public Studente getById(int id) {
		Studente s = null;
		
		try {	
			Connection conn = ConnectionSingleton.getInstance().getConnection();
			
			String query = "SELECT studenteId, nome, cognome, matricola, dataNascita "
					+ "FROM Studente WHERE studenteId = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				s = new Studente();
				s.setId( rs.getInt("studenteId") );
				s.setNome( rs.getString("nome") );
				s.setCognome( rs.getString("cognome") );
				s.setMatricola( rs.getString("matricola") );
				s.setDataNascita( rs.getDate("dataNascita") );
			}
			conn.close();
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return s;
	}
	
	@Override
	public boolean create(Studente obj) {
		boolean result = false;
		
		try {	
			Connection conn = ConnectionSingleton.getInstance().getConnection();
			// INSERT INTO Studente (nome, cognome, matricola, dataNascita) VALUES
			// ('Mario', 'Rossi', 'S000000001', '2000-05-15'),
			
			String query = "INSERT INTO Studente (nome, cognome, matricola, dataNascita) VALUES "
					+ "(?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, obj.getNome());
			ps.setString(2, obj.getCognome());
			ps.setString(3, obj.getMatricola());
			ps.setDate(4, obj.getDataNascita());
			
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
	public boolean update(Studente obj) {
		boolean result = false;
		
		try {	
			Connection conn = ConnectionSingleton.getInstance().getConnection();
						
			int id = obj.getId();
			Studente s = this.getById(id);
			
			if (s != null) {
				s.setNome(obj.getNome() == null ? s.getNome() : obj.getNome());
				// s.setNome(obj.getNome());
				s.setCognome(obj.getCognome());
				s.setMatricola(obj.getMatricola());
				s.setDataNascita(obj.getDataNascita());
			
				String query = "UPDATE Studente SET "
													+ "nome = ?, "
													+ "cognome = ?, "
													+ "matricola = ?, "
													+ "dataNascita = ? "
													+ "WHERE studenteId = ? ";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, s.getNome());
				ps.setString(2, s.getCognome());
				ps.setString(3, s.getMatricola());
				ps.setDate(4, s.getDataNascita());
				ps.setInt(5, s.getId());
				
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
						
			String query = "DELETE FROM Studente WHERE studenteId = ? ";
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
