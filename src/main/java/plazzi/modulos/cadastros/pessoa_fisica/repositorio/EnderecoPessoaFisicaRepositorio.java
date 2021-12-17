package plazzi.modulos.cadastros.pessoa_fisica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plazzi.modulos.cadastros.pessoa_fisica.entidades.EnderecoPessoaFisica;

@Repository
public interface EnderecoPessoaFisicaRepositorio extends JpaRepository<EnderecoPessoaFisica, Long> {

}
