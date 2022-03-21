package teste;

public class Carro {
	    public int velocidade = 0;

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
	    

}
