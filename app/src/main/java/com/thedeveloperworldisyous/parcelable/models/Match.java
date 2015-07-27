package com.thedeveloperworldisyous.parcelable.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by javiergonzalezcabezas on 27/07/15.
 */
public class Match implements Parcelable{

    private String awayTeamName;
    private String homeTeamName;
    private String matchDateString;
    private String objectId;
    private String result;
    private String stadium;
    private String status;
    private String updatedAt;

    public Match(){}

    public Match(Parcel in) {
            awayTeamName = in.readString();
            homeTeamName = in.readString();
            matchDateString = in.readString();
            objectId = in.readString();
            result = in.readString();
            stadium = in.readString();
            status = in.readString();
            updatedAt = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(awayTeamName);
        dest.writeString(homeTeamName);
        dest.writeString(matchDateString);
        dest.writeString(objectId);
        dest.writeString(result);
        dest.writeString(stadium);
        dest.writeString(status);
        dest.writeString(updatedAt);

    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Match createFromParcel(Parcel in) {
            return new Match(in);
        }

        public Match[] newArray(int size) {
            return new Match[size];
        }
    };

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getMatchDateString() {
        return matchDateString;
    }

    public void setMatchDateString(String matchDateString) {
        this.matchDateString = matchDateString;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }



}
