package Dados_cliente_banco;

public class Conta_Corrente extends Conta {

    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    //Transfere o valor da conta Atual para a conta do Destino contadestino
    public void transferir(Conta contdestino, Double valor) {
        Double salddoLimite = this.getSaldo() + this.getLimite();

        if (saldoLimite >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            conta.Destino.depositar(valor);
        }
    }

    //Soma o valor recebido ao saldo da conta
    public void receber(Double valor){

    }
}