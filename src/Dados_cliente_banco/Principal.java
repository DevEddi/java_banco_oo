package Dados_cliente_banco;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Victor");
        cliente.setCPF("040302102");

        Endereco endereco1  = new Endereco();
        endereco1.setCep("38021-231");
        endereco1.setCidade("Juiz de Fora");



        cliente.addEndereco(endereco1);


        endereco1.setCliente(cliente);

        cliente.listarEnderecos();
        System.out.println(endereco1.getCliente().getNome());

    }
}
