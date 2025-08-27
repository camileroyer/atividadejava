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

      // NomeDaClasse NomeDoObjeto = new NomeDoConstrutor();
      geometriaespacial objesp = new geometriaespacial();
      switch (formaespacial){
        case 1:    
        
        objesp.cilindro();
        break;

        case 2:
        objesp.piramide();
        break;

        case 3:
        objesp.esfera();
        break;

        case 4:
        objesp.cone();
        break;

        case 5:
        objesp.tronco();
        break;
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


        //ESFERA
        private void esfera() {
        Scanner ler = new Scanner(System.in);

        int resfera;
        System.out.printf("Qual o RAIO da esfera?");
        resfera = ler.nextInt();

        System.out.println("1) Área superficial");
        System.out.println("2) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhaesfera = ler.nextInt();

            if (escolhaesfera == 1) {
                int areasuperficiale = 4 * (resfera ^ 2);
                System.out.printf("Área das bases:" +areasuperficiale,"π");
            }
            else if (escolhaesfera == 2) {
                int volumee = (4 / 3) * (resfera ^ 3);
                System.out.printf("Área lateral:" +volumee,"π");
            }
        }


        //CONE
        private void cone() {
        Scanner ler = new Scanner(System.in);

        int rcone;
        int gcone;
        int hcone;
        System.out.printf("Qual o RAIO do cone?");
        rcone = ler.nextInt();
        System.out.printf("Qual a GERATRIZ do cone?");
        gcone = ler.nextInt();
        System.out.printf("Qual a ALTURA do cone?");
        hcone = ler.nextInt();

        System.out.println("1) Área lateral");
        System.out.println("2) Área da base");
        System.out.println("2) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhacone = ler.nextInt();

            if (escolhacone == 1) {
                int arealateralc = rcone * gcone ;
                System.out.printf("Área lateral:" +arealateralc,"π");
            }
            else if (escolhacone == 2) {
                int areadabasec = rcone ^ 2;
                System.out.printf("Área da base:" +areadabasec,"π");
            }

            else if (escolhacone == 3) {
                int volumeco = (rcone * hcone) / 3;
                System.out.printf("Volume:" +volumeco,"π");
            }
        }

        //TRONCO
        private void tronco() {
        Scanner ler = new Scanner(System.in);

        int rpequenotronco;
        int rgrandetronco;
        int htronco;
        System.out.printf("Qual o RAIO PEQUENOS do tronco?");
        rpequenotronco = ler.nextInt();
        System.out.printf("Qual o RAIO GRANDE do tronco?");
        rgrandetronco = ler.nextInt();
        System.out.printf("Qual a ALTURA do tronco?");
        htronco = ler.nextInt();

        System.out.println("1) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhatronco = ler.nextInt();

            if (escolhatronco == 1) {
                int volumet = (htronco * ((rpequenotronco + (rpequenotronco ^ 2)) * (rgrandetronco + (rgrandetronco ^ 2)))) / 3 ;
                System.out.printf("Volume:" +volumet,"π");
            }
            else if (escolhatronco == 2) {
                System.out.printf("não tem...");
            }
        }
    }
