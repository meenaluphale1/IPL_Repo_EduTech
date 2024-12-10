package com.wecp.progressive.dao;
 
import com.wecp.progressive.entity.Match;
 
import java.util.List;
 
public class MatchDAOImpl implements MatchDAO {
 
    @Override
    public int addMatch(Match match) {
        return -1;
    }
 
    @Override
    public Match getMatchById(int matchId) {
        return null;
    }
 
    @Override
    public void updateMatch(Match match) {
 
    }
 
    @Override
    public void deleteMatch(int matchId) {
 
    }
 
    @Override
    public List<Match> getAllMatches() {
        return List.of();
    }
}