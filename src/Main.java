import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n1=0, k=0;
        Random pau = new Random();
        for (int i = 1; i <= 100; i++) {
            System.out.println(n1);
            n1 = pau.nextInt((200-1)+1)+1;
            k=n1+k;

        }
        System.out.println("total de la suma:"+ k);
        System.out.println("------------------------------");
        //numeros de 1 a 200, suma de impare y pares

        Random mar = new Random();
        int n2=0, j=0,l=0;

        for (int i = 0; i <= 100; i++) {
            System.out.println(n2);
            n2 = mar.nextInt((200-1)+1)+1;
            if (n2%2==0){
                j = j + n2;

            } else {
                l = l + n2;

            }

        }
        System.out.println("la suma de los pares es:"+j);
        System.out.println("la suma de los impares es:"+l);
    }
}