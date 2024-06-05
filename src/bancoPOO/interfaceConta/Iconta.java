package bancoPOO.interfaceConta;

import bancoPOO.conta.Conta;

public interface Iconta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta contaDestino, double valor);

    void imprimirExt();
}
