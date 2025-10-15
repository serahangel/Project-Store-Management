public class Accessories {

// instance variables
  
  private String rarity;
  private double price;
  private int edition;

  /*
   * no argument constructor
   */
  
  public Accessories () {
    this("normal" , 10.99 , 1);
  }
  
  /*
   * parameterized constructor
   */
  
  public Accessories(String rarity, double price, int edition) {
    this.rarity = rarity;
    this.price = price;
    this.edition= edition;
  }
  
// first accessor method
  
  public String getRarity() {
    return rarity;
  }
  
// second accessor method
  
  public double getPrice() {
    return price;
  }
  
// third accessor method
  
  public int getedition() {
    return edition;
  }
  
// first mutator method
  
  public void setRarity(String newRarity) {
    rarity= newRarity;
  }
  
// second mutator method
  
  public void setPrice(double newPrice) {
    price= newPrice;
  }
  
// third mutator method
  
  public void setEdition(int newEdition) {
    edition= newEdition;
  }
  
// toString method
  
  public String toString() {
    return "Rarity: " + rarity + "\nPrice: " + price + "\nEdition: " + edition;
  }
}