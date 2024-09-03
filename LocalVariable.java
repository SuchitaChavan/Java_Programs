public class LocalVariable
{
  public void StudentAge()
   {
	int age = 21;			//Local variable declaration with initialization
	System.out.println("Student age is "+age);
    }
	
 public static void main(String args[])
  {
	LocalVariable LC = new LocalVariable();
	LC.StudentAge();
   }
}