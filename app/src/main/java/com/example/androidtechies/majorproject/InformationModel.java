package com.example.androidtechies.majorproject;

/**
 * Created by TANSU on 22/03/2018.
 */

public class InformationModel {
    String titleOfProject;
    String introProject;
    String technologyUsed;

    public InformationModel(String titleOfProject, String introProject, String technologyUsed) {
        this.titleOfProject = titleOfProject;
        this.introProject = introProject;
        this.technologyUsed = technologyUsed;
    }

    public String getTitleOfProject() {
        return titleOfProject;
    }

    public void setTitleOfProject(String titleOfProject) {
        this.titleOfProject = titleOfProject;
    }

    public String getIntroProject() {
        return introProject;
    }

    public void setIntroProject(String introProject) {
        this.introProject = introProject;
    }

    public String getTechnologyUsed() {
        return technologyUsed;
    }

    public void setTechnologyUsed(String technologyUsed) {
        this.technologyUsed = technologyUsed;
    }
}
