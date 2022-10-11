package Managers;

import java.util.ArrayList;
import java.util.List;

import Core.ILogger;
import DataAccess.IBaseDao;
import Entities.Course;

public class CourseManager {
	private IBaseDao baseDao;
	List<ILogger> loggers;
	
	public CourseManager(IBaseDao baseDao, List<ILogger> loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		baseDao.addCourse(course);
		List<Course> courses=new ArrayList<>();
		courses.add(new Course(1,"Yazılım Geliştirici Yetiştirme Kampı-JAVA",10));
		courses.add(new Course(1,"Senior Yazılım Geliştirici Yetiştirme Kampı  (.NET)",10));
		 
		if(course.getCoursePrice()<0) throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		
		for (Course course2 : courses) {
			if(course2.getCourseName().equals(course.getCourseName()))
			{ throw new Exception("Bu isme sahip bir kurs zaten mevcut.");	}
		}
		
		for(ILogger logger:loggers) {
			logger.log(course.getCourseName());
		}
		
	}
	
}
