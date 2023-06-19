package Model;

public class Detail {
    private long idThueBan;
    private long idMon;
    private long soLuong;

    private float giaTien;
    public Detail() {

    }

    public Detail(long idThueBan, long idMon, long soLuong, float giaTien) {
        this.idThueBan = idThueBan;
        this.idMon = idMon;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    public long getIdThueBan() {
        return idThueBan;
    }

    public void setIdThueBan(long idThueBan) {
        this.idThueBan = idThueBan;
    }

    public long getIdMon() {
        return idMon;
    }

    public void setIdMon(long idMon) {
        this.idMon = idMon;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return this.idThueBan + "," + this.idMon + "," + this.soLuong + "," + this.giaTien;
    }
}
