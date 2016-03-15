package com.valid.spring.controller;

import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.valid.spring.dao.EmployeeDAO;
import com.valid.spring.entity.Employee;
import com.valid.spring.service.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value={"/new"},method = RequestMethod.GET)
	public String homeEmp(ModelMap model){
		Employee employee = new Employee();
		model.put("employee", employee);
		model.addAttribute("edit", false);
		return "registration";
	}
	
	@RequestMapping(value={"/new"}, method = RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee, BindingResult result,ModelMap model){
		 if (result.hasErrors()) {
	            return "registration";
	     }
		/* if(!service.isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
	            FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
	            result.addError(ssnError);
	            return "registration";
	        }
	         */
	        service.saveEmployee(employee);
	 
	        model.addAttribute("success", "Employee " + employee.getName() + " registered successfully");
	        return "success";
	}

}
