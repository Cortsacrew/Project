import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 
    Netflix netflix = new Netflix(12, 3);
      netflix.setName("Netflix");
      netflix.setSubscription(19.99);
      System.out.println(netflix.toString());    
    ArrayList<String> shows = new ArrayList<String>();
      shows.add("The Witcher");
      shows.add("Stranger Things");
      shows.add("Squid Game");
      shows.add("El Camino");
  
    AmazonPrime amazon = new AmazonPrime("HBO", 4.99);
      amazon.setName("AmazonPrime");
      amazon.setSubscription(14.99);
      System.out.println(amazon.toString());
    ArrayList<String> shows2 = new ArrayList<String>();
      shows2.add("The Rings of Power");
      shows2.add("The Boys");
      shows2.add("Invincible");
      shows2.add("The Grand Tour");

    DisneyPlus disney = new DisneyPlus("ESPN", 9.99);
      disney.setName("DisneyPlus");
      disney.setSubscription(7.99);
      System.out.println(disney.toString());
    ArrayList<String> shows3 = new ArrayList<String>();
      shows3.add("Moon Knight");
      shows3.add("She Hulk"); 
      shows3.add("The Mandalorian"); 
      shows3.add("Andor"); 
    
    Scanner scanner = new Scanner(System.in);
      System.out.println("Choose your prefered Streaming service");
      System.out.println("Press 1 for Netflix press 2 for AmazonPrime or 3 for DisneyPlus");
    
    try{
      int choice = scanner.nextInt();
      switch(choice){
        case 1: netflix.prompt();
                for (int i = 0; i < shows.size(); i++){
                  System.out.println(shows.get(i));
                }
                netflix.newSubscriber();
                
          break;
        case 2: amazon.prompt();   
                for (int i = 0; i < shows2.size(); i++){
                  System.out.println(shows2.get(i));
                }
                amazon.extras();
          break;
        case 3: disney.prompt();
                for (int i = 0; i < shows3.size(); i++){
                  System.out.println(shows3.get(i));
                }
                disney.sports();
          break;
        default: System.out.println("Come back when you decide");
      }
    }catch(Exception ex){
      System.out.println("Please enter a number 1 or 2");
    }
    scanner.close();
  }
}
