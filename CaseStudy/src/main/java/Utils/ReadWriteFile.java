package Utils;

import Model.Table;
import Model.Detail;
import Model.Service;
import Model.OrderTable;
import Services.DetailService;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWriteFile {

    public static Scanner sc = new Scanner(System.in);


    public static <T> void writeFile(String path,List<T> listT) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (T t : listT){
                //long idBan, String tenBan, String trangThaiChoi, String trangThaiXoa, String viTri, float giaBan
                String line = t.toString();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static <T> List<T> readFile(String path, String type){
        List<T> datas = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] items = line.split(",");
                if(items != null && items.length > 1){
                    long idBan;
                    long idThueBan;
                    switch (type){
                        case Config.TYPE_BIDA:
                            idBan = Long.parseLong(items[0]);
                            float giaBan = Float.parseFloat(items[5]);
                            Table banBiDa = new Table(idBan,items[1],items[2],items[3],items[4],giaBan);
                            datas.add((T) banBiDa);
                            break;
                        case Config.TYPE_DICHVU:
                            long idDichVu = Long.parseLong(items[0]);
                            float giaDichVu = Float.parseFloat(items[2]);
                            Service dichVu = new Service(idDichVu, items[1], giaDichVu, items[3]);
                            datas.add((T) dichVu);
                            break;
                        case Config.TYPE_THUEBAN:
                            idThueBan = Long.parseLong(items[0]);
                             idBan = Long.parseLong(items[1]);
//                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(System.c)
                            LocalDateTime gioVao = LocalDateTime.parse(items[2]);
                            LocalDateTime gioRa = items[3].equals("null") ? null: LocalDateTime.parse(items[3]);
                            String trangThai = items[4];
//                            float tongTien = items[5] == "null"? null : Float.parseFloat(items[5]);
                            float tongTien = Float.parseFloat(items[5]);
                            OrderTable thueBan = new OrderTable(idThueBan,idBan,gioVao,gioRa,trangThai,tongTien);
                            DetailService qlChiTietDichVu = new DetailService();
                            List<Detail> listChiTietDichVu = qlChiTietDichVu.getListDichVuById(idThueBan);
                            thueBan.setListChiTietDichVu(listChiTietDichVu);
                            datas.add((T) thueBan);
                            break;
                        case Config.TYPE_CHITIETDICHVU:
                            idThueBan = Long.parseLong(items[0]);
                            long idMon = Long.parseLong(items[1]);
                            long soLuong = Long.parseLong(items[2]);
                            float giaTien = Float.parseFloat(items[3]);
                            Detail chiTietDichVu = new Detail(idThueBan,idMon,soLuong,giaTien);
                            datas.add((T) chiTietDichVu);
                            break;

                    }

                }
            }
            bufferedReader.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return datas;
    }
}
