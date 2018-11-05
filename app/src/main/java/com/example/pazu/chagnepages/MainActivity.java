package com.example.pazu.chagnepages;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private FragmentTransaction fragmentTransaction;
    private ViewGroup container;
    private Fragment page1Fragment, page2Fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (ViewGroup) findViewById(R.id.container);

        fmgr = getSupportFragmentManager();

        page1Fragment = new Page1Fragment();
        page2Fragment = new Page2Fragment();

        fragmentTransaction = fmgr.beginTransaction();

        fragmentTransaction.add(R.id.container, page1Fragment);

        fragmentTransaction.commit();
    }
}
