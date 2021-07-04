package com.helalubo.userproject.mook.user.domain;

/**
 * user
 */
public class User {

    private String firstName;
    private String lastName;
    private Integer age;
    private String hobbie;
    private String favoriteIDE;
    private String OS;

    public User() {
    }

    /**
     * @return String return the name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param name the name to set
     */
    public void setFirstName(String setFirstName) {
        this.firstName = setFirstName;
    }

    /**
     * @return String return the subname
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param subname the subname to set
     */
    public void setLastName(String subname) {
        this.lastName = subname;
    }

    /**
     * @return Integer return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return String return the hobbie
     */
    public String getHobbie() {
        return hobbie;
    }

    /**
     * @param hobbie the hobbie to set
     */
    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    /**
     * @return String return the favoriteIDE
     */
    public String getFavoriteIDE() {
        return favoriteIDE;
    }

    /**
     * @param favoriteIDE the favoriteIDE to set
     */
    public void setFavoriteIDE(String favoriteIDE) {
        this.favoriteIDE = favoriteIDE;
    }

    /**
     * @return String return the SO
     */
    public String getOS() {
        return OS;
    }

    /**
     * @param SO the SO to set
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "{" + " firstName='" + getFirstName() + "'" + ", lastName='" + getLastName() + "'" + ", age='" + getAge()
                + "'" + ", hobbie='" + getHobbie() + "'" + ", favoriteIDE='" + getFavoriteIDE() + "'" + ", SO='"
                + getOS() + "'" + "}";
    }

}