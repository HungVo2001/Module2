package Model;

public class Service {
    private long idDichVu;
    private String tenMon;
    private float giaDichVu;
    private String trangThaiXoa;

    public Service() {

    }

    public Service(long idDichVu, String tenMon, float giaDichVu, String trangThaiXoa) {
        this.idDichVu = idDichVu;
        this.tenMon = tenMon;
        this.giaDichVu = giaDichVu;
        this.trangThaiXoa = trangThaiXoa;
    }

    public long getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(long idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public float getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(float giaDichVu) {
        this.giaDichVu = giaDichVu;
    }

    public String getTrangThaiXoa() {
        return trangThaiXoa;
    }

    public void setTrangThaiXoa(String trangThaiXoa) {
        this.trangThaiXoa = trangThaiXoa;
    }

    @Override
    public String toString() {
        return this.idDichVu + "," + this.tenMon + "," + this.giaDichVu + "," + this.trangThaiXoa;
    }
}
