

public class linkedList {
    
    node head = null;
    node tail = null;
    
 
    
    void basaEkle(int x){
        //dugum olustur
        node eleman = new node();
        eleman.sayi = x;
        if(head == null){
            eleman.next = head;
            head = eleman;
            tail = eleman;
            System.out.println("liste olusturuldu ! basa eleman eklendi ! ");
        }
        else{
            eleman.next = head;
            head = eleman;
            System.out.println("\nbasa eleman eklendi ! ");
        }
        
    }
    void sonaEkle(int x){
        node eleman = new node();
        eleman.sayi = x;
        
        if(head == null){ //ilk olusturdugumuz dugum oldugundan head neye esitse tailde ona esittir
            eleman.next = null; ///elemanın ilerisi null ise biz sona eleman eklemiş oluruz
            tail = eleman;
            head = eleman;
            
            System.out.println("liste olusturuldu ! sona eleman eklendi ! ");
        }
        else{
            tail.next = eleman;
            tail = eleman;
            System.out.println("\nbasa eleman eklendi ! ");

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
