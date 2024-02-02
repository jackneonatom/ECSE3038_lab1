public class Animaal //parent class
{
    void eat()
    {
        System.out.println("i am eating");
        
    }

    
}
class Dog extends Animaal //child class
{
    public static void main(String args[])
    
    {
        Dog d=new Dog();
        Animaal a=new Animaal();
        a.eat();
        d.eat();


    }
    //types of inheritance:
    //1.SIngle Inheritance
    //2.Multilevel inheritance
    //3.hierarchial inheritance
    //4.Mutiple INheritance
    //5. Hybrid Inheritance

}
