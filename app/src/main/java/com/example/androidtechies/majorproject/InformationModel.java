package com.example.androidtechies.majorproject;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by TANSU on 22/03/2018.
 */

public class InformationModel implements Parcelable {
    String titleOfProject;
    String introProject;
    String technologyUsed;

<<<<<<< HEAD
    String modulein;

    public InformationModel(String titleOfProject, String introProject, String technologyUsed, String modulein) {
        this.titleOfProject = titleOfProject;
        this.introProject = introProject;
        this.technologyUsed = technologyUsed;
        this.modulein = modulein;
=======
    public InformationModel(String titleOfProject, String introProject, String technologyUsed) {
        this.titleOfProject = titleOfProject;
        this.introProject = introProject;
        this.technologyUsed = technologyUsed;
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a
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

<<<<<<< HEAD

    public String getModulein() {
        return modulein;
    }

    public void setModulein(String modulein) {
        this.modulein = modulein;
    }


    @Override
    public int describeContents() {
        return 0;
=======
    @Override
    public int describeContents() {
        return hashCode();
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(titleOfProject);
        parcel.writeString(introProject);
        parcel.writeString(technologyUsed);
<<<<<<< HEAD
        parcel.writeString(modulein);
=======
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a
    }

    protected InformationModel(Parcel in) {
        titleOfProject = in.readString();
        introProject = in.readString();
        technologyUsed = in.readString();
<<<<<<< HEAD
        modulein = in.readString();
    }

    public static final Creator<InformationModel> CREATOR = new Creator<InformationModel>() {
=======
    }

    public static final Parcelable.Creator<InformationModel> CREATOR = new Parcelable.Creator<InformationModel>() {
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a
        @Override
        public InformationModel createFromParcel(Parcel in) {
            return new InformationModel(in);
        }

        @Override
        public InformationModel[] newArray(int size) {
<<<<<<< HEAD
            return new InformationModel[size];
=======
            return new InformationModel[0];
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a
        }
    };

}
