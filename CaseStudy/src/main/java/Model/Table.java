package Model;

public class Table {
    private long idBan;
    private String tenBan;
    private String trangThaiChoi;
    private String trangThaiXoa;
    private String viTri;
    private float giaBan;

    public Table() {

    }

    public Table(long idBan, String tenBan, String trangThaiChoi, String trangThaiXoa, String viTri, float giaBan) {
        this.idBan = idBan;
        this.tenBan = tenBan;
        this.trangThaiChoi = trangThaiChoi;
        this.trangThaiXoa = trangThaiXoa;
        this.viTri = viTri;
        this.giaBan = giaBan;
    }

    public long getIdBan() {
        return idBan;
    }

    public void setIdBan(long idBan) {
        this.idBan = idBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getTrangThaiChoi() {
        return trangThaiChoi;
    }

    public void setTrangThaiChoi(String trangThaiChoi) {
        this.trangThaiChoi = trangThaiChoi;
    }

    public String getTrangThaiXoa() {
        return trangThaiXoa;
    }

    public void setTrangThaiXoa(String trangThaiXoa) {
        this.trangThaiXoa = trangThaiXoa;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return this.idBan + "," + this.tenBan +"," +
                this.trangThaiChoi +"," +this.trangThaiXoa +"," + this.viTri +"," + this.giaBan;
    }
}
