

public class main {
    
    public static void main(String[] args){
     
        linkedList listem = new linkedList();
        
        listem.basEkle(10);
        listem.basEkle(30);

        listem.sonEkle(20);
        listem.sonEkle(30);
        listem.sonEkle(40);
        listem.sonEkle(50);
        //head->30->10->20->30->40->50->tail
        
        listem.arayaEkle(2, 13);
        //head->30->10->13->20->30->40->50->tail
        listem.arayaEkle(0, 11);
        //head->11->30->10->13->20->30->40->50->tail
        listem.arayaEkle(7, 52);
        
        listem.duzYazdir();
    }
}
