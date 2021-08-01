/**
 * 
 */
package com.adsoft;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.adsoft.model.User;
import com.adsoft.repository.UserRepository;

/**
 * @author admin
 *
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
	@Autowired
	private UserRepository repo;
	@Autowired
	private TestEntityManager entityManager;

	/*
	 * @Test public void testCreateUser() { User user = new User();
	 * user.setEmail("sreelatha.devara@gmail.com");
	 * user.setPassword("capgemini@2021"); user.setFirstName("Sreelatha");
	 * user.setLastName("Devara"); User savedUser = repo.save(user);
	 * System.out.println("user saved successfully " + savedUser);
	 * 
	 * User existUser = entityManager.find(User.class, savedUser.getId());
	 * assertThat(existUser.getEmail()).isEqualTo(user.getEmail()); }
	 */

	@Test
	public void testCreateUser() {
		User user = new User();
		user.setEmailId("ashoka.devara2024@gmail.com");
		user.setPassword("corp@123");
		user.setUserName("adevara");
		User savedUser = repo.save(user);
		System.out.println("user saved successfully " + savedUser);

		User existUser = entityManager.find(User.class, savedUser.getId());
		assertThat(existUser.getEmailId()).isEqualTo(user.getEmailId());
	}

}
