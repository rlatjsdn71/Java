import java.util.Scanner;

public class Int2Hwd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scan.nextInt();
        switch(num){
            case 1:
                System.out.println("하나");
                break;
            case 2:
                System.out.println("둘");
                break;
            default: System.out.println("없음");
        }
    }
}
