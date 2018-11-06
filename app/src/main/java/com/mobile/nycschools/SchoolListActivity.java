package com.mobile.nycschools;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.mobile.nycschools.model.RecordModule;
import com.mobile.nycschools.model.RecordRealmObject;
import com.mobile.nycschools.model.Records;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class SchoolListActivity extends Activity {

    final String TAG = this.getClass().getName();
    final String DB_NAME = "Records.realm";
    Realm mRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_list);

        // init the Realm file
        Realm.init(SchoolListActivity.this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .assetFile("Records.realm")
                .readOnly()
                // It is optional, but recommended to create a module that describes the classes
                // found in your bundled file. Otherwise if your app contains other classes
                // than those found in the file, it will crash when opening the Realm as the
                // schema cannot be updated in read-only mode.
                //.modules(new RecordModule())
                .build();


        Log.d(TAG, "realm db path: " + config.getPath());
        Log.d(TAG, "realm db filename: " + config.getRealmFileName());

        mRealm = Realm.getInstance(config);

        //readFromRealm();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        mRealm.close();
    }

    public void readFromRealm(){
        RealmQuery<Records> query = mRealm.where(Records.class);

        // add query conditions here

        RealmResults<Records> results = query.findAll();

        /*RealmResults<Records> results = mRealm.where(Records.class)
                        .findAll();*/
        Log.d(TAG, results.toString());
    }

}
