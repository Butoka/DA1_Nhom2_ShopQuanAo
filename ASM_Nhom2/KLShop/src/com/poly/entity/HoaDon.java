
package com.poly.entity;

import java.util.Date;

public class HoaDon {
    private Long MaHD;
    private String MaKH;
    private String TenTK;
    private Date NgayTao;
    private Boolean TrangThai;

    public Long getMaHD() {
        return MaHD;
    }

    public void setMaHD(Long MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MaHD=" + MaHD + ", MaKH=" + MaKH + ", TenTK=" + TenTK + ", NgayTao=" + NgayTao + ", TrangThai=" + TrangThai + '}';
    }
    
    
}
