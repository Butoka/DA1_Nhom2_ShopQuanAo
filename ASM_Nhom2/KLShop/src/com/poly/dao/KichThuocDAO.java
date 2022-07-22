
package com.poly.dao;

import com.poly.entity.KichThuoc;
import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KichThuocDAO extends KLShopDAO<KichThuoc,Integer>{
    String INSERT_SQL = "INSERT INTO KichThuoc (TenKT) VALUES (?)";
    String UPDATE_SQL = "UPDATE KichThuoc SET TenKT = ? WHERE MaKT = ?";
    String DELETE_SQL = "DELETE FROM KichThuoc WHERE MaKT = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KichThuoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM KichThuoc WHERE MaKT = ?";

    @Override
    public void insert(KichThuoc entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getTenKT()
        );
    }

    @Override
    public void update(KichThuoc entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getTenKT(),
                entity.getMaKT()
        );
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KichThuoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KichThuoc selectById(Integer id) {
        List<KichThuoc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KichThuoc> selectBySql(String sql, Object... args) {
        List<KichThuoc> list = new ArrayList<KichThuoc>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);

            while (rs.next()) {
                KichThuoc entity = new KichThuoc();
                entity.setMaKT(rs.getInt("MaKT"));
                entity.setTenKT(rs.getString("TenKT"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<KichThuoc> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM KichThuoc where TenKT LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
