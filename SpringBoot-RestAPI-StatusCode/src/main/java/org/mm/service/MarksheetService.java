package org.mm.service;

import java.util.List;

import org.mm.dao.MarksheetRepository;
import org.mm.entities.Marksheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksheetService 
{
	@Autowired
	private MarksheetRepository marksheetRepository;
	
	public List<Marksheet> getAllMarksheet()
	{
		List<Marksheet> li = (List<Marksheet>) marksheetRepository.findAll();
		return li;
	}
	
	public Marksheet getById(long id)
	{
		Marksheet m = marksheetRepository.findById(id).get();
		return m;
	}
	
	public Marksheet save(Marksheet m)
	{
		Marksheet result = marksheetRepository.save(m);
		return result;
	}
	
	public Marksheet update(Marksheet m)
	{
		Marksheet old = marksheetRepository.findById(m.getId()).get();
		old.setName(m.getName());
		old.setEnglish(m.getEnglish());
		old.setMaths(m.getMaths());
		old.setRollno(m.getRollno());
		old.setScience(m.getScience());
		
		Marksheet result = marksheetRepository.save(old);
		return result;
	}
	
	public void deleteById(long id)
	{
		marksheetRepository.deleteById(id);
	}
	
	public List<Marksheet> findMarksheetByName(String name)
	{
		List<Marksheet> li = marksheetRepository.findByName(name);
		return li;
	}
}
