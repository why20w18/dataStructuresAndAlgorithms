.model small   

.stack 32 dup(0);5454 silme CPU'ya ek yuk biner
;STACK EN FAZLA 16 BIT AYARLIDIR BURADA

.data
    
   data1 db 1,5,7 ; 8 BITLIK DIZI STACK ICIN UYGUN DEGIL
   data2 dw 2,6,8 ;16 BITLIK DIZI STACK ICIN UYGUN  
.code
    
    .STARTUP
     
     ;HERHANGI BIR SAYI GONDERME
     mov ax,3
     push ax
     
     ;UYUMSUZ BITTE DEGISKEN GONDERME
     mov si,offset data1;dizi gezecegiz si dedik
     push [si];hem 1 hem 5 beraber yuklendi 16 bitlik alan var
     
     ;UYUMLU DIZI GONDERME
     push data2 ;ilk eleman 2 degeri gitti 16 bitliktir    

     pop bx;data2 kopyalanir , stackte kalan silinmedi
     pop bx;data1 kopyalanir , stackte kalan silinmedi
     pop bx;3 degeri kopyalanir , stackte kalan silinmedi
    .EXIT
end
