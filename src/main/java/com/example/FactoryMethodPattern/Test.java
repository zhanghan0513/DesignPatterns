package com.example.FactoryMethodPattern;

import com.example.SimpleFactoryPattern.ICourse;

/**
 * @auther ZhangHan
 * @date 2019/12/18 21:03
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new PythonCourseFactory();
        ICourse course = courseFactory.create();
        course.record();

        courseFactory = new JavaCourseFactory();
        course = courseFactory.create();
        course.record();
    }
}
