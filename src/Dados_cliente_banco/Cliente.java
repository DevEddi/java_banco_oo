package Dados_cliente_banco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {

    private String CPF;
    private String Nome;
    private String telefone;
    private String sexo;
    private String naturalidade;
    private Date nascimento;

    private List<Endereco> enderecos = new ArrayList<Endereco>();


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }


    public void listarEnderecos(){
        for (Endereco endereco: this.enderecos){
            System.out.println("Enderecos:");
            System.out.println("CEP:" + endereco.getCep());
            System.out.println("logradouro:" + endereco.getLogradouro());
            System.out.println("Número:" + endereco.getNumero());
            System.out.println("Complemento:" + endereco.getComplemento());
            System.out.println("Cidade:" + endereco.getComplemento());
            System.out.println("UF:" + endereco.getUf());
        }
    }
}
