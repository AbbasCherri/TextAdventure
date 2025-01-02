package Input;

import java.util.Scanner;

public class InputHandler {



    public int takeInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public String takeString(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public double takeDouble(){
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

}
