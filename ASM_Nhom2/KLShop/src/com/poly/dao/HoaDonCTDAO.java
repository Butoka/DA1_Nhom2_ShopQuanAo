
package com.poly.dao;

import com.poly.entity.HoaDonCT;
import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonCTDAO extends KLShopDAO<HoaDonCT,Long>{
    String INSERT_SQL = "INSERT INTO HoaDonCT (MaHD,MaSP,SoLuong) VALUES (?,?,?)";
    String UPDATE_SQL = "UPDATE HoaDonCT SET MaHD = ?,MaSP = ?,SoLuong = ? WHERE MaHDCT = ?";
    String DELETE_SQL = "DELETE FROM HoaDonCT WHERE MaHDCT = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDonCT";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDonCT WHERE MaHDCT = ?";

    @Override
    public void insert(HoaDonCT entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaHD(),
                entity.getMaSP(),
//                entity.getDonGia(),
                entity.getSoLuong()
        );
    }

    @Override
    public void update(HoaDonCT entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaHD(),
                entity.getMaSP(),
//                entity.getDonGia(),
                entity.getSoLuong(),
                entity.getMaHDCT()
        );
    }

    @Override
    public void delete(Long id) {
//        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<HoaDonCT> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDonCT selectById(Long id) {
        List<HoaDonCT> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HoaDonCT> selectBySql(String sql, Object... args) {
        List<HoaDonCT> list = new ArrayList<HoaDonCT>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);

            while (rs.next()) {
                HoaDonCT entity = new HoaDonCT();
                entity.setMaHDCT(rs.getLong("MaHDCT"));
                entity.setMaHD(Long.getLong("MaHD"));
                entity.setMaSP(rs.getInt("MaSP"));
//                entity.setDonGia(rs.getDouble("DonGia"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public List<HoaDonCT> selectByKeyword(String keyword) {
//        String sql = "SELECT * FROM HoaDonCT where TenKT LIKE ?";
//        return this.selectBySql(sql, "%" + keyword + "%");
//    }
}
