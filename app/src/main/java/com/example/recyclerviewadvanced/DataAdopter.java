package com.example.recyclerviewadvanced;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdopter extends RecyclerView.Adapter<DataAdopter.DataViewHolder> {
    private List<Data> datas;

    public DataAdopter(List<Data> datas) {
        this.datas = datas;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_grid_view,null);
        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
    Data data = datas.get(position);
    holder.imageView.setImageResource(data.getImageResourceId());
    holder.tvnam.setText(data.getName());
    holder.tvlik.setText(data.getLike());
    holder.tvmb.setText(data.getmB());

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class DataViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvnam,tvlik,tvmb;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img);
            tvnam = itemView.findViewById(R.id.tvname);
            tvlik = itemView.findViewById(R.id.tvlikes);
            tvmb = itemView.findViewById(R.id.tvmb);

        }
    }
}
