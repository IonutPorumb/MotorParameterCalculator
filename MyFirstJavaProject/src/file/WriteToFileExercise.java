package file;

import oop.B;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExercise {
    public static final String FILE_PATH="./resources/fileToWrite2.txt";
    public static void writeToFileMethod(){
        File f=new File(FILE_PATH);
        try{
            if (!f.exists()){
            f.createNewFile();
        }
    }
        catch(IOException e){
            System.out.println("Error occurred while creating the new file "+e.getMessage());
        }
        FileWriter fw=null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter(f);
            bw=new BufferedWriter(fw);
            String [] docToFile={"Afara este soare.","Noi stam in casa din cauza coronavirusului.",
                                  "La ora 11:00 vom iesi afara in curte","Andrei se joaca fotbal afara."};
            for(String s:docToFile){
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
        }
        catch(IOException e){
            System.out.println("Exception occurred during writing to file ");
            e.getMessage();
        }
        finally{
            try{
                if(fw!=null){
                    fw.close();
                }
                if(bw!=null){
                    bw.close();
                }
            }
            catch(IOException e){
                System.out.println("Exception occurred during closing process! ");
            }
        }
    }
    public static void main(String[]args){
        writeToFileMethod();
    }
}
