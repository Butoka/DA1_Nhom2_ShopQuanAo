
package com.poly.entity;

public class TaiKhoan {

    private String TenTK;
    private String MaNV;
    private String MatKhau;
    private Boolean VaiTro;
    
    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public Boolean getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(Boolean VaiTro) {
        this.VaiTro = VaiTro;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "TenTK=" + TenTK + ", MaNV=" + MaNV + ", MatKhau=" + MatKhau + ", VaiTro=" + VaiTro + '}';
    }
    
}
