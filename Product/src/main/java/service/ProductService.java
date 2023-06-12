package service;

import config.Config;
import javafx.collections.FXCollections;
import model.Product;
import utils.FileUtils;
import utils.DateUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


import java.util.List;

public class ProductService implements IProductService {
    private String fileName = "C:\\codegym\\Module2\\Product\\src\\main\\java\\data\\Product.txt";


    public List<Product> getAllProducts(){
        return FileUtils.readFile(fileName, Config.TYPE_PRODUCT);
    }


    public Product findProductById(long idProductEdit) {
        List<Product> products = FileUtils.readFile(fileName, Config.TYPE_PRODUCT);
        for (Product p : products) {
            if (p.getId() == idProductEdit) {
                return p;
            }
        }
        return null;
    }


    public void updateProductById(long idProduct, Product product) {
        List<Product> products = FileUtils.readFile(fileName, Config.TYPE_PRODUCT);
        for (Product p : products) {
            if (p.getId() == idProduct) {
                p.setName(product.getName());
                p.setDescription(product.getDescription());
                p.setPrice(product.getPrice());
                p.setCreateAt(product.getCreateAt());
                p.setDeleteAt(product.getDeleteAt());
                p.seteCategory(product.geteCategory());
            }
        }
        FileUtils.writeFile(fileName, products);
    }


    public void deleteProductById(long idProduct) {
        List<Product> products = FileUtils.readFile(fileName, Config.TYPE_PRODUCT);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == idProduct) {
                products.remove(i);
                break;
            }
        }
        FileUtils.writeFile(fileName, products);
    }


    public void addProduct(Product product) {
        List<Product> products = FileUtils.readFile(fileName, Config.TYPE_PRODUCT);
        products.add(product);
        FileUtils.writeFile(fileName, products);
    }


    public void sortProductsByName() {
        List<Product> products = FileUtils.readFile(fileName, Config.TYPE_PRODUCT);
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getName().compareTo(product2.getName());
            }
        });
    }
    public void sortProductByPrice(){
        List<Product> products = FileUtils.readFile(fileName, Config.TYPE_PRODUCT);
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return Double.compare(product1.getPrice(),product2.getPrice());
            }
        });
    }


    @Override
    public List<Product> searchProductByName(String keyName) {
        List<Product> products = getAllProducts();
        List<Product> results = new ArrayList<>();

        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyName.toLowerCase())) {
                results.add(p);
            }
        }
        return results;
    }

    @Override
    public List<Product> searchProductByYear(int year) {
        List<Product> products = getAllProducts();
        List<Product> results = new ArrayList<>();

        for (Product p : products) {
//            if (p.getCreateAt()!=null && p.getCreateAt().getYear() == year) {
//                results.add(p);
//            }
        }
        return results;
    }
}
