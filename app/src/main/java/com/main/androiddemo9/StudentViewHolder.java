package com.main.androiddemo9;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView studentName, studentEmail, studentLinOfStudy;

    public StudentViewHolder(@NonNull View itemView){
        super(itemView);

        imageView = itemView.findViewById(R.id.imageView);
        studentName = itemView.findViewById(R.id.viewStudentName);
        studentEmail = itemView.findViewById(R.id.viewStudentEmail);
        studentLinOfStudy = itemView.findViewById(R.id.viewLineOfStudy);


    }
}
