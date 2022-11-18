package com.naturalim.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.naturalim.demo.models.Reclamos;

@Repository
public interface IReclamos extends CrudRepository<Reclamos, Integer> {

}
