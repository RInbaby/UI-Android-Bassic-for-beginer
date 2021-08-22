package com.example.inforcie.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.inforcie.Adapter.AdapterNews;
import com.example.inforcie.Model.News;
import com.example.inforcie.R;

import java.util.ArrayList;

public class ListItem1 extends Fragment {

    RecyclerView  recyclerView2;
    LinearLayout linearLayout;
    ImageButton imgbt;

    // News
    AdapterNews listAdapter2;
    ArrayList<News> contactsList2 = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_list_item1, container, false);
        recyclerView2 = view.findViewById(R.id.rcv2);
        linearLayout = view.findViewById(R.id.listiem);
        imgbt = view.findViewById(R.id.imgbt);

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

        listAdapter2.notifyDataSetChanged();
        imgbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Intent intent = new Intent(Home_Fragment.this, ListItem1.class);
                //linearrr.setVisibility(View.VISIBLE);
                loadFragment(new Home_Fragment());

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