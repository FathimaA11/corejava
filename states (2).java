class states{
public static String names(String[] name)
{
System.out.println("invoked");
int size=name.length;
for(int i=0;i<name.length;i++)
{
System.out.println(name[i]);

}
System.out.println(size);
return "successfull";
}
}