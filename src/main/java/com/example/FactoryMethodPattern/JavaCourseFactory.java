package com.example.FactoryMethodPattern;

import com.example.SimpleFactoryPattern.ICourse;
import com.example.SimpleFactoryPattern.JavaCourse;

/**
 * @auther ZhangHan
 * @date 2019/12/18 20:58
 */
public class JavaCourseFactory implements ICourseFactory{
    public ICourse create() {
        return new JavaCourse();
    }
}
