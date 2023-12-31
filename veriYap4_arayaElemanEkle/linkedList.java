

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
    void arayaEkle(int index , int x){ //girilen indexe göre ekleme yapilacaktir
        //dugum olusturarak baslariz 
        node eleman = new node();
        eleman.sayi = x;
        /*araya ekleme yaparken 3 ozel durum var
          1-head kontrolü : indexi heade mi giriyor
          2-tail kontrolü : indexi taile mi giriyor
          3-araya ekleme  : indexi araya mı giriyor
        */
        if(head == null && index == 0){ //liste yoksa kullanici indexe sadece sifir girebilir
            //headin eskiden oldugu indexe ekleme yapacağız basa ekleme degildir
            eleman.next = null; //biz burada direkt headin oldugu konuma yerlestirmek istiyoruz o yuzden null yazdik
            head = eleman; //headin onune degil dogrudan oldugu yere ekleme yapacağız
            tail = eleman;
            System.out.println("liste olustu ve "+index+". indexe dugum eklendi ! ");
        }
        else if(head != null && index == 0){ //liste varsa ve index sifirsa
            eleman.next = head;
            head = eleman;
            System.out.println(index+". indexe dugum eklendi ! ");
        }
        else{
            //simdi tail degerini kontrol edecegiz bu yuzden son index lazim
            
            node temp = head;
            node temp2 = head;
            int cx = 0;
            while(temp != null){
                cx++; //index degerini tutamadim cunku 1'den baslar dongunun kac kere calistigini gosterir
                temp2 = temp; //temp son dugume gecmeden ben temp2'ye sondan onceki dugumu kopyaladim
                temp = temp.next; //temp burada son dugumu tutuyor artik
            }
            if(index == cx){ //baglama islemlerini yapacagiz
                temp2.next = eleman;
                eleman.next = temp;
            }
            else{ //araya ekleme bu kisimda yapilacak
                temp = head;
                temp2 = head;
                int i = 0;
                while(i < index){
                    i++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = eleman;
                eleman.next = temp;
                
                System.out.println(index+".indexe "+x+" degeri eklendi !");

                
                
                
            }
            
            
            
        }
        
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
