package com.example.android.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sam on 11/18/2017.
 */

public class ChildActivity extends AppCompatActivity {

    public static final String NAME_ENTRY_VALUE_EXTRA = "NAME_ENTRY_VALUE_EXTRA";

    private TextView mDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplayTextView = (TextView) findViewById(R.id.tv_display);

        Intent intent = getIntent();
        mDisplayTextView.setText(intent.getStringExtra(NAME_ENTRY_VALUE_EXTRA));
    }
}
