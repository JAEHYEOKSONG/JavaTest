package Interface;

public class UserData {
    private User[] userDataBase;

    public UserData() {
        userDataBase = new User[5];
    }

    public User[] getUserDataBase() {
        return userDataBase;
    }

    public void setUserDataBase(User[] userDataBase) {
        this.userDataBase = userDataBase;
    }

    public void insertUsers(){
        userDataBase[0] = new User("asd","asd","aaa","asd12@naver.com");
        userDataBase[1] = new User("asd","asd","aaa","asd1@naver.com");
        userDataBase[2] = new User("asd","asd","aaa","asd31@naver.com");
        userDataBase[3] = new User("asd","asd","aaa","asd11@naver.com");
        userDataBase[4] = new User("asd","asd","aaa","asd33@naver.com");

    }
}
