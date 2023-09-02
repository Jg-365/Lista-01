package exercise04;

public class exercise04 {
	 
    public static void main(String[] args) {
          int A = 7;
          int B = 7;
          
          if(A > 10 || A+B == 20) {
        	  System.out.println("Numero Valido!");
          }
          else {
        	  if(A == B) {
              System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
        	  }
        	  else {
              System.out.println("Numero Invalido!");
        	  }
          }
      }
}
