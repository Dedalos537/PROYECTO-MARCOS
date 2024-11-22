package com.mtw.logeoregistrar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtw.logeoregistrar.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
    public Usuario findByEmail(String email);

}
