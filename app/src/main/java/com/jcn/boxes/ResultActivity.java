package com.jcn.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView Txtitem;
    TextView Txtdimention;
    TextView Txtprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Findviews();
        Intent intent = getIntent();
        int type = intent.getIntExtra("TYPE",0);
        if(type == 1){
            float length = intent.getFloatExtra("BOX3_L",0);
            float height = intent.getFloatExtra("BOX3_H",0);
            float width = intent.getFloatExtra("BOX3_W",0);
            int price = intent.getIntExtra("BOX3_P",0);
            Txtitem.setText("Box3");
            Txtdimention.setText("Dimension: "+length+"/ "+width+"/"+height+" cm");
            Txtprice.setText("Price:"+price);
        }else if(type ==2){
            float length = intent.getFloatExtra("BOX5_L",0);
            float height = intent.getFloatExtra("BOX5_H",0);
            float width = intent.getFloatExtra("BOX5_W",0);
            int price = intent.getIntExtra("BOX5_P",0);
            Txtitem.setText("Box5");
            Txtdimention.setText("Dimension: "+length+"/ "+width+"/"+height+" cm");
            Txtprice.setText("Price:"+price);
        }

    }
    public void Findviews(){
        Txtdimention = findViewById(R.id.txt_dimention);
        Txtitem = findViewById(R.id.txt_item);
        Txtprice = findViewById(R.id.txt_price);
    }
}
