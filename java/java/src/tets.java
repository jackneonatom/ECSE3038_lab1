//public class tets {
   //public void  Test()
   // {


   // }
    
//}



//1.contructor name is similar to class name.
//2.Contructor doesnt have a return type.

//className objectname= new contructor();
//Animal pepsi= new Animal ();
//new keyword in order to create an instance /object

//3. Doesnt have any return type not even valid
//4. The only modifiers applicable for contructors are public, protected, default and private
//5. It executes automatically when we create an object.

//ex:
//psvm(string[]arges)
//Test t=new Test();
//t.Test();
//}

class Employee
{
    String name;
    int emp_id;
    Employee()
    {
        name="Abc";
        emp_id=123;
    }
    public static void main(String[]args)
    {
        Employee e1=new Employee();
        Employee e2=new Employee();
        System.out.println(e1.name);
        System.out.println(e1.emp_id);
        System.out.println(e2.name);
        System.out.println(e2.emp_id);


    }
}


