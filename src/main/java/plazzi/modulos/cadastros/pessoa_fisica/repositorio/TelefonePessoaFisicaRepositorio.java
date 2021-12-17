package plazzi.modulos.cadastros.pessoa_fisica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plazzi.modulos.cadastros.pessoa_fisica.entidades.TelefonePessoaFisica;

@Repository
public interface TelefonePessoaFisicaRepositorio extends JpaRepository<TelefonePessoaFisica, Long> {

}
