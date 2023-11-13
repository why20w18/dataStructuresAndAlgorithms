

public class main {
    
    public static void main(String[] args){
        
        linkedList listem = new linkedList();
        
        listem.basEkle(10);
        listem.sonEkle(20);
        listem.sonEkle(30);
        //head->10->20->30->tail
        listem.arayaEkle(0, 5);
        //head->5->10->20->30->tail
        listem.arayaEkle(1, 8);
        //head->5->8->10->20->30->tail
        listem.arayaEkle(4, 25);
        //head->5->8->10->25->30->tail
        listem.basSil();
        //head->8->10->25->30->tail
        listem.sonSil();
        //head->8->10->25->tail
        listem.aradanSil(0);
        //head->10->25->tail
        listem.sonEkle(30);
        listem.sonEkle(40);
        listem.sonEkle(50);
        //head->10->25->30->40->50->tail
        listem.aradanSil(2);
        //head->10->25->40->50->tail
        listem.aradanSil(3);
        //head->10->25->40->tail
        
        listem.yazdir();
        System.out.println();
        
    }
}

