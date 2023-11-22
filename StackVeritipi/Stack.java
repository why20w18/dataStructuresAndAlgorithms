

public class Stack {
    
    int dizi[]; 
    int size;
    int index; //topOfStack = tepenin indexini takip eder
    
    public Stack(int size){
        this.size = size;
        dizi = new int[size];
        index = -1; //ekleme yapinca direkt 0.indexi gosterecek
    }
    
    void push(int data){ //ekleme yapacak
        if(isFull()){
            System.out.println("stack doludur ! ekleme yapilamaz");
        }
        else{
            index++;
        dizi[index] = data;
        System.out.println("push() :"+dizi[index]);
        }
    }
    
    int pop(){
        if(isEmpty()){
            System.out.println("stack bostur cikartma yapilamaz !");
            return -1;
        }
        return dizi[index--];
    }
    boolean isFull(){
        return index == (size-1); //boyut indexin 1 fazlası
    }
    
    boolean isEmpty(){
        return (index == -1);
    }
    
}
