package com.example.androidfinalproject2;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public class ViewModel extends AndroidViewModel {
    private Repository myRepostory;
    public ViewModel(@NonNull Application application) {
        super(application);
        myRepostory = new Repository(application);
    }

    void insertUser(Users users){
        myRepostory.insertUser(users);
    }
    void deleteUser(Users users){
        myRepostory.deleteUser(users);
    }
    void updateUser(Users users) {
        myRepostory.updateUser(users);
    }
    LiveData<List<Users>> getAllUsers(){
        return myRepostory.getAllUsers();


    }
    void insertLevel(Levels levels){
        myRepostory.insertLevel(levels);

    }


    void updateLevel(Levels levels){
        myRepostory.updateLevel(levels);
    }


    void deleteLevel(Levels levels){
        myRepostory.deleteLevel(levels);
    }


    LiveData<List<Levels>> getAllLevel(){
        return myRepostory.getAllLevel();
    }


    void insertPattern(pattern pattern){
        myRepostory.insertPattern(pattern);
    }



    void updatePattern(Pattern pattern){
        myRepostory.updatePattern(pattern);
    }


    void deletePattern(Pattern pattern){
        myRepostory.deletePattern(pattern);
    }

   LiveData<List<Pattern>>getAllPattern(){
       return myRepostory.getAllPattern();
    }



    void insertPuzzles(Puzzles puzzles){
        myRepostory.insertPuzzles(puzzles);

    }

    void updatePuzzles(Puzzles puzzles){
        myRepostory.updatePuzzles(puzzles);
    }


    void deletePuzzles(Puzzles puzzles){
        myRepostory.deletePuzzles(puzzles);
    }

    LiveData<List<Puzzles>> getAllPuzzles(){
        return myRepostory.getAllPuzzles();
    }



}
