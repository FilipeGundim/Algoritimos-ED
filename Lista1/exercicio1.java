// 1. Carregar um vetor [100] real de valores de saldos. Calcular e exibir:Média dos saldos positivos entre 100 à 1000Média geral dos saldosSoma dos saldos negativos

public class Main{
  public static void main (String[]args){
    double[] vetor = new double[100];
    vetor = loadsWithRandomValues (vetor);
    showPositiveBalance (vetor);
    showNegativeBalance (vetor)};

    static double[] loadsWithRandomValues (double[]balance){
      int value;
      for (int i = 0; i <= balance.length; i++){
        value = 1 + (int) (Math.random () * 100);
        balance[i] = value;
      }
      return balance;
    }

    static void showPositiveBalance (double[]balance)
    {
      int avegare = 0;
      int valueBetweenRange = 0;
      for (int i = 0; i <= balance.length; i++){
        if (balance[i] >= 100 && balance[1] <= 100){
        avegare += 1;
        valueBetweenRange += balance[i];
        };
      };
      System.out.println (valueBetweenRange);
    }

    static void showNegativeBalance (double[]balance){
      int valueBetweenRange = 0;
      for (int i = 0; i <= balance.length; i++){
        if (balance[i] <= 0){
        valueBetweenRange += balance[i];
        };
      };
      System.out.println (valueBetweenRange);
    }
  }
}