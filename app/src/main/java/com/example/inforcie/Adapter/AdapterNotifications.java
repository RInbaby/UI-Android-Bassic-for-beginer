package com.example.inforcie.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.inforcie.Model.Notifications;
import com.example.inforcie.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterNotifications extends RecyclerView.Adapter<AdapterNotifications.ContactHolder> {

    ArrayList<Notifications> notice;
    Context mContext;
    ItemClickListener onItemClick;

    public AdapterNotifications(ArrayList<Notifications> notice, Context context) {
        this.notice = notice;
        this.mContext = context;
    }

    @NonNull
    @Override
    public AdapterNotifications.ContactHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.customnotificatons, viewGroup, false);
        return new ContactHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactHolder contactHolder, int position) {

        final  Notifications notice2 = notice.get(position);
        contactHolder.setNotice(notice2.getNotice());
        contactHolder.setTime(notice2.getTime());

    }

    @Override
    public int getItemCount() {
        return notice == null ? 0 : notice.size();
    }

    public class ContactHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView notice;
        TextView time;


        public ContactHolder(View itemView) {
            super(itemView);
            notice = itemView.findViewById(R.id.notice);
            time = itemView.findViewById(R.id.time);

            itemView.setOnClickListener(this);
        }

        public void setNotice(String namee2) {
            notice.setText(namee2);

        }

        public void setTime(String namee1) {
            time.setText(namee1);
        }



        public void onClick(View v) {
            if (onItemClick != null) onItemClick.onItemClick(v, getAdapterPosition());

        }
    }
    public static class ItemClickListener {
        public void onItemClick(View v, int adapterPosition) {
        }
    }


}
