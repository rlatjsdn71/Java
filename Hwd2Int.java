import java.util.Scanner;

public class Hwd2Int {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("한글 입력 :");
        String str = scan.next();
        switch(str){
            case "하나":
            case "일":
            case "첫째":
                System.out.println(1);
                break;
            case "둘":
            case "이":
            case "둘째":
                System.out.println(2);
                break;
            default:
                System.out.println("없음");
        }
    }
}
