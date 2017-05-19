package com.learning.lhd.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.learning.lhd.entity.User;
import com.learning.lhd.Service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/loginconfirm",method = RequestMethod.POST)    
    public String login(User user,ModelMap model){  
          
        User realUser = userService.getById(user.getId());  
        System.out.println(realUser.getId());
        System.out.println(realUser.getPassword());
        if(realUser!=null){ 
        	if(realUser.getPassword().equals(user.getPassword()))
        	{
//            realUser.setPassword("");
            System.out.println(realUser.getId());
            System.out.println(realUser.getPassword());
             model.addAttribute("user", realUser);
            return "input/main"; 
        	}
        }
        return "login";   
    }
	
	
	

//	@RequestMapping(value = "/loginconfirm",method = RequestMethod.POST)    
//    public String login(User user,HttpSession httpSession){  
//          
//        User realUser = userService.getById(user.getId());  
//        if(realUser!=null){ 
//        	if(realUser.getPassword().equals(user.getPassword()))
//        	{
//            realUser.setPassword(""); 
//            httpSession.setAttribute("user", realUser);  
//            return "main"; 
//        	}
//        }
//        return "/login";   
//    }
	
//	@RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
//	@ResponseBody
//	private String detail(@PathVariable("bookId") Long bookId, Model model) {
//		if (bookId == null) {
//			return "redirect:/book/list";
//		}
//		Book book = bookService.getById(bookId);
//		if (book == null) {
//			return "forward:/book/list";
//		}
//		model.addAttribute("book", book);
//		return "detail";
//	}
	
	

}
