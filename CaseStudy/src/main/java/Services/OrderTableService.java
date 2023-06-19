package Services;

import Model.Service;
import Model.Table;
import Model.Detail;
import Model.OrderTable;
import Utils.*;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OrderTableService {
    public static TableService tableService = new TableService();
    public static DichVu orderService = new DichVu();
    public static DetailService productService = new DetailService();
    public static List<OrderTable> listOrderTable;
    public static DetailService detailService = new DetailService();
    public static List<Detail> listAllDetail;
    public static OrderTableService orderTableService = new OrderTableService();
    public static List<Service> listOrderItem;
    public static final String pathThueBan = "C:\\codegym\\Module2\\CaseStudy\\src\\main\\java\\data\\ThueBanManager.txt";
    public static final String pathChiTietDichVu = "C:\\codegym\\Module2\\CaseStudy\\src\\main\\java\\data\\ChiTietDichVu.txt";
    public static Scanner sc = new Scanner(System.in);

    public OrderTableService() {
        listOrderTable = ReadWriteFile.readFile(pathThueBan, Config.TYPE_THUEBAN);
        listAllDetail = ReadWriteFile.readFile(pathChiTietDichVu, Config.TYPE_CHITIETDICHVU);

    }

    public void showRentTable() {

        if (listOrderTable != null && listOrderTable.size() > 0) {
            for (OrderTable thue : listOrderTable) {
                System.out.printf("%-20s | %-20s | %-35s | %-35s | %-25s\n",
                        "ID Thuê: " + thue.getIdThueBan(), "ID Bàn: " + thue.getIdBan(), "Giờ Vào: " + thue.getGioVao(), "Giờ Ra: " + thue.getGioRa(),
                        "Trạng Thái: " + thue.getTrangThai());
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");

//                List<Detail> listChiTietDichVu = thue.getListChiTietDichVu();
                if (thue.getListChiTietDichVu() != null && thue.getListChiTietDichVu().size() > 0) {
                    System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
                            "", "ID Món", "Số Lượng", "Giá");
                    for (Detail dichVu : thue.getListChiTietDichVu()) {
                        System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
                                "", dichVu.getIdMon(), dichVu.getSoLuong(), dichVu.getGiaTien());
                    }
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        }
    }

//    public void showThueBanChuaThanhToan() {
//        if (listOrderTable != null && listOrderTable.size() > 0) {
//            for (OrderTable thue : listOrderTable) {
//                if (thue.getTrangThai().equals("Chưa Thanh Toán")) {
//                    System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
//                            "ID Thuê: " + thue.getIdThueBan(), "ID Bàn: " + thue.getIdBan(), "Giờ Vào: " + thue.getGioVao(),
//                            "Trạng Thái: " + thue.getTrangThai());
//                    System.out.println("--------------------------------------------------------------------------------------------------");
//
////                List<Detail> listChiTietDichVu = thue.getListChiTietDichVu();
//                    if (thue.getListChiTietDichVu() != null && thue.getListChiTietDichVu().size() > 0) {
//                        System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
//                                "", "ID Món", "Số Lượng", "Giá");
//                        for (Detail dichVu : thue.getListChiTietDichVu()) {
//                            System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
//                                    "", dichVu.getIdMon(), dichVu.getSoLuong(), dichVu.getGiaTien());
//                        }
//                        System.out.println("----------------------------------------------------------------------------------------------");
//                    }
//                }
//            }
//        }
//    }

//    public void showBanDaThanhToan() {
//        if (listOrderTable != null && listOrderTable.size() > 0) {
//            for (OrderTable thue : listOrderTable) {
//                if (thue.getTrangThai().equals("Đã thanh toán")) {
//                    System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
//                            "ID Bàn: " + thue.getIdBan(), "Giờ Vào: " + thue.getGioVao(), "Giờ Ra" + thue.getGioRa(),
//                            "Trạng Thái: " + thue.getTrangThai());
//                    System.out.println("--------------------------------------------------------------------------------------------------");
//
////                List<Detail> listChiTietDichVu = thue.getListChiTietDichVu();
//                    if (thue.getListChiTietDichVu() != null && thue.getListChiTietDichVu().size() > 0) {
//                        System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
//                                "", "ID Món", "Số Lượng", "Giá");
//                        for (Detail dichVu : thue.getListChiTietDichVu()) {
//                            System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
//                                    "", dichVu.getIdMon(), dichVu.getSoLuong(), dichVu.getGiaTien());
//                        }
//                        System.out.println("----------------------------------------------------------------------------------------------");
//                    }
//                }
//            }
//        }
//    }
    public void showOrderTableById(OrderTable orderTable) {

        System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
                "ID Thuê: " + orderTable.getIdThueBan(), "ID Bàn: " + orderTable.getIdBan(), "Giờ Vào: " + orderTable.getGioVao(),
                "Trạng Thai: " + orderTable.getTrangThai());
        System.out.println("                     --------------------------------------------------------------------------");

        if (orderTable.getListChiTietDichVu() != null && orderTable.getListChiTietDichVu().size() > 0) {

            System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
                    "", "ID món", "Số lượng", "Giá");
            for (Detail dichVu : orderTable.getListChiTietDichVu()) {
                System.out.printf("%-20s | %-20s | %-35s | %-25s\n",
                        "", dichVu.getIdMon(), dichVu.getSoLuong(), dichVu.getGiaTien());
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------");

        }
    }

    public OrderTable getThueBanById(Long id, List<OrderTable> listThueBan) {
        for (OrderTable thueBan : listThueBan) {
            if (thueBan.getIdThueBan() == id) {
                return thueBan;
            }
        }
        return null;
    }


    public void rentTable() {

        List<Table> listBanTrong = tableService.getListBanTrong();
        if (listBanTrong != null && listBanTrong.size() > 0) {
            tableService.showBanTrangThaiTrong(listBanTrong);
            System.out.println("Vui lòng chọn bàn chơi!");
            long idBan = CheckInput.checkIdInput();
            OrderTable thueBan = new OrderTable();
            thueBan.setIdBan(idBan);
            thueBan.setGioVao(LocalDateTime.now());
            long id = System.currentTimeMillis() % 1000;
            thueBan.setIdThueBan(id);
            thueBan.setTrangThai("Chưa thanh toán");
            System.out.println("Thêm thuê ban thành công!");
            System.out.println("Bạn có muốn thêm dịch vụ hay không?");
            System.out.println("1. Tiếp tục");
            System.out.println("2. Bỏ qua");
            System.out.println("chọn số bạn muốn chọn :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    boolean chonMon = true;
                    List<Detail> listChiTietDichVu = new ArrayList<>();
                    do {
                        orderService.showDichVuChuaXoa();
                        System.out.println("Chọn id dịch vụ");
                        long idDichVu = CheckInput.checkIdInput();
                        System.out.println("Nhập số lượng");
                        long soLuong = CheckInput.checkIdInput();
                        productService.addListDetail(listChiTietDichVu, id, idDichVu, soLuong);
                        thueBan.setListChiTietDichVu(listChiTietDichVu);
                        System.out.println("Bạn có muốn thêm món khác hay không?");
                        System.out.println("1. Tiếp tục");
                        System.out.println("2. Bỏ qua");
                        int choiceContinue = Integer.parseInt(sc.nextLine());
                        switch (choiceContinue) {
                            case 1:
                                break;
                            case 2:
                                chonMon = false;
                        }

                    } while (chonMon);
                    // lưu file chi tiet dv
                    listAllDetail.addAll(listChiTietDichVu);
                    ReadWriteFile.writeFile(pathChiTietDichVu, listAllDetail);
                    break;
                case 2:
                    break;
            }
            // lưu file thuê bàn
            listOrderTable.add(thueBan);
            ReadWriteFile.writeFile(pathThueBan, listOrderTable);
            //update trạng thái đang chơi cho bàn
            tableService.updateTrangThaiChoiCuaBan(idBan);


            showOrderTableById(thueBan);
//            System.err.println("Thêm thuê ban thành công!");
        } else {
            System.out.println("Bàn đã hêt!!");
        }
    }


    public void addFood() {

//        showThueBanChuaThanhToan();
//        List<OrderTable> orderTablesWithItems = new ArrayList<>();
//
//        for (OrderTable order : listOrderTable) {
//            if (order.getListChiTietDichVu() != null && !order.getListChiTietDichVu().isEmpty()){
//                orderTablesWithItems.add(order);
//            }
//        }
//
//        System.out.println("Danh sách các bàn đã có món:");
//        System.out.println(StringUtil.repeat("-", 45));
//        System.out.printf("%-10s | %-10s| %-10s| %-10s%n", "ID Thuê", "ID Món", "Số lượng", "Giá");
//        System.out.println(StringUtil.repeat("-", 45));
//        for (OrderTable order : orderTablesWithItems) {
//            if (order.getListChiTietDichVu() != null && !order.getListChiTietDichVu().isEmpty()){
//                for (Detail detail : order.getListChiTietDichVu()){
//                    System.out.printf("%-10s | %-10s| %-10s| %-10s%n",
//                            detail.getIdThueBan(), detail.getIdMon(), detail.getSoLuong(), detail.getGiaTien());
//                }
//            }
//        }
//        System.out.println(StringUtil.repeat("-", 45));
//        System.out.println("Vui lòng chọn ID thuê để tiếp tục đặt món:");
//

        showRentTable();

        System.out.println("Nhập ID Thuê Bàn:");
        long idThueBan = CheckInput.checkIdInput();


        OrderTable thueBan = null;
        for (OrderTable orderTable : listOrderTable) {
            if (orderTable.getIdThueBan() == idThueBan) {
                thueBan = orderTable;
                break;
            }
        }

        if (thueBan == null) {
            System.out.println("Không tìm thấy thông tin thuê bàn với ID đã nhập!");
            return;
        }

        boolean chonMon = true;
//        List<Detail> listChiTietDichVu = thueBan.getListChiTietDichVu();

        do {
            orderService.showDichVuChuaXoa();
            System.out.println("Chọn ID dịch vụ:");
            long idDichVu = CheckInput.checkIdInput();
            System.out.println("Nhập số lượng:");
            long soLuong = CheckInput.checkIdInput();

            if (listAllDetail.size() <= 0){
                listAllDetail.add(new Detail(idThueBan,idDichVu,soLuong,orderService.getServicePriceById(idDichVu)));
            }else {
                boolean isExitsThueBan = false;
                for (int i = 0; i < listAllDetail.size(); i++) {
                    if (listAllDetail.get(i).getIdThueBan() == idThueBan) {
                        isExitsThueBan = true;
                        if (idDichVu == listAllDetail.get(i).getIdMon()){
                            listAllDetail.get(i).setSoLuong(listAllDetail.get(i).getSoLuong() + soLuong);
                            break;
                        }else {
                            listAllDetail.add(new Detail(idThueBan,idDichVu,soLuong,orderService.getServicePriceById(idDichVu)));
                        break;
                        }
                    }
                }
                if(!isExitsThueBan){
                    listAllDetail.add(new Detail(idThueBan,idDichVu,soLuong,orderService.getServicePriceById(idDichVu)));
                }
            }
            // Cập nhật lại thông tin thuê bàn trong listOrderTable


            System.out.println("Bạn có muốn thêm món khác hay không?");
            System.out.println("1. Tiếp tục");
            System.out.println("2. Bỏ qua");
            int choiceContinue = Integer.parseInt(sc.nextLine());

            switch (choiceContinue) {
                case 1:
                    break;
                case 2:
                    chonMon = false;
                    break;
            }
        } while (chonMon);



        // Lưu file chi tiết dịch vụ
//        listAllDetail.addAll(listChiTietDichVu);
        ReadWriteFile.writeFile(pathChiTietDichVu, listAllDetail);

        // Hiển thị lại thông tin sau khi thêm món
        //Trước khi show thì cập nhật lại thuê bàn:
        listOrderTable = ReadWriteFile.readFile(pathThueBan, Config.TYPE_THUEBAN);
        showRentTable();
        System.out.println("Thêm món thành công!!");
    }

    public void payTable() {
        System.out.println("Danh sách các bàn đang chơi:");
        showRentTable();
        System.out.println("Nhập ID hóa đơn thanh toán:");
        long idThue = CheckInput.checkIdInput();

        OrderTable orderTable = getThueBanById(idThue, listOrderTable);
        if (orderTable != null) {
            System.out.println("Thông tin thanh toán bàn " + orderTable.getIdBan() + ":");

            // Tính thời gian chơi bàn
            LocalDateTime gioRa = LocalDateTime.now();
            LocalDateTime gioVao = orderTable.getGioVao();
            orderTable.setGioRa(gioRa);
            long hoursPlayed = ChronoUnit.HOURS.between(gioVao, gioRa);


            // Tính tổng tiền dịch vụ
            List<Detail> listChiTietDichVu = orderTable.getListChiTietDichVu();
            long tongTienDichVu = 0;
            for (Detail dichVu : listChiTietDichVu) {

                float thanhTienDichVu = dichVu.getGiaTien() * dichVu.getSoLuong();
                tongTienDichVu += thanhTienDichVu;
            }

            // Tính tổng tiền thanh toán
            float giaBan = tableService.getTablePriceById(orderTable.getIdBan()); // Hàm getTablePriceById() để lấy giá bàn dựa trên ID
            float tongTienThanhToan = giaBan * hoursPlayed + tongTienDichVu;
            orderTable.setTongTien(tongTienThanhToan);
            // Cập nhật trạng thái bàn sau khi thanh toán
            orderTable.setTrangThai("Đã thanh toán");

            //Cập nhật tangj thái bàn
            tableService.updateTableAfterOrder(orderTable.getIdBan());
            ReadWriteFile.writeFile(pathThueBan,listOrderTable);
            ReadWriteFile.writeFile(TableService.path,TableService.listTable);

            // Hiển thị thông tin thanh toán
//            System.out.println("Thời gian vào: " + gioVao);
//            System.out.println("Thời gian ra: " + gioRa);
//            System.out.println("Thời gian chơi: " + hoursPlayed + " giờ");
//            System.out.println("Tổng tiền dịch vụ: " + tongTienDichVu + " đồng");
//            System.out.println("Tổng tiền thanh toán: " + tongTienThanhToan + " đồng");
//            System.out.println("-------------------------------------------------Thông Tin Thanh Toán----------------------------------------");
//            System.out.println("--------------------------------------------------------------------------------------------------------------");
//            System.out.printf("| %-25s | %-25s | %-10s | %-15s | %-15s |\n", "Giờ Vào", "Giờ Ra", "Giờ Chơi", "Tổng $ dịch vụ", "Tổng $ thanh toán");
//            System.out.println("--------------------------------------------------------------------------------------------------------------");
//            System.out.printf("| %-25s | %-25s | %-10s | %-15s | %-15s |\n", gioVao, gioRa, hoursPlayed + " giờ", tongTienDichVu + " đồng", tongTienThanhToan + " đồng");
//            System.out.println("---------------------------------------------------------------------------------------------------------------");

            System.out.printf("%-20s |%-20s | %-20s | %-35s | %-25s| %-25s\n","ID Hóa đơn: " + orderTable.getIdThueBan(),
                    "ID Bàn: " + orderTable.getIdBan(), "Giờ Vào: " + orderTable.getGioVao(), "Giờ Ra: " + orderTable.getGioRa(),"Số Giờ Chơi: " + hoursPlayed + " giờ",
                    "Tổng tiền: " + orderTable.getTongTien());
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");

//                List<Detail> listChiTietDichVu = thue.getListChiTietDichVu();
            if (orderTable.getListChiTietDichVu() != null && orderTable.getListChiTietDichVu().size() > 0) {
                System.out.printf("%-20s | %-20s | %-35s | %-25s| %-25s\n",
                        "", "ID Món", "Số Lượng", "Giá", "Thành tiền");
                for (Detail dichVu : orderTable.getListChiTietDichVu()) {
                    System.out.printf("%-20s | %-20s | %-35s | %-25s| %-25s\n",
                            "", dichVu.getIdMon(), dichVu.getSoLuong(), dichVu.getGiaTien(),dichVu.getSoLuong() * dichVu.getGiaTien());
                }
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
            }
         }
    }

    public static String formatCurrency(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedAmount = decimalFormat.format(amount);
        return formattedAmount + " vnd";
    }

    public double calculateRevenueByDate() {
        double totalRevenue = 0.0;
        showRentTable();
        System.out.println("Nhập ngày muốn xem doanh thu: ");
        String input = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(input, formatter);

//        String strLocalDate = localDate.format(formatter);

        for (OrderTable orderTable : listOrderTable) {
            LocalDateTime gioVao = orderTable.getGioVao();
            LocalDateTime gioRa = orderTable.getGioRa();

//            System.out.println("giovao:"+ gioVao.toLocalDate());
//            System.out.println("tháng:" + gioRa.toLocalDate().getMonthValue());

            // Kiểm tra nếu mục có trạng thái là "Đã thanh toán" và nằm trong ngày cần tính
            if (orderTable.getTrangThai().equalsIgnoreCase("Đã thanh toán") && gioRa.toLocalDate().equals(localDate)) {
                long duration = gioRa.toEpochSecond(ZoneOffset.ofHours(7)) - gioVao.toEpochSecond(ZoneOffset.ofHours(15/6/2023));
                double hours = (double) duration / 3600; // Chuyển đổi thời gian thuê bàn từ giây sang giờ
                totalRevenue += orderTable.getTongTien();
            }
        }
        return totalRevenue;
    }

    public double calculateRevenueByMonth() {
        double totalRevenue = 0.0;
        showRentTable();
        System.out.println("Nhập tháng muốn xem doanh thu: ");
        int input = Integer.parseInt(sc.nextLine());


        for (OrderTable orderTable : listOrderTable) {
            LocalDateTime gioVao = orderTable.getGioVao();
            LocalDateTime gioRa = orderTable.getGioRa();


            if (orderTable.getTrangThai().equalsIgnoreCase("Đã thanh toán") && (gioRa.toLocalDate().getMonthValue()) == (input)) {
//                long duration = gioRa.toEpochSecond(ZoneOffset.ofHours(7)) - gioVao.toEpochSecond(ZoneOffset.ofHours(15/6/2023));
                totalRevenue += orderTable.getTongTien();
            }
        }
        return totalRevenue;
    }

    public double calculateRevenueByYear() {
        double totalRevenue = 0.0;
        showRentTable();
        System.out.println("Nhập năm muốn xem doanh thu: ");

        int input = Integer.parseInt(sc.nextLine());


        for (OrderTable orderTable : listOrderTable) {
            LocalDateTime gioVao = orderTable.getGioVao();
            LocalDateTime gioRa = orderTable.getGioRa();


            if (orderTable.getTrangThai().equalsIgnoreCase("Đã thanh toán") && (gioRa.toLocalDate().getYear()) == (input)) {
//                long duration = gioRa.toEpochSecond(ZoneOffset.ofHours(7)) - gioVao.toEpochSecond(ZoneOffset.ofHours(15/6/2023));
                totalRevenue += orderTable.getTongTien();
            }
        }
        return totalRevenue;
    }
}
