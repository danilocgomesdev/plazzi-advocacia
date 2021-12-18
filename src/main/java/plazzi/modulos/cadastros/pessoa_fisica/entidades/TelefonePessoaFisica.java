package plazzi.modulos.cadastros.pessoa_fisica.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TELEFONE_PESSOA_FISICA")
public class TelefonePessoaFisica implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long idTelefone;

    @ManyToOne
    @JoinColumn(name = "ID_PESSOA_FISICA")
    private PessoaFisica pessoaFisica;
    private String tipo;
    private String numero;

    public TelefonePessoaFisica(){}

    public TelefonePessoaFisica(Long idTelefone, PessoaFisica pessoaFisica, String tipo, String numero) {
        this.idTelefone = idTelefone;
        this.pessoaFisica = pessoaFisica;
        this.tipo = tipo;
        this.numero = numero;
    }

    public Long getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Long idTelefone) {
        this.idTelefone = idTelefone;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
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
        return Objects.equals(idTelefone, that.idTelefone) && Objects.equals(pessoaFisica, that.pessoaFisica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTelefone, pessoaFisica);
    }
}
