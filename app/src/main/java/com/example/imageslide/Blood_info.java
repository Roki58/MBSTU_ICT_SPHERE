package com.example.imageslide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Blood_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_info);
    }
    public void toolbarBack (View view){
        Intent intent = new Intent(Blood_info.this,MainActivity.class);
        startActivity(intent);
    }
    public void showStudent (View view){
        Intent intent;
        intent = new Intent(Blood_info.this,showInfo2.class);
        if (view.getId()==R.id.cardView_1_ID){
            intent.putExtra("tag2","A+");
            startActivity(intent);
        }
        else if (view.getId()==R.id.cardView_2_ID){
            intent.putExtra("tag2","A-");
            startActivity(intent);
        }
        else if (view.getId()==R.id.cardView_3_ID){
            intent.putExtra("tag2","B+");
            startActivity(intent);
        }
        else if (view.getId()==R.id.cardView_4_ID){
            intent.putExtra("tag2","B-");
            startActivity(intent);
        }
        else if (view.getId()==R.id.cardView_5_ID){
            intent.putExtra("tag2","O+");
            startActivity(intent);
        }
        else if (view.getId()==R.id.cardView_6_ID){
            intent.putExtra("tag2","O-");
            startActivity(intent);
        }
        else if (view.getId()==R.id.cardView_7_ID){
            intent.putExtra("tag2","AB+");
            startActivity(intent);
        }
        else if (view.getId()==R.id.cardView_8_ID){
            intent.putExtra("tag2","AB-");
            startActivity(intent);
        }


    }

}