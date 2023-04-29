package com.ananas.realappwithseveralactivityes_codeoffuture_module4_4;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SeasonAdapter extends RecyclerView.Adapter<SeasonAdapter.ViewHolder>{

    private final List<Season> seasons;
    private final LayoutInflater inflater;

    public SeasonAdapter(List<Season> seasons, Context context) {
        this.seasons = seasons;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Season season = seasons.get(position);

        holder.seasonView.setImageResource(season.getSeasonRes());
        holder.nameView.setText(season.getName());
        holder.seasonDesView.setText(season.getSeasonDescription());
    }

    @Override
    public int getItemCount() {
        return seasons.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView seasonView;
        final TextView nameView;
        final TextView seasonDesView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

                seasonView = itemView.findViewById(R.id.imageViewSeason);
                nameView = itemView.findViewById(R.id.tvName);
                seasonDesView = itemView.findViewById(R.id.tvDescription);

        }
    }
}
