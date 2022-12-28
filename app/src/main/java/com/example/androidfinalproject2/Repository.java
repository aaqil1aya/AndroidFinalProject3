package com.example.androidfinalproject2;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public class Repository {
    private UserDao userDao;
    private LevelDoa levelDoa;
    private PatternDao patternDao;
    private PuzzlesDoa puzzlesDoa;


    Repository(Application application) {
        MyRoomDataBase db = MyRoomDataBase.getDatabase(application);
        userDao = db.daoUser();
        levelDoa=  db.daoLevel();
        patternDao= db.daoPattern();
        puzzlesDoa=db.daoPuzzles();

    }

    void insertUser(Users users){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userDao.insertUser(users);
            }
        });

    }

    void deleteUser(Users users){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userDao.deleteUser(users);
            }
        });

    }

    void updateUser(Users users){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userDao.updateUser(users);
            }
        });

    }


    LiveData<List<Users>> getAllUsers(){
        return userDao.getAllUser();

    }


    void insertLevel(Levels levels){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                levelDoa.insertLevel(levels);
            }
        });

    }


    void updateLevel(Levels levels){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                levelDoa.updateLevel(levels);
            }
        });
    }


    void deleteLevel(Levels levels){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                levelDoa.deleteLevel(levels);
            }
        });
    }


    LiveData<List<Levels>> getAllLevel(){
        return levelDoa.getAllLevel();
    }




    void insertPattern(pattern pattern){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                patternDao.insertPattern(pattern);
            }
        });
    }


    void updatePattern(Pattern pattern){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                patternDao.updatePattern(pattern);
            }
        });
    }


    void deletePattern(Pattern pattern){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                patternDao.deletePattern(pattern);
            }
        });
    }

    LiveData<List<Pattern>>getAllPattern(){
        return patternDao.getAllPattern();

    }


    void insertPuzzles(Puzzles puzzles){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                puzzlesDoa.insertPuzzles(puzzles);
            }
        });
    }

    void updatePuzzles(Puzzles puzzles){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                puzzlesDoa.updatePuzzles(puzzles);
            }
        });
    }


    void deletePuzzles(Puzzles puzzles){
        MyRoomDataBase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                puzzlesDoa.deletePuzzles(puzzles);
            }
        });
    }

    LiveData<List<Puzzles>> getAllPuzzles(){
        return puzzlesDoa.getAllPuzzles();
    }





}
