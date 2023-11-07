

public class linkedList {
    
    node head = null;
    node tail = null;
    int cx;
    
    void basaEkle(int x){
        //dugum olustur
        node eleman = new node();
        eleman.sayi = x;
        if(head == null){
            cx++;
            eleman.next = head;
            head = eleman;
            tail = eleman;
            System.out.println("liste olusturuldu ! basa eleman eklendi ! "+"dugum:"+cx);
        }
        else{
            cx++;
            eleman.next = head;
            head = eleman;
            System.out.println("\nbasa eleman eklendi ! "+"dugum:"+cx);
        }
        
        
    }
    
    void yazdir()
    {
        node temp = head;
        
        System.out.print("head-->");
        while(temp != null){
            
            System.out.print(temp.sayi+"-->");
            temp = temp.next;
        }
        System.out.println("null");
        
    }    
}

