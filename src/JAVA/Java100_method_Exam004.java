package JAVA;

public class Java100_method_Exam004 {
    public static String captalMethod(String str1,String str2){
        //문자열 변수 선언
        String result1 = str1.toUpperCase();//대문자로 바꾸는 함수
        String result2 = str2.toLowerCase();
        return result1 + "\t" + result2;
    }

    public static void main(String[] args) {
        String rst;

        rst = captalMethod("welcome","WELCOME");

        System.out.println("입력한 소문자와 대문자는 " + rst);
    }
}
