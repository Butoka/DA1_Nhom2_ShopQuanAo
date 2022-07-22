package com.poly.dao;

import com.poly.entity.TaiKhoan;
import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanDAO extends KLShopDAO<TaiKhoan, String> {

    String INSERT_SQL = "INSERT INTO TaiKhoan (TenTK, MaNV, MatKhau, VaiTro) VALUES (?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE TaiKhoan SET MaNV = ?, MatKhau = ?, VaiTro = ?  WHERE TenTK = ?";
    String DELETE_SQL = "DELETE FROM TaiKhoan WHERE TenTK = ?";
    String SELECT_ALL_SQL = "SELECT * FROM TaiKhoan";
    String SELECT_BY_ID_SQL = "SELECT * FROM TaiKhoan WHERE TenTK = ?";
    String SELECT_BY_IDMNV_SQL = "SELECT * FROM TaiKhoan WHERE MaNV = ?";

    @Override
    public void insert(TaiKhoan entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getTenTK(), entity.getMaNV(), entity.getMatKhau(), entity.getVaiTro());
    }

    @Override
    public void update(TaiKhoan entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaNV(), entity.getMatKhau(), entity.getVaiTro(), entity.getTenTK());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<TaiKhoan> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public TaiKhoan selectById(String id) {
        List<TaiKhoan> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<TaiKhoan>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);

            while (rs.next()) {
                TaiKhoan entity = new TaiKhoan();
                entity.setTenTK(rs.getString("TenTK"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<TaiKhoan> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM TaiKhoan where TenTK LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public TaiKhoan selectByIdMaNV(String id) {
        List<TaiKhoan> list = this.selectBySql(SELECT_BY_IDMNV_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
