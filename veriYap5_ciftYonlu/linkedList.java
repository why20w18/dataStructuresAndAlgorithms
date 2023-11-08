

public class linkedList{
    
    node head = null;
    node tail = null;
    
    void basEkle(int data){
        node eleman = new node(data);
        
        if(head == null){ //liste var mı yoksa olustur
            head = eleman;
            tail = eleman;
        }
        
        
    }
    
    
    
}
