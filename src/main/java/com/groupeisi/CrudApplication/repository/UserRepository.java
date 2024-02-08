package com.groupeisi.CrudApplication.repository;

import com.groupeisi.CrudApplication.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
