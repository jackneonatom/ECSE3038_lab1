package java.src;

interface Aaa
{
    void Adisplay();
}
interface Bbb
{
    void Bdisplay();
}
class AB implements Aaa{
    public void Adisplay()
    {
        System.out.println("Dispplay A");
    }
}
class Amain
{
    public static void main(String[] args) {
        AB x=new AB();
        x.Adisplay();
    }
}