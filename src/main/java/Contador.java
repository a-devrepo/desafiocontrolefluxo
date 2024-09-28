import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contador {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.print("Digite o primeiro parâmetro: ");
      int primeiroParametro = Integer.parseInt(reader.readLine());
      System.out.print("Digite o segundo parâmetro: ");
      int segundoParametro = Integer.parseInt(reader.readLine());

      contar(primeiroParametro, segundoParametro);
    } catch (IOException | ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    }
  }

  static void contar(int primeiroParametro, int segundoParametro)
      throws ParametrosInvalidosException {
    if (primeiroParametro > segundoParametro) {
      throw new ParametrosInvalidosException(
          "O segundo parâmetro deve ser maior do que o primeiro");
    }
    int contador = segundoParametro - primeiroParametro;

    for (int i = 1; i <= contador; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}
