package com.example.viewspeaker;

public class User {
    private String fName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public User(String fName, String lName, String job, String companyName, String emil, String location, String bio) {
        this.fName = fName;
        this.lName = lName;
        this.job = job;
        this.companyName = companyName;
        this.emil = emil;
        this.location = location;
        this.bio = bio;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    private String lName;
    private String job;
    private String companyName;
    private String emil;
    private String location;
    private String bio;

}
