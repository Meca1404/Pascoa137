// Bibliotecas

import br.com.iterasys.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Classes
public class TesteCalculadora {

// Atributos

// Funções e Métodos
   @Test
   public void testeSomarDoisNumeros(){
      // Configura
      // Valores de entrada
      double num1 = 7;
      double num2 = 5;
      //Valores de saida
      double resultadoEsperado = 12;

      //Executa
      double resultadoAtual = Calculadora.somarDoisNumeros(num1, num2);
      System.out.println("Teste Soma: "+num1 +"+"+ num2 +" = "+ resultadoAtual);

      // Validar

      assertEquals(resultadoEsperado , resultadoAtual);
      }
      @Test
   public void testeDividirDoisNumeros(){ // inicio do teste de dividir
      // Configura
      double num1 = 10;
      double num2 = 4;
      double resultadoEsperado = 2.5;
      // Executa
      double resultadoAtual = Calculadora.dividirDoisNumeros (num1, num2);
      // Valida
      assertEquals (resultadoEsperado, resultadoAtual);
   }
}
