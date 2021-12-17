package plazzi.core.arquitetura;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {

    @GetMapping(value = "/status")
    public ResponseEntity<StatusDTO> getStatus(){
        StatusDTO statusDTO = new StatusDTO();
        return ResponseEntity.ok().body(statusDTO);
    }
}
