package dao;

import entity.AllProductPrice;
import until.DBUtil;
import entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDAOImpl implements ProductDAO {
    private   final String URL="jdbc:mariadb://localhost:3308/mysqldb";
    private   final String USER="root";
    private   final String PASSWORD="mariadb";
    public List<AllProductPrice> findByProduct(int sku) throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        List<AllProductPrice> allProductPrices=new ArrayList<>();
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            final  String SQL1="select product.pro_id,product.sku,product.title,offer_price.effetive_start_date,offer_price.effetive_end_date,offer_price.ofp_id,offer_price.price,offer_price.type_cd from mysqldb.product left join  mysqldb.offer_price on product.pro_id = offer_price.pro_id where sku=?";
            PreparedStatement pstmt= connection.prepareStatement(SQL1);
            pstmt.setInt(1,sku);
            resultSet= pstmt.executeQuery();
            while (resultSet.next()){
                allProductPrices.add(new AllProductPrice(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getDate(4),resultSet.getDate(5),resultSet.getInt(6),resultSet.getDouble(7),resultSet.getString(8)));
            }
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
        return allProductPrices;
    }//按ID查找
    public List<AllProductPrice> findByProductIp(int proId) throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        List<AllProductPrice> allProductPrices=new ArrayList<>();
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            final  String SQL1="select product.pro_id,product.sku,product.title,offer_price.effetive_start_date,offer_price.effetive_end_date,offer_price.ofp_id,offer_price.price,offer_price.type_cd from mysqldb.product left join  mysqldb.offer_price on product.pro_id = offer_price.pro_id where product.pro_id=?";
            PreparedStatement pstmt= connection.prepareStatement(SQL1);
            pstmt.setInt(1,proId);
            resultSet= pstmt.executeQuery();
            while (resultSet.next()){
                allProductPrices.add(new AllProductPrice(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getDate(4),resultSet.getDate(5),resultSet.getInt(6),resultSet.getDouble(7),resultSet.getString(8)));
            }
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
        return allProductPrices;
    }//按ID查找
    public List<AllProductPrice> findByAll() throws SQLException {
        Connection connection =null;
        Statement statement=null;
        ResultSet resultSet=null;
        List<AllProductPrice> allProductPrices=new ArrayList<>();
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            final  String SQL1="select offer_price.ofp_id,product.sku,product.title,offer_price.effetive_start_date,offer_price.effetive_end_date,product.pro_id,offer_price.price,offer_price.type_cd from mysqldb.product left join  mysqldb.offer_price on product.pro_id = offer_price.pro_id;";
            PreparedStatement pstmt= connection.prepareStatement(SQL1);
            resultSet= pstmt.executeQuery();
            while (resultSet.next()){
                  allProductPrices.add(new AllProductPrice(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getDate(4),resultSet.getDate(5),resultSet.getInt(6),resultSet.getDouble(7),resultSet.getString(8)));
            }
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
        return allProductPrices;
    }//查找全部
    public List<AllProductPrice> findByOffer() throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        List<AllProductPrice> allProductPrices=new ArrayList<>();
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            final  String SQL1="select product.pro_id,product.sku,product.title,offer_price.effetive_start_date,offer_price.effetive_end_date,offer_price.pro_id,offer_price.price,offer_price.type_cd from mysqldb.product left join  mysqldb.offer_price on product.pro_id = offer_price.pro_id where type_cd='促销';";
            PreparedStatement pstmt= connection.prepareStatement(SQL1);
            resultSet= pstmt.executeQuery();
            while (resultSet.next()){
                allProductPrices.add(new AllProductPrice(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getDate(4),resultSet.getDate(5),resultSet.getInt(6),resultSet.getDouble(7),resultSet.getString(8)));

            }
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
        return allProductPrices;
    }//查找促销商品
    public void deleteByProduct(int proId ) throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            final  String SQL1="delete from mysqldb.product where pro_id=?;";
            PreparedStatement pstmt= connection.prepareStatement(SQL1);
            pstmt.setInt(1,proId);
            resultSet= pstmt.executeQuery();
            System.out.println(resultSet);
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
    }//删除
    public void deleteByOfferPrice(int proId ) throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            final  String SQL1="delete from mysqldb.offer_price where pro_id=?;";
            PreparedStatement pstmt= connection.prepareStatement(SQL1);
            pstmt.setInt(1,proId);
            resultSet= pstmt.executeQuery();
            System.out.println(resultSet);
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
    }//删除
    public void updateByProduct(int proId ) throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        Scanner scanner=new Scanner(System.in);
        int num=0;
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            if (findByProductIp(proId).size()>0){
                System.out.print("修改后的价格：");
                Double one =scanner.nextDouble();
            final  String SQL1="update mysqldb.offer_price SET price=? where pro_id=?";
            PreparedStatement pstmt;
            pstmt=connection.prepareStatement(SQL1);
            pstmt.setDouble(1,one);
            pstmt.setInt(2,proId);
             num= pstmt.executeUpdate();
            if (num>0){System.out.printf("修改成功！");}
            else {System.out.printf("修改失败！");}}
        else {System.out.printf("不存在该商品！");}

        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
    }//修改商品
    public void updateByOfferPrice(int proId ) throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        Scanner scanner=new Scanner(System.in);
        List<Product> products =new ArrayList<>();
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            if (findByProductIp(proId).size()>0){
                System.out.printf("修改开始日期：");
                String one =scanner.next();
                System.out.printf("修改结束日期：");
                String two =scanner.next();
            final  String SQL1="update mysqldb.offer_price SET effetive_start_date=?,effetive_end_date=? where pro_id=?";
            PreparedStatement pstmt;
            pstmt=connection.prepareStatement(SQL1);
           pstmt.setDate(1, Date.valueOf(one));
           pstmt.setDate(2, Date.valueOf(two));
           pstmt.setInt(3,proId);
            int num= pstmt.executeUpdate();
            if (num>0){System.out.printf("修改成功！");}}else {
                System.out.printf("不存在该商品！");
            }
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
    }//修改促销
    public void insertByProduct() throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int all=0;
        int i=0;
        List<Product> products =new ArrayList<>();
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            final  String SQL="insert  into product values (?,?,?)";
            PreparedStatement pstmt;
            //int count =

          while (i==0) {
              System.out.printf("插入商品  id  sku  title");
              int one =scanner.nextInt();
              int two=scanner.nextInt();
              String three=scanner.next();
                pstmt=connection.prepareStatement(SQL);
                pstmt.setInt(1,one);
                pstmt.setInt(2,two);
                pstmt.setString(3,three);
                System.out.println(one+"   "+two+"    "+three);
               int num= pstmt.executeUpdate();
               all++;
               if (num>0){ sum++;}
               System.out.print("输入 0 继续插入： ");
               i=scanner.nextInt();
            }
            System.out.printf("本次一个插入:"+all+"   成功插入："+sum+"   ");
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
    }//增加商品
    public void insertByOdderPrice() throws SQLException {
        Connection connection =null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int all=0;
        int i=0;
        List<Product> products =new ArrayList<>();
        try {
            connection= DBUtil.getConnection(URL,USER,PASSWORD);
            final  String SQL="insert into mysqldb.offer_price values(?,?,?,?,?,?)";
            PreparedStatement pstmt;
            //int count =
            System.out.print("插入促销商品 ： id 促销开始时间(年 月 日) 促销结束时间（年 月 日） 商品ID 价格 是否促销（促销/非促销）\n");
            while (i==0) {
                int one =scanner.nextInt();
                String date=scanner.next();
                String date1=scanner.next();
                int two=scanner.nextInt();
                Double three =scanner.nextDouble();
                String four=scanner.next();
                pstmt=connection.prepareStatement(SQL);
                pstmt.setInt(1,one);
                pstmt.setDate(2, Date.valueOf(date));
                pstmt.setDate(3, Date.valueOf(date1));
                pstmt.setInt(4,two);
                pstmt.setDouble(5,three);
                pstmt.setString(6,four);
                int num= pstmt.executeUpdate();
                all++;
                if (num>0){ sum++;}
                System.out.print("输入 0 继续插入： ");
                i=scanner.nextInt();
            }
            System.out.printf("本次一个插入:"+all+"   成功插入："+sum);
        }catch (SQLException throwables){
            System.out.println(throwables.getMessage());
        } finally {
            if (connection!=null){
                connection.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (resultSet!=null){
                resultSet.close();
            }

        }
    }//增加促销


}
