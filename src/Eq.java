import java.io.FileInputStream;
import java.io.IOException;

public class Eq {
    public static void main(String args[]){
        int j = 0,i = 0;
        if (args.length<2){
            System.out.println("Нужно выбрать 2 файла");
        }
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            }while (i != -1 && j != -1);
            if (i != j) System.out.println("Отличаются");
            else System.out.println("Совподает");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
