import java.util.Scanner; // import the Scanner class 

class input {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Pedro Melo"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);        
  }
}