package TV;

public class ControleRemoto {
    int volume;
    int canal;
    boolean ligada;
    static String marca = "Sambung";

    public ControleRemoto(){
        volume = 0;
        canal = 0;
        ligada = false;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public int aumentarVolume(){
        if(this.ligada == true){
            if(this.volume <= 100){
                return this.volume++;
            }
            else{
                System.out.println("volume maximo");
                return 0;
            }
        }
        else{
            System.out.println("Error");
            return 0;
        }
    }
    public int diminuirVolume(){
        if(this.ligada == true){
            if(this.volume >= 0){
                return this.volume--;
            }
            else{
                System.out.println("volume minimo");
                return 0;
            }
        }
        else{
            System.out.println("Error");
            return 0;
        }
    }
    public static void getMarca(){
        System.out.println(marca);
    }
    public static void setMarca(String M) {
        marca = M;
    }
	
    
}
