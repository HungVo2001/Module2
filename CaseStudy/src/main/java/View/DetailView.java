package View;

import Services.DetailService;
import Utils.CheckInput;

import java.util.Scanner;

public class DetailView {
    private static DetailService detailService;
    public static Scanner sc = new Scanner(System.in);

    public DetailView(){
        detailService = new DetailService();
    }
    public void DetailView(){
        boolean checkActionChiTiet;
        do {
            checkActionChiTiet = true;
            System.out.println("Quản lý chi tiết dich vụ");
            System.out.println("Nhập 1.Xem chi tiết dịch vụ");
            System.out.println("Nhập 2.Thêm chi tiết dịch vụ");
            int  actionChiTiet = CheckInput.checkInteger();
            switch (actionChiTiet){
                case 1:
                    detailService.showDetailService();
                    break;
                case 2:
                    detailService.addFood();
                    break;
            }
            System.out.println("Bạn có muốn tiếp tục hay không ?");
            System.out.println("Nhấn 1. Tiếp tục ");
            System.out.println("Nhán 2. Quay lại ");
            int chiTietContinue = CheckInput.checkInteger();
            switch (chiTietContinue){
                case 1:
                    checkActionChiTiet = true;
                    break;
                case 2:
                    checkActionChiTiet = false;
                    break;
                default:
                    boolean validSelection;
                    int[] validOption = {1,2};
                    do {
                        validSelection = true;
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!!");
                        chiTietContinue = CheckInput.checkInteger();
                        for (int option : validOption){
                            if (chiTietContinue == option){
                                validSelection = false;
                                break;
                            }
                        }
                    }while (validSelection);
                    boolean isContinueSelected = (chiTietContinue ==1);
                    checkActionChiTiet = isContinueSelected;
            }
        }while (checkActionChiTiet);
        ViewAll.laucher();
    }

}
