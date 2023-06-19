package View;

import Model.OrderTable;
import Services.OrderTableService;
import Utils.CheckInput;

import java.time.LocalDate;
import java.util.Scanner;

public class OrderTableView {

    private static OrderTableService orderTableService;
    public static Scanner sc = new Scanner(System.in);
    public OrderTableView(){
        orderTableService = new OrderTableService();
    }
    public void OrderTableView(){
        boolean checkActionThueBan;
        do {
            checkActionThueBan = true;
            System.out.println("Quản lý danh sách dịch vụ thuê ban");
            System.out.println("Nhấn 1. Thuê bàn");
            System.out.println("Nhấn 2. Thêm món");
            System.out.println("Nhấn 3. Thanh toán");
            System.out.println("Nhấn 4. Hiển thị DS");
            System.out.println("Nhấn 5. Hiển thi doanh thu theo ngày");
            System.out.println("Nhấn 6. Hiển thi doanh thu theo tháng");
            System.out.println("Nhấn 7. Hiển thi doanh thu theo năm");


            int actionThueBan = CheckInput.checkInteger();
            switch (actionThueBan){
                case 1:
                    orderTableService.rentTable();
                    break;
                case 2:
                    orderTableService.addFood();
                    break;
                case 3:
                    orderTableService.payTable();
                    break;
                case 4:
                    orderTableService.showRentTable();
                    break;
                case 5:
                    System.out.println("Doanh thu la:" + OrderTableService.formatCurrency(orderTableService.calculateRevenueByDate()));
                    break;
                case 6:
                    System.out.println("Doanh thu la:" + OrderTableService.formatCurrency(orderTableService.calculateRevenueByMonth()));
                    break;
                case 7:
                    System.out.println("Doanh thu la:" + OrderTableService.formatCurrency(orderTableService.calculateRevenueByYear()));
                    break;
//                case 6:
//                    orderTableService.calculateRevenueByMonth();
            }
            System.out.println("Bạn có muốn tiếp tục hay không ?");
            System.out.println("Nhấn 1. Tiếp tục ");
            System.out.println("Nhán 2. Quay lại ");
            int actionThueBanContinue = CheckInput.checkInteger();
            switch (actionThueBanContinue){
                case 1:
                    checkActionThueBan = true;
                    break;
                case 2:
                    checkActionThueBan = false;
                    break;
                default:
                    boolean validSelection;
                    int[] validOption = {1,2};
                    do {
                        validSelection = true;
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!!");
                        actionThueBanContinue = CheckInput.checkInteger();
                        for (int option : validOption){
                            if (actionThueBanContinue == option){
                                validSelection = false;
                                break;
                            }
                        }
                    }while (validSelection);
                    boolean isContinueSelected = (actionThueBanContinue ==1);
                    checkActionThueBan = isContinueSelected;
            }

        }while (checkActionThueBan);
        ViewAll.laucher();
    }

}
