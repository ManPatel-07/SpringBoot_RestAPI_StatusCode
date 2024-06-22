package org.mm.dao;

import java.util.List;

import org.mm.entities.Marksheet;
import org.springframework.data.repository.CrudRepository;

public interface MarksheetRepository extends CrudRepository<Marksheet, Long>
{
	List<Marksheet> findByName(String name);
}
