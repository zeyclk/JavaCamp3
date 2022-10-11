package Managers;

import java.util.ArrayList;
import java.util.List;

import Core.ILogger;
import DataAccess.IBaseDao;
import Entities.Category;

public class CategoryManager {
	private IBaseDao baseDao;
	private List<ILogger> loggers;
	
	
	public CategoryManager(IBaseDao baseDao, List<ILogger> loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
		//this.categories=categories;
	}
	
	
	public void add(Category category) throws Exception {
		
		List<Category> categories=new ArrayList<>();
		categories.add(new Category(1, "Programlama"));
		
		for (Category category1 : categories) {
			if(category1.getCategoryName().equals(category.getCategoryName()))
				throw new Exception("Bu isme sahip bir kategori zaten mevcut.");
		}
		
		baseDao.addCategory(category);
		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName());
			
		}
		
		
	}
	
	

}
