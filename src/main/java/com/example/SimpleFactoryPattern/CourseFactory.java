package com.example.SimpleFactoryPattern;

/**
 * 工厂类
 * @auther ZhangHan
 * @date 2019/12/18 20:35
 */
public class CourseFactory {

    public ICourse create_1(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("python".equals(name)){
            return new PythonCourse();
        }else
            return null;
    }

    /**
     * 继续业务扩展
     * 增加课程需要继续create的逻辑代码。
     * 使用反射
     * @param className
     * @return
     */
    public ICourse create_2(String className){
        try {
            if(!(className == null || "".equals(className))){
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 方法参数为字符串，可控性有待提升，而且还需要强制类型转换
     * 继续优化
     * @param clazz
     * @return
     */
    public ICourse create_3(Class<? extends ICourse> clazz){
        try {
            if(clazz != null){
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
