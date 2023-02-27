class DisneyPlus extends StreamingService{
    
  private String name;
  private double subscription;

  @Override
  public void prompt(){
    System.out.println("Thank you for choosing DisneyPlus! Here are our top shows!");
  }
  
  public void setName(String name){
    this.name = name;
  }
  public String getName(String name){
    return this.name; 
  }

  public void setSubscription(double subscription){
    this.subscription = subscription;
  }

  public double getsubscription(){
    return this.subscription;
  }
    
  public String toString(){
    return (name + " will cost " + subscription + " per month. We have Star Wars!");
  }

  public DisneyPlus(String sports, double cost){
    this.sports = sports;
    this.cost = cost;
  }

  public void sports(){
    System.out.println("You can watch sports live on " + this.sports + " for an aditional " + this.cost + " per month ");
  }
  

}  
