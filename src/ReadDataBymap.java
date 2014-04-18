import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Reader;

public class ReadDataBymap {   

    public ReadDataBymap() {   

    }   

    public static void main(String[] args) {   

    	Reader in = null;   

    	
        try {   

        	in = new FileReader(new File("D:/test.csv"));   
        	BufferedReader reader = null; 
        	
        	
        	reader = new BufferedReader(in); 
            long begin = System.currentTimeMillis();   
           
            String tempString = null; 
            while ((tempString = reader.readLine()) != null){ 
            	//œ‘ æ––∫≈ 
            	System.out.println(""); 
            	
            	} 
           reader.close(); 

            in.close();   

            long end = System.currentTimeMillis();   
            
            System.out.println(end-begin);

        } catch (Exception e) {   

            e.printStackTrace();   

        }   

        finally {   

            try {   

            	in.close();   

            } catch (Exception e) {   

                e.printStackTrace();   

            }   

        }   

    }   

}   