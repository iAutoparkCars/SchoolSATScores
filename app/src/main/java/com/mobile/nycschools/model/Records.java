package com.mobile.nycschools.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Records extends RealmObject {

    @Required
    @PrimaryKey
    private String dbn;

    @Required
    private String schoolName;

    private String overviewParagraph;
    private String phoneNumber;
    private String email;
    private String website;
    private Long studentCount;
    private Double graduationRate;
    private Double attendRate;
    private Double collegeRate;
    private String neighborhood;
    private String campusName;
    private String location;
    private String primary_address_line_1;
    private String city;
    private Long postcode;
    private String stateCode;
    private String borough;
    private String testTakerCount;
    private Long criticalReadingAvg;
    private Long mathAvg;
    private Long writingAvg;

    public String getDbn() { return dbn; }

    public void setDbn(String dbn) { this.dbn = dbn; }

    public String getSchoolName() { return schoolName; }

    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }

    public String getOverviewParagraph() { return overviewParagraph; }

    public void setOverviewParagraph(String overviewParagraph) { this.overviewParagraph = overviewParagraph; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getWebsite() { return website; }

    public void setWebsite(String website) { this.website = website; }

    public Long getStudentCount() { return studentCount; }

    public void setStudentCount(Long studentCount) { this.studentCount = studentCount; }

    public Double getGraduationRate() { return graduationRate; }

    public void setGraduationRate(Double graduationRate) { this.graduationRate = graduationRate; }

    public Double getAttendRate() { return attendRate; }

    public void setAttendRate(Double attendRate) { this.attendRate = attendRate; }

    public Double getCollegeRate() { return collegeRate; }

    public void setCollegeRate(Double collegeRate) { this.collegeRate = collegeRate; }

    public String getNeighborhood() { return neighborhood; }

    public void setNeighborhood(String neighborhood) { this.neighborhood = neighborhood; }

    public String getCampusName() { return campusName; }

    public void setCampusName(String campusName) { this.campusName = campusName; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getPrimary_address_line_1() { return primary_address_line_1; }

    public void setPrimary_address_line_1(String primary_address_line_1) { this.primary_address_line_1 = primary_address_line_1; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public Long getPostcode() { return postcode; }

    public void setPostcode(Long postcode) { this.postcode = postcode; }

    public String getStateCode() { return stateCode; }

    public void setStateCode(String stateCode) { this.stateCode = stateCode; }

    public String getBorough() { return borough; }

    public void setBorough(String borough) { this.borough = borough; }

    public String getTestTakerCount() { return testTakerCount; }

    public void setTestTakerCount(String testTakerCount) { this.testTakerCount = testTakerCount; }

    public Long getCriticalReadingAvg() { return criticalReadingAvg; }

    public void setCriticalReadingAvg(Long criticalReadingAvg) { this.criticalReadingAvg = criticalReadingAvg; }

    public Long getMathAvg() { return mathAvg; }

    public void setMathAvg(Long mathAvg) { this.mathAvg = mathAvg; }

    public Long getWritingAvg() { return writingAvg; }

    public void setWritingAvg(Long writingAvg) { this.writingAvg = writingAvg; }

    @Override
    public String toString() { return this.dbn; }
}
