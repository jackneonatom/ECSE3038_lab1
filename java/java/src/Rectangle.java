public class Rectangle {
    int length;
    int width;
    Rectangle(int x,int y)
    {
        length=x;
        width=y;

    }
    int rectArea()
    {
        return(length*width);
    }
        public static void main(String[]args)
        {
        Rectangle obj1=new Rectangle(10,12);
        int a=obj1.rectArea();
        System.out.println("Area is "+ a);
        
        
    }

    
}
