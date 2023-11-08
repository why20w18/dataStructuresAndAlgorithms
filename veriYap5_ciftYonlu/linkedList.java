

public class linkedList{
    
    node head = null;
    node tail = null;
    
    void basEkle(int data){
        node eleman = new node(data);
        
        if(head == null){ //liste var mı yoksa olustur
            head = eleman;
            tail = eleman;
            System.out.println("liste olusturuldu : basEkle");
        }
        else{
            //liste olusmussa ve basa ekleme yapacaksak
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.println("basa eleman eklendi ! : basEkle");
        }
        
    }
    void sonEkle(int data){
        
        node eleman = new node(data);
        
        if(head == null){ //liste boşsa ilk dugumu olustur hem head hem taildir
            head = eleman;
            tail = eleman;
            System.out.println("liste olusturuldu ! : sonEkle ");
        }
        else{
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
            System.out.println("sona eklendi : sonEkle ");
        }
        
    }
    //index değerine göre ekleme yapsın
    void arayaEkle(int index , int data){
        
        node eleman = new node(data);
        
        if(head == null){ //liste yoksa dugum olustur , liste yoksa indexin onemi yok ilk liste olusacak
            head = eleman;
            tail = eleman;
            System.out.println("liste olusturuldu : arayaEkle");
        }
        else if(head != null && index == 0){
        //basa ekleme yapacağız
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.println("basa eklendi : arayaEkle");
        }
        else{ //sona ekleme ve araya ekleme
            //sona ekleme için sonuncunun indexini bulmaliyiz
            int cx = 0;
            node temp = head; //baştan next ile bağlayarak gitcem
            //node temp2 = head; // çift yönlüde temp2 tanımlamaya gerek yok
            while(temp.next != null){
                temp = temp.next;
                cx++;
            }
            //tail için indexi buradan tutarız tailin
            
            //tempi sadece son indexi bulmak icin kullandim
            if(index > cx){ //indeximiz son degere esit olmayacak ki direkt son degere atama yapamasin
                            //taili ileri kaydiracagiz ve elemani tail yerine kaydedeceğiz
            /*tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
            */
            eleman.next = temp;
            temp.prev = eleman;
            tail = temp;
            
            System.out.println("sona dugum eklendi : arayaEkle ");
            }
            else{
                //araya ekleme
                //indis bulacagiz girilene kadar gideceğiz
                
                int cxx = 0;
                temp = head;
                while(index != cxx){
                    temp = temp.next;
                    cxx++;
                }
                eleman.prev = temp.prev;
                temp.prev.next = eleman;
                
                eleman.next = temp;
                temp.prev = eleman;
                
            }
            
            
        }
        
    }
    void basSil(){
        
        if(head != null){ //listede eleman yoksa silmeye gerek yoktur zaten
            
            if(head.next == null){ //listede bir eleman varsa onu sileceğiz
                head = null;
                tail = null;
                System.out.println("listedeki tek elemanda silindi !");
            }
            else{ //listede birden fazla eleman varsa
                head = head.next; //headi kaydırırız çünkü artık onu sileceğiz
                head.prev = null; //yeni head değerinden geri gidip siliyoruz eski headi
            }
            
        }
        
    }
    
    void sonSil(){
        
        if(head != null){ //sadece dolu listeleri aldik
            
            if(head.next == null){  //tek eleman varsa sil bunu anlamak için headin ilerisi null mu diye bakariz
             head = null;
             tail = null;
                
            }
            else{ //birden fazla elemanda
                tail = tail.prev;  //taili sileceğiz o yuzden 1 gerisini tail belirledik
                tail.next = null; //yeni tailin ilerisindeki dugum null diyerek sildik   
            }
        }
    }
    
    //yazdir metoduyla yazdirabilmemizin sebebi next ile dugumleri birbirine baglamakti
    //prev ile yazdirmak istiyorsak dugumleri yine birbirine baglamak zorundayiz
    void duzYazdir(){
        int cx = 0;
        node temp = head;
        //node temp2 = head; buna şimdilik gerek yok
        
        System.out.print("head->");
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("tail\n");
        
    }
    
    void tersYazdir(){ //tersten yazdiracaksin
        int cx = 0;
        node temp = tail;
        
        System.out.print("tail->");
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.prev;
        }
        System.out.print("head\n");
    }
    
    
}
