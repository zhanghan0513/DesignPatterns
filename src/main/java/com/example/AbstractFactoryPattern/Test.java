package com.example.AbstractFactoryPattern;

/**
 * @auther ZhangHan
 * @date 2019/12/18 21:24
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        courseFactory.createNote().note();
        courseFactory.createVideo().video();
    }
}
