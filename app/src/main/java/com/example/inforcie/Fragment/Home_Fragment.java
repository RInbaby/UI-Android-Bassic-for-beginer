package com.example.inforcie.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.inforcie.Adapter.AdapterEvents;
import com.example.inforcie.Adapter.AdapterNews;
import com.example.inforcie.Adapter.MyImage;
import com.example.inforcie.Model.Events;
import com.example.inforcie.Model.Image;
import com.example.inforcie.Model.News;
import com.example.inforcie.R;

import java.util.ArrayList;

public class Home_Fragment extends Fragment {

        RecyclerView recyclerView, recyclerView2,recyclerView3;

        MyImage listAdapter;
        ArrayList<Image> contactsList = new ArrayList<>();

        // News
        AdapterNews listAdapter2;
        ArrayList<News> contactsList2 = new ArrayList<>();

        // Events
        AdapterEvents listAdapter3;
        ArrayList<Events> contactsList3 = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_, container, false);

        recyclerView = view.findViewById(R.id.rcvimg);
        recyclerView2 = view.findViewById(R.id.rcv2);
        recyclerView3 = view.findViewById(R.id.rcvevent);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        // for furture
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        listAdapter = new MyImage(contactsList, getContext());
        recyclerView.setAdapter(listAdapter);

        contactsList.add(new Image(R.drawable.list1, "May20,20", "The global ecomic impact of Covid"));
        contactsList.add(new Image(R.drawable.list2, "May11,11", "The global "));
        contactsList.add(new Image(R.drawable.list1, "May21,21", "ecomic impact of Covid"));
        contactsList.add(new Image(R.drawable.list1, "May20,20", " ecomic impact of "));
        contactsList.add(new Image(R.drawable.list2, "May20,20", "The  ecomic  of Covid"));
        contactsList.add(new Image(R.drawable.list1, "May20,20", "global ecomic  of "));
        listAdapter.notifyDataSetChanged();

    // for News
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        listAdapter2 = new AdapterNews(contactsList2, getContext());
        recyclerView2.setAdapter(listAdapter2);

        contactsList2.add(new News(R.drawable.list2, "May20,20", "The global ecomic impact of Covid"));
        contactsList2.add(new News(R.drawable.list1, "May11,11", "The global "));
        contactsList2.add(new News(R.drawable.list2, "May21,21", "ecomic impact of Covid"));
        contactsList2.add(new News(R.drawable.list1, "May20,20", " ecomic impact of "));
        contactsList2.add(new News(R.drawable.list2, "May20,20", "The  ecomic  of Covid"));
        contactsList2.add(new News(R.drawable.list1, "May20,20", "global ecomic  of "));
        listAdapter.notifyDataSetChanged();

        // For Events
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView3.setLayoutManager(layoutManager3);
        listAdapter3 = new AdapterEvents(contactsList3, getContext());
        recyclerView3.setAdapter(listAdapter3);

        contactsList3.add(new Events(R.drawable.list2, "May20,20", "The global ecomic impact of Covid"));
        contactsList3.add(new Events(R.drawable.list1, "May11,11", "The global "));
        contactsList3.add(new Events(R.drawable.list2, "May21,21", "ecomic impact of Covid"));
        contactsList3.add(new Events(R.drawable.list2, "May20,20", " ecomic impact of "));
        contactsList3.add(new Events(R.drawable.list1, "May20,20", "The  ecomic  of Covid"));
        contactsList3.add(new Events(R.drawable.list2, "May20,20", "global ecomic  of "));
        listAdapter.notifyDataSetChanged();





        return view;
    }
}