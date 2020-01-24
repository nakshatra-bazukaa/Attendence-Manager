package com.github.bazukaa.nakshatra.attman.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.github.bazukaa.nakshatra.attman.db.dao.CourseDao;
import com.github.bazukaa.nakshatra.attman.db.entity.Course;

@Database(entities = {Course.class}, version = 1)
public abstract class CourseDatabase extends RoomDatabase {

    private static CourseDatabase courseDatabaseInstance;

    public abstract CourseDao courseDao();

    public static synchronized CourseDatabase getInstance(Context context){
        if(courseDatabaseInstance == null){
            courseDatabaseInstance = Room.databaseBuilder(context.getApplicationContext(),
                    CourseDatabase.class, "course_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return courseDatabaseInstance;
    }
}
