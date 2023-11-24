// Example taken from http://www.dailyfreecode.com/Code/inheritance-superclass-subclass-1393.aspx

class InheritanceDemo
{
       public static void main(String args[])
       {
               Person pObj = new Person("Rayan","Miller");
               Student sObj = new Student("Jacob","Smith",1,"1 - B","Roma");
               Teacher tObj = new Teacher("Daniel","Martin","English",6000,"Primary Teacher");
               System.out.println("Person :");
               pObj.Display();
               System.out.println("");
               System.out.println("Student :");
               sObj.Display();
               System.out.println("");
               System.out.println("Teacher :");
               tObj.Display();
        }
}