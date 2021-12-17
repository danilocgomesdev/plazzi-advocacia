package plazzi.modulos.cep.servicos;

import plazzi.core.exception.EntidadeNotFoundException;
import plazzi.modulos.cep.entidade.Cep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

@Service
public class CepServicos {

    @Autowired
    WebClient webClient;

    public Cep obterCep(Integer cep){
        try {
        Mono<Cep> cepMono = this.webClient
                .method(HttpMethod.GET)
                .uri("/{cep}/json", cep)
                .retrieve()
                .bodyToMono(Cep.class);
        return cepMono.block();
        } catch (WebClientResponseException e){
            throw new EntidadeNotFoundException("Cep not found "+ cep);
        }
    }

}
