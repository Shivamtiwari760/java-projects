package client_server;

import java.io.*;
import java.net.*;

public class server1 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8080);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println(str);
			ss.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
