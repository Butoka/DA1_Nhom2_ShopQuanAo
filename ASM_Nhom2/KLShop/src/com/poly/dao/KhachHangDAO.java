
package com.poly.dao;

import com.poly.entity.KhachHang;
import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO extends KLShopDAO<KhachHang,String>{
    String INSERT_SQL = "INSERT INTO KhachHang (MaKH,TenKH,NamSinh,GioiTinh,DiaChi,Email,SDT) VALUES (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KhachHang SET TenKH = ?,NamSinh = ?,GioiTinh = ?,DiaChi = ?,Email = ?,SDT = ? WHERE MaKH = ?";
    String DELETE_SQL = "DELETE FROM KhachHang WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KhachHang";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang WHERE MaKH = ?";

    @Override
    public void insert(KhachHang entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaKH(),
                entity.getTenKH(),
                entity.getNamSinh(),
                entity.getGioiTinh(),
                entity.getDiaChi(),
                entity.getEmail(),
                entity.getSDT()
        );
    }

    @Override
    public void update(KhachHang entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getTenKH(),
                entity.getNamSinh(),
                entity.getGioiTinh(),
                entity.getDiaChi(),
                entity.getEmail(),
                entity.getSDT(),
                entity.getMaKH());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<KhachHang>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);

            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setNamSinh(rs.getDate("NamSinh"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setEmail(rs.getString("Email"));
                entity.setSDT(rs.getString("SDT"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<KhachHang> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM KhachHang where TenKH LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

}
