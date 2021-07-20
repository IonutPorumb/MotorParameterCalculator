package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExercise{
    public static final String FILE_PATH="./resources/fileForRead.txt";
    public static void readFromFileMethod(){
        File f=new File(FILE_PATH);
        if(!f.exists()){
            System.out.println("Invalid path!");
        return;
        }
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr=new FileReader(f);
            br=new BufferedReader(fr);
            String readLine=null;
            int nrOfLine=0;
            while((readLine=br.readLine())!=null){
                nrOfLine++;
                System.out.println("The read line is "+readLine+" and the number of line is "+nrOfLine);
            }
        }
        catch (IOException e){
            System.out.println("Error occurred during readout process "+e.getMessage());

        }
        finally{
            try{
                if(fr!=null){
                 fr.close();;
                }
                if(br!=null){
                    br.close();
                }

            }
            catch(IOException e){
                System.out.println("Error occurred during closing the file "+e.getMessage());
            }
        }
    }


    public static void main(String []args){
        readFromFileMethod();
    }



}