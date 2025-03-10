public class testesconversao {
  public static void main(String[] args) {
    // numero de chutes realizados pelo jogador
    int maximoaproveitamento = 5;

    // numero de chutes acertados no gol pelo jogador
    int aproveitamentojogador = 2;

    //Porcentagem de acertos ao gol do jogador
    float percentage = (float) aproveitamentojogador / maximoaproveitamento * 100f;


     System.out.println("Aproveitamento do jogador é de " + percentage);
 
 
 
 
  }
}