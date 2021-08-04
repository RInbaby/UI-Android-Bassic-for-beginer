package com.example.inforcie.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.inforcie.Model.Events;
import com.example.inforcie.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterEvents extends RecyclerView.Adapter<AdapterEvents.ContactHolder> {

    ArrayList<Events> news;
    Context mContext;
    ItemClickListener onItemClick;

    public AdapterEvents(ArrayList<Events> news, Context context) {
        this.news = news;
        this.mContext = context;
    }

    @NonNull
    @Override
    public AdapterEvents.ContactHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.customnews, viewGroup, false);
        return new ContactHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactHolder contactHolder, int position) {

        final  Events news2 = news.get(position);
        contactHolder.setImageView(news2.getImg());
        contactHolder.setName2(news2.getName2());
        contactHolder.setName1(news2.getName1());

    }

    @Override
    public int getItemCount() {
        return news == null ? 0 : news.size();
    }

    public class ContactHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView name2;
        TextView name1;


        public ContactHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imglist2);
            name2 = itemView.findViewById(R.id.note2);
            name1 = itemView.findViewById(R.id.date2);

            itemView.setOnClickListener(this);
        }
        public void setImageView(int imageView2) {
            imageView.setImageResource(imageView2);
        }

        public void setName2(String namee2) {
            name2.setText(namee2);

        }

        public void setName1(String namee1) {
            name1.setText(namee1);
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
