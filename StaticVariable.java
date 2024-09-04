class Student
{
  static String className = "Ty";
  String Name;
 };
class StaticVariable
{
 public static void main(String args[])
  {
    Student obj1 = new Student();
    obj1.Name = "Suchita Chavan";
   

    Student obj2 = new Student();
     obj2.Name = "Pallavi Chavan";
    

    System.out.println(obj1.Name + " " + Student.className);

    System.out.println(obj2.Name + " " + Student.className);
  }
}