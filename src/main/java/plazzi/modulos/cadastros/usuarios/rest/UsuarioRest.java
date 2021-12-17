package plazzi.modulos.cadastros.usuarios.rest;

import plazzi.modulos.cadastros.usuarios.entidade.Usuario;
import plazzi.modulos.cadastros.usuarios.servicos.UsuarioServicos;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
@Api(value="API REST Pessoa Fisica")
@CrossOrigin(origins = "*")
public class UsuarioRest implements UsuarioApi {

    @Autowired
    UsuarioServicos usuarioServicos;

    @GetMapping
    public ResponseEntity<List<Usuario>> ListarUsuarios() {
        List<Usuario> list = usuarioServicos.findAll();
            return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> BuscarPorId(@PathVariable Long id) {
        Usuario usuario = usuarioServicos.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario> Adicionar(@RequestBody Usuario usuario){
        usuario = usuarioServicos.inserir(usuario);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(usuario);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> Remover(@PathVariable Long id) {
        usuarioServicos.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> Atualizar(@PathVariable Long id, @RequestBody Usuario usuario ) {
       usuario = usuarioServicos.atualizar(id, usuario);
       return ResponseEntity.ok().body(usuario);
    }
}
