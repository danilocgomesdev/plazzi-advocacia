package plazzi.modulos.cadastros.pessoa_fisica.entidades;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "PESSOA_FISICA")
public class PessoaFisica implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPf;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String email;
    private String sexo;
    private String escolaridade;
    private String rg;
    private String orgaoExpedidor;
    private Date dataExpedicao;
    private String estadoCivil;
    private String nacionalidade;

    public PessoaFisica(){
    }

    public PessoaFisica(Long idPf, String nome, String cpf, Date dataNascimento, String email, String sexo, String escolaridade, String rg, String orgaoExpedidor, Date dataExpedicao, String estadoCivil, String nacionalidade) {
        this.idPf = idPf;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.sexo = sexo;
        this.escolaridade = escolaridade;
        this.rg = rg;
        this.orgaoExpedidor = orgaoExpedidor;
        this.dataExpedicao = dataExpedicao;
        this.estadoCivil = estadoCivil;
        this.nacionalidade = nacionalidade;
    }

    public Long getIdPf() {
        return idPf;
    }

    public void setIdPf(Long idPf) {
        this.idPf = idPf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public Date getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(Date dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaFisica)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(idPf, that.idPf) && Objects.equals(cpf, that.cpf) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPf, cpf, email);
    }
}
