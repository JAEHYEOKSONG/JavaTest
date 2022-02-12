package Test;

public class Wizard {
    public String Number;
    public String PhoneNumber;
    public String HomeAdrres;
    public String Date;
    public String Time;
    public String Money;
    public String MNumber;
    public Wizard() {

    }

    public Wizard(String Number, String PhoneNumber, String HomeAdrres, String Date,
                  String Time, String Money, String MNumber) {
        this.Number = Number;
        this.PhoneNumber = PhoneNumber;
        this.HomeAdrres = HomeAdrres;
        this.Date = Date;
        this.Time = Time;
        this.Money = Money;
        this.MNumber = MNumber;
    }



    @Override
    public String toString() {
        return "Wizard [Number=" + Number + ", PhoneNumber=" + PhoneNumber + ", HomeAdrres=" + HomeAdrres + ", Date="
                + Date + ", Time=" + Time + ", Money=" + Money + ", MNumber=" + MNumber + "]";
    }

    public String ShowInfo() {
        return "접수번호:" + Number + "\n" + "주문 핸드폰 번호:" + PhoneNumber + "\n" +
                "주문 집 주소:" + HomeAdrres + "\n" +"주문 날짜:" + Date + "\n" + "주문 시간" +
                Time + "\n" + "주문 가격:" + Money + "\n" + "메뉴 번호:" + MNumber + "\n";
    }
}
