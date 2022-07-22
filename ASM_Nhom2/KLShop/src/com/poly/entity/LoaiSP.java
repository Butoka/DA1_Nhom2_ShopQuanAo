
package com.poly.entity;

public class LoaiSP {
    private Integer MaLoai;
    private String TenLoai;

    public Integer getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(Integer MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    @Override
    public String toString() {
        return "LoaiSP{" + "MaLoai=" + MaLoai + ", TenLoai=" + TenLoai + '}';
    }
    
    
}
