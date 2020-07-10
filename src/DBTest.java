import until.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBTest {
    private   final String STATICURL="jdbc:mariadb://localhost:3308/mysqldb?user=root&password=mariadb";
    private   final String DBURL="jdbc:mariadb://localhost:3308/";
    private   final String URL="jdbc:mariadb://localhost:3308/test";
    private   final String DB="test";
    private   final String USER="root";
    private   final String PASSWORD="mariadb";


   /* void   preparedstatement(int sal) throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        List<Student> students = new ArrayList();
        students.add(new Student(3,"王二","计算机"));
        students.add(new Student(4,"王三","计算机"));
        students.add(new Student(5,"王四","计算机"));
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
        /*  final  String SQL="insert  into test.student values (?,?,?)";
            PreparedStatement pstmt;
            //int count =
            for (int i=0;i<students.size();i++){
                pstmt=connection.prepareStatement(SQL);
                pstmt.setInt(1,students.get(i).getStuNp());
                pstmt.setString(2,students.get(i).getStu_name());
                pstmt.setString(3,students.get(i).getMajor());
                pstmt.executeUpdate();
      }*/
       /* final  String SQL1="select empno, ename, sal from mysqldb.emp where sal > ?";
         PreparedStatement pstmt= connection.prepareStatement(SQL1);
         pstmt.setInt(1,sal);
         ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("empno")+rs.getString("ename")+rs.getInt("sal"));		}

        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }

        }

    }*/

}
