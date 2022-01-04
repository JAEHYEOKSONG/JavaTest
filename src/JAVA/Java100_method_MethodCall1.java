package JAVA;

public class Java100_method_MethodCall1 {

    public static int sum (int a) {
        a +=400;
        System.out.println(a);
        return a + 500;
    }
    public static void sum1(Java100_method_MethodCall1 a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Java100_method_MethodCall1 test = new Java100_method_MethodCall1();
        sum1(test);
        int a = 100;
        int [] ab  = new int[5] ;
        System.out.println(test);
        sum(a);//함수 출력값
        System.out.println(sum(a)); //return 값
    }
}
