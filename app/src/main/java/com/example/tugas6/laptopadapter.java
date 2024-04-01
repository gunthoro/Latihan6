package com.example.tugas6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class laptopadapter extends RecyclerView.Adapter<laptopadapter.ViewHolder> {

    private ArrayList<modellaptop> modellaptops;
    private OnItemClickListener listener;

    public laptopadapter(ArrayList<modellaptop> modellaptops) {
        this.modellaptops = modellaptops;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.namalaptop.setText(modellaptops.get(position).getNamalaptop());
        holder.gambarlaptop.setImageResource(modellaptops.get(position).getGambarlaptop());
    }

    @Override
    public int getItemCount() {
        return modellaptops.size();
    }

    public interface OnItemClickListener {
        void onItemClick(modellaptop model);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView namalaptop;
        ImageView gambarlaptop;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namalaptop = itemView.findViewById(R.id.nama_laptop);
            gambarlaptop = itemView.findViewById(R.id.gambar_laptop);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(modellaptops.get(position));
                }
            }
        }
    }
}
