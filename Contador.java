import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int parametroum;
        int parametrodois;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        parametroum = scan.nextInt();
        System.out.println("Digite o segundo parametro");
        parametrodois = scan.nextInt();
        try {
            contar(parametroum , parametrodois);
        } catch (Exception e) {
            System.out.println(" ocorreu um erro!"+e.getMessage());
        }
        scan.close();
    }

    static void contar (int parametroum , int parametrodois) throws Exception{
        if (parametroum > parametrodois) {
            throw new Exception("O primeiro parâmetro deve ser menor que o segundo");
        }
        for (int i= parametroum; i<=parametrodois; i++){
            System.out.println(" a contagem está em "+ i);

        }
    }

   
}