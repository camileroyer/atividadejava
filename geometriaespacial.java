import java.util.Scanner;

public class geometriaespacial extends aplicacao {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

      System.out.println("1) Cilindro");
      System.out.println("2) Pirâmide Triangular");
      System.out.println("3) Esfera");
      System.out.println("4) Cone");
      System.out.println("5) Troncos");
      System.out.println("6) Prismas");
      
      int formaespacial;
      System.out.printf("Qual figura você quer?");
      formaespacial = ler.nextInt();

      switch (formaespacial){
        case 1:     
        cilindro();
        break;

        case 2:
        piramide()
        break;

        case 3:

        case 4:

        case 5: 

        case 6:
      }
    }

    //CILINDRO
      private void cilindro() {
        Scanner ler = new Scanner(System.in);

        int rcilindro;
        int hcilindro;
        System.out.printf("Qual o RAIO do cilindro?");
        rcilindro = ler.nextInt();
        System.out.printf("Qual a ALTURA do cilindro?");
        hcilindro = ler.nextInt();

        System.out.println("1) Área das bases");
        System.out.println("2) Área lateral");
        System.out.println("3) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhacilindro = ler.nextInt();

            if (escolhacilindro == 1) {
                int areadasbasesc = rcilindro ^ 2;
                System.out.printf("Área das bases:" +areadasbasesc,"π");
            }
            else if (escolhacilindro == 2) {
                int arealateralc = 2 * rcilindro * hcilindro;
                System.out.printf("Área lateral:" +arealateralc,"π");
            }
            else if (escolhacilindro == 3) {
            int volumec = (rcilindro ^ 2) * hcilindro;
            System.out.printf("Volume:" +volumec,"π");
            }
        }

        //PIRAMIDE
        private void piramide() {
        Scanner ler = new Scanner(System.in);

        int bpiramide;
        int appiramide;
        int hpiramide;
        System.out.printf("Qual a BASE da pirâmide?");
        bpiramide = ler.nextInt();
        System.out.printf("Qual a APÓTEMA da pirâmide?");
        appiramide = ler.nextInt();
        System.out.printf("Qual a ALTURA da pirâmide?");
        hpiramide = ler.nextInt();

        System.out.println("1) Área lateral");
        System.out.println("2) Área total");
        System.out.println("3) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhapiramide = ler.nextInt();

        int arealateralp = (bpiramide * appiramide) / 2;
        int areadabasep = (bpiramide * hpiramide) / 2;

            if (escolhapiramide== 1) {
                System.out.printf("Área lateral:" +arealateralp);
            }
            else if (escolhapiramide == 2) {
                int areatotalp = areadabasep + arealateralp;
                System.out.printf("Área total:" +areatotalp);
            }
            else if (escolhapiramide == 3) {
            int volumep = (areadabasep * hpiramide) / 3;
            System.out.printf("Volume:" +volumep);
            }
        }
    }
