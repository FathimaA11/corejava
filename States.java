class States{
public static String stateNames(String[] state)
{
System.out.println("method invoke");
int size=state.length;
for(int i=0;i<size;i++)
{
System.out.println(state[i]);


}
return "successful";
}
}