

public class kuyrukYapisi{
    
    int kuyruk[];
    int size;
    int rear;
    int front;
    
    public kuyrukYapisi(int size){
        this.size = size;
        kuyruk = new int[size];
        rear = -1;
        front = 0;
    }
    
    void enQueue(int data){
        if(isFull()){
            System.out.println("kuyruk tamamen dolu ! eleman eklenemez !");
        }
        else{
            kuyruk[++rear] = data;
            System.out.println(data+" kuyruga eklendi !");
        }
    }
    
    void deQueue(){
        if(isEmpty()){
            System.out.println("kuyruk bostur ! cikartma yapilamaz !");   
        }
        else{
            int cikartilanSayi = kuyruk[front]; //cikartilan sayiyi tutmak icin
            for(int i = 0 ; i < rear ; i++){
                kuyruk[i] = kuyruk[i+1];
            }
            rear--; //kuyruga eleman eklerken artar , cikartirken azalir
            System.out.println("cikartilan eleman :"+cikartilanSayi);
        }
    }
    
    boolean isFull(){
        return rear == size -1;
    }
    boolean isEmpty(){
        return rear == -1;
    }
    
    void elemanSayisi(){
        System.out.println("kuyruktaki eleman sayisi: "+(rear+1));
    }
    
    void yazdir(){
        int i = rear;
        System.out.print("rear->");
        while(i >= 0){ //fronta gidene kadar yazdiriyoruz
            System.out.print(kuyruk[i]+"->");
            i--;
        }
        System.out.print("front");
        
    }
    
}
