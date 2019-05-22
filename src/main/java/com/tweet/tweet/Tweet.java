package com.tweet.tweet;

public class Tweet {
    private int id;
    private String name;
    private String title;
    private String description;
    private String active;
    private String url;
    private String pefurl;

    public Tweet(int id, String name, String title, String description, String active, String url, String pefurl) {

        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;
        this.active = active;
        this.url = url;
        this.pefurl = pefurl;

    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPefurl() {
        return pefurl;
    }

    public void setPefurl(String pefurl) {
        this.pefurl = pefurl;
    }

}