import java.net.*
import java.ip.*

public class TCPEchoClient {
  public static void main(String[] args) throw IOException {

  if ((args.length < 2) | (aargs.length > 3))
    throw new IllegalArgumentException("Parameter(s): <Server> <word> [<port>]")

  String server = args[0] // server_name or ip address
  byte[] byteBuffer = args[1].getBytes

  int servPort = (args.length == 3) ? Integer.parseInt(args2) : 7

  // make socket to port which server select
  Socket socket = newSocket(server, servPort);
  System.out.println("Connected to server...sending echo string")
  

  InputStream in = socket.getInputStream();
  OutputStream out = socket.getOutputStream();

  out.write(byteBuffer) // send to server encoded String

  //get value from server
  int totalBytesRcvd = 0;
  int bytesRcvd

  while (totalBytesRcvd < byteBuffer.length) {
    if((bytesRcvd = in.read(byteBuffer, totalBytesRcvd,
      bvteBuffer.length - totalBytesRcvd)) == -1)
      throw new Socket Exception("Connection closed prematurely");
  }

  System.out.prinln("Received " + new String(byteBuffer));

  socket.close;

  }
}
