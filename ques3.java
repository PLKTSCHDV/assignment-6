class overloading
{
  public void display(String a)
  {
    System.out.println(a);
  }
  public void display(int a)
  {
    System.out.println("integer no: "+a);
  }
  public void display(float a)
  {
    System.out.println("float no: "+a);
  }
}
class ques3 {
  public static void main(String[] args) {
    overloading x=new overloading();
    x.display(null);
    x.display(5);
    x.display(3.6f);
  }
}
