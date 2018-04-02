package com.example.admin.ch6_3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgBtn1,imgBtn2,imgBtn3; //宣告imagebutton變數
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step1
        imgBtn1 = (ImageButton)findViewById(R.id.imgBtn1); //找到ImageButton id為imgBtn1
        imgBtn2 = (ImageButton)findViewById(R.id.imgBtn2); //找到ImageButton id為imgBtn2
        imgBtn3 = (ImageButton)findViewById(R.id.imgBtn3); //找到ImageButton id為imgBtn3

        //Step2 建立OnClick的監聽事件
        imgBtn1.setOnClickListener(
                new View.OnClickListener(){ //匿名物件(沒有名稱)
                    public void onClick(View v){
                        imgBtn1.setImageResource(R.drawable.h11);
                    }
                }
        );
        imgBtn2.setOnClickListener(
                new View.OnClickListener(){ //匿名物件(沒有名稱)
                    public void onClick(View v){
                        imgBtn2.setImageResource(R.drawable.d8);
                    }
                }
        );
        imgBtn3.setOnClickListener(
                new View.OnClickListener(){ //匿名物件(沒有名稱)
                    public void onClick(View v){
                        imgBtn3.setImageResource(R.drawable.h7);
                    }
                }
        );
    }
}
