package com.example.AttractionsCanada.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.AttractionsCanada.CanadaAttraction;
import com.example.AttractionsCanada.Ui.AttractionDetailsActivity;
import com.example.countrylistrecyclerview.R;

import java.util.ArrayList;

public class placesAdapter extends RecyclerView.Adapter<placesAdapter.CountryViewHolder>
{


    ArrayList<CanadaAttraction> canadaAttractionArrayList;
    private ArrayList<String> mImages = new ArrayList<>();
    private Context mContext;

    public placesAdapter(ArrayList<CanadaAttraction> canadaAttractionArrayList , ArrayList<String> mImages,Context mContext) {

        this.canadaAttractionArrayList = canadaAttractionArrayList;
        this.mImages = mImages;
        this.mContext = mContext;

    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.placesitem, parent, false);
       CountryViewHolder mCountryViewHolder = new CountryViewHolder(mView);
       return mCountryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final placesAdapter.CountryViewHolder holder, final int position)
    {

        CanadaAttraction mCanadaAttraction = this.canadaAttractionArrayList.get(position);
        holder.txtName.setText(mCanadaAttraction.getPlaceName());
        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.imgPlace);
       // holder.imgPlace.setImageResource(mCanadaAttraction.getPlaceImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                CanadaAttraction c = canadaAttractionArrayList.get(position);
                Toast.makeText(holder.itemView.getContext(), "C : " + c.getPlaceName(), Toast.LENGTH_SHORT).show();
                Log.d("CLICK", "hello");

                Intent mIntent = new Intent(holder.itemView.getContext(), AttractionDetailsActivity.class);
                mIntent.putExtra("object",c);
                holder.itemView.getContext().startActivity(mIntent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return this.canadaAttractionArrayList.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;
        ImageView imgPlace;

        public CountryViewHolder(@NonNull View itemView)
        {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtCN);
            imgPlace = itemView.findViewById(R.id.imgPlace);
        }
    }
}
