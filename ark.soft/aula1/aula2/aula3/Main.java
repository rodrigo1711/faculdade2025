public class Main 

{ 

public static void main(String[] args) { 

//System.out.println("Hello World"); 

Player jogador = new Player(); // constructor (inicializa os atributos do obj) 

Inimigo inimigo = new Inimigo(); 

Personagem p = new Personagem(); 

System.out.println(p.Nome); 

System.out.println(p.Poder); 

p.voar(); 

System.out.println(jogador.Nome); 

System.out.println(jogador.Poder); 

jogador.voar(); 

System.out.println(jogador.mudarNivel()); 

System.out.println(inimigo.Nome); 

System.out.println(inimigo.Poder); 

inimigo.voar(); 

//System.out.println(inimigo.mudarNivel()); 

} 

} 

 
