package com.example.FactoryMethodPattern;

import com.example.SimpleFactoryPattern.ICourse;
import com.example.SimpleFactoryPattern.PythonCourse;

/**
 * @auther ZhangHan
 * @date 2019/12/18 21:03
 */
public class PythonCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
