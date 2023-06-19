package Services;

import Model.Service;
import Utils.CheckInput;
import Utils.Config;
import Utils.ReadWriteFile;
import Utils.StringUtil;

import java.util.List;
import java.util.Scanner;

public class DichVu {
    public static List<Service> listService;
    public static String path = "C:\\codegym\\Module2\\CaseStudy\\src\\main\\java\\data\\DichVuManager.txt";
    public static Scanner sc = new Scanner(System.in);
    public DichVu(){
        listService = ReadWriteFile.readFile(path, Config.TYPE_DICHVU);
    }

    public void showService() {
        if (listService != null && listService.size() > 0){
            System.out.printf("%-10s | %-20s | %-20s | %-20s\n",
                    "ID", "Ten Món", "Giá Dịch Vụ", "Trang Thái Xóa");
            for (Service item : listService){
                System.out.printf("%-10s | %-20s | %-20s | %-20s\n",
                        item.getIdDichVu(),item.getTenMon(),item.getGiaDichVu(),item.getTrangThaiXoa());
            }
        }else {
            System.out.println("Danh sách dịch vụ trống!!");
        }
    }
    public Service getServiceById(Long id, List<Service> listService){
        for (Service item : listService){
            if (item.getIdDichVu() == id){
                return item;
            }
        }
        return null;
    }
    public void addService(){
        Service service = new Service();
        System.out.println("Vui lòng nhập tên món(vd: Mì tôm)");
        String tenMon = CheckInput.checkText();
        System.out.println("Vui lòng nhập giá món");
        float giaDichVu = CheckInput.checkFloat();

        service.setIdDichVu(System.currentTimeMillis() % 1000);
        service.setTenMon(tenMon);
        service.setGiaDichVu(giaDichVu);
        service.setTrangThaiXoa("Còn");

        listService.add(service);
        ReadWriteFile.writeFile(path,listService);
        showService();
        System.out.println("Thêm món dịch vụ thành cong!!");
    }
    public void editService(){
        showDichVuChuaXoa();
        do {
            System.out.println("Vui lòng nhập id món muốn sua !!");
            Long idDichVu = CheckInput.checkIdInput();
            Service dichVu = getServiceById(idDichVu,listService);
            if (dichVu != null){
                for (Service dich : listService){
                    if (dich.getIdDichVu() == idDichVu){
                        System.out.println("Vui lòng nhập tên món muốn sửa");
                        String tenMon = CheckInput.checkText();
                        System.out.println("Vui long nhập giá muốn sua");
                        Float giaDichVu = CheckInput.checkFloat();

                        dich.setTenMon(tenMon);
                        dich.setGiaDichVu(giaDichVu);
                        System.out.println("Sửa dịch vụ món thành công !!");
                        break;
                    }
                }
                ReadWriteFile.writeFile(path,listService);
                showDichVuChuaXoa();
                break;
            }else {
                System.err.println("Id dịch vụ không tồn tại trong hệ thống!!");
                System.err.println("Vui lòng nhập lại:");
            }

        }while (true);
    }

    public void showDichVuChuaXoa(){
        if (listService != null && listService.size() > 0){
            System.out.println(StringUtil.repeat("-", 75));
            System.out.printf("%-10s | %-20s | %-20s | %-20s\n",
                    "ID", "Ten Món", "Giá Dịch Vụ", "Trang Thái Xóa");
            System.out.println(StringUtil.repeat("-", 75));
            for (Service dich : listService){
                if (!dich.getTrangThaiXoa().equals("Hết")){
                    System.out.printf("%-10s | %-20s | %-20s | %-20s\n",
                            dich.getIdDichVu(),dich.getTenMon(),dich.getGiaDichVu(),dich.getTrangThaiXoa());
                }
            }
            System.out.println(StringUtil.repeat("-", 75));
        }else {
            System.out.println("Danh sách dịch vụ chưa xóa");
        }
        //System.out.println("Danh sách các bàn đã có món:");
        //        System.out.println(StringUtil.repeat("-", 40));
        //        System.out.printf("%-10s | %-10s%n", "ID Thuê", "ID Bàn");
        //        System.out.println(StringUtil.repeat("-", 40));
        //        for (OrderTable order : orderTablesWithItems) {
        //            System.out.printf("%-10s | %-10s%n", order.getIdThueBan(), order.getIdBan());
        //        }
        //        System.out.println(StringUtil.repeat("-", 40));
    }

    public void showDichVuDaXoa(){
        if (listService != null && listService.size() > 0){
            System.out.printf("%-10s | %-20s | %-20s | %-20s\n",
                    "ID", "Ten Món", "Giá Dịch Vụ", "Trang Thái Xóa");
            for (Service dich : listService){
                if (dich.getTrangThaiXoa().equals("Hết")){
                    System.out.printf("%-10s | %-20s | %-20s | %-20s\n",
                            dich.getIdDichVu(),dich.getTenMon(),dich.getGiaDichVu(),dich.getTrangThaiXoa());
                }
            }
        }else {
            System.out.println("Danh sách dịch vụ đã xóa");
        }
    }

    public void deleteService(){
        showDichVuChuaXoa();
        do {
            System.out.println("Vui lòng nhập id dịch vụ bạn muốn xóa");
            Long idDichVu = CheckInput.checkIdInput();
            System.out.println("Bạn có chắn chắn muốn xóa không ?? (Y/N)");
            String confirm = CheckInput.checkConfirm();
            if (confirm.equalsIgnoreCase("Y")){
                Service dichVuMuonXoa = getServiceById(idDichVu,listService);
                if (dichVuMuonXoa != null){
                    for (Service dichVuXoa : listService){
                        if (dichVuXoa.getIdDichVu() == idDichVu){
                            dichVuXoa.setTrangThaiXoa("Hết");
                            break;
                        }
                    }
                    ReadWriteFile.writeFile(path,listService);
                    showService();
                    System.err.println("Xóa dịch vụ thành công!!");
                    break;
                }else {
                    System.err.println("Id dịch vụ không tồn tại trong hệ thống!!");
                    System.out.println("Vui lòng nhập lại: ");
                }
            }else {
                System.out.println("Không xóa dịch vụ !!");
                break;
            }
        }while (true);
    }

    public void restoreService(){
        showDichVuDaXoa();
        do {
            System.out.println("Vui lòng nhập id dịch vụ muốn khôi phục!!");
            Long idDichVu = CheckInput.checkIdInput();
            Service dichVuMuonKhoiPhuc = getServiceById(idDichVu,listService);
            if (dichVuMuonKhoiPhuc != null){
                for (Service dichVu : listService){
                    if (dichVu.getIdDichVu() == idDichVu){
                        dichVu.setTrangThaiXoa("Còn");
                        break;
                    }
                }
                ReadWriteFile.writeFile(path,listService);
                showService();
                System.err.println("Khôi phục id dịch vụ thành công");
                break;
            }else {
                System.err.println("Id dịch vụ không tồn tại trong hệ thống!!");
                System.out.println("Vui lòng nhập lại: ");
            }
        }while (true);
    }

    public Float getServicePriceById(long id){
        for (Service dichVu : listService){
            if (dichVu.getIdDichVu() == id){
                return dichVu.getGiaDichVu();
            }
        }
        return null;
    }

}
