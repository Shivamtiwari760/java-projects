package client_server;

import java.io.*;
import java.net.*;

public class client1 {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 8080);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Sir");
			dout.flush();
			dout.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
