
package com.poly.entity;

public class KichThuoc {
    private Integer MaKT;
    private String TenKT;

    public Integer getMaKT() {
        return MaKT;
    }

    public void setMaKT(Integer MaKT) {
        this.MaKT = MaKT;
    }

    public String getTenKT() {
        return TenKT;
    }

    public void setTenKT(String TenKT) {
        this.TenKT = TenKT;
    }

    @Override
    public String toString() {
        return "KichThuoc{" + "MaKT=" + MaKT + ", TenKT=" + TenKT + '}';
    }
    
    
}
