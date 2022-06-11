package com.ShnatWorld.testNG;

import java.net.*;
import java.io.*;
public class MultithreadedSocketServer {
 public static void main(String[] args) throws Exception {
   try{
     ServerSocket server=new ServerSocket(8888);
     int counter=0;
     System.out.println("Server Started ....");
     while(true){
       counter++;
       Socket serverClient=server.accept();  
       System.out.println(" >> " + "Client No:" + counter + " started!");
       ServerClientThread sct = new ServerClientThread(serverClient,counter); 
       sct.start();
     }
   }catch(Exception e){
     System.out.println(e);
   }
 }
}
