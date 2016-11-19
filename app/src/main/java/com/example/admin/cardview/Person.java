package com.example.admin.cardview;

/**
 * Created by Admin on 17-11-2016.
 */
public class Person {
    String VersionName;
    int photoId;

    public Person(String versionName, int photoId) {
        VersionName = versionName;
        this.photoId = photoId;
    }

    public String getVersionName() {
        return VersionName;
    }

    public void setVersionName(String versionName) {
        VersionName = versionName;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}