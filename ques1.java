class ques1
{
static int x;
static String y;
static
{
System.out.println("block 1");
x=16;
y="block1";
}
static
{
System.out.println("block 2");
x=18;
y="block2";
}
public static void main(String args[])
{
System.out.println("int " +x);
System.out.println("string " +y);
}
}
