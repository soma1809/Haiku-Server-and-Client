//Import the necessary packages
import java.io.*;
import java.net.*;

public class haiku_client{
    public void make_conn(){
	try{
	    Socket sock=new Socket("127.0.0.1",5575); //Connect to localhost on port 5575

	    InputStream in=sock.getInputStream(); //Get the byte stream data
	    BufferedReader reader=new BufferedReader(new InputStreamReader(in)); //Read the data as characters through InputStreamReader

	    String line;
	    while((line=reader.readLine())!=null)
		System.out.println(line); //Print the data obtianed from the stream

	    sock.close(); //Close the connection
	}
	catch(IOException ex){
	    ex.printStackTrace();
	}
    }

    public static void main(String args[]){
	    //Create a new class object and call make_conn function
	haiku_client c=new haiku_client();
	c.make_conn();
    }
}


