## Exercicio (Java): Ordenando Números Pares e Ímpares

O exercicio publicado é referente ao treinamento do Bootcamp Java Developer - Ordenação e Filtros em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:
- Primeiro os Pares
- Depois os Ímpares

Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

#### Entrada: 

A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

#### Saída: 

Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
10 | 4
4 | 32
32 | 34
34 | 98
543 | 654
3456 | 3456
654 | 6789
567 | 567
87 | 543
6789 | 87
98


#### Java　

```java
//SOLUCAO 1

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
```

