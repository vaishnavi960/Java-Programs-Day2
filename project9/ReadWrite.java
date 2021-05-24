package project9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {

    public static void main(String[] args) {
        System.out.println("Order details are:");
  
        Order o1 = new Order("book", 1, "abhay");
        Order o2 = new Order("paper", 2, "anju");
        Order o3 = new Order("cards", 3, "akshatha");
        Order o4 = new Order("bag", 4, "arjun");
        

        try {
            FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(o1);
            o.writeObject(o2);
            o.writeObject(o3);
            o.writeObject(o4);
            

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Order ord1 = (Order) oi.readObject();
            Order ord2 = (Order) oi.readObject();
            Order ord3 = (Order) oi.readObject();
            Order ord4 = (Order) oi.readObject();

            System.out.println(ord1.toString());
            System.out.println(ord2.toString());
            System.out.println(ord3.toString());
            System.out.println(ord4.toString());


            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}