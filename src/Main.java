import java.io.*;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    //public static int count = 0;
    public static AtomicInteger coun = new AtomicInteger();
    public static boolean exit = false;
    public static void main(String[] args) {

        while(!exit) {
            Thread neWrite = new Thread(new Thr());
            neWrite.start();
            //count++;
            coun.incrementAndGet();
            try {
                neWrite.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }




    }
    public static void mprint(String filename){
        String filetext = "fileN"+coun;
        String dir = "C:\\test\\"+filetext+".txt";
        File file = new File(dir);
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(filename);
            writer.flush();
            writer.close();
        } catch (IOException e) { System.out.println("Error, not found");}

    }


}



