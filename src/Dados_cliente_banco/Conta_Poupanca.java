package Dados_cliente_banco;

public class Conta_Poupanca extends Conta{

    private Double rentabilidadeMensal;

    public Double getRentabilidade() {
        return rentabilidadeMensal;
    }

    public void setRentabilidade(Double rentabilidade) {
        this.rentabilidadeMensal = rentabilidade;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal){
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    //Retirar dinehiro da contaPoupanca e enviar para conta Destino
    public void resgatar (Conta contaDestino, Double valor){

    }
}