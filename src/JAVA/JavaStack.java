package JAVA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class JavaStack {
    private static void result( String[] people ) {
        int count = 0;
        for( int firstIndex = 0; firstIndex < people.length; firstIndex++ ) {
            for( int secondIndex = 0; secondIndex < people.length; secondIndex++ ) {

                if( firstIndex == secondIndex ) continue;

                for( int thirdIndex = 0; thirdIndex < people.length; thirdIndex++ ) {
                    if( thirdIndex == secondIndex || thirdIndex == firstIndex ) continue;

                    String first = people[firstIndex];
                    String second= people[secondIndex];
                    String third = people[thirdIndex];
                    count++;
                    System.out.println("( "+first +" " + second + " " + third +" )");
                }
            }
        }
        System.out.println("총 경우의 수 : " + count);
    }
    public static void main(String[] args) {
          String[] people = {"1","2","3","4","5","6"};
          JavaStack javaStack = new JavaStack();
          javaStack.result(people);
//        Stack<String> s = new Stack<String>();
//        s.push("A");
//        s.push("B");
//        s.push("C");
//        s.push("D");
//
//        System.out.println(s.peek());
//
//        while (!s.empty()) {
//            System.out.println(s.pop());
//        }
//
    }
}
