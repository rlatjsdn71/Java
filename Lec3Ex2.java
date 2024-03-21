import java.util.Scanner;

public class Lec3Ex2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 :");
        int num = scan.nextInt();
        System.out.println(num+"의 약수는 다음과 같습니다.");
        float i;
        for(i = 1;i < Math.sqrt(num);i++){
            if(num%i == 0) {
                System.out.println(i + "\n" + num / i);
            }
        }
        if(num%i==0) System.out.println(i);
    }
}
