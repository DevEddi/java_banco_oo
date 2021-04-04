package Dados_cliente_banco;

import java.util.ArrayList;
import java.util.Collection;

public class Principal2 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Victor");
        cliente.setCPF("040302102");

        Endereco endereco1  = new Endereco();
        endereco1.setCep("38021-231");
        endereco1.setCidade("Juiz de Fora");

        Endereco endereco2  = new Endereco();
        endereco2.setCep("42011-231");
        endereco2.setCidade("Rio de Janeiro");

        cliente.addEndereco(endereco1);
        cliente.addEndereco(endereco2);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSalario(1500.0);
        funcionario.setCPF("1234567890");

        Cargo cargo_1 = new Cargo();
        cargo_1.setNome("Caixa");

        Collection<Cargo> cargos_dos_funcionarios = new ArrayList<>();
        cargos_dos_funcionarios.add(cargo_1);

        funcionario.setCargos(cargos_dos_funcionarios);

    }
}
