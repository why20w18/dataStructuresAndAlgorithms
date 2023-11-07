

public class linkedList {
    
    node head = null; //ilk dugum
    node tail = null; //son dugum
    int i=0;
    void nodeEkle(int x , String y ){
        //node ekleyebilmek obje olustur
        node eleman = new node();
        eleman.yas  = x;
        eleman.isim = y;
        //dugum olustu ve icine isim yas degerlerini aldi
        
        if(head == null){ //liste olusturmadiysam basi ve sonu ayni listeyi olusturuyorum
        i++;
        head = eleman;
        tail = eleman;
            System.out.println("ilk dugum olustu !"+" dugum:"+i);
            //yukarda olusan dugumu hem heade hem taile atadim
        }
        else{ //sona ekleme yapacagim
            i++;
            tail.next = eleman;
            tail = eleman;
            
            System.out.println("dugum eklendi !"+" dugum:"+i);
            
        }
        
    }
    void yazdir(){
        node temp = head;
        while(temp != null){
            System.out.println("isim:"+temp.isim+" yas:"+temp.yas);
            temp = temp.next;
        }
    }
    
}
