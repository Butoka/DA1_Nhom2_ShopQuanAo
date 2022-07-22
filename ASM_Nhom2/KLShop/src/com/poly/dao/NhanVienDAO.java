package com.poly.dao;

import com.poly.entity.NhanVien;
import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends KLShopDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien (MaNV,HoTen,NamSinh,GioiTinh,DiaChi,Email,SDT,Hinh) VALUES (?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET HoTen = ?,NamSinh = ?,GioiTinh = ?,DiaChi = ?,Email = ?,SDT = ?,Hinh = ? WHERE MaNV = ?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaNV(),
                entity.getHoTen(),
                entity.getNamSinh(),
                entity.getGioiTinh(),
                entity.getDiaChi(),
                entity.getEmail(),
                entity.getSDT(),
                entity.getHinh()
        );
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getHoTen(),
                entity.getNamSinh(),
                entity.getGioiTinh(),
                entity.getDiaChi(),
                entity.getEmail(),
                entity.getSDT(),
                entity.getHinh(),
                entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);

            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setNamSinh(rs.getDate("NamSinh"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setEmail(rs.getString("Email"));
                entity.setSDT(rs.getString("SDT"));
                entity.setHinh(rs.getString("Hinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<NhanVien> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NhanVien where HoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

}
