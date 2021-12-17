package plazzi.modulos.cadastros.usuarios.rest;

import plazzi.modulos.cadastros.usuarios.entidade.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface UsuarioApi {

    ResponseEntity<List<Usuario>> ListarUsuarios();

    ResponseEntity<Usuario> BuscarPorId(Long id);

    ResponseEntity<Usuario> Adicionar(Usuario usuario);

    ResponseEntity<Void> Remover(Long id);

    ResponseEntity<Usuario> Atualizar(Long id, Usuario usuario);

}
