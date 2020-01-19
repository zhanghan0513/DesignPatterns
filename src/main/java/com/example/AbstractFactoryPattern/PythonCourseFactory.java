package com.example.AbstractFactoryPattern;

/**
 * @auther ZhangHan
 * @date 2019/12/18 21:23
 */
public class PythonCourseFactory implements CourseFactory {
    public IVideo createVideo() {
        return new PythonVideo();
    }

    public INote createNote() {
        return new PythonNote();
    }
}
