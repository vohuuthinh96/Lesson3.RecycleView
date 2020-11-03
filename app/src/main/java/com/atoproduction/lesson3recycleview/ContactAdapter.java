package com.atoproduction.lesson3recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by : Thinhvh on 11/3/2020
 * Phone      : 0962890153 - 0398477967
 * Facebook   : https://www.facebook.com/thinh.super22
 * Skype      : https://join.skype.com/invite/fvfRTDLcGPJN
 * Mail       : thinhvhph04204@gmail.com
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewholder> {
    private Context mContext;
    private ArrayList<Contact> mContactArrayList;

    public ContactAdapter(Context context, ArrayList<Contact> contactArrayList) {
        mContext = context;
        mContactArrayList = contactArrayList;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_contact, parent, false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        Contact contact = mContactArrayList.get(position);
        holder.tvname.setText(contact.getName());
        holder.tvPhoneNumber.setText(contact.getPhone());
    }

    @Override
    public int getItemCount() {
        return mContactArrayList.size();
    }

    class MyViewholder extends RecyclerView.ViewHolder {
        private TextView tvname;
        private TextView tvPhoneNumber;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            tvname = itemView.findViewById(R.id.tv_name);
            tvPhoneNumber = itemView.findViewById(R.id.tv_phone_number);
        }
    }
}
