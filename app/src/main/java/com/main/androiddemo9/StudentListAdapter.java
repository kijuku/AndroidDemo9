package com.main.androiddemo9;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class StudentListAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public StudentListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public StudentListAdapter() {
        super();
    }

    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
