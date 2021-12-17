package plazzi.modulos.cep.rest;

import plazzi.core.exception.EntidadeNotFoundException;
import plazzi.modulos.cep.entidade.Cep;
import plazzi.modulos.cep.servicos.CepServicos;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="API REST Pessoa Fisica")
@CrossOrigin(origins = "*")
public class CepRest implements CepApi {

    @Autowired
    CepServicos cepServicos;

    @GetMapping(value = "/cep/{cep}")
    public ResponseEntity<Cep> BuscarCep(@PathVariable Integer cep) {
        Cep cep1 = this.cepServicos.obterCep(cep);
        if(cep1.getCep() == null) throw new EntidadeNotFoundException("Cep not found " + Long.valueOf(cep));
        return ResponseEntity.ok().body(cep1);
    }
}
