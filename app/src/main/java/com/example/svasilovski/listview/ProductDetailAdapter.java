package com.example.svasilovski.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ProductDetailAdapter extends BaseAdapter {

    Product product;

    public ProductDetailAdapter(Product product) {
        this.product = product;
    }

    @Override
    public int getCount() {
        return product!=null?1:0;
    }

    @Override
    public Object getItem(int position) {
        return product;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cells_product_detail,parent,false);

        Product product = (Product)getItem(position);
        TextView id=(TextView)view.findViewById(R.id.txtViewId);
        TextView name=(TextView)view.findViewById(R.id.txtViewName);
        TextView description=(TextView)view.findViewById(R.id.txtViewDescription);

        id.setText(Integer.toString(product.getId()));
        name.setText(product.getName());
        description.setText(product.getDescription());

        return view;
    }
}
