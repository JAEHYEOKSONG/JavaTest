package Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = null;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("[서비스선택]");
            System.out.println("1. naver");
            System.out.println("2. kakao");
            int select = sc.nextInt();

            if(select == 1) {
                userService = new NaverUserServiceImpl();
                break;
            }else if(select == 2) {
                userService = new KakaoUserServiceImpl();
                break;
            }else {
                System.out.println("지원하지 않는 서비스입니다.");
            }
            System.out.println();
        }
        User user = userService.getUser(); //업캐스팅

        if(user == null) {
            System.out.println("입력하신 계정의 사용자를 찾을수 없습니다.");
        }else {
            System.out.println(user.toString());
        }
    }
}
