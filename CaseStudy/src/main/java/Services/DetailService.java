package Services;

import Model.Detail;
import Utils.CheckInput;
import Utils.Config;
import Utils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetailService {

    public TableService tableService = new TableService();
    public static DichVu orderItemService = new DichVu();
    public static OrderTableService orderTableService = new OrderTableService();

    public  List<Detail> listDetail;
    public static final String pathChiTietDichVu = "C:\\codegym\\Module2\\CaseStudy\\src\\main\\java\\data\\ChiTietDichVu.txt";

    public static Scanner sc = new Scanner(System.in);

    public DetailService(){
        listDetail = ReadWriteFile.readFile(pathChiTietDichVu, Config.TYPE_CHITIETDICHVU);
    }
    public void addFood(){
//        quanLyBan.showBanTrangThaiTrong();
        orderItemService.showDichVuChuaXoa();
        System.out.println("Nhập số lượng");
        long soLuong = CheckInput.checkIdInput();
        Detail chiTietDichVu = new Detail();
        chiTietDichVu.setSoLuong(soLuong);
        listDetail.add(chiTietDichVu);
        showDetailService();

    }
    public Detail getDetailById(long id, List<Detail> listQLChiTiet){
        for (Detail chiTiet : listQLChiTiet){
            if (chiTiet.getIdThueBan() == id){
                return chiTiet;
            }
        }
        return null;
    }
    public void showDetailService(){
        if (listDetail != null && listDetail.size() > 0){
            System.out.printf("%-10s | %-20s | %-25s\n",
                    "ID Thuê", "ID Món", "Số Lượng");
            for (Detail chiTietDichVu : listDetail){
                System.out.printf("%-10s | %-20s | %-25s\n",
                        chiTietDichVu.getIdThueBan(), chiTietDichVu.getIdMon(), chiTietDichVu.getSoLuong());
            }
        }
    }
    public void addListDetail(List<Detail> listDetail, long idThue, long idMon, long soLuong){
        boolean isExist = false;
        for (Detail mon : listDetail){
            if (mon.getIdMon() == idMon){
                mon.setSoLuong(mon.getSoLuong() + soLuong);
                isExist = true;
                break;
            }
        }

        if (!isExist){
            Detail detail = new Detail();
            detail.setIdThueBan(idThue);
            detail.setIdMon(idMon);
            detail.setSoLuong(soLuong);
            detail.setGiaTien(orderItemService.getServicePriceById(idMon));
            listDetail.add(detail);
        }

    }
    public List<Detail> getListDichVuById(long id){
       List<Detail> listChiTietDichVuById = new ArrayList<>();
        for (Detail dichVu : listDetail){
            if (dichVu.getIdThueBan() == id){
                listChiTietDichVuById.add(dichVu);
            }
        }
        return listChiTietDichVuById;
    }
}
