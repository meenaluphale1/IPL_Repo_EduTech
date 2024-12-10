package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TeamServiceImplJpa  implements TeamService {

    @Override
    public List<Team> getAllTeams() throws SQLException {
        return List.of();
    }

    @Override
    public int addTeam(Team team) throws SQLException {
        return -1;
    }

    @Override
    public List<Team> getAllTeamsSortedByName() throws SQLException {
        return List.of();
    }

    @Override
    public Team getTeamById(int teamId) throws SQLException {
        return null;
    }

    @Override
    public void updateTeam(Team team) throws SQLException {

    }

    @Override
    public void deleteTeam(int teamId) throws SQLException {

    }
}