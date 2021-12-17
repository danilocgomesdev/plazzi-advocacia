package plazzi.modulos.cep.rest;


import plazzi.modulos.cep.entidade.Cep;
import org.springframework.http.ResponseEntity;

public interface CepApi {

    ResponseEntity<Cep> BuscarCep(Integer cep);
}
