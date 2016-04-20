package hw1;

/* OpenCommercial.java */

import java.net.*;
import java.io.*;
import java.util.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));
    /*System.in对象类型是InputStream,先用InputStreamReader转换成Reader类型，
    BufferedReader只能接受reader类的子类
    */

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();
    URL url;
    String[] inLines = new String[5];//数组动态初始化，数据类型[] 数组名称 = new 数据类型[长度
    if(inputLine.length() != 0){
    	url = new URL ("http://www." + inputLine + ".com");
    	System.out.println(inputLine);
    	//try{
    		InputStream ins = url.openStream();
    		InputStreamReader isr = new InputStreamReader(ins);
    		BufferedReader website = new BufferedReader(isr);
            for (int i = 0; i < 5; i++) {
                inLines[i] = website.readLine();
            }
    	/*}catch (IOException e) {
            throw new Exception(e);
        }
    }*/

    for (int i = 0; i < 5; i++) {
        int reverseIndex = 5 - i - 1;
        System.out.println(inLines[reverseIndex]);
    }
}   
  }
}
