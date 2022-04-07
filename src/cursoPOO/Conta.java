package cursoPOO;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    
    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void Extrato(){
        System.out.println("Nome: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Numero: " + this.getNumConta());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Saldo: " + this.getSaldo());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        }
        else if(t == "CP"){
            this.setSaldo(150);
        }
        else{
            System.out.println("Error");
        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");;
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta com débito");
        }
        else{
            this.setStatus(false);
        }
        
    }

    public void sacar(int v){
        if(this.status = true){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("impossivel sacar");
        }
        
    }

    public void depositar(int v){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
        }
        else{
            System.out.println("error");
        }

    }

    public void pagarMensal(){
        int v = 0;
        // if(this.status = true){
        //     if(getSaldo() > 0 && getTipo() == "CC"){
        //         v = 12;
        //         saldo -= v;
        //     }
        //     else if(getSaldo() > 0 && getTipo() == "CP"){
        //         v = 20;
        //         saldo -= v;
        //     }
        //     else{
        //         System.out.println("Saldo insuficiente");
        //     }
        // }
        // System.out.println("impossivel pagar");
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() - v);
        }else{
            System.out.println("impossivel pagar");
        }

    }
    public String getDono() {
        return dono;
    }public int getNumConta() {
        return numConta;
    }public int getSaldo() {
        return saldo;
    }public String getTipo() {
        return tipo;
    }public boolean getStatus() {
        return status;
    }public void setDono(String dono) {
        this.dono = dono;
    }public void setNumConta(int numConta) {
        this.numConta = numConta;
    }public void setSaldo(int saldo) {
        this.saldo = saldo;
    }public void setStatus(boolean status) {
        this.status = status;
    }public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
