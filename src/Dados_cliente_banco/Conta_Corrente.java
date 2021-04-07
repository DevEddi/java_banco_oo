package Dados_cliente_banco;

public class Conta_Corrente extends Conta {

    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    //Transfere o valor da conta Atual para a conta do Destino 'contadestino'
    public void transferir(Conta contdestino, Double valor){

    }
    //Somar
    public void receber(Double valor){

    }
}
