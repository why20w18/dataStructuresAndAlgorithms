

public class main {
    
    public static void main(String[] args){
        
        linkedList listem = new linkedList();
        
        listem.arayaEkle(0, 8);
        
        listem.sonaEkle(35);
        listem.basaEkle(15);
        listem.arayaEkle(2, 44); // 15->8->35 iken benim listem 2.indexe ekledi o zamanki 2.index
        
        listem.basaEkle(45);
        listem.sonaEkle(55);
        
        listem.arayaEkle(1, 11);
        listem.yazdir();
        
        
    }
    
}
