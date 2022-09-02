package com.nicomot.databindingone.adapter;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.adapters.AdapterViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.nicomot.databindingone.R;
import com.nicomot.databindingone.databinding.LayoutadapterBinding;

import java.util.ArrayList;
import java.util.List;

public class adapterTest extends RecyclerView.Adapter<adapterTest.ViewHolder> {

    List<String> listData = new ArrayList<>();

    public adapterTest(List<String> listData) {
        this.listData = listData;
    }

    @Override
    public adapterTest.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        LayoutAdapter layoutadapterBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layoutadapter, parent, false);
        return new ViewHolder(layoutadapterBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterTest.ViewHolder holder, int position) {
        holder.bindView(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
        public class ViewHolder extends RecyclerView.ViewHolder{

        LayoutadapterBinding layoutadapterBinding;
        public ViewHolder(@NonNull LayoutadapterBinding layoutadapterBinding){
            super(layoutadapterBinding.getRoot());
            layoutadapterBinding.getRoot();

        }

        public void bindView(String text){
            layoutadapterBinding.setTextName(text);
        }
    }

}
