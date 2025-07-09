package com.MyAzienda.SpringJDBC.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyAzienda.SpringJDBC.models.Studente;
import com.MyAzienda.SpringJDBC.services.StudenteService;

@RestController
@RequestMapping("api/studenti")
public class StudenteController {
	
	@Autowired
	private StudenteService service;
	
	@GetMapping("elenco")
	public List<Studente> elencoStudenti() {
		return service.elencoStudentiService();
	}
	
	/********** prima questa e poi con ResponseEntity ******/
	@GetMapping("dettaglio/{id}")
	public Studente studenteDettaglio(@PathVariable int id) {
		return service.studenteDettService(id);
	}
	
	@GetMapping("{id}")
	public ResponseEntity studenteDettaglioRE(@PathVariable int id) {
		Studente result = service.studenteDettService(id);
		
		if (result == null) 
			return ResponseEntity.notFound().build();
		else 
			return ResponseEntity.ok(result);
	}
	
	/********** prima questa e poi con ResponseEntity ******/
	@PostMapping("crea")
	public boolean studenteCrea(@RequestBody Studente obj) {
		return service.createStudenteService(obj);
	}
	
	@PostMapping("creaRE")
	public ResponseEntity studenteCreaRE(@RequestBody Studente s) {
		boolean insertResult = service.createStudenteService(s);
		
		if (insertResult)
			return ResponseEntity.ok().build();
		else
			return ResponseEntity.unprocessableEntity().build();
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity studenteDeleteRE(@PathVariable int id) {
		if ( service.deleteStudenteService(id) )
			return ResponseEntity.ok().build();
			
	    return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity updateStudenteRE(@PathVariable int id, @RequestBody Studente s) {
		if ( id != 0) {
			s.setId(id);
			if ( service.updateStudenteService(s) )
				return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.badRequest().build();	
	}

}
