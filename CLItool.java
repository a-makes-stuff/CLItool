import java.io.*;
import java.util.Scanner;

public class CLItool{
    public static void main(String[] args){
        System.out.println("Welcome to the CLI TOOL");
        System.out.println(" ,-----.,--.   ,--. ,--------.            ,--. ");
        System.out.println("'  .--./|  |   |  | '--.  .--',---. ,---. |  |");
        System.out.println("|  |    |  |   |  |    |  |  | .-. | .-. ||  |");
        System.out.println("'  '--'\\|  '--.|  |    |  |  ' '-' ' '-' '|  | ");
        System.out.println(" `-----'`-----'`--'    `--'   `---' `---' `--' ");
        String nextcommand=" ";
        
        while (true) { 
            if(nextcommand.equals("")||nextcommand.equals("exit"))
                break;
            System.out.print(" > ");
            Scanner scan = new Scanner(System.in);
            nextcommand = scan.nextLine();
            String[] terms = nextcommand.split(" ");
            switch (terms[0]) {
                case "add": 
                    break;
                case "update":
                    break;
                case "delete":
                    break;
                case "help":
                    BufferedReader br;
                    try {
                        /*Why not use br = new BufferedReader(new FileReader("help.txt")) instead? : because we
                         can't control the encoding we use to parse the txt file and we'll get errors*/
                        br = new BufferedReader(new InputStreamReader(new FileInputStream("help.txt"),"UTF-8"));
                        /* FileInputStream reads the file as raw bytes, Input Stream Reader converts those raw bytes to a character stream, to
                        read a block of chars at once, instead of a character one by one, we use bufferedReader, thus we can create Strings using readLine() */
                        String line;
                        while((line= br.readLine())!=null){
                        System.out.println(line);
                        }
                        br.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "exit":
                    break;
                case "mark-done":
                    break;
                case "mark-in-progress":
                    break;
                case "list-done":
                    break;
                case "list-in-progress":
                    break;
                case "list-incomplete":
                    break;
                default:
                    throw new  AssertionError("provide something");};
            }
        }}
    
