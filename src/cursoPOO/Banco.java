package cursoPOO;

public class Banco {
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.abrirConta("CP");
        c1.setDono("Francisco");
        c1.setNumConta(1234);
        c1.depositar(323.00);
        c1.pagarMensal();
        c1.Extrato();
        c1.fecharConta();
        c1.sacar(453.00);
        c1.fecharConta();
        c1.Extrato();
    }
}
