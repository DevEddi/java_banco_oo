package Dados_cliente_banco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {
    private Boolean vip;

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    private List<Endereco> enderecos = new ArrayList<Endereco>();

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
