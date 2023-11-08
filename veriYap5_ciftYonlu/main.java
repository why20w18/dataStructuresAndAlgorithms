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
        //tail->55->17->98->31->15->41->25->head
        listem.arayaEkle(0, 21);
        //head->21->25->41->15->31->98->17->55->tail
        //tail->55->17->98->31->15->41->25->21->head
        listem.basEkle(59);
        //head->59->21->25->41->15->31->98->17->55->tail
        //tail->55->17->98->31->15->41->25->21->59->head
        
        listem.basSil(); //head->21->25->41->15->31->98->17->55->tail
        listem.sonSil(); //head->21->25->41->15->31->98->17->tail
        listem.basSil(); //head->25->41->15->31->98->17->tail
        
        System.out.println();
        listem.duzYazdir();
        listem.tersYazdir();
       
        System.out.println();
        System.out.println("head:"+listem.head.data);
        System.out.println("tail:"+listem.tail.data);
    }
}
