package Dados_cliente_banco;

public class Conta {

    private String numero;
    private Double saldo; //Armazena o saldo da conta

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    //Somar o valor ao Saldo da Conta
    public void depositar(Double valor){
        this.saldo = this.saldo + valor;

    }

    //Subtrair o valor do Saldo da conta
    public void retirar(Double valor){
        if(this.getSaldo() >= valor){
            this.setSaldo( this.getSaldo() - valor);

        }

    }
}
