package plazzi.modulos.cadastros.usuarios.servicos;

import plazzi.core.exception.EntidadeNotFoundException;
import plazzi.modulos.cadastros.usuarios.entidade.Usuario;
import plazzi.modulos.cadastros.usuarios.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicos {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;


    public List<Usuario> findAll(){
        return usuarioRepositorio.findAll();
    }

    public Usuario findById(Long id){
        Optional<Usuario> obj = usuarioRepositorio.findById(id);
        return obj.orElseThrow(() -> new EntidadeNotFoundException("Id not found "+ id));
    }

    public Usuario inserir(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }

    public void deletar(Long id){
        try {
            usuarioRepositorio.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            throw new EntidadeNotFoundException("Id not found "+ id);
        }
    }

    public Usuario atualizar(Long id, Usuario usuario){
        try {
        Usuario entidade = usuarioRepositorio.getOne(id);
        updadeDados(entidade, usuario);
        return usuarioRepositorio.save(entidade);
        } catch (EntityNotFoundException e){
            throw new EntidadeNotFoundException("Id not found "+ id);
        }
    }

    private void updadeDados(Usuario entidade, Usuario usuario) {
        entidade.setNome(usuario.getNome());
        entidade.setEmail(usuario.getEmail());
    }


}
