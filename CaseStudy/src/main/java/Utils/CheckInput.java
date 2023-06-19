package Utils;

import Model.Table;

import java.util.List;
import java.util.Scanner;

public class CheckInput {
    public static List<Table> tables;

    public static Scanner sc = new Scanner(System.in);
    public static String checkNumberAndText(){
        do {
            try {
                String input = sc.nextLine();
                if (!ValidateUtil.isValidLocation(input)) {
                    System.out.println("Vị trí nhập không hợp lệ. Phải từ 10-50 kí tự");
                }else{
                    return input;
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (true);
    }

    public static String checkConfirm(){
        do {
            try {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("Y")|| input.equalsIgnoreCase("N")) {
                   return input;
                }else{
                   System.out.println("Vui lòng nhập đúng định dạng");
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (true);

    }
    public static String checkText(){
        do {
            try {
                String input = sc.nextLine();
//                if (!input.trim().isEmpty() && input.trim().matches("[a-zA-Z]+")){
//                    return input;
//                }else {
//                    System.out.println("Không được để trống, không ký tự(Yêu cầu nhập chữ). Vui lòng nhâp lại");
//                }
                if (!ValidateUtil.isValidName(input)) {
                    System.out.println("Tên sản phẩm không hợp lệ. Phải từ 10-50 kí tự");
                }else{
                    return input;
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (true);

    }
    public static Float checkFloat(){
        do {
            try {
                Float input = Float.parseFloat(sc.nextLine());
                if (input > 0){
                    return input;
                }else {
                    System.out.println("Vui lòng nhập số lớn hon 0");
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (true);
    }
    public static Float checkTrangThaiXoa(){
        do {
            try {
                Float input = Float.parseFloat(sc.nextLine());
                if (input > 0){
                    return input;
                }else {
                    System.out.println("Vui lòng nhập số lớn hon 0");
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (true);
    }
    public static Long checkIdInput(){
        do {
            try {
                Long id = Long.parseLong(sc.nextLine());
                if (id > 0 ){
                    return id;
                }else {
                    System.out.println("Vui lòng nhập số lớn hơn 0");
                }
            }catch (Exception e){
                System.err.println("Vui lòng nhập đúng định dang!!");
            }
        }while (true);
    }
    public static Integer checkInteger(){
        do {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input > 0 && input < 8){
                    return input;
                } else {
                    System.out.println("Vui lòng nhập số(Từ 1-7) ");
                }

            } catch (Exception e){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (true);

    }

}
