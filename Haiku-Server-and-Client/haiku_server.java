//Import the necessary packages
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.Random;

public class haiku_server{

	//The list of haiku files (there are 10 of them)
    String[] haiku_list= new String[] {"haiku1.txt","haiku2.txt","haiku3.txt","haiku4.txt",
			 "haiku5.txt","haiku6.txt","haiku7.txt","haiku8.txt","haiku9.txt","haiku10.txt"};
    int k;

    public void send_haiku(){
	
	try{
	    ServerSocket serversock=new ServerSocket(5575); //Create a new socket on the localhost on port 5575

	    while(true){
		Socket sock=serversock.accept(); //Accept connections 

		Random rand=new Random();
		k=rand.nextInt(10); //Generate a random number from 0 to 9

		File file=new File(haiku_list[k]); //Create a file pointer to the selected file
		Scanner sc=new Scanner(file); //Scanner object to read the file

		PrintWriter writer=new PrintWriter(sock.getOutputStream(),true); 
		while(sc.hasNextLine())
		    writer.println(sc.nextLine()); //Write the file data to the output stream
		
		sock.close(); //Close the connection
	    }
		
	}catch(Exception ex){
		ex.printStackTrace();
	}
    }
	public static void main(String []args){
		
		//Create a class instance and start the haiku_server 
	    haiku_server s=new haiku_server();
	    s.send_haiku();
	}
}
	    
