package plazzi.modulos.cadastros.pessoa_fisica.rest;

import plazzi.modulos.cadastros.pessoa_fisica.entidade.PessoaFisica;
import plazzi.modulos.cadastros.pessoa_fisica.servicos.PessoaFisicaServicos;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoafisica")
@Api(value="API REST Pessoa Fisica")
@CrossOrigin(origins = "*")
public class PessoaFisicaRest implements PessoaFisicaApi {

    @Autowired
    PessoaFisicaServicos pessoaFisicaServicos;

    @GetMapping
    @ApiOperation(value="Retorna uma lista de Pessoas")
    public ResponseEntity<List<PessoaFisica>> ListarUsuarios() {
        List<PessoaFisica> list = pessoaFisicaServicos.findAll();
            return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value="Busca uma Pessoa por ID")
    public ResponseEntity<PessoaFisica> BuscarPorId(@PathVariable Long id) {
        PessoaFisica pessoaFisica = pessoaFisicaServicos.findById(id);
        return ResponseEntity.ok().body(pessoaFisica);
    }

    @GetMapping(value = "/cpf/{cpf}")
    @ApiOperation(value="Busca uma Pessoa por CPF")
    public ResponseEntity<PessoaFisica> BuscarPorCpf(@PathVariable String cpf) {
        PessoaFisica pessoaFisica = pessoaFisicaServicos.findCpf(cpf);
        return ResponseEntity.ok().body(pessoaFisica);
    }

    @PostMapping
    public ResponseEntity<PessoaFisica> Adicionar(@RequestBody PessoaFisica pessoaFisica){
        pessoaFisica = pessoaFisicaServicos.inserir(pessoaFisica);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(pessoaFisica.getId_pf()).toUri();
        return ResponseEntity.created(uri).body(pessoaFisica);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value="Deleta uma Pessoa")
    public ResponseEntity<Void> Remover(@PathVariable Long id) {
        pessoaFisicaServicos.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    @ApiOperation(value="Retorna uma lista de Produtos")
    public ResponseEntity<PessoaFisica> Atualizar(@PathVariable Long id, @RequestBody PessoaFisica pessoaFisica) {
       pessoaFisica = pessoaFisicaServicos.atualizar(id, pessoaFisica);
       return ResponseEntity.ok().body(pessoaFisica);
    }
}
