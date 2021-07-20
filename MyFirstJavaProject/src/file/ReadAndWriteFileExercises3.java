package file;

import pearson.Person;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadAndWriteFileExercises3 {
    private static final String FILE_PATH1="./resources/persons3.txt";
    private static final String FILE_PATH2="./resources/fileToWritePersons3.txt";
//We write the read persons from file method:
    public static List<Person> readPersonsFromFile() throws ParseException {
        List<Person>resultPersonList=new ArrayList<>();
        File f=new File(FILE_PATH1);
        if(!f.exists()){
            System.out.println("Invalid file path :"+FILE_PATH1+"!");
        }
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr=new FileReader(f);
            br=new BufferedReader(fr);
            String currentLine;
            int noOfLine=0;
            while((currentLine=br.readLine())!=null){
                String[]personData=currentLine.split(";");
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                String firstName=personData[0].trim();
                String lastName=personData[1].trim();
                int age=Integer.parseInt(personData[2].trim());
                double height=Double.parseDouble(personData[3].trim());
                double weight=Double.parseDouble(personData[4].trim());
                Date dateOfBirth=sdf.parse(personData[5].trim());
                String address=personData[6];
                String domicile=personData[7];
                String cnp=personData[8];
                Person p=new Person(firstName,lastName,age,height,weight,dateOfBirth,address,domicile,cnp);
                resultPersonList.add(p);
                System.out.println("The number of line is : "+noOfLine);
                noOfLine++;
            }
        }
        catch (IOException e){
            System.out.println("Exception occurred while reading from file!");
            e.getMessage();
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
                System.out.println("Exception occurred during file closing procedure! ");
                e.getMessage();
            }
        }
        System.out.println("The read person list is : "+resultPersonList.toString());
        return resultPersonList;
    }
//Write to file method:
    public static void writeToFileMethod(List<Person>personList) {
        File f = new File(FILE_PATH2);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Exception occurred during the file creation!");
        }
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw= new FileWriter(f);
            bw=new BufferedWriter(fw);
            int i=1;
            for (Person p : personList) {
                String persons= i +")"+p.getFirstName()+";"+p.getLastName()+";"+ p.getAge() +";"+
                    p.getHeight() +";"+p.getWeight()+";"+p.getDateOfBirth()+";"+p.getAddress()+";"+p.getDomiciliu()+";"+
                    p.getCnp();
            bw.write(persons);
            bw.newLine();
            i++;
            }
            bw.flush();
        }
        catch(IOException e){
            System.out.println("Exception occurred during file writing !");
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
                System.out.println("Exception occurred during file writing closing procedure!");
                e.getMessage();
            }
        }






    }


    public static void main(String[] args)throws ParseException {
//Calling the readPersonsFromFile() method:
        System.out.println("Read from file method");
        List<Person>personList1=readPersonsFromFile();
        System.out.println(personList1);
        System.out.println("Write to file method");
        writeToFileMethod(personList1);
    }
}
