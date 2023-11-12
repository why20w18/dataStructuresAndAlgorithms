//Basa Sona Araya Ekleme vardir
//Basa Sonra Araya Silme vardir



public class linkedList{
    node head = null;
    node tail = null;
    
    void basEkle(int x){
        node eleman = new node();
        eleman.data = x;
        
        if(head == null){
            eleman.next = head;
            head = eleman;
            tail = eleman;
        }
        else{
            eleman.next = head;
            head = eleman;
        }
        
    }
    
    void sonaEkle(int x){
        node eleman = new node();
        eleman.data = x;
        
        if(head == null){
            eleman.next = null;
            head = eleman;
            tail = eleman;
        }
        else{
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
        }
    }
    
    void arayaEkle(int index , int x){
        node eleman = new node();
        eleman.data = x;
        
        if(head == null && index == 0){
            eleman.next = null;
            head = eleman;
            tail = eleman;
        }
        else if(head != null && index == 0){
            eleman.next = head;
            head = eleman;
        }
        else{ //tail durumu son index
            node temp = head;
            node temp2 = head;
            int i = 0;
            
            while(temp.next != null){
                i++;
                temp2 = temp;
                temp = temp.next;
            }
            if(i == index){
            temp2.next = eleman;
            eleman.next = temp;
            }
            else{//araya ekleme işlemi
             int j = 0;
             temp = head;
             temp2 = head;
             while(j < index){
                 j++;
                 temp2 = temp;
                 temp = temp.next; //temp son indexi tutar burada cunku indexten ileride gider
             }
             temp2.next = eleman;
             eleman.next = temp;
            }
            
        }
        
    }
    
    void basSil(){
        
        if(head == null){
            System.out.println("Bos Liste !");
        }
        else if(head.next == null){
            //listede tek eleman varsa
            head = null;
            
        }
        else{
            head = head.next;
            //garbage collector otomatik silecek
        }
    }
    void sonSil(){
        
        if(head == null){
            
            head = null;
            tail = null;
        }
        else if(head.next == null){ //1 eleman varsa
            head = null;
            tail = null;
        }
        else{ //tail silebilmek için arkasındaki düğüme erişmeliyim
            node temp = head;
            node temp2 = head;
            
            while(temp.next != null){
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = temp2;
        }
    }
    void aradanSil(int index){
        
        if(head == null){
            System.out.println("liste bostur !");
        }
        else if(head.next == null && index == 0){ //listede 1 eleman varsa
            head = null;
            tail = null;
        }
        else if(head.next != null && index == 0){ //listede 1'den fazla eleman varsa
            head = head.next;
            //garbage collector otomatik sildi
        }
        else{//son indexi girerse
            node temp = head;
            node temp2 = head;
            int i = 0;
            while(temp.next != null){
                i++;
                temp2 = temp;
                temp = temp.next;
            }
            if(index == i){
                temp2.next = null;
                tail = temp2;
            }
            else{
                temp = head;
                temp2 = head;
                int j = 0;
                while(j < index){
                    j++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = temp.next; // direkt null değere eşitlemiyoruz çünkü öyle dersem 1.indexten sona kadar siler
                
            }
        }
        
    }
    
    void yazdir(){
        node temp = head;
        System.out.print("head->");
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("tail");
    }
    
    
}
