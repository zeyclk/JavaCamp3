package Managers;

import java.util.List;

import Core.ILogger;
import DataAccess.IBaseDao;
import Entities.Instructor;

public class InstructorManager {
	private IBaseDao baseDao;
	List<ILogger> loggers;
	
	public InstructorManager(IBaseDao baseDao, List<ILogger> loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		baseDao.addInstructor(instructor);
		
		for (ILogger logger : loggers) {
			logger.log(instructor.getInstructorFirstName()+" "+instructor.getInstructorLastName());
		}
	}
	

}
