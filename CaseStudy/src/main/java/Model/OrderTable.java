package Model;

import java.time.LocalDateTime;
import java.util.List;

public class OrderTable {
    private long idThueBan;
    private long idBan;
    private LocalDateTime gioVao;
    private LocalDateTime gioRa;
    private List<Detail> listChiTietDichVu;


    private String trangThai;
    private float tongTien;



    public OrderTable(){

    }

    public OrderTable(long idThueBan, long idBan, LocalDateTime gioVao, LocalDateTime gioRa, List<Detail> listChiTietDichVu, String trangThai, float tongTien) {
        this.idThueBan = idThueBan;
        this.idBan = idBan;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.listChiTietDichVu = listChiTietDichVu;
        this.trangThai = trangThai;
        this.tongTien = tongTien;

    }

    public OrderTable(long idThueBan, long idBan, LocalDateTime gioVao, LocalDateTime gioRa, String trangThai, float tongTien) {
        this.idThueBan = idThueBan;
        this.idBan = idBan;
        this.gioVao = gioVao;
        this.gioRa = gioRa;

        this.trangThai = trangThai;
        this.tongTien = tongTien;
    }

    public long getIdThueBan() {
        return idThueBan;
    }

    public void setIdThueBan(long idThueBan) {
        this.idThueBan = idThueBan;
    }

    public long getIdBan() {
        return idBan;
    }

    public void setIdBan(long idBan) {
        this.idBan = idBan;
    }

    public LocalDateTime getGioVao() {
        return gioVao;
    }

    public void setGioVao(LocalDateTime gioVao) {
        this.gioVao = gioVao;
    }

    public LocalDateTime getGioRa() {
        return gioRa;
    }

    public void setGioRa(LocalDateTime gioRa) {
        this.gioRa = gioRa;
    }

    public List<Detail> getListChiTietDichVu() {
        return listChiTietDichVu;
    }

    public void setListChiTietDichVu(List<Detail> listChiTietDichVu) {
        this.listChiTietDichVu = listChiTietDichVu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }


    public void updateTotal() {
            float total = 0;
            if (this.listChiTietDichVu != null) {
                for (Detail detailItem : listChiTietDichVu) {
                    total += detailItem.getSoLuong() * detailItem.getGiaTien();
                }
            }
            this.setTongTien(total);
        }
    @Override
    public String toString() {
        return this.idThueBan + "," + this.idBan + "," + this.gioVao + "," + this.gioRa  + "," + this.trangThai + "," + this.tongTien;
    }


}
