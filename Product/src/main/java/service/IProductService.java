package service;

import model.Product;

import java.util.List;

public interface IProductService {
     List<Product> getAllProducts();
     Product findProductById(long idProductEdit);
     void updateProductById(long idProduct, Product product);
     void deleteProductById(long idProduct);

     void addProduct(Product product);

     void sortProductsByName();

    List<Product> searchProductByName(String keyName);
    List<Product> searchProductByYear(int year);
}
