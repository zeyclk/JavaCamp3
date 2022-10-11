package DataAccess;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class JdbcDao implements IBaseDao{
	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("Instructor, JDBC ile eklendi. Adı ve sooyadı: "+instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName());
	}

	@Override
	public void addCategory(Category category) {
		System.out.println("Category, JDBC ile eklendi.Adı : "+category.getCategoryName());
		
	}

	@Override
	public void addCourse(Course course) {
		System.out.println("Course, JDBC ile eklendi.Adı : "+course.getCourseName());
		
	}
}
