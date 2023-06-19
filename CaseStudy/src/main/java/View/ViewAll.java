package View;

import Utils.CheckInput;

import java.util.Scanner;

//"C:\codegym\Module2\CaseStudy"
public class ViewAll {
    public static Scanner sc = new Scanner(System.in);
    public static void laucher(){
            try {
                boolean checkActionBiDaMenu;
                do {
                    checkActionBiDaMenu = true;
                    System.out.println("Menu chính quản lí BIDA");
                    System.out.println("Nhấn 1. Quản Lý Bàn BiDa");
                    System.out.println("Nhấn 2. Quản Lý Dịch Vụ ");
                    System.out.println("Nhần 3. Quản Lý Thuê Bàn");
//                    System.out.println("Nhấn 4. Quản Lý Chi Tiết Dịch Vụ");
                    System.out.println("Nhấn 4. Exit");
                    System.out.println("Mời nhập số: ");

                    int actionMenuBiDa = CheckInput.checkInteger();
                    switch (actionMenuBiDa){
                        case 1:
                            TableView tableView = new TableView();
                            tableView.TableView();
                            break;
                        case 2:
                            ServiceView orderItemView = new ServiceView();
                            orderItemView.ServiceView();
                            break;
                        case 3:
                            OrderTableView orderTableView = new OrderTableView();
                            orderTableView.OrderTableView();
                            break;
//                        case 4:
//                            DetailView detailView = new DetailView();
//                            detailView.DetailView();
//                            break;
                        case 4:
                            System.out.println("Thoát chương trình!");
                            System.exit(0);
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
            }catch (Exception e){
                System.out.println("Không đúng định dạng. Vui lòng nhập lại");
            }
    }
}
