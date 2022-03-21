package teste;

public class Caneta {
    private String modelo;
    private String cor;
    private Double ponta;
    protected int carga ;
    protected Boolean tampada;
    
    public Caneta(String m, String c, Double p){
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
        this.tampar();
    }

    public void rabiscar(){
        if(tampada == true && carga > 0){
            System.out.print("Error ");
        }
        else if(tampada == false){
            carga--;
            System.out.println(" Rabiscando"+ " Quantidade de carga: "+ carga);
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m; 
    }

    public Double getPonta(){
        return this.ponta;
    }

    public void setPonta(Double p){
        this.ponta = p;
    }

    public void Status(){
        System.out.print("Modelo: "+ this.modelo);
        System.out.print(" Cor: "+ this.cor);
        System.out.print(" Ponta: "+ this.ponta);
    }

    

}
