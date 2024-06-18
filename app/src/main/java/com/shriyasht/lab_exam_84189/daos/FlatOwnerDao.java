package com.shriyasht.lab_exam_84189.daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.shriyasht.lab_exam_84189.entity.FlatOwner;

import java.util.List;

@Dao
public interface FlatOwnerDao {
    @Query("SELECT * FROM flatowner")
    List<FlatOwner> getAllFlatOwners();

    @Insert
    void insertFlatOwner(FlatOwner flatOwner);

}
