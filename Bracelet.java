public class Bracelet extends Accessories{

//instance variables
  
  private String material;

  /*
   * no argument constructor
   */
  
  public Bracelet() {
   super();
    this.material= "gold";
  }

   /*
   * parameterized constructor
   */

  public Bracelet (String rarity, double price, int edition, String material) {
    super(rarity, price, edition);
    this.material= material;
  }

  /*
   * accessor method
   */

  public String getMaterial() {
    return material;
  }

    /*
   * mutator method
   */
  
  public void setMaterial(String newmaterial) {
    material= newmaterial;
  }

    /*
   * toString mutator method
   */

  public String toString() {
    return super.toString() + "\nMaterial: " + this.material;
  }
}