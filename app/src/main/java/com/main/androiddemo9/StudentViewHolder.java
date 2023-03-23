package com.main.androiddemo9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentViewHolder {
    ImageView imageView;
    TextView studentName, studentEmail, studentLinOfStudy;

    public StudentViewHolder() {
        super();
    }

    public StudentViewHolder(View itemView){
        super(itemView);

        imageView = itemView.findViewById(R.id.imageView);
        studentName = itemView.findViewById(R.id.viewStudentName);
        studentEmail = itemView.findViewById(R.id.viewEmail);
        studentLinOfStudy = itemView.findViewById(R.id.viewLineOfStudy);


    }
}
