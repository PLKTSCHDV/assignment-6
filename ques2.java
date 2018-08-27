class animal
{
public int breed;
public int color;
public void speak()
{
System.out.println("inside speak");
}
}
class dog extends animal
{
public void speak()
{
System.out.println("inside dog");
}
}
class cat extends animal
{
public void speak()
{
System.out.println("inside cat");
}
}
class ques2
{
public static void main(String args[])
{
animal a=new animal();
a.speak();
a=new dog();
a.speak();
a=new cat();
a.speak();
}
}
