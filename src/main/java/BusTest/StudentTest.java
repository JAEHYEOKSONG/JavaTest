package BusTest;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동",10000);
        Bus bus200 = new Bus(200);
        Subway subway = new Subway(1);

        student1.takeBus(bus200);
        student1.showInfo();
        System.out.println("------------");
        bus200.showInfo();
        System.out.println("------------");
        //학교를 마치고 지하철을 탑니다.
        student1.takeBus(bus200);
        student1.showInfo();
    }
}
