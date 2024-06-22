package org.mm.controller;

import java.util.List;

import org.mm.entities.Marksheet;
import org.mm.service.MarksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarksheetController 
{
	@Autowired
	private MarksheetService marksheetService;
	
	@GetMapping(value = "/marksheet")
	public ResponseEntity<List<Marksheet>> index()
	{
		List<Marksheet> li = marksheetService.getAllMarksheet();
		return new ResponseEntity<List<Marksheet>>(li, HttpStatus.OK);
	}
	
	@GetMapping(value = "/marksheet/{id}")
	public ResponseEntity<Marksheet> getById(@PathVariable("id") long id)
	{
		Marksheet m = marksheetService.getById(id);
		return new ResponseEntity<Marksheet>(m, HttpStatus.OK);
	}
	
	@PostMapping(value = "/marksheet")
	public ResponseEntity<Marksheet> save(@RequestBody Marksheet m)
	{
		Marksheet result = marksheetService.save(m);
		return new ResponseEntity<Marksheet>(result, HttpStatus.OK);
	}
	
	@PutMapping(value = "/marksheet")
	public ResponseEntity<Marksheet> update(@RequestBody Marksheet m)
	{
		Marksheet result = marksheetService.save(m);
		return new ResponseEntity<Marksheet>(result, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/marksheet/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") long id)
	{
		marksheetService.deleteById(id);
		return new ResponseEntity<String>("Record Deleted ...", HttpStatus.NO_CONTENT);
	}
	
	@GetMapping(value = "/marksheet/name/{name}")
	public ResponseEntity<List<Marksheet>> findMarksheetByName(@PathVariable("name") String name)
	{
		List<Marksheet> li = marksheetService.findMarksheetByName(name);
		return new ResponseEntity<List<Marksheet>>(li, HttpStatus.OK);
	}
	
}
