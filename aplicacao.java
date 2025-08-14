import java.util.Scanner;

public class aplicacao {
        public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
     
      System.out.println("1) geometria espacial");
      System.out.println("2) geometria plana");

      int x;
      System.out.printf("Qual geometria voce quer?");
      x = ler.nextInt();

      if (x == 1){
      System.out.println("1) Cilindro");
      System.out.println("2) Pirâmide");
      System.out.println("3) Esfera");
      System.out.println("4) Cone");
      System.out.println("5) Troncos");
      System.out.println("6) Prismas");
      
      int formaespacial;
      System.out.printf("Qual figura você quer?");
      formaespacial = ler.nextInt();

      switch (formaespacial){
        case 1:

        case 2:

        case 3:

        case 4:

        case 5: 

        case 6:
      }
        }
    
        else if (x == 2){
      System.out.println("1) Quadrado");
      System.out.println("2) Retângulo");
      System.out.println("3) Triângulo");
      System.out.println("4) Triângulo Equilátero");
      System.out.println("5) Paraleogramo");
      System.out.println("6) Losango");
      System.out.println("7) Trapézio");
      System.out.println("8) Circunfêrencia");
      
      int formaplana;
      System.out.printf("Qual figura você quer?");
      formaplana = ler.nextInt();

      switch (formaplana){
        case 1:
         instancia um objeto
         espacial.x = 10;
         espacial.y = 30;
         espacial.Quadrado();
        case 2:

        case 3:

        case 4:

        case 5: 

        case 6:

        case 7:

        case 8:
      }
      }
}
}
