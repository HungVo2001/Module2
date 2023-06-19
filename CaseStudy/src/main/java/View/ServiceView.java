package View;

import Utils.CheckInput;

import java.util.Scanner;

public class ServiceView {
//    public static List<DichVu> listDichVu;
    private static Services.DichVu orderItemService;
    public static Scanner sc = new Scanner(System.in);

    public ServiceView(){
        orderItemService = new Services.DichVu();
//        listDichVu = quanLyDichVu.readFileDichVu();
    }
    public void ServiceView(){
//        quanLyDichVu = new QuanLyDichVu();
//        listDichVu = quanLyDichVu.readFileDichVu();
        boolean checkActionDichVuMenu;
        do {
            checkActionDichVuMenu = true;
            System.out.println("Quản lý danh sách Dịch Vụ BiDa");
            System.out.println("Nhấn 1. Xem danh sách Menu dịch vụ");
            System.out.println("Nhấn 2. Thêm dịch vụ");
            System.out.println("Nhấn 3. Sửa dịch vụ");
            System.out.println("NHấn 4. Xóa dịch vụ");
            System.out.println("Nhấn 5. Khôi phục dịch vụ");

             int actionDichVuMenu = CheckInput.checkInteger();
            switch (actionDichVuMenu){
                case 1:
                    orderItemService.showService();
                    break;
                case 2:
                    orderItemService.addService();
                    break;
                case 3:
                    orderItemService.editService();
                    break;
                case 4:
                    orderItemService.deleteService();
                    break;
                case 5:
                    orderItemService.restoreService();
                    break;
            }
            System.out.println("Bạn có muốn tiếp tục hay không ?");
            System.out.println("Nhấn 1. Tiếp tục ");
            System.out.println("Nhán 2. Quay lại ");
            System.out.println("chọn số bạn muốn :");
            int actionMenuContinue = CheckInput.checkInteger();
            switch (actionMenuContinue){
                case 1:
                    checkActionDichVuMenu = true;
                    break;
                case 2:
                    checkActionDichVuMenu = false;
                    break;
                default:
                    boolean validSelection;
                    int[] validOption = {1,2};
                    do {
                        validSelection = true;
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!!");
                        actionMenuContinue = CheckInput.checkInteger();
                        for (int option : validOption){
                            if (actionMenuContinue == option){
                                validSelection = false;
                                break;
                            }
                        }
                    }while (validSelection);

                    boolean isContinueSelected = (actionMenuContinue ==1);
                    checkActionDichVuMenu = isContinueSelected;

            }
        }while (checkActionDichVuMenu);
        ViewAll.laucher();
    }

}
