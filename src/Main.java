import bancoPOO.cliente.Cliente;
import bancoPOO.conta.Conta;
import bancoPOO.conta.ContaCorrente;
import bancoPOO.conta.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Cliente lcv = new Cliente("Lauriano");


        Cliente ml = new Cliente("Maria Laura");


        Conta cclcv = new ContaCorrente(lcv);
        cclcv.imprimirExt();
        cclcv.depositar(300);

        Conta cplcv = new ContaPoupanca(lcv);
        cplcv.imprimirExt();

        Conta ccml = new ContaCorrente(ml);
        ccml.imprimirExt();

        cclcv.transferir(ccml,100);
        cclcv.imprimirExt();
        ccml.imprimirExt();







    }
}