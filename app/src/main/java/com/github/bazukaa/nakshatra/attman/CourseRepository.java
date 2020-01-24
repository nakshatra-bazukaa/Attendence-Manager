package com.github.bazukaa.nakshatra.attman;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.github.bazukaa.nakshatra.attman.db.CourseDatabase;
import com.github.bazukaa.nakshatra.attman.db.dao.CourseDao;
import com.github.bazukaa.nakshatra.attman.db.entity.Course;

import java.util.List;

public class CourseRepository {
    private CourseDao courseDao;
    private LiveData<List<Course>> courses;

    public CourseRepository(Application application){
        CourseDatabase courseDatabase = CourseDatabase.getInstance(application);
        courseDao = courseDatabase.courseDao();
        courses = courseDao.getCourses();
    }

    public void insert(Course course){new InsertCourseTask(courseDao).execute(course);}

    public void update(Course course){new UpdateCourseTask(courseDao).execute(course);}

    public void delete(Course course){new DeleteCourseTask(courseDao).execute(course);}

    public static class InsertCourseTask extends AsyncTask<Course, Void, Void>{
        private CourseDao courseDao;

        private InsertCourseTask(CourseDao courseDao){this.courseDao = courseDao;}

        @Override
        protected Void doInBackground(Course... courses) {
            courseDao.insert(courses[0]);
            return null;
        }
    }

    public static class UpdateCourseTask extends AsyncTask<Course, Void, Void>{
        private CourseDao courseDao;

        private UpdateCourseTask(CourseDao courseDao){this.courseDao = courseDao;}

        @Override
        protected Void doInBackground(Course... courses) {
            courseDao.update(courses[0]);
            return null;
        }
    }

    public static class DeleteCourseTask extends AsyncTask<Course, Void, Void>{
        private CourseDao courseDao;

        private DeleteCourseTask(CourseDao courseDao){this.courseDao = courseDao;}

        @Override
        protected Void doInBackground(Course... courses) {
            courseDao.delete(courses[0]);
            return null;
        }
    }
}
