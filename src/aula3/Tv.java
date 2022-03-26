package aula3;

public class Tv {
    public int volume;
    public int canal;

    public Tv(){
        this.volume = 10;
        this.canal = 10;
    }

    public void aumentarVolume(){
        // this.volume = this.volume + 1;
        System.out.println(this.volume);
        System.out.println("Volume: " + this.volume++);
        System.out.println(this.volume);
    }
    public void diminuirVolume(){
        // this.volume = this.volume--;
        System.out.println("Volume: " + this.volume--);
    }
    public void aumentarCanal(){
        // this.canal = this.canal++;
        System.out.println("Canal: " + this.canal++);
    }
    public void diminuirCanal(){
        // this.canal = this.canal--;
        System.out.println("Canal: " + this.canal--);
    }
}
