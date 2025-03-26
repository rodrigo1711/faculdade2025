public class Personagem{ //pai & public abstract = erro 

     

    public String Poder; 

    public String Nome; 

     

    public Personagem(){ 

      Nome = "Felipe"; 

      Poder = "Raduke"; 

    } 

     

     public Personagem(String n, String p){  

          

        this.Nome = n; 

        this.Poder = p; 

          

     }  

     

    public void voar(){ 

        System.out.println("Voando"); 

    } 

     

} 
