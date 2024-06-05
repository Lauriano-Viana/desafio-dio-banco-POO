package bancoPOO.conta;

import bancoPOO.cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    public void imprimirExt() {
        System.out.println("Imprimir extrato conta poupança cliente: " + cliente.getNome());
        super.printInfos();
    }

}
