    package calculadora;
    
    class Funcionalidades {

        private int num1;
        private int num2;

        //getter amd setter
        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
            //metodos comportamentais = os verbos da classe
            // inserir anotar, 
        }
        public int Somar(int v1, int v2){
            this.num1 =v1;
            this.num2 =v2;
            return (this.num1+this.num2);
        }
    }


public class Calculadora {
    public static void main(String[] args) {
        Funcionalidades soma = new Funcionalidades();
        System.out.println(soma.Somar(10, 20));
    }

}












og
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

    public int somar(int v1, int v2) {
        this.num1 = v1;
        this.num2 = v2;
        return (this.num1 + this.num2);
    }
    }
}

public class Calculadora {
    public static void main(String[] args) {
        Funcionalidades soma = new Funcionalidades();
        System.out.println(soma.somar(10, 20));
    }

}







2

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

    public int somar(int v1, int v2) {
        this.num1 = v1;
        this.num2 = v2;
        return (this.num1 + this.num2);
    }
   public int subtrair() {
        return (this.num1 - this.num2);
    } 

}

public class Calculadora {
    public static void main(String[] args) {
        Funcionalidades soma = new Funcionalidades();
        System.out.println(soma.somar(10, 20));
         System.out.println(soma.somar(10, 20));
    }

}





last


calculadora.java

    package calculadora;

import java.util.Scanner;

public class Calculadora {

    // Atributos privados
    private int numero1;

    private int numero2;

    // Métodos acessores para numero1
    public void setNumero1(int numero1) {

        this.numero1 = numero1;

    }

    public int getNumero1() {

        return this.numero1;

    }

    // Métodos acessores para numero2
    public void setNumero2(int numero2) {

        this.numero2 = numero2;

    }

    public int getNumero2() {

        return this.numero2;

    }

    // Método para multiplicar numero1 por numero2 (sem parâmetros)
    public int multiplicar() {

        return this.numero1 * this.numero2;

    }

    // Método para dividir numero1 por numero2 (sem parâmetros)
    public double dividir() {

        if (this.numero2 == 0) {

            System.out.println("Erro: divisão por zero!");

            return 0;

        }

        return (double) this.numero1 / this.numero2;

    }

    // Método para subtrair numero2 de numero1 (sem parâmetros)
    public int subtrair() {

        return this.numero1 - this.numero2;

    }

    // Método para testar se o primeiro número (numero1) é par ou ímpar (sem parâmetros)
    public String testarParOuImpar() {

        return (this.numero1 % 2 == 0) ? "PAR" : "ÍMPAR";

    }

    // Método main: ponto de entrada do programa
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculadora op = new Calculadora();

        // Solicita e define o primeiro número
        System.out.print("Digite o primeiro número: ");

        op.setNumero1(scanner.nextInt());

        // Solicita e define o segundo número
        System.out.print("Digite o segundo número: ");

        op.setNumero2(scanner.nextInt());

        // Exibe os resultados das operações utilizando os métodos sem parâmetros
        System.out.println("Multiplicação: " + op.multiplicar());

        System.out.println("Divisão: " + op.dividir());

        System.out.println("Subtração: " + op.subtrair());

        System.out.println("O primeiro número é " + op.testarParOuImpar());

        scanner.close();

    }

}









cal.java
    
        package cal;

class Funcionalidades {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int somar(int v1, int v2) {
        this.num1 = v1;
        this.num2 = v2;
        return (this.num1 + this.num2);
    }
   public int subtrair() {
        return (this.num1 - this.num2);
    } 

}

public class Cal {
    public static void main(String[] args) {
        Funcionalidades soma = new Funcionalidades();
        Funcionalidades subtracao = new Funcionalidades();
        
        System.out.println(soma.somar(10, 20));
        System.out.println(subtracao.subtrair(10,20));
    }

}


    
