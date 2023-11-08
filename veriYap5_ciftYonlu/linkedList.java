

public class linkedList{
    
    node head = null;
    node tail = null;
    
    void basEkle(int data){
        node eleman = new node(data);
        
        if(head == null){ //liste var mı yoksa olustur
            head = eleman;
            tail = eleman;
            System.out.println("liste olusturuldu : basEkle");
        }
        else{
            //liste olusmussa ve basa ekleme yapacaksak
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.println("basa eleman eklendi ! : basEkle");
        }
        
    }
    //yazdir metoduyla yazdirabilmemizin sebebi next ile dugumleri birbirine baglamakti
    //prev ile yazdirmak istiyorsak dugumleri yine birbirine baglamak zorundayiz
    void duzYazdir(){
        int cx = 0;
        node temp = head;
        //node temp2 = head; buna şimdilik gerek yok
        
        System.out.print("head->");
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("tail\n");
        
    }
    
    void tersYazdi(){ //tersten yazdiracaksin
        int cx = 0;
        node temp = tail;
        
        System.out.print("tail->");
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.prev;
        }
        System.out.print("head\n");
    }
    
    
}
