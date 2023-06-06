import java.net.*;
import java.io.*;

public class Client {
    public static void main (String[] args){
        try{
            Socket client = new Socket("localhost",5000);
            System.out.println("Client is connected");

            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter output = new PrintWriter(client.getOutputStream(),true);

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String message;
            System.out.println("Enter data:");

            while ((message = consoleInput.readLine()) != null) {
                output.println(message);
                String response = input.readLine();
                System.out.println("Server response: " + response);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
