package com.example.AbstractFactoryPattern;

public interface CourseFactory {
    INote createNote();
    IVideo createVideo();
}
