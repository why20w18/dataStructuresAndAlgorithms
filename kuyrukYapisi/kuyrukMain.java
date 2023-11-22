

public class kuyrukMain{
    public static void main(String[] args) {
        
        kuyrukYapisi kuyruk1 = new kuyrukYapisi(5);
        
        kuyruk1.enQueue(10);
        kuyruk1.enQueue(20);
        kuyruk1.enQueue(30);
        kuyruk1.deQueue();
        
        
        kuyruk1.elemanSayisi();
        kuyruk1.yazdir();
        
        
    }
    
}
