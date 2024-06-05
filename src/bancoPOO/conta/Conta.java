package bancoPOO.conta;

import bancoPOO.cliente.Cliente;
import bancoPOO.interfaceConta.Iconta;

public abstract class Conta implements Iconta {
    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente= cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
      this.sacar(valor);
      contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void printInfos() {
        System.out.printf("Agencia: %d \n", this.agencia);
        System.out.printf("Conta: %d \n", this.numero);
        System.out.printf("Saldo: %.2f \n", this.saldo);
    }



}
