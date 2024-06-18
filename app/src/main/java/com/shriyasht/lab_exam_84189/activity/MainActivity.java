package com.shriyasht.lab_exam_84189.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shriyasht.lab_exam_84189.R;
import com.shriyasht.lab_exam_84189.adapter.FlatListAdapter;
import com.shriyasht.lab_exam_84189.daos.AppDatabase;
import com.shriyasht.lab_exam_84189.entity.FlatOwner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolBar;
    RecyclerView recyclerView;
    FlatListAdapter flatListAdapter;
    List<FlatOwner> flatOwnerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolBar = findViewById(R.id.toolBar);
        recyclerView = findViewById(R.id.recyclerView);
        setSupportActionBar(toolBar);
        recyclerView = findViewById(R.id.recyclerView);
        flatOwnerList = new ArrayList<>();
        flatListAdapter= new FlatListAdapter(this,flatOwnerList);
        recyclerView.setAdapter(flatListAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
    }

    @Override
    protected void onStart() {
        super.onStart();
        getData();

    }

    private void getData() {
        flatOwnerList = AppDatabase.getInstance(this).flatOwnerDao().getAllFlatOwners();
        flatListAdapter.setFlatOwnerList(flatOwnerList);
        flatListAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Add").setIcon(R.drawable.add).setShowAsAction(1);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(this, FlatInputActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}