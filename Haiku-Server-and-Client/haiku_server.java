import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.Random;

public class haiku_server{

    String[] haiku_list= new String[] {"haiku1.txt","haiku2.txt","haiku3.txt","haiku4.txt",
			 "haiku5.txt","haiku6.txt","haiku7.txt","haiku8.txt","haiku9.txt","haiku10.txt"};
    int k;

    public void send_haiku(){
	
	try{
	    ServerSocket serversock=new ServerSocket(5575);

	    while(true){
		Socket sock=serversock.accept();

		Random rand=new Random();
		k=rand.nextInt(10);

		File file=new File(haiku_list[k]);
		Scanner sc=new Scanner(file);

		PrintWriter writer=new PrintWriter(sock.getOutputStream(),true);
		while(sc.hasNextLine())
		    writer.println(sc.nextLine());
		
		sock.close();
	    }
		
	}catch(Exception ex){
		ex.printStackTrace();
	}
    }
	public static void main(String []args){
	    haiku_server s=new haiku_server();
	    s.send_haiku();
	}
}
	    
