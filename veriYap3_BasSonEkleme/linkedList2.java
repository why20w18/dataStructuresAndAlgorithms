//cikartma metodlari eklenmeden sadece bas , son ve araya ekleme metodlarini icerir


public class linkedList2{
    node head = null;
    node tail = null;
    
    void basEkle(int x){
        node eleman = new node();
        eleman.data = x;
        
        if(head == null){
            eleman.next = head;
            head = eleman;
            tail = eleman;
        }
        else{
            eleman.next = head;
            head = eleman;
        }
        
    }
    void sonaEkle(int x){
        node eleman = new node();
        eleman.data = x;
        
        if(head == null){
            eleman.next = null;
            tail = eleman;
            head = eleman;
        }
        else{
            eleman.next = null; //elemanım null gösteriyor demektir
            tail.next = eleman;
            tail = eleman;
        }
    }
    
    void arayaEkle(int index , int x){
        node eleman = new node();
        eleman.data = x;
        
        if(head == null && index == 0){
            eleman.next = null;
            head = eleman;
            tail = eleman;
        }
        else if(head != null && index == 0){
            eleman.next = head; //elemanimdan cikan ok Head'i gosterir
            head = eleman;
        }
        else{
            //tail indexi girilirse
            int i = 0;
            node temp = head;
            node temp2 = head;
            
            while(temp.next != null){ 
                    //temp.next != null ise temp bizim son degerimizi tutar bu null degildir , temp2 ise sondan 1 onceki dugumdur
                    //temp != null ise temp null degerini tutar , temp2 bizim son dugumumuzu gosterir
            i++;
            temp2 = temp;
            temp = temp.next;
            }
            if(i == index){
                temp2.next = eleman;
                eleman.next = temp;
            }
            else{ //araya ekleme icin index tespiti
                int j = 0;
                temp = head;
                temp2 = head;
                while(j < index){ //j kullanarak ne kadar dugum gidecegimizi hesapladik
                    j++;            //index 3 olsun , j = 2.indexe geldiğinde temp değeri 3.indexteki dugumu gosterir
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = eleman;
                eleman.next = temp;
                
            }
        }
        
    }

    void yazdir(){
        int i = 0;
        node temp = head;
        
        System.out.print("head->");
        while(temp != null){ //temp.next deseydim son dugumun ilerisi null oldugundan orayi almiyor dongu bozuluyor cunku
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("tail");
    }
    
    
    
    
}
