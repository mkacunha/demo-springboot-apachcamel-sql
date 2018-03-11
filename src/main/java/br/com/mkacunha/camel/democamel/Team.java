package br.com.mkacunha.camel.democamel;

public class Team {

    private String id;

    private String name;

    private String coach;

    private String gifBorderColor;

    private String urlGif;

    private String urlBackground;

    private Integer numberPlayers = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getGifBorderColor() {
        return gifBorderColor;
    }

    public void setGifBorderColor(String gifBorderColor) {
        this.gifBorderColor = gifBorderColor;
    }

    public String getUrlGif() {
        return urlGif;
    }

    public void setUrlGif(String urlGif) {
        this.urlGif = urlGif;
    }

    public String getUrlBackground() {
        return urlBackground;
    }

    public void setUrlBackground(String urlBackground) {
        this.urlBackground = urlBackground;
    }

    public Integer getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(Integer numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", coach='" + coach + '\'' +
                ", gifBorderColor='" + gifBorderColor + '\'' +
                ", urlGif='" + urlGif + '\'' +
                ", urlBackground='" + urlBackground + '\'' +
                ", numberPlayers=" + numberPlayers +
                '}';
    }
}
