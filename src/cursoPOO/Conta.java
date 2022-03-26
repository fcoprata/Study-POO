package cursoPOO;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private boolean status;

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t == "CC"){
            saldo = 50.0;
        }
        else if(t == "CP"){
            saldo = 150.0;
        }
        else{
            System.out.println("Error");
        }
    }

    public void fecharConta(){
        if(saldo == 0){
            setStatus(false);
        }
        else if(saldo > 0){
            sacar();
        }
    }

    public void sacar(){
        getSaldo();
        
    }

    public void saque(){

    }

    public void deposito(){

    }

    public void pagarMensal(){

    }

    public Conta(){
        saldo = 0.0;
        status = false;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return tipo; 
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return dono; 
    }

    public void setSaldo(Double s){
        this.saldo = s;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean stat){
        this.status = stat;
    }

}
