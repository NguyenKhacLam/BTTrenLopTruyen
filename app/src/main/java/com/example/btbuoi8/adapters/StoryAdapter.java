package com.example.btbuoi8.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btbuoi8.R;
import com.example.btbuoi8.modals.Story;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Story> storiesData;
    private StoryListener listener;

    public StoryAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    public ArrayList<Story> getStoriesData() {
        return storiesData;
    }

    public void setStoriesData(ArrayList<Story> storiesData) {
        this.storiesData = storiesData;
        notifyDataSetChanged();
    }

    public void setListener(StoryListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_row, parent, false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        final Story story = storiesData.get(position);
        holder.bindData(story);
        if (listener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onStoryItemClick(story);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return storiesData != null ? storiesData.size() : 0;
    }

    public class StoryViewHolder extends RecyclerView.ViewHolder{
        private TextView story_name,story_author,story_chapters,story_updateDay;
        private ImageView story_img;

        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews();
        }

        private void initViews() {
            story_img = itemView.findViewById(R.id.story_img);
            story_name = itemView.findViewById(R.id.story_name);
            story_chapters = itemView.findViewById(R.id.story_chapters);
            story_author = itemView.findViewById(R.id.story_author);
            story_updateDay = itemView.findViewById(R.id.story_updateDAy);
        }

        public void bindData(Story story){
            story_img.setImageResource(story.getImage());
            story_name.setText(story.getName());
            story_chapters.setText("Chương " + story.getChapter());
            story_author.setText("T/g: " + story.getAuthor());
            story_updateDay.setText("Ngày cập nhật: " + story.getUpdateAt());
        }
    }

    public interface StoryListener{
        void onStoryItemClick(Story story);
    }
}
