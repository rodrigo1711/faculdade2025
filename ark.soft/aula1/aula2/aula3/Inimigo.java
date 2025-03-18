public class Inimigo extends Personagem{ 

     

    public int hp; 

     

    public Inimigo(){ 

        super("Pica Pau", "bicada"); 

        this.hp = 9999999; 

    } 

     

    public void atacar(){ 

    System.out.println("Inimigo atacando"); 

    } 

     

} 
