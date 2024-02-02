
class Age {
    String colour;
    int age;

    void initObj(String s,int a)//method
    {
        colour=s;
        age=a;
    }
    void display()
    {
        System.out.println(colour +" and "+age);

    }
    public static void main(String[] args)
         { 
            
           Age pepsi= new Age();//object
           Age pizza=new Age();
           

            pepsi.initObj("black",10);
            pepsi.display();

            pizza.initObj("red",13);
            pizza.display();

        

           
        }


        
    }