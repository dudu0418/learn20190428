package com.jackie.learn.daily;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(5000);
		Socket accept = serverSocket.accept();
		InputStream inputStream = accept.getInputStream();

		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		Object readObject = objectInputStream.readObject();
		System.out.println(readObject);
	}
}
