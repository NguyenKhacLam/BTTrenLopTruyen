package com.example.btbuoi8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.btbuoi8.adapters.StoryAdapter;
import com.example.btbuoi8.modals.Story;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, StoryAdapter.StoryListener {
    private Toolbar mToolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private RecyclerView recyclerView;
    private StoryAdapter storyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
    }

    private void initData(){
        ArrayList<Story> storiesData = new ArrayList<>();
        storiesData.add(new Story("Solo Leveling", R.drawable.solo, "Lam", 200, "Action", true, "21/12/2015","20/11/2020"));
        storiesData.add(new Story("Vua trộm mộ", R.drawable.king, "Trung", 200, "Action", true, "21/12/2015","20/11/2020"));
        storiesData.add(new Story("Dragon ball", R.drawable.dragonball, "Nhật bổn", 200, "Action", true, "21/12/2015","20/11/2020"));
        storiesData.add(new Story("Swort Art Online", R.drawable.sao, "Kirito", 20, "Action, Fantasy", false, "21/12/2015","20/11/2020"));
        storiesData.add(new Story("One Piece", R.drawable.one, "Luffy", 1000, "Action, Fantasy", false, "21/12/2015","20/11/2020"));
        storiesData.add(new Story("Re:Zero", R.drawable.one, "Rem", 5, "Action, Fantasy", false, "21/12/2015","20/11/2020"));
        storyAdapter.setStoriesData(storiesData);
    }

    private void initViews() {
        mToolbar = findViewById(R.id.mainToolbar);
        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                mToolbar,
                R.string.openNavDrawer,
                R.string.closeNavDrawer
        );

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        recyclerView = findViewById(R.id.rc_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        storyAdapter = new StoryAdapter(getLayoutInflater());
        storyAdapter.setListener(this);
        recyclerView.setAdapter(storyAdapter);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


    @Override
    public void onStoryItemClick(Story story) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("Name", story.getName());
        intent.putExtra("Author", story.getAuthor());
        intent.putExtra("Categories", story.getCategories());
        intent.putExtra("Image", story.getImage());
        intent.putExtra("Chapters", story.getChapter());
        intent.putExtra("UpdateAt", story.getUpdateAt());
        intent.putExtra("UploadDay", story.getUploadDate());
        intent.putExtra("Status", story.isStatus());
        intent.putExtra("Content", story.getContent());
        startActivity(intent);
    }
}