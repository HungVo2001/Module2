package ManagerOfficer;

import java.util.Scanner;

public class ManagerOfficer {
    public Scanner sc = new Scanner(System.in);
    private CanBo[] canBos;
    public ManagerOfficer() {
        canBos = new CanBo[5];
        //CongNhan String name, int age, String gender, String address, int level
        canBos[0] = new CongNhan("Đat",20,"Nam","28 NTP",9);
        //KySy String name, int age, String gender, String address, int level
        canBos[1] = new KySu("Hung",28,"Nam","28 NTP","ĐH Bách Khoa");

    }

}
