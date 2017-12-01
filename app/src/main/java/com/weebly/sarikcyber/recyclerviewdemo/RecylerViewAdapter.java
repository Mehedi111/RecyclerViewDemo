package com.weebly.sarikcyber.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dustu on 12/2/2017.
 */

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.ProductViewHolder> {

    Context context;
    List<Product> productList;

    public RecylerViewAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       LayoutInflater inflater = LayoutInflater.from(context);
       View v = inflater.inflate(R.layout.card_view, null);
       ProductViewHolder viewHolder = new ProductViewHolder(v);

        //LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        ////getting data for specific position
        Product product = productList.get(position);

        ////data binding to viewholder


        holder.textViewTitle.setText(product.getProductTitle());
        holder.textViewRating.setText(String.valueOf(product.getProductRating()));
        holder.textViewPrice.setText(Double.toString(product.getProductPrice()));
        //holder.imageViewProductImage.setImageDrawable(context.getResources().getDrawable(product.getProductImage()));


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewRating, textViewPrice;
        ImageView imageViewProductImage;

        public ProductViewHolder(View v) {
            super(v);

           textViewTitle = v.findViewById(R.id.textViewTitle);
           textViewPrice = v.findViewById(R.id.textViewPrice);
           textViewRating = v.findViewById(R.id.textViewRating);
           imageViewProductImage = v.findViewById(R.id.imageView);
        }
    }
}
