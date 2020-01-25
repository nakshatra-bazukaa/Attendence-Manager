package com.github.bazukaa.nakshatra.attman.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "course_table")
public class Course {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String courseName;

    private Integer courseAttended;

    private Integer courseMissed;

    private Integer courseCancelled;

    private int goal;

    public Course(String courseName, Integer courseAttended, Integer courseMissed, Integer courseCancelled, int goal) {
        this.courseName = courseName;
        this.courseAttended = courseAttended;
        this.courseMissed = courseMissed;
        this.courseCancelled = courseCancelled;
        this.goal = goal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseAttended() {
        return courseAttended;
    }

    public void setCourseAttended(Integer courseAttended) {
        this.courseAttended = courseAttended;
    }

    public Integer getCourseMissed() {
        return courseMissed;
    }

    public void setCourseMissed(Integer courseMissed) {
        this.courseMissed = courseMissed;
    }

    public Integer getCourseCancelled() {
        return courseCancelled;
    }

    public void setCourseCancelled(Integer courseCancelled) {
        this.courseCancelled = courseCancelled;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }
}
