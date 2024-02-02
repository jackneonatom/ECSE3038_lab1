public class Student {
    String name;
    int rno;
    Student(String str,int n)
    {
        name=str;
        rno=n;

    }
    public static void main(String[]args)
    {
        Student s1=new Student("DEF1",103);
        Student s2=new Student("DEF",102);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s2.name);
        System.out.println(s2.rno);
        


    }
    //COntructors are of two types
    //1. Default Contructor
    //2. Parameterized Contructor
}
