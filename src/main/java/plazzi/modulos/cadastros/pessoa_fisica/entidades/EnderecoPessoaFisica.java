package plazzi.modulos.cadastros.pessoa_fisica.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ENDERECO_PF")
public class EnderecoPessoaFisica implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;

    private Long idPessoa;
    private String rua;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    public EnderecoPessoaFisica(){}

    public EnderecoPessoaFisica(Long idEndereco, Long idPessoa, String rua, String complemento, String numero, String bairro, String cidade, String uf) {
        this.idEndereco = idEndereco;
        this.idPessoa = idPessoa;
        this.rua = rua;
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnderecoPessoaFisica)) return false;
        EnderecoPessoaFisica that = (EnderecoPessoaFisica) o;
        return Objects.equals(idEndereco, that.idEndereco) && Objects.equals(idPessoa, that.idPessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEndereco, idPessoa);
    }
}
