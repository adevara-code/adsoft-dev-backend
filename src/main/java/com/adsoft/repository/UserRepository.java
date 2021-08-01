/**
 * 
 */
package com.adsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adsoft.model.User;

/**
 * @author admin
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
