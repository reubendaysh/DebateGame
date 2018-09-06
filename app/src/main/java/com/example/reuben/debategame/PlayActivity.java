package com.example.reuben.debategame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == android.R.id.home)
        {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void main(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void judge(View view) {
       Intent intent = new Intent(this, JudgeActivity.class);
        startActivity(intent);
    }

    public void find(View view) {
        Intent intent = new Intent(this, FindActivity.class);
        startActivity(intent);

    }

    public void loading(View view) {
        Intent intent = new Intent(this, LoadingActivity.class);
        startActivity(intent);

    }


}
