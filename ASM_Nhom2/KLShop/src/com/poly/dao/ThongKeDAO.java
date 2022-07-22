
package com.poly.dao;

import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {
    List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getDoanhThu(Integer nam) {
        String sql = "{CALL sp_ThongKeDoanhThu(?)}";
        String[] cols = {"Ten", "SoLuong", "SoKH", "DoanhThu"};
        return this.getListOfArray(sql, cols, nam);
    }

    public List<Object[]> getDoanhThu1(int thang,int nam) {
        String sql = "{CALL sp_ThongKeDoanhThu1(?,?)}";
        String[] cols = {"Ten", "SoLuong", "SoKH", "DoanhThu"};
        return this.getListOfArray(sql, cols, thang,nam);
    }
}
