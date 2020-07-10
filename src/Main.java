import until.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

   /* public static void main(String[] args) throws SQLException {
        final String URL="jdbc:mariadb://localhost:3308/mysqldb";
        String USER="root";
        String PASSWORD="mariadb";
        Connection connection =null;
        Statement statement=null;
        ResultSet resultSet=null;
        List<Student> student = new ArrayList<Student>();
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
             statement=connection.createStatement();
            resultSet=statement.executeQuery("select e1.EMPNO,e1.ENAME,e1.SAL,e2.EMPNO,e2.ENAME,LOC from emp e1 left join dept d on e1.DEPTNO = d.DEPTNO left join emp e2 on e1.MGR=e2.EMPNO where LOC='chicago'; ");
            while (resultSet.next()){
               // System.out.printf("e1.EMPNO=%d ,   e1.ENAME=%s,    e1.SAL=%d,   e2.EMPNO=%d,   2.ENAME=%s,   LOC=%s,\n",resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4),resultSet.getString(5),resultSet.getString(6));
                student.add(new Student(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(5)));
            }
            for (int i=0;i<student.size();i++){
            System.out.println(student.get(i)+"111111111111111111");}
        }catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            if (connection==null){
                connection.close();
            }
            if (statement==null){
                statement.close();
            }
            if (resultSet==null){
                resultSet.close();
            }
        }

    }--*/
}
