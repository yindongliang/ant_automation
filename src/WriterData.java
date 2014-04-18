import java.io.File;
import java.io.FileOutputStream;

public class WriterData {   

    public WriterData() {   

    }   

    public static void main(String[] args) {   

        FileOutputStream out = null;   


        try {   

            out = new FileOutputStream(new File("D:/test.csv"));   

            long begin = System.currentTimeMillis();   
            String content="";
            for (int j=0;j<512;j++){
            	content=content+0;
            }
            content=content+"\r\n";
            for (int i = 0; i <100*1024; i++) {   
//            	System.out.println("2");
                out.write(content.getBytes());   

            }   

            out.close();   

            long end = System.currentTimeMillis();   
            
            System.out.println(end-begin);

        } catch (Exception e) {   

            e.printStackTrace();   

        }   

        finally {   

            try {   

                out.close();   

            } catch (Exception e) {   

                e.printStackTrace();   

            }   

        }   

    }   

}   