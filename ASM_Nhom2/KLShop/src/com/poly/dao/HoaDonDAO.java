package com.poly.dao;

import com.poly.entity.HoaDon;
import com.poly.helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO extends KLShopDAO<HoaDon, Long> {

    String INSERT_SQL = "INSERT INTO HoaDon (MaKH,TenTK,NgayTao,TrangThai) VALUES (?,?,?,?)";
    String UPDATE_SQL = "UPDATE HoaDon SET MaKH = ?,TenTK = ?,NgayTao = ?,TrangThai = ? WHERE MaHD = ?";
    String DELETE_SQL = "DELETE FROM HoaDon WHERE MaHD = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDon";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDon WHERE MaHD = ?";
    
    @Override
    public void insert(HoaDon entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaKH(),
                entity.getTenTK(),
                entity.getNgayTao(),
                entity.getTrangThai()
        );
    }
    
    @Override
    public void update(HoaDon entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaKH(),
                entity.getTenTK(),
                entity.getNgayTao(),
                entity.getTrangThai(),
                entity.getMaHD()
        );
    }

    @Override
    public void delete(Long id) {
        //JdbcHelper.update(DELETE_SQL, id);
    }
    @Override
    public List<HoaDon> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    
    @Override
    public HoaDon selectById(Long id) {
        List<HoaDon> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getLong("MaHD"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setNgayTao(rs.getDate("NgayTao"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
//    public List<HoaDon> selectByKeyword(String keyword) {
//        String sql = "SELECT * FROM HoaDon where MaHD LIKE ?";
//        return this.selectBySql(sql, "%" + keyword + "%");
//    }
}
