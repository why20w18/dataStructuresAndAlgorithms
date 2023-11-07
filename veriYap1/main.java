

public class main {

    public static void main(String[] args){
        
        //düğüm oluşturacağım yani obje oluşturmalıyım
        node A = new node();
        node B = new node();
        node C = new node();
        //-->referansa obje oluşturmazsam düğüm olmaz çünkü düğümler ramde yer kaplar
        
        //düğümlere değer atayacağım benim düğümlerim isim ve yaş tutacak (String ve Integer)
        
        A.isim = "ali";
        A.yas  = 15;
        B.isim = "veli";
        B.yas  = 16;
        C.isim = "ahmet";
        C.yas  = 17;
        //-->düğümlerim artık içinde veri tutuyor
           
        //nodelerimi birbirine node classında tanımladığım next işaretçisi ile bağlayacağım
        
        A.next = B;
        B.next = C;
        C.next = null; //son düğüm hiçbir yere bağlanmaz TAIL
        
        //nodelerimi ekrana bastiracagim dongu yardimiyla
        
        node temp = A; //baştaki düğüme atayacağım geçiciyi
        while(temp != null){ //son düğüme gidene kadar çalışacak
            System.out.println("isim:"+temp.isim + " yasi:"+temp.yas);
            temp = temp.next; //temp her döngüde ileri gidecek şekilde güncellenecek
        }
                
        
    }
    
}
