package callucas;
import java.util.Scanner;

class Funcionalidades {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getSoma() { //soma adicionada (nn original do lucas, mas segui o padrao)
        return (this.num1 + this.num2);
    }

    public int getSubtrair() {
        return (this.num1 - this.num2);
    }
   
     public int getMultiplicar() {
        return (this.num1 * this.num2);
    }
   
    public int getDividir() {
        return (this.num1 / this.num2);
    }
   
 //   public int TestImpasOuPar(){
 //       return (getSoma() % 2 == 0)? 1:0;
//    }
}


public class CalLucas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Funcionalidades calcula = new Funcionalidades();
        System.out.println("insira o primeiro numero");
        calcula.setNum1(sc.nextInt());
        System.out.println("insira o primeiro numero");
        calcula.setNum2(sc.nextInt());
       
        System.out.println("Soma: " + calcula.getSoma()); //(same)
        System.out.println("Subtração: " + calcula.getSubtrair());
        System.out.println("Multiplicação: " + calcula.getMultiplicar());
        System.out.println("Divisão: " + calcula.getDividir());
        //System.out.println("o resultado da soma é : " + calcula.getTestImpasOuPar());
        
        sc.close();
    }
}
