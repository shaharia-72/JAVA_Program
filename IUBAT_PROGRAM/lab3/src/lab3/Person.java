
// Example taken from http://www.dailyfreecode.com/Code/inheritance-superclass-subclass-1393.aspx
class Person
{
     String FirstName;
     String LastName;
 
     Person(String fName, String lName)
     {
              FirstName = fName;
              LastName = lName;
      }

      void Display()
      {
            System.out.println("First Name : " + FirstName);
            System.out.println("Last Name : " + LastName);
       }
} 