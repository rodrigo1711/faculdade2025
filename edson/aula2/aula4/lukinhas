package calculadora;

class Funcionalidades {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
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
   
    public String testImpasOuPar(){
        return (this.num1 % 2 == 0)?"PAR:IMPAR";
    }
}


public class Calculadora {
    public static void main(String[] args) {
        Funcionalidades calcula = new Funcionalidades();
       
        calcula.setNum1(10);
        calcula.setNum2(20);
       
        System.out.println("Subtração: " + calcula.getSubtrair());
        System.out.println("Multiplicação: " + calcula.getMultiplicar());
        System.out.println("Divisão: " + calcula.getDividir());
       
    }
}
