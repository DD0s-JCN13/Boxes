package com.jcn.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    String Box3;
    String Box5;
    float b3l = 23f;
    float b3w = 14f;
    float b3h = 13f;
    int b3p = 65;
    float b5l =  39.5f;
    float b5h = 27.5f;
    float b5w = 23f;
    int b5p = 90;
    int dataout = 0;
    EditText edLenght;
    EditText edWidth;
    EditText edHeigth;

    public void Findviews(){
        edLenght = findViewById(R.id.ed_length);
        edHeigth = findViewById(R.id.ed_height);
        edWidth = findViewById(R.id.ed_width);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Findviews();

    }


    public void Boxes(View v){
        String lenght = edLenght.getText().toString();
        String height = edHeigth.getText().toString();
        String width = edWidth.getText().toString();
        Float l = Float.parseFloat(lenght);
        Float h = Float.parseFloat(height);
        Float w = Float.parseFloat(width);

        if(l<=b3l){
            if(h<=b3h){
                if(w<=b3w){
                    dataout = 1;
                }else if(w<=b5w){
                    dataout = 2;
                }
            }else if(h<=b5h){
                dataout = 2;
            }
        }else if(l<=b5l){
            dataout = 2;
        }
        Intent intent = new Intent(this,ResultActivity.class);
        if(dataout==1){
            intent.putExtra("BOX3_L",b3l);
            intent.putExtra("BOX3_W",b3w);
            intent.putExtra("BOX3_H",b3h);
            intent.putExtra("BOX3_P",b3p);
            intent.putExtra("TYPE",dataout);
        }else if (dataout==2){
            intent.putExtra("BOX5_L",b5l);
            intent.putExtra("BOX5_W",b5w);
            intent.putExtra("BOX5_H",b5h);
            intent.putExtra("BOX5_P",b5p);
            intent.putExtra("TYPE",dataout);
        }
        startActivity(intent);



    }

}
