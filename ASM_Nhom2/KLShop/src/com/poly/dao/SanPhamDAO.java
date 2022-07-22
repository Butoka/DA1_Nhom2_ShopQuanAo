package com.poly.dao;

import com.poly.entity.SanPham;
import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDAO extends KLShopDAO<SanPham, Integer> {

    String INSERT_SQL = "INSERT INTO SanPham (TenSP,Loai,DonGia,SoLuong,MoTa,Hinh,KichThuoc) VALUES (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SanPham SET TenSP = ?,Loai = ?,DonGia = ?,SoLuong = ?,MoTa = ?,Hinh = ?,KichThuoc = ?; WHERE MaSP = ?";
    String DELETE_SQL = "DELETE FROM SanPham WHERE MaSP = ?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM SanPham WHERE MaSP = ?";

    @Override
    public void insert(SanPham entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getTenSP(),
                entity.getLoai(),
                entity.getDonGia(),
                entity.getSoLuong(),
                entity.getMoTa(),
                entity.getHinh(),
                entity.getKichThuoc()
        );
    }

    @Override
    public void update(SanPham entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getTenSP(),
                entity.getLoai(),
                entity.getDonGia(),
                entity.getSoLuong(),
                entity.getMoTa(),
                entity.getHinh(),
                entity.getKichThuoc(),
                entity.getMaSP()
        );
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public SanPham selectById(Integer id) {
        List<SanPham> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<SanPham>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);

            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getInt("MaSP"));
                entity.setTenSP(rs.getString("TenSP"));
                entity.setLoai(rs.getInt("Loai"));
                entity.setDonGia(rs.getDouble("DonGia"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setMoTa(rs.getString("MoTa"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setKichThuoc(rs.getInt("KichThuoc"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<SanPham> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM SanPham where HoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

}
