import java.util.Scanner;

//Anderson Rodrigues Ramos
//Lucas Vieira dos Santos Martins
//Exercício 02
//Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no exercício anterior.

public class TesteHora {
  public static void main(String[] args) {
  
    Hora hora1 = new Hora();
    System.out.println("Digite a hora no formato hh:mm:ss:");
    hora1.setHor();
    hora1.setMin();
    hora1.setSeg();
    System.out.println("Hora 1: " + hora1.getHora1());
    
    Hora hora2 = new Hora(12, 30, 45);
    System.out.println("Hora 2: " + hora2.getHora2());
    
    hora2.setHor(14);
    hora2.setMin(20);
    hora2.setSeg(10);
    System.out.println("Hora 2 alterada: " + hora2.getHora1());
    
    int segundos = hora2.getSegundos();
    System.out.println("Hora 2 em segundos: " + segundos);
    
    boolean valido = false;
    Hora hora3 = null;
    while (!valido) {
      System.out.println("Digite uma hora inválida (ex: 25:00:00):");
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int m = sc.nextInt();
      int s = sc.nextInt();
      hora3 = new Hora(h, m, s);
      if (hora3 == null) {
        System.out.println("Hora inválida. Tente novamente.");
      } else {
        valido = true;
        System.out.println("Hora 3: " + hora3.getHora1());
      }
    }
  }
}
