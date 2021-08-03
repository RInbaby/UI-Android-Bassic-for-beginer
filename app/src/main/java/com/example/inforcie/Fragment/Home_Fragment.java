package com.example.inforcie.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.inforcie.Adapter.MyImage;
import com.example.inforcie.Model.Image;
import com.example.inforcie.R;

import java.util.ArrayList;

public class Home_Fragment extends Fragment {

        RecyclerView recyclerView;
        MyImage listAdapter;
        ArrayList<Image> contactsList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_, container, false);

        recyclerView = view.findViewById(R.id.rcvimg);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);
        listAdapter = new MyImage(contactsList, getContext());
        recyclerView.setAdapter(listAdapter);

        contactsList.add(new Image(R.drawable.quochuy, "May20,20", "The global ecomic impact of Covid"));
        contactsList.add(new Image(R.drawable.quochuy, "May11,11", "The global "));
        contactsList.add(new Image(R.drawable.quochuy, "May21,21", "ecomic impact of Covid"));
        contactsList.add(new Image(R.drawable.quochuy, "May20,20", " ecomic impact of "));
        contactsList.add(new Image(R.drawable.quochuy, "May20,20", "The  ecomic  of Covid"));
        contactsList.add(new Image(R.drawable.quochuy, "May20,20", "global ecomic  of "));
        listAdapter.notifyDataSetChanged();


        return view;
    }
}