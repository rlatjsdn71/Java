import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        System.out.print("정수를 입력하세요 :");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2 == 0) System.out.println("짝수입니다.");
        else System.out.println("홀수입니다.");
        System.out.print("프로그램이 종료되었습니다.");
    }
}
