

package java.src;
/* 
//Abstract Method
abstract class A {
    abstract void display();

    
}
class B extends A
{
    void display()
    {
    System.out.println("Class A method");
    }



}
class C extends B{
    void show()
    {

    }
}
class abstractDemo
{
    public static void main(String[] args) {
        B b=new B();
        b.display();

    }
}
*/
abstract class Vehicle
{
    abstract void start();
    {
        class car extends Vehicle
        {
            void start()
            {
                System.out.println("car starts with key");
            }
        }
        class scooter extends Vehicle
        {
            void start()
            {
                System.out.println("Scooter starts with keys");
            }


        }
public static void main(String[] args) {
    
               // Vehicle v=new Vehicle();//error
                car c=new car();
                c.start();
                scooter s=new scooter();
                s.start();
                

        }
    }
    
}
