package com.example.myapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.SubjectsViewHolder> {

    String[] mSubjects;
    public static String TAG = SubjectsAdapter.class.getSimpleName();

    public SubjectsAdapter(String[] subjects) {
        mSubjects = subjects;
    }

    //rashed going to market to purchase a row plank for menu
    @NonNull
    @Override
    public SubjectsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG,"rashed going to market to purchase a row plank for menu");
        View rowPlank = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_plank,parent,false);
        return new SubjectsViewHolder(rowPlank); //rashed is giving the newly bought plank to anu
    }

    //lakshmi is writing the menu item on the plank
    @Override
    public void onBindViewHolder(@NonNull SubjectsViewHolder holder, int position) {
        Log.i(TAG, "lakshmi is writing the menu item on the plank ");
        holder.rowTextView.setText(mSubjects[position]);

    }

    //amina is keeping the count of the data items
    @Override
    public int getItemCount() {
        Log.i(TAG,"amina is keeping the count of the data items --- "+mSubjects.length);
        return mSubjects.length;
    }

    //anu -- she is holding the reserver box for the row planks
    class SubjectsViewHolder extends RecyclerView.ViewHolder {
        TextView rowTextView;
        public SubjectsViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.i(TAG,"anu -- she is holding the reserver box for the row planks");
            rowTextView = itemView.findViewById(R.id.subjectTv);

        }
    }
}
