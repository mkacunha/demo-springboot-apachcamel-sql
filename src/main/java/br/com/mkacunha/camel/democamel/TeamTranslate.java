package br.com.mkacunha.camel.democamel;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TeamTranslate {

    public Team translate(Map<String, Object> row) {
        Team team = new Team();
        team.setId((String) row.get("id"));
        team.setName((String) row.get("name"));
        team.setCoach((String) row.get("coach"));
        team.setGifBorderColor((String) row.get("gifBorderColor"));
        team.setUrlGif((String) row.get("urlGif"));
        team.setUrlBackground((String) row.get("urlBackground"));
        team.setNumberPlayers((Integer) row.get("numberPlayers"));
        return team;
    }

}
