public class Main
{
    public static void main (String[] args) {


    Carro carro1 = new Carro();
    Carro carro2 = new Carro();
    carro1.ligar();
    carro2.ligar();
    
    System.out.println(carro1.reduzirVelocidade());
    
    System.out.println(carro1.acelerar(500.2));
    
    }

}
