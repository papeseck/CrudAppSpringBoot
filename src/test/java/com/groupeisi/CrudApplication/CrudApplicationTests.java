package com.groupeisi.CrudApplication;

import com.groupeisi.CrudApplication.entities.UserEntity;
import com.groupeisi.CrudApplication.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CrudApplicationTests {

	@Autowired
	private UserRepository userEntityRepository;

	@Test
	void contextLoads() {

	}

	@Test
	void testSaveUserEntity() {
		// Créez un utilisateur
		UserEntity userEntity = new UserEntity();
		userEntity.setPrenom("John");
		userEntity.setNom("Doe");
		userEntity.setAdresse("123 Main Street");
		userEntity.setTelephone("123-456-7890");


		userEntityRepository.save(userEntity);


		UserEntity savedUser = userEntityRepository.findById(userEntity.getId()).orElse(null);


		assertNotNull(savedUser);
		assertEquals(userEntity.getPrenom(), savedUser.getPrenom());
		assertEquals(userEntity.getNom(), savedUser.getNom());
		assertEquals(userEntity.getAdresse(), savedUser.getAdresse());
		assertEquals(userEntity.getTelephone(), savedUser.getTelephone());
	}


}
