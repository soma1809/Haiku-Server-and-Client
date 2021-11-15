# Haiku-Server-and-Client <br/>
This is the Java Code for a Haiku Server and Client. <br/>
A server listens on port 5575 on the localhost. <br/>
Whenever a client connects to the server (using port 5575), the server returns a haiku (choosing randomly from 10 haikus) to the client and closes the connection.
ServerSocket class is used to create the socket on the localhost (and required port). <br/>
Socket class is used to connect to and accept connections from the address. <br/>
Java IO classes are used to write to and read from the connection.
<br/>
<br/>
Example of the server and clients running:
![image](https://user-images.githubusercontent.com/60248071/141733299-b0942233-e94b-4845-93dc-0e1cf9fa303b.png)
<br/> As seen above the server returns a random haiku for every client connection.<br/> 
# Credits/Sources :<br/>
Source Code: Operating System Concepts (10th edition), Abraham Silberschatz, Peter Baer Galvin, Greg Gagne
Haikus: 
https://poemanalysis.com/best-poems/haikus/<br>
https://www.readpoetry.com/10-vivid-haikus-to-leave-you-breathless/
