package com.library.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.library.bean.Admin;
import com.library.bean.Appointment;
import com.library.bean.Bollow;
import com.library.bean.Book;
import com.library.bean.BookType;
import com.library.bean.LibraryMsg;
import com.library.bean.User;
import com.library.service.AppointmentService;
import com.library.service.BollowService;
import com.library.service.BookService;
import com.library.service.BookTypeSevrice;
import com.library.service.LibraryMsgService;
import com.library.service.UserService;
import com.library.utils.Util_1;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private BookService bookService;
	@Autowired
	private LibraryMsgService libraryMsgService;
	@Autowired
	private AppointmentService appointmentService;
	@Autowired
	private BollowService bollowService;
	@Autowired
	private BookTypeSevrice bookTypeSevrice;
	
	@RequestMapping("toIndex")
	public ModelAndView toIndex(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			mv.addObject("user", user);
			mv.setViewName("user/index");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	
	@RequestMapping("to1")
	public ModelAndView to1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			mv.setViewName("user/1");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	
	@RequestMapping("to2")
	public ModelAndView to2(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			mv.setViewName("user/2");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("to2a")
	public ModelAndView to2a(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			List<Book> books = bookService.selAll();
			mv.addObject("books", books);
			mv.setViewName("user/2a");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("yuyue")
	public void yuyue(HttpServletRequest request,HttpServletResponse response) throws IOException {
		User user = (User) request.getSession().getAttribute("user");
		String uuid = request.getParameter("uuid");
		Book book = bookService.selByUuid(uuid);
		if (user!=null) {
			if (book.getNum()!=0) {
				User user2 = userService.selById(user.getId());
				if (user2.getNum()>user2.getBollowed()) {
					appointmentService.insert(Util_1.getUuid(), user.getId(), uuid, new Date(System.currentTimeMillis()));
					userService.updateBollowed(user.getId());
					bookService.updateNum(uuid);
					response.getWriter().write("ok");
				} else {
					response.getWriter().write("bollowenough");
				}
			} else {
				response.getWriter().write("notenough");
			}
		} else {
				response.getWriter().write("login");
		}
	}
	@RequestMapping(value="to2aa")
	public ModelAndView to2aa(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		int tiaojian = Integer.parseInt(request.getParameter("tiaojian"));
		String name = request.getParameter("name");
		List<Book> books = new ArrayList<Book>();
		if (user!=null) {
			switch (tiaojian) {
			case 1:{books = bookService.selAll();break;}
			case 2:{books = bookService.selByBookType(name);break;}
			case 3:{books = bookService.selByBookName(name);break;}
			case 4:{books = bookService.selByBookAuthor(name);break;}
			case 5:{books = bookService.selByBookIsbn(name);break;}
			case 6:{books = bookService.selByBookPublish(name);break;}
			default:
				break;
			}
			mv.addObject("books", books);
			mv.setViewName("user/2a");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("xq")
	public ModelAndView xq(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		String uuid = request.getParameter("uuid");
		if (user!=null) {
			Book book = bookService.selByUuid(uuid);
			mv.addObject("book", book);
			mv.setViewName("user/2a1");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	
	@RequestMapping("to3_1")
	public ModelAndView to3_1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			User user2 = userService.selById(user.getId());
			mv.addObject("user", user2);
			mv.setViewName("user/3_1");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("3_1xg")
	public void xg3_1(HttpServletRequest request,HttpServletResponse response) throws IOException {
		User user = (User) request.getSession().getAttribute("user");
		String id = request.getParameter("uuid");
		String pwd = userService.selById(id).getPwd();
		int num = userService.selById(id).getNum();
		String name = request.getParameter("name");
		String sex = request.getParameter("author");
		String readType = request.getParameter("republish");
		String tel = request.getParameter("translator");
		String barcode = request.getParameter("isbn");
		String paperType = request.getParameter("booktype");
		Date inTime = Date.valueOf(request.getParameter("intime"));
		String paperNo = request.getParameter("price");
		String operator = request.getParameter("bookcase");
		int bollowed = Integer.parseInt(request.getParameter("num"));
		String account = request.getParameter("page");
		if (user!=null) {
			try {
				userService.deleteById(id);
				userService.insertUser(id, account, pwd, name, sex, barcode, readType, tel, paperType, paperNo, inTime, operator, num, bollowed);
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
				e.printStackTrace();
			}
		} else {
			response.getWriter().write("login");
		}
	}
	
	@RequestMapping("to3_3")
	public ModelAndView to3_3(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			String readerId = user.getId();
			List<Appointment> appointments = appointmentService.selByReaderId(readerId);
			List<BookType> bookTypes = new ArrayList<BookType>();
			for (Appointment appointment : appointments) {
				bookTypes.add(bookTypeSevrice.selByName(appointment.getBookUuid().getBookType()));
			}
			List<Bollow> bollows = bollowService.selByReaderId(readerId);
			List<Bollow> bollows2 = bollowService.selByReaderId2(readerId);
			mv.addObject("appointments", appointments);
			mv.addObject("bollows", bollows);
			mv.addObject("bollows2", bollows2);
			mv.addObject("bookTypes", bookTypes);
			mv.setViewName("user/3_3");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("3_2xg")
	public void xg3_2(HttpServletRequest request,HttpServletResponse response) throws IOException, NoSuchAlgorithmException {
		User user = (User) request.getSession().getAttribute("user");
		String oldPwd = request.getParameter("name");
		String newPwd = request.getParameter("author");
		if (user!=null) {
			if(Util_1.sHAEncrypt(oldPwd).equals(user.getPwd())) {
				try {
					userService.updetPwd(user.getId(), Util_1.sHAEncrypt(newPwd));
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
					e.printStackTrace();
				}
			}else {
				response.getWriter().write("pwdwrong");
			}
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping("to3_2")
	public ModelAndView to3_2(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			User user2 = userService.selById(user.getId());
			mv.addObject("user", user2);
			mv.setViewName("user/3_2");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	
	@RequestMapping("qxyy")
	public void qxyy(HttpServletRequest request,HttpServletResponse response) throws IOException {
		User user = (User) request.getSession().getAttribute("user");
		String uuid = request.getParameter("uuid");
		if (user!=null) {
			try {
				appointmentService.deleteByUuid(uuid);
				userService.updateBollowed2(user.getId());
			} catch (Exception e) {
				response.getWriter().write("error");
				e.printStackTrace();
			}
			response.getWriter().write("ok");
		} else {
			response.getWriter().write("login");
		}
	}
	
	@RequestMapping(value="to4")
	public ModelAndView to5_1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			LibraryMsg libraryMsg = libraryMsgService.selLibraryMsg();
			mv.addObject("libraryMsg", libraryMsg);
			mv.setViewName("user/4");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}

}
