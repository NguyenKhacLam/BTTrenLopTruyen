package com.example.btbuoi8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private Toolbar dToolbar;
    private TextView name, author, categories, status, chapters, upload, update, content;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dToolbar = findViewById(R.id.detailToolbar);
        dToolbar.setTitle("");
        setSupportActionBar(dToolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        name = findViewById(R.id.d_name);
        author = findViewById(R.id.d_author);
        categories = findViewById(R.id.d_cate);
        status = findViewById(R.id.d_status);
        chapters = findViewById(R.id.d_chapters);
        update = findViewById(R.id.d_update);
        upload = findViewById(R.id.d_upload);
        content = findViewById(R.id.d_content);
        img = findViewById(R.id.d_img);

        Bundle extras = getIntent().getExtras();

        name.setText(extras.getString("Name"));
        author.setText("Tác giả: " + extras.getString("Author"));
        categories.setText("Thể loại: " + extras.getString("Categories"));
        status.setText("Trạng thái: " + (extras.getBoolean("Status") ? "Hoàn thành" : "Chưa hoàn thành"));
        chapters.setText("Số chương: " + extras.getInt("Chapters"));
        upload.setText("Ngày up: " + extras.getString("UploadDay"));
        update.setText("Ngày cập nhật: " + extras.getString("UpdateAt"));
        content.setText(extras.getString("Content"));

        img.setImageResource(extras.getInt("Image"));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}