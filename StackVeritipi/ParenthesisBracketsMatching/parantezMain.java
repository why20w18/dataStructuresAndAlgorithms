import java.util.Scanner;

public class parantezMain{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        parantezKontrol parantezTest = new parantezKontrol();
        System.out.print("mesaj girin:");
        String ifade = scanner.nextLine();
        
        String sonuc = (parantezTest.kontrol(ifade)) ? "tum parantezler kapanmis" : "parantez kapatmayi unuttun !";
        System.out.println(sonuc);
        
    }
}
