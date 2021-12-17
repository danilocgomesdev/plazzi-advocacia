package plazzi.modulos.cadastros.pessoa_fisica.servicos;

import plazzi.core.exception.EntidadeNotFoundException;
import plazzi.modulos.cadastros.pessoa_fisica.entidades.PessoaFisica;
import plazzi.modulos.cadastros.pessoa_fisica.repositorio.PessoaFisicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaFisicaServicos {

    @Autowired
    PessoaFisicaRepositorio pessoaFisicaRepositorio;


    public List<PessoaFisica> findAll(){
        return pessoaFisicaRepositorio.findAll();
    }

    public PessoaFisica findById(Long id){
        Optional<PessoaFisica> obj = pessoaFisicaRepositorio.findById(id);
        return obj.orElseThrow(() -> new EntidadeNotFoundException("Id not found "+ id));
    }

    public PessoaFisica findCpf(String cpf){
        Optional<PessoaFisica> obj = pessoaFisicaRepositorio.findByCpf(cpf);
        return obj.orElseThrow(() -> new EntidadeNotFoundException("Cpf not found "+ cpf));
    }

    public PessoaFisica inserir(PessoaFisica pessoaFisica){
        return pessoaFisicaRepositorio.save(pessoaFisica);
    }

    public void deletar(Long id){
        try {
            pessoaFisicaRepositorio.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            throw new EntidadeNotFoundException("Id not found "+ id);
        }
    }

    public PessoaFisica atualizar(Long id, PessoaFisica pessoaFisica){
        try {
        PessoaFisica entidade = pessoaFisicaRepositorio.getOne(id);
        updadeDados(entidade, pessoaFisica);
        return pessoaFisicaRepositorio.save(entidade);
        } catch (EntityNotFoundException e){
            throw new EntidadeNotFoundException("Id not found "+ id);
        }
    }

    private void updadeDados(PessoaFisica entidade, PessoaFisica pessoaFisica) {
        entidade.setNome(pessoaFisica.getNome());
        entidade.setEmail(pessoaFisica.getEmail());
        entidade.setEscolaridade(pessoaFisica.getEscolaridade());

    }

}
