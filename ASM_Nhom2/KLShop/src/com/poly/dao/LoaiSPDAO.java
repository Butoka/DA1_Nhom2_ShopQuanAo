
package com.poly.dao;

import com.poly.entity.LoaiSP;
import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoaiSPDAO extends KLShopDAO<LoaiSP,Integer>{
    String INSERT_SQL = "INSERT INTO LoaiSP (TenLoai) VALUES (?)";
    String UPDATE_SQL = "UPDATE LoaiSP SET TenLoai = ? WHERE MaLoai = ?";
    String DELETE_SQL = "DELETE FROM LoaiSP WHERE MaLoai = ?";
    String SELECT_ALL_SQL = "SELECT * FROM LoaiSP";
    String SELECT_BY_ID_SQL = "SELECT * FROM LoaiSP WHERE MaLoai = ?";

    @Override
    public void insert(LoaiSP entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getTenLoai()
        );
    }

    @Override
    public void update(LoaiSP entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getTenLoai(),
                entity.getMaLoai()
        );
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<LoaiSP> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public LoaiSP selectById(Integer id) {
        List<LoaiSP> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<LoaiSP> selectBySql(String sql, Object... args) {
        List<LoaiSP> list = new ArrayList<LoaiSP>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);

            while (rs.next()) {
                LoaiSP entity = new LoaiSP();
                entity.setMaLoai(rs.getInt("MaLoai"));
                entity.setTenLoai(rs.getString("TenLoai"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<LoaiSP> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM LoaiSP where TenLoai LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
