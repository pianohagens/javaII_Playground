package dbConnect;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import model.accessModel;
import static java.lang.Class.forName;

/**
 *
 * @author Piano Hhagens
 */

public class DBconnection {
    //JDBC URL parts
    private static final String protocol = "jdbc";
    private static final String vendorName = ":mysql:";
    private static final String url = "//wgudb.ucertify.com/WJ0000J";

    //JDBC URL
    private static final String jdbcURL = protocol + vendorName + url;

    //Driver and Connection interface reference
    private static final String MYSQLJDBCDriver = "com.mysql.cj.jdbc.Driver";
    private static Connection conn = null;

    //store credential
    private static final String username = "U0000TJ";
    private static String password = "5000000007";

    //get connection
    protected static Connection connection = null;
    protected static Statement statement = null;
    public static boolean getConnection(){
        boolean isConnected = true;
        if(connection == null || statement == null){
            isConnected = false;
        }
        try{//connect to driver manager
            forName(MYSQLJDBCDriver);
            connection = (Connection) DriverManager.getConnection(jdbcURL, username, password);
            statement = connection.createStatement();
            isConnected = true;
        }
        catch(Exception ex)
        {
            System.out.println("Connection failure!");
        }
        return isConnected;
    }

     /*1----------------------------------------------------------
     ----------------------     dbAccess   ----------------------
      -----------------------------------------------------------*/

    protected static PreparedStatement preparedStat = null;
/*    protected static List<String> columns;
    protected static String loggedUser = "loadUser";*/

    /**
     * Pre-formatted sql and string data as need
     * @param stringSQL
     * @param entryDatas
     * @return
     * @throws SQLException
     */

    public ResultSet execute(String stringSQL, HashMap<String, String> entryDatas) throws SQLException {
        accessModel userSql = new accessModel(stringSQL, entryDatas);
        ResultSet results = this.execute(userSql);
        return results;
    }

    private ResultSet execute(accessModel userSql) throws SQLException {
        ResultSet results = null;
        this.connectStatement(userSql);
        results = executeQuery();
        return results;
    }
    /**3***********************************************************/

    private static ResultSet executeQuery() throws SQLException {
        ResultSet results = null;
        if(DBconnection.getConnection()){
            results = preparedStat.executeQuery();
        }
        return results;
    }
    private void connectStatement(accessModel userSql) throws SQLException {
        if(getConnection()){
            preparedStat = connection.prepareStatement(userSql.getDataString(), Statement.RETURN_GENERATED_KEYS);
            Map<String, String> entryData = userSql.getsortedDatas();
            int dataCounter = 1;
            Iterator dataIterator = entryData.entrySet().iterator();
            while (dataIterator.hasNext()){
                Map.Entry pair = (Map.Entry)dataIterator.next();
                preparedStat.setObject(dataCounter, pair.getValue());
                dataCounter++;
            }
        }
    }

    public static void closeConnection() {

        try{//end connected
            conn.close();
            System.out.println("End Connected!");
        }
        catch(SQLException e)
        {//print connect error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
