package DataAccess;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public interface IBaseDao {
	void addInstructor(Instructor instructor);
	void addCategory(Category category);
	void addCourse(Course course);
}
