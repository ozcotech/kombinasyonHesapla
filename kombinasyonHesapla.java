import java.util.Scanner;
public class kombinasyonHesapla {

  public static void main(String[] args) {

    int i, n, r, j, total1 = 1, total2 = 1, total3 = 1, kombi;
    Scanner input = new Scanner(System.in);

    System.out.print("Bir Sayı Giriniz: ");
    n = input.nextInt();

    for (i = 1; i <= n; i++){
      
      total1 *= i;
    }
    
    System.out.print("Bir Sayı Giriniz: ");
    r = input.nextInt();

    for (i = 1; i <= r; i++){
      
      total2 *= i; 
    }
    System.out.println("Birinci Sayının Faktoriyeli: " + total1);
    System.out.println("İkinci Sayının Faktoriyeli: " + total2);

    for (j = 1; j <= (n - r); j++){

      total3 *= j;
    }

    kombi = (total1 / (total2 * (total3)));

    System.out.println("Girilen " + n + " ve " + r + " Sayılarının Faktoriyellerinin Kombinasyonları: \n" + kombi);

    input.close();
  }
}