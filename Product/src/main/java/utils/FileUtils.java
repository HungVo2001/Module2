package utils;

import config.Config;
import model.ECategory;
import model.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static <T> List<T> readFile(String path, String type) {
        List<T> datas = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                //5284,Iphone X,Dep lam,23000.0,Mon Jun 05 16:55:35 ICT 2023
                String [] items = line.split(",");
                switch (type) {
                    case Config.TYPE_PRODUCT:
                        parserTypeProduct(items, datas);
                        break;

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return datas;
    }

    private static <T> void parserTypeProduct(String[] items, List<T> datas) {

        long idProduct = Long.parseLong(items[0]);
        String nameProduct = items[1];
        String descriptionProduct = items[2];
        float priceProduct = Float.parseFloat(items[3]);

        Instant d = null;
        if (!items[4].equals("null")){
            d = DateUtils.parseStrInstant((items[4]));
        }
        LocalDate d2 = null;
        if (!items[5].equals("null")) {
            d2 = DateUtils.parseStrLocalDate(items[5]);
        }

        ECategory eCategory = ECategory.valueOf(items[4]);



        Product p = new Product(idProduct, nameProduct, descriptionProduct, priceProduct, d, d2, eCategory);
        datas.add((T) p);
    }


    public static <T> void writeFile(String path, List<T> datas) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (T p : datas) {
                bufferedWriter.write(p.toString());
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
