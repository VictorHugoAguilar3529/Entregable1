package mx.edu.uteq.tienda.repositorio;

import org.springframework.stereotype.Repository;

import mx.edu.uteq.tienda.modelo.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
