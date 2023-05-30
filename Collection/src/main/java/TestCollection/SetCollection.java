package TestCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>(); // Tính cáchdda hình, 1 biến kiểu dữ lieeuj lớp cha tham chiếu đến 1 đôi tượng lớp con,
//        // mà Interface thì k thể tạo mới 1 đối tượng nên phải tạo qua lớp con bằng Pthuc hashSet(). Set(Không trùng lặp)
        //
//        set.add("Ha");
//        set.add("Trung");
//        set.add("Quan");set.add("Tien");
//        System.out.println(set);
//        for (String s : set) {
//            System.out.print(s.toUpperCase()+" ");

        Set<Integer> sets1 = new TreeSet<>();    //Neus dùng TreeSet(Có sắp xếp) thi danh sách được sắp xếp và k trùng lặp(set)
        sets1.add(1);
        sets1.add(3);
        sets1.add(9);sets1.add(-5);
        System.out.println(sets1);
        for (Integer s : sets1) {
            System.out.print(s +" ");

            //hoc
//            for(int i = 0; i < sets1.size();i++) {
//                System.out.println(sets1.get(i));
//            }

            //==> 2 thằng for trên là 2 cách duyệt giống nhau.

        }
    }
}
