package com.prayan_it.nari;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Remainder extends Fragment {

Button remainderOnBtn,remainderOFFBtn;
    public Remainder() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_remainder, container, false);
        remainderOnBtn = (Button)view.findViewById(R.id.remainderBtn);
        remainderOFFBtn = (Button)view.findViewById(R.id.remainderOffBtn);
        remainderOnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(),setRemainder.class);
                startActivity(intent);
            }
        });
        remainderOFFBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(),offRemainder.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
