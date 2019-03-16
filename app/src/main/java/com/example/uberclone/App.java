package com.example.uberclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WWalnaaWhB39q7o3nxHKCou47CT78sm8ZZsBQUQT")
                // if defined
                .clientKey("iw5SBHwJTSr6zd1IDSWFyL35cTrQECxfP5i8MNuj")
                .server(getString(R.string.back4app_server_url))
                .build()
        );
    }
}
