
public interface SQLConstants {
String LOGIN_SQL = "select userid,password from user_mst where userid=? and password=?";
String REGISTER_SQL = "insert into user_mst (userid , password) values (?,?)";
}
