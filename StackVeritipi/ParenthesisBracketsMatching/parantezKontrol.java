

public class parantezKontrol{
    
    boolean kontrol(String ifade){
        char[] stack = new char[ifade.length()];
        int top = -1;
        
        for(int i = 0 ; i < ifade.length() ; i++){
            char karakter = ifade.charAt(i);
            
            if(karakter == '(' || karakter == '{' || karakter == '['){
                top++;
                stack[top] = karakter;
            }
            else if(karakter == ')' || karakter == '}' || karakter == ']'){
                
                if(top == -1 || !kapatma(stack[top--], karakter)){
                return false;
                }
            }
        }
        return top == -1;
    }
    
    boolean kapatma(char acmaParentezi , char kapatmaParantezi){
        return (acmaParentezi == '(' && kapatmaParantezi == ')') ||
                (acmaParentezi == '{' && kapatmaParantezi == '}') ||
                (acmaParentezi == '[' && kapatmaParantezi == ']');
    }
    
}
