//cift yonlu linked list olusturuyoruz
//basa , sona ve araya ekleme metodu icerecek

public class main{
    
    public static void main(String[] args){
     
        //metodlarıma erişebilmek için referans üzerinden nesne tanımlayacağım
        linkedList listem = new linkedList();
        
        listem.arayaEkle(0, 15);
        listem.sonEkle(55);
        listem.arayaEkle(0, 25);
        listem.arayaEkle(2, 31);
        listem.arayaEkle(1, 41);
        listem.arayaEkle(4, 98);
        listem.arayaEkle(5, 17);
        //head->25->41->15->31->98->17->55->tail
        //head->25->41->15->31->98->17->55->tail
        listem.arayaEkle(0, 21);
        System.out.println();
        listem.duzYazdir();
        listem.tersYazdi();
       
        System.out.println();
        System.out.println("head:"+listem.head.data);
        System.out.println("tail:"+listem.tail.data);
    }
}
