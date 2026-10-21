import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int type, duration, total = 0;

        do{
            System.out.print("Vehicle type: 1=Car, 2=Motorcycle, 0=Exit");
            type = sc.nextInt();
                
                if (type == 1 || type == 2) {
                    System.out.println("Input parking duration: ");
                    duration = sc.nextInt();
                
                    if (type == 1) {
                    total += duration * 3000;
                    } else{
                    total += duration * 2000;
                    } else if (type != 0) {
                    System.out.println("invalid vehicle type:");
                }
            } while (type != 0); 
            System.out.println(total);
        }
    }
}