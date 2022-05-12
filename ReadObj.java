import java.io.*;

public class ReadObj {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("grape.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
