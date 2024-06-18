package com.shriyasht.lab_exam_84189.daos;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.shriyasht.lab_exam_84189.entity.FlatOwner;


@Database(entities = {FlatOwner.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase{

    public abstract FlatOwnerDao flatOwnerDao();

    public static AppDatabase getInstance(Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, "flat_db")
                .allowMainThreadQueries()
                .build();

    }
}
