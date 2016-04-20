package hw1;

import java.io.*;
public class Nuke2{
public static void main (String args[]) throws Exception{
	BufferedReader keyboard;
	String inputLine;
	keyboard = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("输入的是：");
	inputLine = keyboard.readLine();
	System.out.println(inputLine);
	char[] inputLine2 = inputLine.toCharArray();
	for(int i=0;i<inputLine2.length;i++){
		if(i!=1){
			System.out.print(inputLine2[i]);
		}
	}
}
}

