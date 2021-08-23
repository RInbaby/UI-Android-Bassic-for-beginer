package com.example.inforcie.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.inforcie.Activity.Bottom_Home;
import com.example.inforcie.Activity.MainActivity;
import com.example.inforcie.Adapter.AdapterEvents;
import com.example.inforcie.Adapter.AdapterNews;
import com.example.inforcie.Adapter.AdapterSociety;
import com.example.inforcie.Adapter.MyImage;
import com.example.inforcie.Model.Events;
import com.example.inforcie.Model.Image;
import com.example.inforcie.Model.News;
import com.example.inforcie.R;

import java.util.ArrayList;

public class Home_Fragment extends Fragment {

        RecyclerView recyclerView, recyclerView2,recyclerView3,recyclerView4,recyclerView5;
        RecyclerView std, std2;
        ImageView img;
        LinearLayout item1,list_item1;
        Button see1,see2;

        MyImage listAdapter;
        ArrayList<Image> contactsList = new ArrayList<>();

        // News
        AdapterNews listAdapter2;
        ArrayList<News> contactsList2 = new ArrayList<>();

        // Events
        AdapterEvents listAdapter3;
        ArrayList<Events> contactsList3 = new ArrayList<>();

        // society
        AdapterSociety listAdapter4;
        ArrayList<Image> contactsList4 = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_, container, false);
        recyclerView = view.findViewById(R.id.rcvimg);
        recyclerView2 = view.findViewById(R.id.rcv2);
        recyclerView3 = view.findViewById(R.id.rcvevent);
        recyclerView4 = view.findViewById(R.id.society);
        recyclerView5 = view.findViewById(R.id.society2);
        std = view.findViewById(R.id.student);
        std2 = view.findViewById(R.id.student2);

        img = view.findViewById(R.id.iv_clear_text);
        item1 = view.findViewById(R.id.item1);
        list_item1 = view.findViewById(R.id.list_item1);

        see1 = view.findViewById(R.id.see1);
        see2 = view.findViewById(R.id.see2);
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
        contactsList2.add(new News(R.drawable.item4, "May20,20", "The global ecomic impact of Covid"));
        contactsList2.add(new News(R.drawable.item1, "May11,11", "The global "));
        contactsList2.add(new News(R.drawable.item4, "May21,21", "ecomic impact of Covid"));
        contactsList2.add(new News(R.drawable.item3, "May20,20", " ecomic impact of "));
        contactsList2.add(new News(R.drawable.item2, "May20,20", "The  ecomic  of Covid"));
        contactsList2.add(new News(R.drawable.item1, "May20,20", "global ecomic  of "));
        contactsList2.add(new News(R.drawable.item3, "May21,21", "ecomic impact of Covid"));
        contactsList2.add(new News(R.drawable.item2, "May21,21", "ecomic impact of Covid"));
        contactsList2.add(new News(R.drawable.item4, "May21,21", "ecomic impact of Covid"));
        contactsList2.add(new News(R.drawable.item1, "May21,21", "ecomic impact of Covid"));
        contactsList2.add(new News(R.drawable.item3, "May20,20", " ecomic impact of jdfbwbvsdhb"));
        contactsList2.add(new News(R.drawable.item1, "May20,20", " ecomic impact of "));
        contactsList2.add(new News(R.drawable.item2, "May20,20", " ecomic impact of "));
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

        // for society
        LinearLayoutManager layoutManager4 = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView4.setLayoutManager(layoutManager4);
        listAdapter4 = new AdapterSociety(contactsList4, getContext());
        recyclerView4.setAdapter(listAdapter4);

        contactsList4.add(new Image(R.drawable.list1, "May20,20", "The global ecomic impact of Covid"));
        contactsList4.add(new Image(R.drawable.list2, "May11,11", "The global "));
        contactsList4.add(new Image(R.drawable.list1, "May21,21", "ecomic impact of Covid"));
        contactsList4.add(new Image(R.drawable.list1, "May20,20", " ecomic impact of "));
        contactsList4.add(new Image(R.drawable.list2, "May20,20", "The  ecomic  of Covid"));
        contactsList4.add(new Image(R.drawable.list1, "May20,20", "global ecomic  of "));
        listAdapter4.notifyDataSetChanged();

        // for society2
        LinearLayoutManager layoutManager5 = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView5.setLayoutManager(layoutManager5);
        listAdapter4 = new AdapterSociety(contactsList4, getContext());
        recyclerView5.setAdapter(listAdapter4);

        contactsList4.add(new Image(R.drawable.list1, "May20,20", "The global ecomic impact of Covid"));
        contactsList4.add(new Image(R.drawable.list2, "May11,11", "The global "));
        contactsList4.add(new Image(R.drawable.list1, "May21,21", "ecomic impact of Covid"));
        contactsList4.add(new Image(R.drawable.list1, "May20,20", " ecomic impact of "));
        contactsList4.add(new Image(R.drawable.list2, "May20,20", "The  ecomic  of Covid"));
        contactsList4.add(new Image(R.drawable.list1, "May20,20", "global ecomic  of "));
        listAdapter4.notifyDataSetChanged();


        // For student
        LinearLayoutManager layoutManager6 = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        std.setLayoutManager(layoutManager6);
        listAdapter4 = new AdapterSociety(contactsList4, getContext());
        std.setAdapter(listAdapter4);

        contactsList4.add(new Image(R.drawable.list1, "May20,20", "The global ecomic impact of Covid"));
        contactsList4.add(new Image(R.drawable.list2, "May11,11", "The global "));
        contactsList4.add(new Image(R.drawable.list1, "May21,21", "ecomic impact of Covid"));
        contactsList4.add(new Image(R.drawable.list1, "May20,20", " ecomic impact of "));
        contactsList4.add(new Image(R.drawable.list2, "May20,20", "The  ecomic  of Covid"));
        contactsList4.add(new Image(R.drawable.list1, "May20,20", "global ecomic  of "));
        listAdapter4.notifyDataSetChanged();

        // for student2
        LinearLayoutManager layoutManager7= new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        std2.setLayoutManager(layoutManager7);
        listAdapter4 = new AdapterSociety(contactsList4, getContext());
        std2.setAdapter(listAdapter4);

        contactsList4.add(new Image(R.drawable.list1, "May20,20", "The global ecomic impact of Covid"));
        contactsList4.add(new Image(R.drawable.list2, "May11,11", "The global "));
        contactsList4.add(new Image(R.drawable.list1, "May21,21", "ecomic impact of Covid"));
        contactsList4.add(new Image(R.drawable.list1, "May20,20", " ecomic impact of "));
        contactsList4.add(new Image(R.drawable.list2, "May20,20", "The  ecomic  of Covid"));
        contactsList4.add(new Image(R.drawable.list1, "May20,20", "global ecomic  of "));
        listAdapter4.notifyDataSetChanged();


        // custom button
        //search
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //linearrr.setVisibility(View.VISIBLE);
                loadFragment(new ListItem1());

            }
        });

        // img_feature
        see1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //linearrr.setVisibility(View.VISIBLE);
                loadFragment(new ListItem1());

            }
        });

        see2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //linearrr.setVisibility(View.VISIBLE);
                loadFragment(new ListItem1());

            }
        });

        return view;
    }
    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = this.getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.homefragment, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

}
