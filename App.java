import com.fazecast.jSerialComm.*; // Serial Port classes
import java.io.*;

public class App
{
   public static void main (String[] Args) throws IOException
   {
      

    
     SerialPort [] AvailablePorts = SerialPort.getCommPorts();
       
        //Open the first Available port
        
       for(SerialPort S:AvailablePorts)
       System.out.println("\n "+ S.toString());
        
        
        SerialPort MySerialPort = AvailablePorts[0];   
        MySerialPort.openPort(); //open the port
                                 //Arduino May get reset                       

        if (MySerialPort.isOpen()){//Check whether port open/not
        while(true){      
        System.out.println("is Open ");
              InputStream in = MySerialPort.getInputStream();
                    
              BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line = reader.readLine();
                System.out.println(line);

        }
             
                    }
        else
           System.out.println(" Port not open ");

    
   }//end of main()
}