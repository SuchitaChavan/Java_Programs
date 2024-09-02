 class Mark
{
  int cs;
  int maths;
  int evs;
}
 class  InstanceVariable
{
 public static void main(String args[])
  {
	   //Object First
      Mark obj1 = new Mark();
     obj1.cs = 70;
     obj1.maths = 80;
     obj1.evs = 60;

           //Second Object
      Mark obj2 = new Mark();
      obj2.cs = 90;
      obj2.maths = 70;
      obj2.evs = 50;

	   //Display marks of first object
      System.out.println("Marks Of First Student :\n"); 
      System.out.println("Mark of cs : "+obj1.cs); 
      System.out.println("Mark of maths : "+obj1.maths); 
      System.out.println("Mark of evs : "+obj1.evs);

	    //Display marks of second object
      System.out.println("\nMarks Of Second Student :\n"); 
      System.out.println("Mark of cs : "+obj2.cs); 
      System.out.println("Mark of maths : "+obj2.maths); 
      System.out.println("Mark of evs : "+obj2.evs);

   }
}