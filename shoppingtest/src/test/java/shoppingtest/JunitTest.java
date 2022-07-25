package shoppingtest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JunitTest {

  private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
  private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
  private static final String USER = "system";
  private static final String PWD = "0344";

  @Test
  public void testConn() throws Exception {
    Class.forName(DRIVER);
    try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
      System.out.println(conn);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
