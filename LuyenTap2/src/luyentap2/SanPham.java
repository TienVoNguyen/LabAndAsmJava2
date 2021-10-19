
package luyentap2;

import java.io.Serializable;

public class SanPham implements Serializable{
    private String maSP, tenSP, danhMuc;
    private double donGia;
    private boolean tinhTrang;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, String danhMuc, double donGia, boolean tinhTrang) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.danhMuc = danhMuc;
        this.donGia = donGia;
        this.tinhTrang = tinhTrang;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
