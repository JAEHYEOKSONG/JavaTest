package BusTest;

public class Student {
    String name;
    int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -=1000;
    }
    public void takeSubway(Subway subway){
        subway.take(15000);
        this.money -=15000;
    }

    public void showInfo(){
        System.out.println(name + "님의 남은돈 " + money);
    }
}
