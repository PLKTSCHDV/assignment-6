class vehicle
{
  public void start()
  {
    System.out.println("inside vehicle start");
  }
  public void stop()
  {
    System.out.println("inside vehicle stop");
  }
}
  class w2 extends vehicle
  {
    public void start()
  {
    System.out.println("inside w2 start");
  }
  public void stop()
  {
    System.out.println("inside w2 stop");
  }
  }
  class w4 extends vehicle
  {
    public void start()
  {
    System.out.println("inside w4 start");
  }
  public void stop()
  {
    System.out.println("inside w4 stop");
  }
  }

class ques4 {
  public static void main(String[] args) {
    vehicle a=new w2();
    a.start();
    a.stop();
    a=new w4();
    a.start();
    a.stop();
    
    
  }
}