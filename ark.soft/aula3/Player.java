public class Player extends Personagem{ 

     

    public int qtdVida; 

    public int nivel; 

     

    public Player(){ 

        super("Leoncio","bola de gorfe"); 

        this.qtdVida=10; 

        this.nivel=1; //this. = referncia ao atributo 

    } 

     

    public int mudarNivel(){ 

        return this.nivel + 1; 

    } 

} 
