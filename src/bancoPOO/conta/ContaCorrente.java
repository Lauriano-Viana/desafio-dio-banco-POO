package bancoPOO.conta;

import bancoPOO.cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }


    public void imprimirExt() {
        System.out.println("Imprimir extrato conta corrente cliente: "+ cliente.getNome() );
        super.printInfos();
    }
}
