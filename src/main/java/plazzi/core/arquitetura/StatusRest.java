package plazzi.core.arquitetura;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusRest {

    @GetMapping(value = "/status")
    public ResponseEntity<StatusDto> getStatus(){
        StatusDto status = new StatusDto();
        return ResponseEntity.ok().body(status);
    }
}
