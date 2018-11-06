package com.example.pazu.chagnepages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page2Fragment extends Fragment {
    Button goToPage1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view_page2 = inflater.inflate(R.layout.fragment_page2, container, false);
        goToPage1 = view_page2.findViewById(R.id.goToPage1);
        goToPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Page1Fragment page1Fragment = new Page1Fragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.container, page1Fragment);
                ft.commit();
            }
        });
        return view_page2;
    }

}
