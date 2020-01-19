package com.example.SimpleFactoryPattern;

/**
 * @auther ZhangHan
 * @date 2019/12/18 20:32
 */
public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaCourse();
        course.record();

        //使用就简单工厂创建
        CourseFactory factory = new CourseFactory();
        ICourse course1 = factory.create_1("python");
        course1.record();

        //修改后V2
        ICourse course2 = factory.create_2("com.example.SimpleFactoryPattern.JavaCourse");
        course2.record();

        //继续优化V3
        ICourse course3 = factory.create_3(PythonCourse.class);
        course3.record();
    }
}
