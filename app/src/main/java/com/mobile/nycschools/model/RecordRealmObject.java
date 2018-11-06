package com.mobile.nycschools.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;


/**
 * Created by Steven on 10/30/2018.
 */

public class RecordRealmObject extends RealmObject {

    @Required
    @PrimaryKey
    private String dbn;

    @Required
    private String schoolName;

    private String phoneNumber;
    private String overviewParagraph;
    private String email;
    private String website;

    // constructor to make fields empty
    public RecordRealmObject(){
        schoolName = "";
        phoneNumber = "";
        overviewParagraph = "";
        email = "";
        website = "";
    }

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOverviewParagraph() {
        return overviewParagraph;
    }

    public void setOverviewParagraph(String overviewParagraph) {
        this.overviewParagraph = overviewParagraph;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() { return this.dbn; }

}
