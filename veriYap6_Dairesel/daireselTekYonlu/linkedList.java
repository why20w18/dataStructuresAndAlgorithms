


public class linkedList {
    /*
    dairesel tek yönlü bağlı listede son düğümün göstericisi head düğümünü gösterir
    düğümleride node classından oluştururuz nextide çünkü göstericiler data ve dugumler aynı classtan olmalıdır
    daireselde başa ekleme yaparken son düğümün işaretçiside güncellenmelidir
    dairesel linkedListlerde null asla kullanılmaz döngülerde
    dairesellerde yazdırırken çıkıştada değer yazdırırız
    */
    
    node head = null;
    node tail = null;
    
    void basEkle(int x){
        node eleman = new node(x);
        
        if(head == null){
            head = eleman;
            tail = eleman;
            tail.next = head; //tailin göstericisi her zaman headi başı gösterir
        }
        else{
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
    }
    
    void sonEkle(int x){
        node eleman = new node(x);
        
        if(head == null){
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else{
            tail.next = eleman;
            tail = eleman;
            tail.next = head;
        }
    }
    
    void arayaEkle(int index , int x){
        node eleman = new node(x);
        
        if(head == null && index == 0){
            head = eleman;
            tail = eleman;
            tail.next = head;
        }//başa ekleme
        else if(/*head != null && */index == 0){
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
        else{
            //tail kaçıncı index
            node temp = head;
            node temp2 = head;
            int i = 0;
            
            while(temp.next != tail){
                i++;
                temp2 = temp;
                temp = temp.next;
            }
            if(index >= i){
               //tail ekleme yapacağız
               temp2.next = eleman;
               eleman.next = tail;
               tail.next = head;
               
               tail.next = head;
            }
            else{
                temp = head;
                temp2 = head;
                int j = 0;
                
                while(j < index){
                    temp2 = temp;
                    temp = temp.next;
                    j++;
                }
                temp2.next = eleman;
                eleman.next = temp;
                tail.next = head;
            }
            
        }
        
    }
    
    void basSil(){
        
        if(head == null){
            System.out.println("liste bos !");
        }
        else if(head == tail){ //listede 1 eleman varsa
            head = null;
            tail = null;
        }
        else{
            //listede birden fazla eleman varsa
            head = head.next;
            //tailide guncelleyeceğiz tail silinen headi gosteriyor
            tail.next = head;
        }
    }
    void sonSil(){
        
        if(head == null){
            System.out.println("liste bostur !");
        }
        else if(head == tail){//tek eleman varsa
            head = null;
            tail = null;
        }
        else{
            //birden fazla eleman varsa
            node temp = head;
            int i = 0;
            while(temp.next != tail){
                i++;
                temp = temp.next;
            } 
            //tail != demek yerine null koysaydık o zamn temp son düğüme eşitti şimdi temp tail öncesine eşit
            tail = temp;
            tail.next = head;
        }
    }
    
    void aradanSil(int index){
     
        if(head != null){
            
            if(head.next == null && index <= 0){//tek eleman varsa
                head = null;
                tail = null;
            }
            else if(head.next != null && index <= 0){
                head = head.next;
                tail.next = head;
            }
            else{//tail bulacağız
                int i = 0;
                node temp = head;
                
                while(temp.next != tail){
                    //temp artık tail değerini tutuyor
                    temp = temp.next;
                    i++;
                }
                if(i <= index){
                    tail = temp;
                    temp.next = head;
                }
                else{//aradan silme
                    int j = 0;
                    temp = head;
                    node temp2 = head;
                    
                    while(j < index){
                        temp2 = temp;
                        temp = temp.next;
                        j++;
                    }
                    temp2.next = temp.next;
                    
                    
                    
                }
            }
            
        }
        
    }
    void yazdir(){
        node temp = head;
        
        System.out.print("head->");
        while(temp != tail){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp.data+"->tail");
    }
    
}
