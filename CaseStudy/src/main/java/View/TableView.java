package View;

import Services.TableService;
import Utils.CheckInput;

import java.util.Scanner;

public class TableView {
//    public static List<BanBiDa> listBan ;

    private static TableService tableService;

    public TableView(){
        tableService = new TableService();
//        listBan = quanLyBan.readFileBida();s
    }
    public static Scanner sc = new Scanner(System.in);
    public void TableView(){
//        quanLyBan = new QuanLyBan();
//        listBan = quanLyBan.readFileBida();

        boolean checkActionBiDaMenu;
        do {
            checkActionBiDaMenu = true;

                System.out.println("Menu quản lí bàn BIDA");
                System.out.println("Nhấn 1. Thêm Bàn BiDa");
                System.out.println("Nhấn 2. Sửa bàn BiDa ");
                System.out.println("Nhần 3. Xóa bàn BIDA");
                System.out.println("Nhấn 4. Khôi phục bàn BIDA");
                System.out.println("Nhấn 5. Xem danh sách bàn Bida");

                int actionMenuBiDa = CheckInput.checkInteger();


            switch (actionMenuBiDa){
                case 1:
                    tableService.addTable();
                    break;
                case 2:
                    tableService.editTable();

                    break;
                case 3:
                    tableService.deleteTable();
                    break;
                case 4:
                    tableService.restoreTable();
                    break;
                case 5:

                    tableService.showTable();
                    break;
                case 6:
                    break;
            }
            System.out.println("Ban có muốn tiếp tục hay không: ");
            System.out.println("Nhập 1. Tiếp tục");
            System.out.println("Nhập 2. Quay lai");
            int actionMenuContinue = CheckInput.checkInteger();
            switch (actionMenuContinue){
                case 1:
                    checkActionBiDaMenu = true;
                    break;
                case 2:
                    checkActionBiDaMenu = false;
                    break;
                default:
                    boolean validSelection;
                    int[] validOptions = {1, 2};  //mảng chứa giá trị hợp lý

                    do {
                        validSelection = true;
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");

                        actionMenuContinue = CheckInput.checkInteger();
                        for (int option : validOptions) {
                            if (actionMenuContinue == option) {
                                validSelection = false;
                                break;
                            }
                        }
                    } while (validSelection);  // end vòng lặp và kiểm tra giá trị của validSelection

                    //đặt giá trị của checkAC dựa trên action.
                    //Nếu checkAC = 1 => action là true
                    boolean isContinueSelected = (actionMenuContinue == 1);
                    checkActionBiDaMenu = isContinueSelected;
            }
        }while (checkActionBiDaMenu);

        ViewAll.laucher();
    }
}
