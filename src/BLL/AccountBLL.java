package BLL;
import DAL.AccountDAL;
import java.sql.SQLException;
public class AccountBLL {
    AccountDAL accountDAL;
    public void AccountBll(String UserName,String Password) throws SQLException, ClassNotFoundException{
        accountDAL.Login(UserName, Password);
    }
}
