package com.example.svasilovski.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends BaseAdapter {

    private List<Product> lstProduct;

    public ProductAdapter(List<Product> lstProduct) {
        this.lstProduct = lstProduct;
    }

    @Override
    public int getCount() {
        return lstProduct.size();
    }

    @Override
    public Object getItem(int position) {
        return lstProduct.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cells_product,parent,false);

        Product product = (Product)getItem(position);
        TextView id=(TextView)view.findViewById(R.id.txtViewId);
        TextView name=(TextView)view.findViewById(R.id.txtViewName);

        id.setText(Integer.toString(product.getId()));
        name.setText(product.getName());

        return view;
    }
}
