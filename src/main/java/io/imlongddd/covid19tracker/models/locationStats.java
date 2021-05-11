package io.imlongddd.covid19tracker.models;

public class locationStats {
    private  String country;
    private String state;
    private  int latestTotalCases;
    private int newUpdate;

    public int getNewUpdate() {
        return newUpdate;
    }

    public void setNewUpdate(int newUpdate) {
        this.newUpdate = newUpdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "locationStats{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", newUpdate=" + newUpdate +
                '}';
    }
}
