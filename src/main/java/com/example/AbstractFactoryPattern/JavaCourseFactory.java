package com.example.AbstractFactoryPattern;

/**
 * @auther ZhangHan
 * @date 2019/12/18 21:21
 */
public class JavaCourseFactory implements CourseFactory {
    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
