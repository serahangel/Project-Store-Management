import java.util.Scanner;

public class StoreRunner {
public static void main(String[] args) {

// Creates a Scanner object 
    Scanner input = new Scanner(System.in);

Necklace GoldenDiamond = new Necklace ();
  
System.out.print("What rarity is the necklace: ");
  String rarity = input.nextLine();
  GoldenDiamond.setRarity(rarity);

System.out.print("What price is the necklace: ");
  double price = input.nextDouble();
  GoldenDiamond.setPrice(price);

System.out.print("What edition is the necklace: ");
  int edition = input.nextInt();
  GoldenDiamond.setEdition(edition);

//using accessories class to identify details of the accessories or overriding them
  
Accessories number1 = new Accessories();

Accessories number2 = new Accessories("Rare", 109.99, 100);


Accessories number3 = new Accessories("Old", 33.00, 50);

//using necklace class to identify details of the necklace or overriding them

Necklace letterA= new Necklace();


Necklace letterB= new Necklace("Normal", 10.00, 4, true, "Diamond Secrets");


Necklace letterC= new Necklace("Rare", 109.99  , 151 , false, "Sparkling Necklace");
    
 //using bracelet class to identify details of the bracelet or overriding them

Bracelet standard= new Bracelet();

    
Bracelet standardA= new Bracelet("Old", 12.99, 3,"Treasured Emerald");


Bracelet standardB= new Bracelet("Normal", 12.99, 1,"Friendship Bracelet");

System.out.println(GoldenDiamond);
System.out.println();

//printing out the details of each item/accessory
System.out.println("What are the available accessories? ");   
System.out.println(number1);
System.out.println(number2);
System.out.println(number3);
System.out.println(letterA);
System.out.println(letterB);
System.out.println(standard);
System.out.println(standardA);
System.out.println(standardB);


// Closes the Scanner object
  
    input.close();
    
  }
}