package JAVA;

class TestNumber {
    int num;
    TestNumber(int num) {this.num = num;}
}
public class Java100_method_MethodCall2 {

    public static void sum(TestNumber b) {//같은 주소값을 가리킴
        System.out.println(b);
        b.num += 400;
        System.out.println(b.num);
    }

    public static void main(String[] args) {
        TestNumber a = new TestNumber(100); //new가 건네준 주소값이 a에 들어감
        sum(a);
        System.out.println(a.num);
    }
}
