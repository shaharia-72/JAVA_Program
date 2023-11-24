// Example taken from http://www.dailyfreecode.com/Code/inheritance-superclass-subclass-1393.aspx

class Teacher extends Person
{
      String mainSubject;
      int salary;
      String type; // Primary or Secondary School teacher
 
     Teacher(String fName, String lName, String sub, int slry, String sType)
     {
          super(fName,lName);
          mainSubject = sub;
          salary = slry;
          type = sType;         
      }
     void Display()
     {
            super.Display();

            System.out.println("Main Subject : " + mainSubject);
            System.out.println("Salary : " + salary);
            System.out.println("Type : " + type);
     }
}