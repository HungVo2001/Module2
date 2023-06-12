package view;

import model.ECategory;
import model.Product;
import service.IProductService;
import service.ProductService;
import utils.DateUtils;
import utils.ValidateUtils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner sc = new Scanner(System.in);
    private static final int INPUT_PRODUCT_ADD = 1;
    private static final int INPUT_PRODUCT_EDIT = 2;

    private IProductService iProductService;
    private List<Product> products;

    public ProductView(){
        iProductService = new ProductService();
    }

    public void laucher(){
        boolean checkActionMenu;
        do {
            checkActionMenu = true;
            System.out.println("=================================================");
            System.out.println("||            Menu Quản lý PRODUCT             ||");
            System.out.println("|| ------------------------------------------- ||");
            System.out.println("|| Nhấn 1: Xem danh sách PRODUCT               ||");
            System.out.println("|| Nhấn 2: Thêm PRODUCT mới                    ||");
            System.out.println("|| Nhấn 3: Sửa thông tin của PRODUCT           ||");
            System.out.println("|| Nhấn 4: Xóa PRODUCT                         ||");
            System.out.println("|| Nhấn 5: Sắp xếp PRODUCT theo tên            ||");
            System.out.println("|| Nhấn 6: Sắp xếp PRODUCT theo ngay thang     ||");
            System.out.println("|| Nhấn 7: Tìm kiem PRODUCT theo ngay ten      ||");
            System.out.println("|| Nhấn 8: Tim kiem PRODUCT theo nam sinh      ||");
            System.out.println("|| Nhấn 9: Tim kiem PRODUCT theo khoản time    ||");
            System.out.println("=================================================");

            int actionMenu = Integer.parseInt(sc.nextLine());
            switch (actionMenu){
                case 1:
                    showProduct(iProductService.getAllProducts());
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
//                case 5:
//                    sortProductByNameView();
//                    break;
//                case 6:
//                    sortProductByDateView();
//                    break;
//                case 7:
//                    searchProductByNameView();
//                    break;
//                case 8:
//                    searchProductByYearView();
//                    break;
//                case 9:
//                    searchProductByRangeDateView();
//                    break;
                default:
                    System.out.println("Nhập không đúng, vui lòng nhập lại!");
                    continue;
            }
            boolean repeatMenu;
            do {
                repeatMenu = true;
                System.out.println("Ban có muốn tiếp tục hay không: ");
                System.out.println("Nhập 1. Tiếp tục");
                System.out.println("Nhập 2. Kết thúc");

                int actionMenuContinue = Integer.parseInt(sc.nextLine());
                switch (actionMenuContinue) {
                    case 1:
                        checkActionMenu = true;
                        repeatMenu = false;
                        break;
                    case 2:
                        checkActionMenu = false;
                        repeatMenu = false;
                        break;
                    default:
                        System.out.println("Không đúng lệnh, vui lòng nhập lại:");
                }
            }while (repeatMenu);
        }while (checkActionMenu);
    }



    public void showProduct(List<Product> products) {
        System.out.printf("%-5s | %-20s | %-25s | %-15s | %-15s | %-15s | %-15s\n",
                "ID", "NAME", "DESCRIPTION", "PRICE", "CREATEAT", "DELETEAT","CATEGORY");
        for (int i = 0; i < products.size(); i++) {
            Product item = products.get(i);
            String instantView = DateUtils.formatInstant(item.getCreateAt());
            String instantResult = instantView == null ? "" : instantView;
            String dateView = DateUtils.formatLocalDate(item.getDeleteAt());
            String localResult = dateView == null ? "" : dateView;

            System.out.printf("%-5s | %-20s | %-25s | %-15s | %-15s | %-15s | %-15s\n",
                    item.getId(), item.getName(), item.getDescription(), item.getPrice(), instantResult, localResult, item.geteCategory());
        }
    }

    public void addProduct() {
        Product product = new Product();
        product.setId(System.currentTimeMillis() % 1000);
        inputProduct(INPUT_PRODUCT_ADD, product);
        iProductService.addProduct(product);
        showProduct(iProductService.getAllProducts());
    }
    public void inputNamePRODUCT(String strACTION,int ACTION, Product product){
        if(ACTION == INPUT_PRODUCT_ADD){
            do {
                System.out.printf("Nhập tên %s của product \n", strACTION);
                String name = sc.nextLine();
                if (!ValidateUtils.isValidProductName(name)) {
                    System.out.println("Tên không hợp lệ.Từ 8-20 kí tự, không chứa số");
                }else{
                    product.setName(name);
                    break;
                }
            } while (true);
        }else {
            do {
                System.out.printf("Nhập tên %s của product Enter để bỏ qua\n", strACTION);
                String name = sc.nextLine();
                if (!ValidateUtils.isValidProductName(name)) {
                    if (name.equals("")) {
                        break;
                    }
                    System.out.println("Tên không hợp lệ.Từ 8-20 kí tự, không chứa số");
                }else {
                    product.setName(name);
                    break;
                }
            } while (true);
        }
    }

    public void inputCreateATProduct(String strACTION, int inputProductAdd, Product product) {
        do {
            System.out.printf("Nhập ngày tạo %s của product Enter để bỏ qua\n", strACTION);
            System.out.println("Nhập ngày tạo (dd-MM-yyyy): ");
            String createATString = sc.nextLine();
            Instant ICreate = null;
            try {
                ICreate = DateUtils.parseStrInstant(createATString);
                if (ICreate != null) {
                    product.setCreateAt(ICreate);
                    break;
                }
            } catch (DateTimeParseException dateTimeParseException) {
                if (createATString.equals("")) {
                    break;
                }
            }
        } while (true);
    }
    public void inputDeleteATProduct(String strACTION, int inputProductAdd, Product product) {
        do {
            System.out.printf("Nhập ngày xóa %s của product Enter để bỏ qua\n", strACTION);
            System.out.println("Nhập ngày xóa (dd-MM-yyyy): ");
            String deleteATString = sc.nextLine();
            LocalDate IDelete = null;
            try {
                IDelete = DateUtils.parseStrLocalDate(deleteATString);
                if (IDelete != null) {
                    product.setDeleteAt(IDelete);
                    break;
                }
            } catch (DateTimeParseException dateTimeParseException) {
                if (deleteATString.equals("")) {
                    break;
                }
            }
        } while (true);
    }


    public void inputProduct(int ACTION, Product product) {
        String strACTION = ACTION == INPUT_PRODUCT_ADD ? "" : "cần sửa lại";

        inputNamePRODUCT(strACTION, INPUT_PRODUCT_ADD, product);

        System.out.printf("Nhập miêu tả của PRODUCT %s: \n", strACTION);
        String discription = sc.nextLine();

        System.out.println("Chọn thể loại (Category): ");
        for (ECategory e : ECategory.values()) {
            if (e.equals(product.geteCategory())) {
                continue;
            }
            System.out.println("Nhập " + e.getId() + "." + e.getName());
        }
        int actionMenuProduct1 = Integer.parseInt(sc.nextLine());
        product.seteCategory(ECategory.findById(actionMenuProduct1));

//        System.out.println("Chọn vai trò (Role): ");
//        for (ERole r : ERole.values()) {
//            if (r.equals(user.getErole())) {
//                continue;
//            }
//            System.out.println("Nhập " + r.getId() + "." + r.getName());
//        }
//        int actionMenuUser = Integer.parseInt(scanner.nextLine());
//        user.setErole(ERole.findById(actionMenuUser));

        inputCreateATProduct(strACTION, INPUT_PRODUCT_ADD, product);

        product.setDescription(discription);

    }

    public void editProduct() {
        showProduct(iProductService.getAllProducts());
        System.out.println("Nhập ID của PRODUCT cần sửa: ");
        long idProductEdit = Long.parseLong(sc.nextLine());

        Product productEdit = iProductService.findProductById(idProductEdit);
        if (productEdit != null) {
            inputProduct(INPUT_PRODUCT_EDIT, productEdit);
            iProductService.updateProductById(idProductEdit, productEdit);
        } else {
            System.out.println("PRODUCT này không tồn tại!");
        }
        showProduct(iProductService.getAllProducts());
    }
    public void deleteProduct() {
        boolean continueDeleting = true;
        do {
            showProduct(iProductService.getAllProducts());
            System.out.println("Nhập ID của PRODUCT cần xóa: ");
            long idProductDelete = Long.parseLong(sc.nextLine());

            if (idProductDelete == 0) {
                continueDeleting = false; // Người dùng nhập 0, thoát khỏi vòng lặp
            } else {
                Product productDelete = iProductService.findProductById(idProductDelete);

                if (productDelete == null) {
                    System.out.println("ID PRODUCT này không tồn tại!");
                } else {
                    iProductService.deleteProductById(idProductDelete);
                }
            }
        } while (continueDeleting);
    }

}
