package com.kce.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.kce.model.Student;


@Controller
public class StudentController {
	
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView doStart()
	{
		return new ModelAndView("index");
	}

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String doStudent(Model model,@ModelAttribute Student StudentBean)
	{
		if(StudentBean.getAge()!=null && StudentBean.getName()!=null)		
		{
			
				return "sucess";
			
		}
		
		return "tryagain";
	}
}
