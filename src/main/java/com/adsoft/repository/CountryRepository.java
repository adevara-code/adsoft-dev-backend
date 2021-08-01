/**
 * 
 */
package com.adsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adsoft.model.Country;

/**
 * @author admin
 *
 */
@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}
