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
		// Assurez-vous que le contexte Spring se charge correctement
	}

	@Test
	void testSaveUserEntity() {
		// Créez un utilisateur
		UserEntity userEntity = new UserEntity();
		userEntity.setPrenom("John");
		userEntity.setNom("Doe");
		userEntity.setAdresse("123 Main Street");
		userEntity.setTelephone("123-456-7890");

		// Sauvegardez l'utilisateur dans la base de données
		userEntityRepository.save(userEntity);

		// Récupérez l'utilisateur par ID depuis la base de données
		UserEntity savedUser = userEntityRepository.findById(userEntity.getId()).orElse(null);

		// Assurez-vous que l'utilisateur est sauvegardé et que les propriétés sont correctes
		assertNotNull(savedUser);
		assertEquals(userEntity.getPrenom(), savedUser.getPrenom());
		assertEquals(userEntity.getNom(), savedUser.getNom());
		assertEquals(userEntity.getAdresse(), savedUser.getAdresse());
		assertEquals(userEntity.getTelephone(), savedUser.getTelephone());
	}

	// Ajoutez d'autres méthodes de test pour les opérations CRUD (update, delete, findAll, etc.)
}
