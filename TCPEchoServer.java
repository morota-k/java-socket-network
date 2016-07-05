import java.net.*;
import java.io.*;

public class TCPEchoServer {
	private static final int BUFSIZE = 32;

	public static void main (String[] args) throw IOExeption {
		if (args.length != 1) // args size
		throw new IllegalArgumentExcption("parameter(s): <port>")

		int servPort = Intefer.parseInt(args[0]);

		// make server socket available on requirement of client

		int recvMsgSize;  // acceptance message size
		byte[] byteBuffer = new byte[BUFSIZE]; // acceptance baffer

		for(; ;) {
			socket clntSock = servSock.accept() // get connenction with client

		System.out.println("handling client at" + 
			clntsock.getinetAdddress().getHostAddress() + " on port") +
				clntSock.getPort());

		InputStream in = clntsock.getInputStream();
		OutputStream out = clngtSock.getOutputStream();

		// until client close connection(return -1) executed
		while ((recvMsgSize = in.read(byteBuffer))  != -1)
			out.write(byteBuffer, 0, recvMsgSize);

		clntSock.close();
		}

	}

}