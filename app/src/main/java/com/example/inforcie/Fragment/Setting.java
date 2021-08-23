package com.example.inforcie.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.inforcie.R;

public class Setting extends Fragment {

    ImageView t1,t2,t3,t4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_setting, container, false);

        t1 = view.findViewById(R.id.t1);
        t2 = view.findViewById(R.id.t2);
        t3 = view.findViewById(R.id.t3);
        t4 = view.findViewById(R.id.t4);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nguyenkimdao1998.github.io/Web-LaTrobe/?fbclid=IwAR2nHYSAHbk1X4CZnY-Q_QZdkK8xy-pTIetgnbTicB6vL7B3ZY6adGOpB0U"));
             startActivity(intent);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nguyenkimdao1998.github.io/Web-LaTrobe/?fbclid=IwAR2nHYSAHbk1X4CZnY-Q_QZdkK8xy-pTIetgnbTicB6vL7B3ZY6adGOpB0U"));
                startActivity(intent);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nguyenkimdao1998.github.io/Web-LaTrobe/?fbclid=IwAR2nHYSAHbk1X4CZnY-Q_QZdkK8xy-pTIetgnbTicB6vL7B3ZY6adGOpB0U"));
                startActivity(intent);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nguyenkimdao1998.github.io/Web-LaTrobe/?fbclid=IwAR2nHYSAHbk1X4CZnY-Q_QZdkK8xy-pTIetgnbTicB6vL7B3ZY6adGOpB0U"));
                startActivity(intent);
            }
        });

        return view ;
    }

}