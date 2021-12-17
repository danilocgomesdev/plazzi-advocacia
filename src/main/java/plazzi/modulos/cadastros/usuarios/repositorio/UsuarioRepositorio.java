package plazzi.modulos.cadastros.usuarios.repositorio;

import plazzi.modulos.cadastros.usuarios.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
