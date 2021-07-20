package algoritmi.homework;
//Ex131/Pg88

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ReferenceMystery1 {
    public static void main(String[]args){
        int x=0;
        int[]a=new int[4];
        x++;
        mystery(x,a);
        System.out.println(x+" "+ Arrays.toString(a));
        x++;
        mystery(x,a);
        System.out.println(x+" "+ Arrays.toString(a));
    }
    public static void mystery(int x, int[]a){
        x++;
        a[x]++;
        System.out.println(x+" "+Arrays.toString(a));
    }



}
