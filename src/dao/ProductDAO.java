package dao;

import entity.AllProductPrice;
import entity.Product;
import until.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ProductDAO {
    List<AllProductPrice> findByAll() throws SQLException;
    List<AllProductPrice> findByProduct(int sku ) throws SQLException;
    List<AllProductPrice> findByProductIp(int proId) throws SQLException;
    List<AllProductPrice> findByOffer() throws SQLException;
    void deleteByProduct(int proId ) throws SQLException;
    void deleteByOfferPrice(int proId ) throws SQLException;
    void updateByProduct(int proId ) throws SQLException;
    void updateByOfferPrice(int proId ) throws SQLException;
    void insertByProduct() throws SQLException;
    void insertByOdderPrice() throws SQLException;
}
