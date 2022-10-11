package DataAccess;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class HibernateDao implements IBaseDao {

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("Instructor, Hibernate ile eklendi. Adı ve sooyadı: "+instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName());
	}

	@Override
	public void addCategory(Category category) {
		System.out.println("Category, Hibernate ile eklendi.Adı : "+category.getCategoryName());
		
		
	}

	@Override
	public void addCourse(Course course) {
		System.out.println("Course, Hibernate ile eklendi.Adı : "+course.getCourseName());
		
	}

}
