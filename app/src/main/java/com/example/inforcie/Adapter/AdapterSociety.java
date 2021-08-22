package com.example.inforcie.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.inforcie.Model.Image;
import com.example.inforcie.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterSociety extends RecyclerView.Adapter<AdapterSociety.ContactHolder> {

    ArrayList<Image> image;
    Context mContext;
    ItemClickListener onItemClick;

    public AdapterSociety(ArrayList<Image> image, Context context) {
        this.image = image;
        this.mContext = context;
    }

    @NonNull
    @Override
    public AdapterSociety.ContactHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.customsociety, viewGroup, false);
        return new ContactHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSociety.ContactHolder contactHolder, int position) {

        final  Image image2 = image.get(position);
        contactHolder.setImageView(image2.getImg());
        contactHolder.setName1(image2.getName1());
        contactHolder.setName2(image2.getName2());
    }

    @Override
    public int getItemCount() {
        return image == null ? 0 : image.size();
    }

    public class ContactHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView name1;
        TextView name2;

        public ContactHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imglist2);
            name1 = itemView.findViewById(R.id.date2);
            name2 = itemView.findViewById(R.id.note2);
            itemView.setOnClickListener(this);
        }
        public void setImageView(int imageView2) {
            imageView.setImageResource(imageView2);
        }

        public void setName1(String namee1) {
            name1.setText(namee1);
        }

        public void setName2(String namee2) {
            name2.setText(namee2);

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

