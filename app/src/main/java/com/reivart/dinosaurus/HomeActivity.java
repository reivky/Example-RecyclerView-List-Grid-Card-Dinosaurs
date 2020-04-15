package com.reivart.dinosaurus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import java.util.ArrayList;
import AdapterPackage.CardViewDinoAdapter;
import AdapterPackage.GridDinoAdapter;
import AdapterPackage.ListDinoAdapter;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView rvDino;
    private ArrayList<Dino> list = new ArrayList<>();
    private String title = "Mode List";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setActionBarTitle(title);
        rvDino = findViewById(R.id.rv_dino);
        rvDino.setHasFixedSize(true);
        list.addAll(DinoData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvDino.setLayoutManager(new LinearLayoutManager(this));
        ListDinoAdapter listDinoAdapter = new ListDinoAdapter(list);
        rvDino.setAdapter(listDinoAdapter);

        listDinoAdapter.setOnItemClickCallback(new ListDinoAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Dino data) {
                showSelectedDino(data);
            }
        });
    }
    private void showRecyclerGrid() {
        rvDino.setLayoutManager(new GridLayoutManager(this, 2));
        GridDinoAdapter gridDinoAdapter = new GridDinoAdapter(list);
        rvDino.setAdapter(gridDinoAdapter);

        gridDinoAdapter.setOnItemClickCallback(new GridDinoAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Dino data) {
                showSelectedDino(data);
            }
        });
    }
    private void showRecyclerCardView() {
        rvDino.setLayoutManager(new LinearLayoutManager(this));
        CardViewDinoAdapter cardViewDinoAdapter = new CardViewDinoAdapter(list);
        rvDino.setAdapter(cardViewDinoAdapter);
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
    private void showSelectedDino(Dino dino) {
        Toast.makeText(this, "Kamu memilih " + dino.getName(), Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }
}