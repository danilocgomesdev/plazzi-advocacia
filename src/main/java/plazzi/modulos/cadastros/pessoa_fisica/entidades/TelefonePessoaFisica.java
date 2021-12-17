package plazzi.modulos.cadastros.pessoa_fisica.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TELEFONE_PF")
public class TelefonePessoaFisica implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTelefone;

    private Long idPessoa;
    private String tipo;
    private String numero;

    public TelefonePessoaFisica(){}

    public TelefonePessoaFisica(Long idTelefone, Long idPessoa, String tipo, String numero) {
        this.idTelefone = idTelefone;
        this.idPessoa = idPessoa;
        this.tipo = tipo;
        this.numero = numero;
    }

    public Long getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Long idTelefone) {
        this.idTelefone = idTelefone;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TelefonePessoaFisica)) return false;
        TelefonePessoaFisica that = (TelefonePessoaFisica) o;
        return Objects.equals(idTelefone, that.idTelefone) && Objects.equals(idPessoa, that.idPessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTelefone, idPessoa);
    }
}
