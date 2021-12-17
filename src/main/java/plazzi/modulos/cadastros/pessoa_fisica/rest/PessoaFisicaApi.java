package plazzi.modulos.cadastros.pessoa_fisica.rest;

import plazzi.modulos.cadastros.pessoa_fisica.entidades.PessoaFisica;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface PessoaFisicaApi {

    ResponseEntity<List<PessoaFisica>> ListarUsuarios();

    ResponseEntity<PessoaFisica> BuscarPorId(Long id);

    ResponseEntity<PessoaFisica> BuscarPorCpf(String cpf);

    ResponseEntity<PessoaFisica> Adicionar(PessoaFisica pessoaFisica);

    ResponseEntity<Void> Remover(Long id);

    ResponseEntity<PessoaFisica> Atualizar(Long id, PessoaFisica pessoaFisica);

}
