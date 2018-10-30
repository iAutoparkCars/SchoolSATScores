package com.mobile.nycschools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class SchoolListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_list);

        // init the Realm file
        Realm.init(this);
        //RealmConfiguration realmConfig = new RealmConfiguration.Builder()
    }
}
