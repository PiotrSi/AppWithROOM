package com.example.myapplication2;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ElementDao {

    @Insert(onConflict =  OnConflictStrategy.ABORT)
    void insert(Element element);

    @Query("DELETE  FROM phones")
    void deleteAll();


    @Query("SELECT * FROM phones ORDER BY nazwa_kolumny2 ASC")
    LiveData<List<Element>> getAlphabetizedElements();

}