import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Collections; 
import java.util.ArrayList;

public class OrdenarNumParImpar {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
  
    ArrayList<Integer> numerosPares = new ArrayList();
    ArrayList<Integer> numerosImpares = new ArrayList();
    int num = 0;
    st = new StringTokenizer(br.readLine()); 
    Integer quantEntrada = Integer.parseInt(st.nextToken()); 
  
    for (int i = 0; i < quantEntrada; i++){
      st = new StringTokenizer(br.readLine()); 
      num = Integer.parseInt(st.nextToken()); 
      // Verifica se o numero é par ou impar e atribui na lista correspondente
      boolean r = (num % 2 == 0) ? numerosPares.add(num) : numerosImpares.add(num);
    }
    
    Collections.sort(numerosPares); //Ordena a lista par em ordem crescente
    Collections.sort(numerosImpares); //Ordena a lista impar em ordem crescente
    Collections.reverse(numerosImpares); //Ordena a lista impar em ordem decrescente.
  
    //Imprime a lista par
    for (Integer np : numerosPares) System.out.println(np);
    
    //Imprime a lista impar
    for (Integer ni : numerosImpares) System.out.println(ni);
    
  }
}
