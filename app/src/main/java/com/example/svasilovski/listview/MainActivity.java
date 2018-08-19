package com.example.svasilovski.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Product> lstProduct;
    private ListView listViewProduct;
    private ListView listViewDetail;
    private ProductAdapter adapterProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewProduct = (ListView)findViewById(R.id.listView);
        listViewDetail = (ListView)findViewById(R.id.listViewDetail);

        listViewProduct.setVisibility(View.VISIBLE);
        listViewDetail.setVisibility(View.GONE);

        loadList();
    }

    private void loadList(){
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product(1,"Teclado ingles","Teclado de computadora"));
        lstProduct.add(new Product(2,"Monitor Sony","Monitor de computadora"));
        lstProduct.add(new Product(3,"Mother asus","Mother de computadora"));
        lstProduct.add(new Product(4,"Mother acer","Mother de computadora"));
        lstProduct.add(new Product(5,"Mother astock","Mother de computadora"));
        lstProduct.add(new Product(6,"Monitor Samsung","Monitor de computadora"));
        lstProduct.add(new Product(7,"Impresora Color","Impresora de computadora"));
        lstProduct.add(new Product(8,"Impresora B&W","Impresora 2 de computadora"));
        lstProduct.add(new Product(9,"Mouse genius","Mouse 1 de computadora"));
        lstProduct.add(new Product(10,"Mouse Logitech","Mouse 2 de computadora"));
        lstProduct.add(new Product(11,"Teclado ingles","Teclado de computadora"));
        lstProduct.add(new Product(12,"Monitor Sony","Monitor de computadora"));
        lstProduct.add(new Product(13,"Mother asus","Mother de computadora"));
        lstProduct.add(new Product(14,"Mother acer","Mother de computadora"));
        lstProduct.add(new Product(15,"Mother astock","Mother de computadora"));
        lstProduct.add(new Product(16,"Monitor Samsung","Monitor de computadora"));
        lstProduct.add(new Product(17,"Impresora Color","Impresora de computadora"));
        lstProduct.add(new Product(18,"Impresora B&W","Impresora 2 de computadora"));
        lstProduct.add(new Product(19,"Mouse genius","Mouse 1 de computadora"));
        lstProduct.add(new Product(20,"Mouse Logitech","Mouse 2 de computadora"));
        lstProduct.add(new Product(21,"Teclado ingles","Teclado de computadora"));
        lstProduct.add(new Product(22,"Monitor Sony","Monitor de computadora"));
        lstProduct.add(new Product(23,"Mother asus","Mother de computadora"));
        lstProduct.add(new Product(24,"Mother acer","Mother de computadora"));
        lstProduct.add(new Product(25,"Mother astock","Mother de computadora"));
        lstProduct.add(new Product(26,"Monitor Samsung","Monitor de computadora"));
        lstProduct.add(new Product(27,"Impresora Color","Impresora de computadora"));
        lstProduct.add(new Product(28,"Impresora B&W","Impresora 2 de computadora"));
        lstProduct.add(new Product(29,"Mouse genius","Mouse 1 de computadora"));

        //adapterProduct.notifyDataSetChanged();
        adapterProduct = new ProductAdapter(lstProduct);
        listViewProduct.setAdapter(adapterProduct);

        listViewProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // @todo
                Product product = (Product) parent.getAdapter().getItem(position);

                listViewProduct.setVisibility(View.GONE);
                listViewDetail.setVisibility(View.VISIBLE);
                ProductDetailAdapter prductDetail = new ProductDetailAdapter(product);
                listViewDetail.setAdapter(prductDetail);
            }
        });

        listViewDetail.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // @todo
                listViewProduct.setVisibility(View.VISIBLE);
                listViewDetail.setVisibility(View.GONE);
            }
        });
    }
}
