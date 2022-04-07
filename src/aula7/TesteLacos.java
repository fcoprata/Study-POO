package aula7;

public class TesteLacos {
    public void testeFor(int b, int e, boolean ascending){
        if (ascending == true){
            for(int i = b; i <= e; i++){
                System.out.println(i);
            }
        }
        else if(ascending == false){
            for(int i = e; i >= b; i--){
                System.out.println(i);
            }
        }
    }
    public void testeWhile(int b, int e, boolean ascending){
        
        if (ascending == true){
            while(b <= e){
                System.out.println(b++);
            }
        }
        else if (ascending == false){
            while(e >= b){
                System.out.println(e--);
            }
        }
    }
    public void testeDoWhile(int b, int e, boolean ascending){
        if (ascending == true) {
            int i = b;
            do {
                System.out.println(i);
                i++;
            } while (i <= e);
        }
            
        else if(ascending == false) {
            int i = e;
            do {
                System.out.println(i);
                i--;
            } while (i >= b);
            
        }
    }
}
