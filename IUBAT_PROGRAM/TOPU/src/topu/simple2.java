package lab7;

public class simple2 {
      public static void main(String[] args) {  
          
           try{
               int data=50/0;
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs" + e);  
                  }       
               catch(Exception e)  
                  {  
                   System.out.println("Exception occurs" + e);  
                  }             
               System.out.println("rest of the code");    
    }  
    
    
    
}
