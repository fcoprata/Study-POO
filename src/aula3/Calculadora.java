package aula3;

public class Calculadora {
    public int v1;
    public int v2;

    public void somar(int v1,int v2) {
        this.v1 = v1;
        this.v2 = v2;
        int sum = v1 + v2;
        System.out.println(sum);
    }
    public void subtrair(int v1,int v2) {
        this.v1 = v1;
        this.v2 = v2;
        int sub = v1 - v2;
        System.out.println(sub);
        
    }
    public void multiplicar(int v1,int v2) {
        this.v1 = v1;
        this.v2 = v2;
        int mul = v1 * v2;
        System.out.println(mul);
        
    }
    public void dividir(int v1,int v2) {
        this.v1 = v1;
        this.v2 = v2;
        int div = v1 / v2;
        System.out.println(div);
        
    }
}
