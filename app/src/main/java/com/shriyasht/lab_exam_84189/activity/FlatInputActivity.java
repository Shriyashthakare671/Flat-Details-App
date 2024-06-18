package com.shriyasht.lab_exam_84189.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.shriyasht.lab_exam_84189.R;
import com.shriyasht.lab_exam_84189.daos.AppDatabase;
import com.shriyasht.lab_exam_84189.entity.FlatOwner;

public class FlatInputActivity extends AppCompatActivity {
    EditText editFlatNo, editName, editFlatHolderType, editCarpet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_input);

        editFlatNo = findViewById(R.id.editFlatNo);
        editName = findViewById(R.id.editName);
        editFlatHolderType = findViewById(R.id.editFlatHolderType);
        editCarpet = findViewById(R.id.editCarpet);
    }

    public void save(View view) {
        FlatOwner flatOwner = new FlatOwner();
        flatOwner.setFlatNo(Integer.parseInt(editFlatNo.getText().toString()));
        flatOwner.setName(editName.getText().toString());
        flatOwner.setFlatHolderType(editFlatNo.getText().toString());
        flatOwner.setCarpet(Double.parseDouble(editCarpet.getText().toString()));


        AppDatabase.getInstance(this).flatOwnerDao().insertFlatOwner(flatOwner);
        finish();

    }
    public void cancel(View view) {
        finish();
    }

}