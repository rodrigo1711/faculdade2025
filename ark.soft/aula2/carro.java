public class Carro
{
    public String modelo = "fusca";
    public int chassi =123;
    public double velocidadeMaxima =350.20;
    
    public void ligar(){
         System.out.println("Carro ligado");
    }
    
    public double reduzirVelocidade(){
    
        return velocidadeMaxima / 2.;
    }

    public double acelerar (double v){
    return velocidadeMaxima + v;    
    }
}
