package service;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import entity.AllProductPrice;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductDAO productDAO=new ProductDAOImpl();

    @Override
    public List<AllProductPrice> findByAll() throws SQLException {
        return  productDAO.findByAll();
    }

    @Override
    public List<AllProductPrice> findByProduct(int sku) throws SQLException {
        return productDAO.findByProduct(sku);
    }

    @Override
    public List<AllProductPrice> findByProductIp(int proId) throws SQLException {
        return productDAO.findByProductIp(proId);
    }

    @Override
    public List<AllProductPrice> findByOffer() throws SQLException {
        return productDAO.findByOffer();
    }

    @Override
    public void deleteByProduct(int proId) throws SQLException {
        productDAO.deleteByProduct(proId);
    }

    @Override
    public void deleteByOfferPrice(int proId) throws SQLException {
       productDAO.deleteByOfferPrice(proId);
    }

    @Override
    public void updateByProduct(int proId) throws SQLException {
        productDAO.updateByProduct(proId);
    }

    @Override
    public void updateByOfferPrice(int proId) throws SQLException {
        productDAO.updateByOfferPrice(proId);
    }

    @Override
    public void insertByProduct() throws SQLException {
        productDAO.insertByProduct();
    }

    @Override
    public void insertByOdderPrice() throws SQLException {
        productDAO.insertByOdderPrice();
    }
}
