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
        System.out.println(subtracao.subtrair(10, 20));
    }

}
