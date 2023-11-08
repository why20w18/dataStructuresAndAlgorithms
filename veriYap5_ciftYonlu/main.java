//cift yonlu linked list olusturuyoruz
//basa , sona ve araya ekleme metodu icerecek

public class main{
    
    public static void main(String[] args){
     
        //metodlarıma erişebilmek için referans üzerinden nesne tanımlayacağım
        linkedList listem = new linkedList();
        
        listem.basEkle(10);
        listem.basEkle(20);
        listem.basEkle(30);
        listem.sonEkle(40);
        listem.sonEkle(50);
        
        System.out.println();
        listem.duzYazdir();
        listem.tersYazdi();
       
        System.out.println();
        System.out.println("head:"+listem.head.data);
        System.out.println("tail:"+listem.tail.data);
    }
}
