package teste;

public class Carro {
	    public int velocidade = 0;
		public String cor;
		
		public Carro(){
			velocidade = 0;
			cor = "branco";
		}

	    public int acelerar() {
	    	this.velocidade++;
	    	return velocidade;
	    	
	    }
	    
	    public int frear() {
	    	if(velocidade>0)
	    		this.velocidade--;
	    	return velocidade;
	    }
	    
	    public int getVelocidade() {
	    	return velocidade;
	    }
		
		public void status(){
			System.out.println("Cor: "+ this.cor);
			System.out.println("Velocidade: "+ this.velocidade);
		}
	    
}	
