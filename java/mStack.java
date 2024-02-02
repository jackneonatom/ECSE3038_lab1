import java.util.ArrayList;
public class mStack {
   private ArrayList<int>data;
    public mStack()
    {
        data = new ArrayList<Integer>();

    }
    public void push(int val)
    {
        data.add(val);
    }
    public int pop(){
        int sz=data.size();
        int val =data.get(sz -1);
        this.data.remove(index:sz-1);
        return val;
    }
    
}
