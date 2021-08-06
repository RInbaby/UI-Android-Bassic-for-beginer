package com.example.inforcie.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.inforcie.Adapter.AdapterNotifications;
import com.example.inforcie.Adapter.MyImage;
import com.example.inforcie.Model.Image;
import com.example.inforcie.Model.Notifications;
import com.example.inforcie.R;

import java.util.ArrayList;

public class Notificators extends Fragment {

    RecyclerView recyclerView;
    AdapterNotifications listAdapter;
    ArrayList<Notifications> contactsList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_notificators, container, false);

        recyclerView = view.findViewById(R.id.rcvnoti);
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        listAdapter = new AdapterNotifications(contactsList, getContext());
        recyclerView.setAdapter(listAdapter);

        contactsList.add(new Notifications("The global ecomic impact of Covid", "1h ago "));
        contactsList.add(new Notifications("The global ", "20 mins"));
        contactsList.add(new Notifications( "ecomic impact of", "30 mins "));
        contactsList.add(new Notifications("ecomic impact of Covid1", "2h ago"));
        contactsList.add(new Notifications( "ecomic impact of", "30 mins "));
        contactsList.add(new Notifications("The  ecomic  of Covid", "2 mins"));
        contactsList.add(new Notifications( "ecomic impact of", "30 mins "));

        listAdapter.notifyDataSetChanged();

        return  view;
    }
}