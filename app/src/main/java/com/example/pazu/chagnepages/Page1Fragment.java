package com.example.pazu.chagnepages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page1Fragment extends Fragment implements View.OnClickListener {
    private FragmentManager fmgr;
    private FragmentTransaction fragmentTransaction;

    public Page1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page1, container, false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.goToPage2:

                Fragment page2Fragment = new Page2Fragment();

                fragmentTransaction.replace(R.id.container, page2Fragment);
                fragmentTransaction = fmgr.beginTransaction();
                
                fragmentTransaction.commit();
        }
    }
}
