package client;

import java.io.IOException;
import java.net.Socket;

public class ClientSocket {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 5000);
		System.out.println("Server connected.");
	}
}
