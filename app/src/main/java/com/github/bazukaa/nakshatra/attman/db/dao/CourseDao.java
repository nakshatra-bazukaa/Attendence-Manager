package com.github.bazukaa.nakshatra.attman.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.github.bazukaa.nakshatra.attman.db.entity.Course;

import java.util.List;

@Dao
public interface CourseDao {
    @Insert
    void insert(Course course);

    @Delete
    void delete(Course course);

    @Update
    void update(Course course);

    @Query("SELECT * FROM course_table ORDER BY id DESC")
    LiveData<List<Course>> getCourses();
}
