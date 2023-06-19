package Services;

import Model.Table;
import Utils.CheckInput;
import Utils.Config;
import Utils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableService {
    public static List<Table> listTable;

    public static String path = "C:\\codegym\\Module2\\CaseStudy\\src\\main\\java\\data\\BidaManager.txt";
    public static Scanner sc = new Scanner(System.in);
    public TableService(){
        listTable = ReadWriteFile.readFile(path, Config.TYPE_BIDA);
    }

    public List<Table> findAll(){
        return listTable;
    }

    public void addTable(){
        Table banBiDa = new Table();

        System.out.println("Vui lòng nhâp tên bàn Bida(vd:Bàn 01)");
        String tenBan = CheckInput.checkText();
        System.out.println("Vui lòng nhập vị trí bàn Bida(vd:Khu Vip02)");
        String viTriBan = CheckInput.checkNumberAndText();
        System.out.println("Vui lòng nhập giá bàn Bida");
        Float giaBan = CheckInput.checkFloat();


        banBiDa.setTenBan(tenBan);
        banBiDa.setViTri(viTriBan);
        banBiDa.setGiaBan(giaBan);
        banBiDa.setIdBan(System.currentTimeMillis() % 1000);
        banBiDa.setTrangThaiChoi("Trống");
        banBiDa.setTrangThaiXoa("Chưa xóa");

        listTable.add(banBiDa);
        ReadWriteFile.writeFile(path,listTable);
        showTable();

        System.err.println("Thêm bàn thành công!!");

    }

    public void editTable() {


        showBansChuaXoa();
        do {
            System.out.println("Vui lòng nhâp Id bàn bạn muốn sửa");
            Long idBan = CheckInput.checkIdInput();
            Table banBiDa = getBanById(idBan,listTable);
            if (banBiDa != null){
                for (Table ban : listTable){
                    if (ban.getIdBan() == idBan){
                        System.out.println("Vui lòng nhâp tên bàn Bida muốn sửa");
                        String tenBan = CheckInput.checkText();
                        System.out.println("Vui lòng nhập vị trí bàn Bida muốn sửa");
                        String viTriBan = CheckInput.checkNumberAndText();
                        System.out.println("Vui lòng nhập giá bàn Bida muốn sửa");
                        Float giaBan = CheckInput.checkFloat();

                        ban.setTenBan(tenBan);
                        ban.setViTri(viTriBan);
                        ban.setGiaBan(giaBan);

                        break;

                    }
                }
                ReadWriteFile.writeFile(path,listTable);
                showBansChuaXoa();
                System.err.println("Sửa bàn Bida thành công");
                break;

            }else {
                System.err.println("Id bàn Bida không tồn tại trong hệ thống!!");
                System.err.println("Vui lòng nhập lại:");

            }
        }while (true);

    }


    public void showBansChuaXoa(){
        if (listTable != null && listTable.size() > 0){
            System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                    "ID", "Ten Ban", "Trạng Thái Chơi", "Vị Trí", "Giá Bàn", "Trang Thái Xóa");
            for (Table ban : listTable){
                if (!ban.getTrangThaiXoa().equals("Đã xóa")){
                    System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                            ban.getIdBan(),ban.getTenBan(),ban.getTrangThaiChoi(),ban.getViTri(),ban.getGiaBan(),ban.getTrangThaiXoa());
                }

            }
        }else {
            System.out.println("Danh sách bàn chưa xóa trống");
        }

    }

    public void updateTrangThaiChoiCuaBan(long idBan){
        for (Table ban : listTable){
            if (ban.getIdBan() == idBan){
                ban.setTrangThaiChoi("Đang chơi");
                break;
            }
        }
        ReadWriteFile.writeFile(path,listTable);
    }
    public void updateTableAfterOrder(long idBan){
        for (Table ban : listTable){
            if (ban.getIdBan() == idBan){
                ban.setTrangThaiChoi("Trống");
                break;
            }
        }
        ReadWriteFile.writeFile(path,listTable);
    }
    public List<Table> getListBanTrong(){
        List<Table> banTrongs = new ArrayList<>();
        for (Table ban : listTable){
            if (ban.getTrangThaiChoi().equals("Trống")){
                banTrongs.add(ban);
            }
        }
        return banTrongs;
    }
    public void showBanTrangThaiTrong(List<Table> banTrongs){

        if (banTrongs != null && banTrongs.size() > 0){
            System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                    "ID", "Ten Ban", "Trạng Thái Chơi", "Vị Trí", "Giá Bàn", "Trang Thái Xóa");
            for (Table ban : banTrongs){
                if (!ban.getTrangThaiXoa().equals("Đã xóa") && ban.getTrangThaiChoi().equals("Trống")){
                    System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                            ban.getIdBan(),ban.getTenBan(),ban.getTrangThaiChoi(),ban.getViTri(),ban.getGiaBan(),ban.getTrangThaiXoa());
                }

            }
        }else {
            System.out.println("Danh sách bàn trống đã hết!");
        }



    }
    public void showBansDaXoa(){
        if (listTable != null && listTable.size() > 0){
            System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                    "ID", "Ten Ban", "Trạng Thái Chơi", "Vị Trí", "Giá Bàn", "Trang Thái Xóa");
            for (Table ban : listTable){
                if (ban.getTrangThaiXoa().equals("Đã xóa"))
                    System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                            ban.getIdBan(),ban.getTenBan(),ban.getTrangThaiChoi(),ban.getViTri(),ban.getGiaBan(),ban.getTrangThaiXoa());

            }
        }else {
            System.out.println("Danh sách bàn đã xóa trống");
        }

    }

    public void showTable(){
        if (listTable != null && listTable.size() > 0){

            System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                    "ID", "Ten Ban", "Trạng Thái Chơi", "Vị Trí", "Giá Bàn", "Trang Thái Xóa");
            for (Table ban : listTable){

                System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                        ban.getIdBan(),ban.getTenBan(),ban.getTrangThaiChoi(),ban.getViTri(),ban.getGiaBan(),ban.getTrangThaiXoa());

            }
        }else {
            System.out.println("Danh sách bàn trống");
        }

    }


    public void deleteTable() {


        showBansChuaXoa();
        do {
            System.out.println("Vui lòng nhâp Id bàn bạn muốn xóa");
            Long idBan = CheckInput.checkIdInput();
            System.out.println("Bạn có chắc chắn muốn xóa không? (Y/N)");
            String confirm = CheckInput.checkConfirm();
            if (confirm.equalsIgnoreCase("Y")){
                Table banMuonXoa = getBanById(idBan,listTable);
                if (banMuonXoa != null){
                    for (Table banXoa : listTable){
                        if (banXoa.getIdBan() == idBan){
                            banXoa.setTrangThaiXoa("Đã xóa");
                            break;
                        }
                    }
                    ReadWriteFile.writeFile(path,listTable);
                    showTable();
                    System.err.println("Xóa bàn Bida thành công");
                    break;
                }else {
                    System.err.println("Id bàn Bida không tồn tại trong hệ thống!!");
                    System.out.println("Vui lòng nhập lại: ");
                }
            }else {
                System.out.println("Không xóa bàn !!");
                break;
            }

        }while (true);


    }


    public Table getBanById(Long id, List<Table> listTable){
        for (Table ban : listTable){
            if (ban.getIdBan() == id){
                return ban;
            }
        }
        return null;
    }

    public void restoreTable() {


        showBansDaXoa();
        do {
            System.out.println("Vui lòng nhâp Id bàn bạn muôn khôi phục");
            Long idBan = CheckInput.checkIdInput();

            Table banMuonXoa = getBanById(idBan,listTable);
            if (banMuonXoa != null){
                for (Table banXoa : listTable){
                    if (banXoa.getIdBan() == idBan){
                        banXoa.setTrangThaiXoa("Chưa xóa");
                        break;
                    }
                }
                ReadWriteFile.writeFile(path,listTable);
                showTable();
                System.err.println("Khôi phục bàn Bida thành công");

                break;
            }else {
                System.err.println("Id bàn Bida không tồn tại trong hệ thống!!");
                System.out.println("Vui lòng nhập lại: ");
            }
        }while (true);
    }

    public Float getTablePriceById(long id){
        for (Table table : listTable){
            if (table.getIdBan() == id){
                return table.getGiaBan();
            }
        }
        return null;
    }
}
