package Test;

public class WizardTest {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        wizard.Number ="202106250003";
        wizard.PhoneNumber = "01023450001";
        wizard.HomeAdrres = "부산시 해운대구 우동 111-333";
        wizard.Date = "20210625";
        wizard.Time = "130258";
        wizard.Money = "35000";
        wizard.MNumber = "0003";

        System.out.println(wizard.toString());
        System.out.println(wizard.ShowInfo());

    }
}
