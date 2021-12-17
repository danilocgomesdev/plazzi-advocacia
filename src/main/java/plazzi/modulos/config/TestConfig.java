package plazzi.modulos.config;

import plazzi.modulos.cadastros.usuarios.entidade.Usuario;
import plazzi.modulos.cadastros.usuarios.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public void run(String... args) throws Exception {
        Usuario u1 = new Usuario(null, 1L, "Maria da Silva","mariadasilva@gmail.com", "1234");
        Usuario u2 = new Usuario(null,2L, "João da Silva","joaodasilva@gmail.com", "1234");

        usuarioRepositorio.saveAll(Arrays.asList(u1,u2));
    }
}
