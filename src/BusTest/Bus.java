package BusTest;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int nusNumber){
        this.busNumber = busNumber;
    }

    public void take(int pay){
        this.money +=pay;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println(busNumber + "번 버스의 승객은");
        System.out.println(passengerCount + "명 이고");
        System.out.println("수업은"+ money + "입니다.");
    }
}
