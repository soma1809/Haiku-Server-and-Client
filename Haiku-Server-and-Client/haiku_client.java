import java.io.*;
import java.net.*;

public class haiku_client{
    public void make_conn(){
	try{
	    Socket sock=new Socket("127.0.0.1",5575);

	    InputStream in=sock.getInputStream();
	    BufferedReader reader=new BufferedReader(new InputStreamReader(in));

	    String line;
	    while((line=reader.readLine())!=null)
		System.out.println(line);

	    sock.close();
	}
	catch(IOException ex){
	    ex.printStackTrace();
	}
    }

    public static void main(String args[]){
	haiku_client c=new haiku_client();
	c.make_conn();
    }
}


