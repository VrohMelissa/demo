import java.util.Scanner;

public class MonApplication8 {

    public static void main (String arg[]) {
    System.out.println ("demo boucle do...while");
    String prenom = new String();
	
    char reponse = ' ';
	
    Scanner sc = new Scanner(System.in);

    do{
      System.out.println("Donnez un prenom : ");
      prenom = sc.nextLine();
      System.out.println("Bonjour " +prenom+", comment vas-tu ?");
    }
     do{
	  System.out.println("Voulez-vous r?ssayer ? (O/N)");
      reponse = sc.nextLine().charAt(0);
	 }
	 while(reponse =='o' &&
	
	while (reponse =='O');
	
    System.out.println("Au revoir...");
  }
}