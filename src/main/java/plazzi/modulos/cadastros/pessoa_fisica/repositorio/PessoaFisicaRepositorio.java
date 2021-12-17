package plazzi.modulos.cadastros.pessoa_fisica.repositorio;

import plazzi.modulos.cadastros.pessoa_fisica.entidades.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaFisicaRepositorio extends JpaRepository<PessoaFisica, Long> {

    Optional<PessoaFisica> findByCpf(String cpf);
}
