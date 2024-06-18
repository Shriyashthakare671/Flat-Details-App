package com.shriyasht.lab_exam_84189.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shriyasht.lab_exam_84189.R;
import com.shriyasht.lab_exam_84189.activity.MainActivity;
import com.shriyasht.lab_exam_84189.entity.FlatOwner;

import java.util.List;

public class FlatListAdapter extends RecyclerView.Adapter<FlatListAdapter.FlatViewHolder> {

    Context context;
    List<FlatOwner> flatOwnerList;

    FlatListAdapter flatListAdapter;


    public FlatListAdapter (Context context, List<FlatOwner> flatOwnerList) {
        this.context = context;
        this.flatOwnerList = flatOwnerList;
    }

    public void setFlatOwnerList(List<FlatOwner> flatOwnerList) {
        this.flatOwnerList = flatOwnerList;
    }

    @NonNull
    @Override
    public FlatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.flat_list, null);
        return new FlatViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull FlatViewHolder holder, int position) {
        holder.textFlatNo.setText("FlatNo - "+flatOwnerList.get(position).getFlatNo());
        holder.textName.setText("Name - "+flatOwnerList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return flatOwnerList.size();
    }

    class FlatViewHolder extends RecyclerView.ViewHolder {
        TextView textFlatNo, textName;
        public FlatViewHolder(@NonNull View itemView) {
            super(itemView);
            textFlatNo = itemView.findViewById(R.id.textFlatNo);
            textName = itemView.findViewById(R.id.textName);
        }
    }
    }
