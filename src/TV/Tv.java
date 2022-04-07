package TV;

public class Tv {
    
    public static void main(String[] args) {
        
        ControleRemoto.getMarca();
        ControleRemoto tv = new ControleRemoto();
        ControleRemoto.setMarca("Sony");
        ControleRemoto.getMarca();
        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
    }

}
