package com.wecp.progressive.service.impl;
 
import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
 
import java.util.List;
 
public class TeamServiceImplJdbc implements TeamService {
 
    private TeamDAO teamDAO;
 
    public TeamServiceImplJdbc(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }
 
    @Override
    public List<Team> getAllTeams() {
        return List.of();
    }
 
    @Override
    public int addTeam(Team team) {
        return -1;
    }
 
    @Override
    public List<Team> getAllTeamsSortedByName() {
        return List.of();
    }
 
    @Override
    public Team getTeamById(int teamId) {
        return null;
    }
 
    @Override
    public void updateTeam(Team team) {
    }
 
    @Override
    public void deleteTeam(int teamId) {
    }
}