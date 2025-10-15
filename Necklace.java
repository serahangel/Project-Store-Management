public class Necklace extends Accessories{

//instance variables
  private boolean isDiamond;
  private String name;
  
 /*
   * no argument constructor
   */
  
  public Necklace() {
    super();
    isDiamond= false;
    name="Diamond Glory";
  }
  
 /*
   * parameterized constructor
   */
  
  public Necklace (String rarity, double price, int edition, boolean isDiamond, String name) {
    super(rarity, price, edition);
    this.isDiamond= isDiamond;
    this.name=name;
  }

  
 /*
   * first accessor method
   */
  
  public boolean getisDiamond() {
    return isDiamond;
  }

  /*
   * second accessor method
   */
  
  public String getName() {
    return name;
  }

  /*
   * first mutator method
   */
  
  public void setisDiamond(boolean newisDiamond) {
    isDiamond= newisDiamond;
  }

  /*
   * second mutator method
   */

  public void setName(String newName) {
    name= newName;
  }

  /*
   * toString mutator method
   */
  
  public String toString() {
    return super.toString() + "\nIs Diamond? " + this.isDiamond + "\nName: " + this.name;
  }
}