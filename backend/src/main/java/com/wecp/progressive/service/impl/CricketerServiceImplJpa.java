package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.repository.CricketerRepository;
import com.wecp.progressive.service.CricketerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CricketerServiceImplJpa implements CricketerService {

    private CricketerRepository cricketerRepository;

    @Autowired
    public CricketerServiceImplJpa(CricketerRepository cricketerRepository) {
        this.cricketerRepository = cricketerRepository;
    }

    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
        return List.of();
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) throws SQLException {
        return -1;
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        return List.of();
    }

    @Override
    public void updateCricketer(Cricketer cricketer) throws SQLException {

    }

    @Override
    public void deleteCricketer(int cricketerId) throws SQLException {

    }

    @Override
    public Cricketer getCricketerById(int cricketerId) throws SQLException {
        return null;
    }

    @Override
    public List<Cricketer> getCricketersByTeam(int teamId) {
        return null;
    }
}