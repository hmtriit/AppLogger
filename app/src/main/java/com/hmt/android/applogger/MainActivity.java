package com.hmt.android.applogger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoggerFactory.Logger logger = LoggerFactory.getLogger("MainActivity", LoggerFactory.LoggerType.Console);

        // optional, set a minimum filter level
        // logger.setLevel(Log.INFO);

        logger.info("Info message: %s", "test string");
        logger.verbose("Verbose message: %d", 1);
        logger.debug("Debug message: %b", false);
        logger.error("Error message: %g", 1.5f);
        logger.warn("Warning message");
    }
}