import java.util.ArrayList;
import java.util.List;

import Core.DatabaseLogger;
import Core.FileLogger;
import Core.ILogger;
import Core.MailLogger;
import DataAccess.HibernateDao;
import DataAccess.JdbcDao;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import Managers.CategoryManager;
import Managers.CourseManager;
import Managers.InstructorManager;

public class Main {
//Kategori ve kurs listelerine main üzerinden değer atamak daha kullanışlı olabilirdi
//Şu an manuel olarak giriş yapılıyor 
	
	public static void main(String[] args) throws Exception {
		
		List<ILogger> loggerList=new ArrayList<>();
		loggerList.add(new DatabaseLogger());
		loggerList.add(new MailLogger());
		loggerList.add(new FileLogger());
		
		Category category=new Category(2, "Web Tasarım");
		CategoryManager categoryManager=new CategoryManager(new HibernateDao(), loggerList);
		categoryManager.add(category);
		
		System.out.println("---------------------");
		
		Course course=new Course(2, "Unity ile Oyun Geliştirme Kampı", 100);
		CourseManager courseManager=new CourseManager(new JdbcDao(), loggerList);
		courseManager.add(course);
		
		System.out.println("---------------------");
		
		Instructor instructor=new Instructor(2, "Zeynep", "Çelik");
		InstructorManager instructorManager=new InstructorManager(new HibernateDao(), loggerList);
		instructorManager.add(instructor);
		
		

	}

}
