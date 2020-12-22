package com.example.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);

}
