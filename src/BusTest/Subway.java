package BusTest;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    public void take(int pay) {
        this.money += pay;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(lineNumber + "번 호선의 승객은");
        System.out.println(passengerCount + "명 이고");
        System.out.println("수업은" + money +"입니다.");
    }
}
