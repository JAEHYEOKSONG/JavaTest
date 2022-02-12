package Database.Dao;

import Database.DB.DBConnectionMgr;
import Database.Dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    private DBConnectionMgr pool; //디비 접속 풀

    public UserDao(DBConnectionMgr pool){ //의존성 주입
        this.pool = pool;
    }

    public User selectByUsername(String username){
        User user  = null;
        String sql = null;

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = pool.getConnection();
            sql = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pool.freeConnection(con, pstmt, rs);
        }

        return user;
    }
}
