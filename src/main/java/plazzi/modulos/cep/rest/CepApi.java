package plazzi.modulos.cep.rest;


import org.springframework.http.ResponseEntity;
import plazzi.modulos.cep.entidade.Cep;

public interface CepApi {

    ResponseEntity<Cep> BuscarCep(Integer cep);
}
