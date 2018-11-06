package com.example.pazu.chagnepages;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
public class Page1Fragment extends Fragment{
    private FragmentManager fmgr;
    private FragmentTransaction fragmentTransaction;
    private Button goToPage2;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment_page1 =   inflater.inflate(R.layout.fragment_page1, container, false);
        goToPage2 = fragment_page1.findViewById(R.id.goToPage2);
        goToPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Page2Fragment page2Fragment = new Page2Fragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.container, page2Fragment);
                ft.commit();
            }
        });
        return fragment_page1;
    }



}
