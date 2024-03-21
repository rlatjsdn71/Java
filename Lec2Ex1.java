import java.util.Scanner;

public class Lec2Ex1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수1을 입력하세요 :");
        int num1 = scan.nextInt();
        System.out.print("정수2을 입력하세요 :");
        int num2 = scan.nextInt();
        if(num1==num2) {
            System.out.println("같은 수 입니다.");
            return;
        }
        System.out.print("더 큰 수는 ");
        if(num1>num2) System.out.println(num1+" 입니다.");
        else System.out.println(num2+" 입니다.");
    }
}
