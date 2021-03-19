public class ExamTwo{
  
  //declaring variables
  private int id;
  private String name;
  private int houseNo;
  private String barangay;
  private String municipality;
  private String phoneNumber;
  private String order;
  private String type;

  //constructor
  public ExamTwo() {
    setId (1000);
    setName ("testname");
    setHouseNo(1);
    setBarangay("brgy");
    setMunicipality("municipality");
    setPhoneNumber ("xxxx");
    setOrder ("testorder");
    setType ("testtype");
  }
  

  // SETTER SETTER SETTER SETTER SETTER
    // SETTER SETTER SETTER SETTER SETTER

 public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setHouseNo(int houseNo) {
    this.houseNo = houseNo;
  }









  //GETTER GETTER GETTER GETTER GETTER
  //GETTER GETTER GETTER GETTER GETTER


 








  


  //declaring variables for methods of cost and total cost of pizza
  
  double totalCost;
  double price; 
  double deliveryCost; 
  
  
  //method for determining pizza price
  public double determinePizzaPrice(){
    if (getOrder().equals("Hawaiian")){
      price = 14.95;
    }
    else if (getOrder().equals("Hawaiian Delight")){
      price = 17.95;
    }
    
    else if (getOrder().equals("Classic Cheese")){
      price = 16.95;
    }
    
    else if (getOrder().equals("Pizza Bianca")){
      price = 15.95;
    }
    else if (getOrder().equals("Pepperoni")){
      price = 13.95;
    }
    else {
      System.out.println("Error: Incorrect Order name has been entered. Please ensure it is spelt correctly"); 
    }
    return price;
  }
  
  public double totalCost(){
    if (getType().equals("Pick-up")){
      deliveryCost = 0;
    }
    else if (getType().equals("Delivery")){
      deliveryCost = 7;
    }
    return totalCost = price + deliveryCost;
  }
}
