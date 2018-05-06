package textgen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Replace {
	public void replace (String from, String to, File file) throws IOException {
		File log= file;
		

		try{
		    FileReader fr = new FileReader(log);
		    String s;
		    String totalStr = "";
		    try (BufferedReader br = new BufferedReader(fr)) {

		        while ((s = br.readLine()) != null) {
		            totalStr += s;
		        }
		        totalStr = totalStr.replaceAll(from, to);
		        FileWriter fw = new FileWriter(log);
		    fw.write(totalStr);
		    fw.close();
		    }
		}catch(Exception e){
		    e.printStackTrace();
		}
	}
	public static void main(String[] args) {
         Replace r = new Replace();
         try
             {
             File file = new File("/Users/luwang/Desktop/test.txt");
             r.replace ("f", "t", file);
         }
         catch (IOException ioe)
             {
             ioe.printStackTrace();
         }
     }
    
}
