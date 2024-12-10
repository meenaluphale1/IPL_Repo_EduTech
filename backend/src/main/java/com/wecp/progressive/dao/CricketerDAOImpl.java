package com.wecp.progressive.dao;
 
import com.wecp.progressive.entity.Cricketer;
 
import java.util.List;
 
public class CricketerDAOImpl implements CricketerDAO {
 
    @Override
    public int addCricketer(Cricketer cricketer) {
        return -1;
    }
 
    @Override
    public Cricketer getCricketerById(int cricketerId) {
        return null;
    }
 
    @Override
    public void updateCricketer(Cricketer cricketer) {
 
    }
 
    @Override
    public void deleteCricketer(int cricketerId) {
 
    }
 
    @Override
    public List<Cricketer> getAllCricketers() {
        return List.of();
    }
}