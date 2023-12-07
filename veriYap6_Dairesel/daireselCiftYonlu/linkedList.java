/*
head prev ile taili gösterir
tail next ile headi gösterir
*/

public class linkedList {
    
    node head = null;
    node tail = null;
    
    void basEkle(int x){
        
        node eleman = new node(x);
        
        if(head == null){
            head = eleman;
            tail = eleman;
            
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
            
        }
        else{
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            
            tail.next = head;
            head.prev = tail;
        }
    }
    
    void sonEkle(int x){
        node eleman = new node(x);
        
        if(head == null){
            head = eleman;
            tail = eleman;
            //burada hepsini uç uca bağlarayarak gidiyoruz
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
            
        }
        else{
            tail.next = eleman;
            eleman.prev = tail;
            
            tail = eleman;
            
            tail.next = head;
            head.prev = tail;
        }
    }
    
    void arayaEkle(int index , int x){
     
        node eleman = new node(x);
        
        if(head == null && index == 0){
            head = eleman;
            tail = eleman;
            
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
            
        }
        else if(/*head.next == null &&*/ index == 0){
            //headi kaydıracağız
            eleman.next = head;
            head.prev = eleman;
            head = eleman; //başa ekledik
            
            tail.next = head;
            head.prev = tail;
        }
        else{
            node temp = head;
            node temp2 = head;
            int i = 0;
            while(temp.next != tail){
                i++;
                temp2 = temp;
                temp = temp.next;
            } 
            if(i <= index){
                eleman.next = temp.next;
               temp.prev.next = eleman;
               tail = temp.next;
                
                head.prev = tail;
                tail.next = head;
            }
            else{//araya ekleme
               int j = 0;
               temp = head;
               temp2 = head;
               while(j < index){
                   j++;
                   temp2 = temp;
                   temp = temp.next;
               }
               temp2.next = eleman;
               eleman.prev = temp2;
               //***
               eleman.next = temp;
               temp.prev = eleman;
            }
        }
        
    }
    void duzYazdir(){
        node temp = head;
        int i = 0;
        System.out.print("head->");
        while(temp != tail){
            i++;
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp.data+"->tail");
    }
    
}
