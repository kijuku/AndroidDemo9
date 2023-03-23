package com.main.androiddemo9;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
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
        return new StudentViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_main_list_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(users.get(i).getFirstName() + " " + users.get(i).getLastName());
        studentViewHolder.studentName.setText("  ");
        studentViewHolder.studentLinOfStudy.setText(users.get(i).getDegreeProgram());
        studentViewHolder.studentEmail.setText(users.get(i).getEmail());
       // studentViewHolder.studentName.setText(sb.toString());
       // studentViewHolder.studentLinOfStudy.setText(users.get(i).getDegreeProgram());
       // studentViewHolder.studentEmail.setText(users.get(i).getEmail());
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
