public class Assendingorder{    
    public static void main(String[] args) {       
        int [] num = new int [] {10,17,30,20};     
        int temp = 0;    

              
        for (int i = 0; i < num.length; i++) {     
            for (int j = i+1; j < num.length; j++) {     
               if(num[i] > num[j]) {    
                   temp = num[i];    
                  num[i] = num[j];    
                   num[j] = temp;    
               }     
            }     
        }    
        System.out.println("Elements in ascending order: ");    
        for (int i = 0; i < num.length; i++) {     
            System.out.print(num[i] + " ");    
        }    
    }    
}