package com.fryanramzkhar.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void btnPagi(View view){
        Intent pindah = new Intent(this, DzikirPagiActivity.class);
        startActivity(pindah);
    }


}
