

public class linkedList {
    
    node head = null;
    node tail = null;
    
    void basaEkle(int x){
        //dugum olusturacagiz yani obje
        node eleman = new node();
        eleman.sayi = x;
        
        if(head == null){ //hic dugum yoksa
            eleman.next = head;
            head = eleman;
            tail = eleman; //liste olusmadigindan tailede ayni dugumu atadik
            System.out.println("liste olustu , basa dugum eklendi ! ");
        }
        else{ //dugum varsa
            eleman.next = head;
            head = eleman;
            System.out.println("basa dugum eklendi ! ");
        }
        
    }
    void sonaEkle(int x){
        //dugum olusturmaliyim
        node eleman = new node();
        eleman.sayi = x;
        
        if(head == null){
            eleman.next = null;
            tail = eleman;
            head = eleman;
            System.out.println("liste olustu , sona dugum eklendi ! ");
        }
        else{
            tail.next = eleman; //eğer zaten liste olustuysa tail değeri vardır bu yuzden tailin ilerisi diyebiliriz
            tail = eleman;
            System.out.println("sona dugum eklendi ! ");
        }
        
    }
    void arayaEkle(int index , int x){
        
    }
    
    void yazdir(){
        node temp = head;
        
        System.out.print("head-->");
        while(temp != null){
            System.out.print(temp.sayi+"-->");
            temp = temp.next;
        }
        System.out.println("tail");
    }
    
}
