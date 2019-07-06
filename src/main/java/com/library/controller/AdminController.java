package com.library.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
import com.library.bean.UserType;
import com.library.service.AdminService;
import com.library.service.AppointmentService;
import com.library.service.BollowService;
import com.library.service.BookService;
import com.library.service.BookTypeSevrice;
import com.library.service.LibraryMsgService;
import com.library.service.UserService;
import com.library.service.UserTypeService;
import com.library.utils.Util_1;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	@Autowired
	private LibraryMsgService libraryMsgService;
	@Autowired
	private BookTypeSevrice bookTypeSevrice;
	@Autowired
	private UserTypeService userTypeService;
	@Autowired
	private AppointmentService appointmentService;
	@Autowired
	private BollowService bollowService;
	
	@RequestMapping("toIndex")
	public ModelAndView toIndex(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			mv.addObject("admin", admin);
			mv.setViewName("admin/index");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
//		Admin admin = (Admin) request.getSession().getAttribute("admin");
//		if (admin!=null) {
//		} else {
//			mv.setViewName("redirect:/index.jsp");
//		}
	}
	
	@RequestMapping(value="to1_1")
	public ModelAndView to1_1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			mv.setViewName("admin/1_1");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
		
	}
	
	@RequestMapping(value="to1_1a")
	public ModelAndView to1_1a(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			List<Book> books = bookService.selAll();
			mv.addObject("books", books);
			mv.setViewName("admin/1_1a");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping(value="to1_1aa")
	public ModelAndView to1_1aa(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		int tiaojian = Integer.parseInt(request.getParameter("tiaojian"));
		String name = request.getParameter("name");
		List<Book> books = new ArrayList<Book>();
		if (admin!=null) {
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
			mv.setViewName("admin/1_1a");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	
	@RequestMapping("xq")
	public ModelAndView xq(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			Book book = bookService.selByUuid(uuid);
			mv.addObject("book", book);
			mv.setViewName("admin/1_1a1");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("xg")
	public ModelAndView xg(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			Book book = bookService.selByUuid(uuid);
			mv.addObject("book", book);
			mv.setViewName("admin/1_1a2");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("xg2")
	public void xg2(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String republish = request.getParameter("republish");
		String translator = request.getParameter("translator");
		String isbn = request.getParameter("isbn");
		String booktype = request.getParameter("booktype");
		Date intime = Date.valueOf(request.getParameter("intime"));
		float price = Float.parseFloat(request.getParameter("price"));
		String bookcase = request.getParameter("bookcase");
		int num = Integer.parseInt(request.getParameter("num"));
		int page = Integer.parseInt(request.getParameter("page"));
		if (admin!=null) {
			try {
				bookService.deleteByUuid(uuid);
				bookService.insertBook(uuid, booktype, name, author, translator, republish, isbn, price, bookcase, intime, page, num);
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
			}
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping("sc")
	public void sc(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			try {
				bookService.deleteByUuid(uuid);
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
			}
		} else {
			response.getWriter().write("login");
		}
	}
	
	@RequestMapping("add1")
	public void add1(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String republish = request.getParameter("republish");
		String translator = request.getParameter("translator");
		String isbn = request.getParameter("isbn");
		String booktype = request.getParameter("booktype");
		Date intime = Date.valueOf(request.getParameter("intime"));
		float price = Float.parseFloat(request.getParameter("price"));
		String bookcase = request.getParameter("bookcase");
		int num = Integer.parseInt(request.getParameter("num"));
		int page = Integer.parseInt(request.getParameter("page"));
		if (admin!=null) {
			Book book = bookService.selByBookIsbn2(isbn);
			if (book==null) {
				try {
					bookService.insertBook(Util_1.getUuid(), booktype, name, author, translator, republish, isbn, price, bookcase, intime, page, num);
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
				}
			} else {
				response.getWriter().write("found");
			}
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping("add2")
	public void add2(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String isbn = request.getParameter("isbn");
		Date intime = Date.valueOf(request.getParameter("intime"));
		int num = Integer.parseInt(request.getParameter("num"));
		if (admin!=null) {
			Book book = bookService.selByBookIsbn2(isbn);
			if (book!=null) {
				try {
					bookService.addBook(isbn, intime, num);
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
				}
			} else {
				response.getWriter().write("notfound");
			}
		} else {
			response.getWriter().write("login");
		}
	}
	
	@RequestMapping(value="to1_2a1")
	public ModelAndView to1_2a1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			List<BookType> bookTypes = bookTypeSevrice.selAll();
			mv.addObject("bookTypes", bookTypes);
			mv.setViewName("admin/1_2a1");
			return mv;
		} else {
			return mv;
		}
		
	}
	@RequestMapping(value="to1_3")
	public ModelAndView to1_3() {
		ModelAndView mv = new ModelAndView();
		List<BookType> bookTypes = bookTypeSevrice.selAll();
		mv.addObject("bookTypes", bookTypes);
		mv.setViewName("admin/1_3");
		return mv;
	}
	@RequestMapping(value="to2_5")
	public ModelAndView to2_5() {
		ModelAndView mv = new ModelAndView();
		List<UserType> userTypes = userTypeService.selAll();
		mv.addObject("userTypes", userTypes);
		mv.setViewName("admin/2_5");
		return mv;
	}
	@RequestMapping(value="1_3sc")
	public void sc1_3(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			try {
				bookTypeSevrice.deleteByUuid(uuid);
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
				e.printStackTrace();
			}
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping(value="2_5sc")
	public void sc2_5(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			try {
				userTypeService.deleteByUuid(uuid);
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
				e.printStackTrace();
			}
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping(value="1_3xg")
	public ModelAndView xg1_3(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String typeName = request.getParameter("name");
		BookType bookType = bookTypeSevrice.selByName(typeName);
		mv.addObject("bookType", bookType);
		mv.setViewName("admin/1_3a1");
		return mv;
	}
	@RequestMapping(value="2_5xg")
	public ModelAndView xg2_5(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String typeName = request.getParameter("name");
		UserType userType = userTypeService.selByName(typeName);
		mv.addObject("userType", userType);
		mv.setViewName("admin/2_5a1");
		return mv;
	}
	@RequestMapping(value="1_3xg2")
	public void xg21_3(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		String name = request.getParameter("name");
		int days = Integer.parseInt(request.getParameter("author"));
		if (admin!=null) {
				try {
					bookTypeSevrice.deleteByUuid(uuid);
					bookTypeSevrice.insert(uuid, name, days);
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
					e.printStackTrace();
				}
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping(value="2_5xg2")
	public void xg22_5(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		String name = request.getParameter("name");
		int days = Integer.parseInt(request.getParameter("author"));
		if (admin!=null) {
				try {
					userTypeService.deleteByUuid(uuid);
					userTypeService.insert(uuid, name, days);
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
					e.printStackTrace();
				}
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping(value="1_3tj")
	public ModelAndView tj1_3() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/1_3a2");
		return mv;
	}
	@RequestMapping(value="2_5tj")
	public ModelAndView tj2_5() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/2_5a2");
		return mv;
	}
	@RequestMapping(value="1_3tj2")
	public void tj21_3(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String name = request.getParameter("name");
		int days = Integer.parseInt(request.getParameter("author"));
		if (admin!=null) {
			BookType bookType = bookTypeSevrice.selByName(name);
			if (bookType==null) {
				try {
					bookTypeSevrice.insert(Util_1.getUuid(), name, days);
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
					e.printStackTrace();
				}
			} else {
				response.getWriter().write("found");
			}
			
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping(value="2_5tj2")
	public void tj22_5(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String name = request.getParameter("name");
		int num = Integer.parseInt(request.getParameter("author"));
		if (admin!=null) {
			UserType userType = userTypeService.selByName(name);
			if (userType==null) {
				try {
					userTypeService.insert(Util_1.getUuid(), name, num);
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
					e.printStackTrace();
				}
			} else {
				response.getWriter().write("found");
			}
			
		} else {
			response.getWriter().write("login");
		}
	}
	
	@RequestMapping(value="to2_1")
	public ModelAndView to2_1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/2_1");
		return mv;
	}
	@RequestMapping(value="to2_1a")
	public ModelAndView to2_1a(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			List<User> users = userService.selAll();
			mv.addObject("users", users);
			mv.setViewName("admin/2_1a");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping(value="to2_1aa")
	public ModelAndView to2_1aa(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		int tiaojian = Integer.parseInt(request.getParameter("tiaojian"));
		String name = request.getParameter("name");
		List<User> users = new ArrayList<User>();
		if (admin!=null) {
			switch (tiaojian) {
			case 1:{users = userService.selAll();break;}
			case 2:{users = userService.selByName(name);break;}
			case 3:{users = userService.selBySex(name);break;}
			case 4:{users = userService.selByreadType(name);break;}
			case 5:{users = userService.selByTel(name);break;}
			case 6:{users = userService.selByPaperNo(name);break;}
			default:
				break;
			}
			mv.addObject("users", users);
			mv.setViewName("admin/2_1a");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	
	@RequestMapping("2_1xq")
	public ModelAndView xq2_1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			User user = userService.selById(uuid);
			mv.addObject("user", user);
			mv.setViewName("admin/2_1a1");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("2_1xg")
	public ModelAndView xg2_1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			User user = userService.selById(uuid);
			mv.addObject("user", user);
			mv.setViewName("admin/2_1a2");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("2_1xg2")
	public void xg22_1(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
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
		if (admin!=null) {
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
	@RequestMapping("2_1sc")
	public void sc2_1(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String id = request.getParameter("uuid");
		if (admin!=null) {
			try {
				userService.deleteById(id);
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
			}
		} else {
			response.getWriter().write("login");
		}
	}
	
	
	@RequestMapping(value="to2_2")
	public ModelAndView to2_2() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/2_2");
		return mv;
	}
	@RequestMapping(value="to2_2a")
	public ModelAndView to2_2a(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			List<Admin> admins = adminService.selAll();
			mv.addObject("admins", admins);
			mv.setViewName("admin/2_2a");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping(value="to2_2aa")
	public ModelAndView to2_2aa(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		int tiaojian = Integer.parseInt(request.getParameter("tiaojian"));
		String name = request.getParameter("name");
		List<Admin> admins = new ArrayList<Admin>();
		if (admin!=null) {
			switch (tiaojian) {
			case 1:{admins = adminService.selAll();break;}
			case 2:{admins = adminService.selByName(name);break;}
			case 3:{admins = adminService.selBySex(name);break;}
			case 4:{admins = adminService.selByIdNo(name);break;}
			case 5:{admins = adminService.selByTel(name);break;}
			case 6:{admins = adminService.selByAccount(name);break;}
			default:
				break;
			}
			mv.addObject("admins", admins);
			mv.setViewName("admin/2_2a");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("2_2sc")
	public void sc2_2(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			try {
				adminService.deleteByUuid(uuid);
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
			}
		} else {
			response.getWriter().write("login");
		}
	}
	
	@RequestMapping(value="to2_3")
	public ModelAndView to2_3() {
		ModelAndView mv = new ModelAndView();
		List<UserType> userTypes = userTypeService.selAll();
		mv.addObject("userTypes", userTypes);
		mv.setViewName("admin/2_3");
		return mv;
	}
	@RequestMapping("2_3add")
	public void add2_3(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String name = request.getParameter("name");
		String sex = request.getParameter("author");
		String readType = request.getParameter("republish");
		String tel = request.getParameter("translator");
		String barcode = request.getParameter("isbn");
		String paperType = request.getParameter("booktype");
		Date inTime = Date.valueOf(request.getParameter("intime"));
		String paperNo = request.getParameter("price");
		String pwd = request.getParameter("bookcase");
		int num = Integer.parseInt(request.getParameter("num"));
		String account = request.getParameter("page");
		if (admin!=null) {
			User user = userService.selByPaperNo2(paperNo);
			if (user==null) {
				try {
					userService.insertUser(Util_1.getUuid(), account, Util_1.sHAEncrypt(pwd), name, sex, barcode, readType, tel, paperType, paperNo, inTime, admin.getName(), num, 0);
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
				}
			} else {
				response.getWriter().write("found");
			}
		} else {
			response.getWriter().write("login");
		}
	}
	
	@RequestMapping(value="to2_4")
	public ModelAndView to2_4() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/2_4");
		return mv;
	}
	@RequestMapping("2_4add")
	public void add2_4(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String name = request.getParameter("name");
		String sex = request.getParameter("author");
		String tel = request.getParameter("translator");
		String paperNo = request.getParameter("price");
		String pwd = request.getParameter("bookcase");
		String account = request.getParameter("page");
		if (admin!=null) {
			Admin admin2 = adminService.selByIdNo2(paperNo);
			if (admin2==null) {
				try {
					adminService.insertAdmin(Util_1.getUuid(), account, Util_1.sHAEncrypt(pwd), name, sex, paperNo, tel);
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
					e.printStackTrace();
				}
			} else {
				response.getWriter().write("found");
			}
		} else {
			response.getWriter().write("login");
		}
	}
	
	@RequestMapping(value="to3_1")
	public ModelAndView to3_1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			List<Appointment> appointments = appointmentService.selAll();
			mv.addObject("appointments", appointments);
			mv.setViewName("admin/3_1");
			return mv;
		} else {
			return mv;
		}
	}
	@RequestMapping(value="ty")
	public void ty(HttpServletRequest request,HttpServletResponse response) throws IOException{
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		Appointment appointment = appointmentService.selByUuid(uuid);
		String readerId = appointment.getUserId().getId();
		String bookUuid = appointment.getBookUuid().getUuid();
		int days = bookTypeSevrice.selByName(appointment.getBookUuid().getBookType()).getDays();
		Date outTime = new Date(System.currentTimeMillis());
		if (admin!=null) {
			try {
				appointmentService.deleteByUuid(uuid);
				bollowService.insertBollow(Util_1.getUuid(), readerId, bookUuid, outTime, days,null, false);
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
				e.printStackTrace();
			}
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping(value="bh")
	public void bh(HttpServletRequest request,HttpServletResponse response) throws IOException{
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		Appointment appointment = appointmentService.selByUuid(uuid);
		if (admin!=null) {
			try {
				appointmentService.deleteByUuid(uuid);
				String readerId = appointment.getUserId().getId();
				userService.updateBollowed2(readerId);
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
				e.printStackTrace();
			}
		} else {
			response.getWriter().write("login");
		}
	}
	
	
	@RequestMapping(value="to3_2")
	public ModelAndView to3_2(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			mv.setViewName("admin/3_2");
			return mv;
		} else {
			return mv;
		}
	}
	@RequestMapping(value="3_2a")
	public ModelAndView to3_2a(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			List<Bollow> bollows = bollowService.selAll();
			mv.addObject("bollows", bollows);
			mv.setViewName("admin/3_2a");
			return mv;
		} else {
			return mv;
		}
	}
	@RequestMapping(value="3_2aa")
	public ModelAndView to3_2aa(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		int tiaojian = Integer.parseInt(request.getParameter("tiaojian"));
		String name = request.getParameter("name");
		List<Bollow> bollows = new ArrayList<Bollow>();
		if (admin!=null) {
			List<Bollow> bollows2 = bollowService.selAll();
			switch (tiaojian) {
			case 1:{bollows = bollowService.selAll();break;}
			case 2:{
				for (Bollow bollow : bollows2) {
					if (bollow.getUserId().getName().equals(name)) {
						bollows.add(bollow);
					}
				}
				break;
				}
			case 3:{
				for (Bollow bollow : bollows2) {
					if (bollow.getBookUuid().getBookName().equals(name)) {
						bollows.add(bollow);
					}
				}
				break;
				}
			case 4:{
				for (Bollow bollow : bollows2) {
					if (bollow.getBookUuid().getAuthor().equals(name)) {
						bollows.add(bollow);
					}
				}
				break;
				}
			case 5:{bollows = bollowService.selNoReturn();break;}
			case 6:{bollows = bollowService.selYesReturn();break;}
			default:
				break;
			}
			mv.addObject("bollows", bollows);
			mv.setViewName("admin/3_2a");
			return mv;
		} else {
			return mv;
		}
	}
	@RequestMapping(value="to3_3")
	public ModelAndView to3_3(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			List<Bollow> bollows = bollowService.selYesReturn(); 
			mv.addObject("bollows", bollows);
			mv.setViewName("admin/3_3");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping(value="3_3xq")
	public ModelAndView xq3_3(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			Bollow bollow = bollowService.selByUuid(uuid);
			mv.addObject("bollow", bollow);
			mv.setViewName("admin/3_3a");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping(value="to3_4")
	public ModelAndView to3_4(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			List<Bollow> bollows = bollowService.selNoReturn(); 
			mv.addObject("bollows", bollows);
			mv.setViewName("admin/3_4");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping(value="hs")
	public void hs(HttpServletRequest request,HttpServletResponse response) throws IOException{
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String uuid = request.getParameter("uuid");
		if (admin!=null) {
			try {
				bollowService.updateReturned(uuid);
				User user = bollowService.selByUuid(uuid).getUserId();
				userService.updateBollowed2(user.getId());
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
				e.printStackTrace();
			}
		} else {
			response.getWriter().write("login");
		}
	}
	//=====================================================================
	@RequestMapping(value="to4_1")
	public ModelAndView to4_1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			mv.addObject("admin", admin);
			mv.setViewName("admin/4_1");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("4_1xg")
	public void xg4_1(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String name = request.getParameter("name");
		String sex = request.getParameter("author");
		String tel = request.getParameter("translator");
		String idNo = request.getParameter("price");
		String account = request.getParameter("page");
		if (admin!=null) {
			try {
				adminService.deleteByUuid(admin.getUuid());
				adminService.insertAdmin(admin.getUuid(), account, admin.getPwd(), name, sex, idNo, tel);
				request.getSession().setAttribute("admin", adminService.selByIdNo2(admin.getIdNo()));
				response.getWriter().write("ok");
			} catch (Exception e) {
				response.getWriter().write("error");
				e.printStackTrace();
			}
		} else {
			response.getWriter().write("login");
		}
	}
	@RequestMapping(value="to4_2")
	public ModelAndView to4_2(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			mv.setViewName("admin/4_2");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("4_2xg")
	public void xg4_2(HttpServletRequest request,HttpServletResponse response) throws IOException, NoSuchAlgorithmException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String oldPwd = request.getParameter("name");
		String newPwd = request.getParameter("author");
		if (admin!=null) {
			if(Util_1.sHAEncrypt(oldPwd).equals(admin.getPwd())) {
				try {
					adminService.updetPwd(admin.getUuid(), Util_1.sHAEncrypt(newPwd));
					request.getSession().setAttribute("admin", adminService.selByIdNo2(admin.getIdNo()));
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
	
	@RequestMapping(value="to5_1")
	public ModelAndView to5_1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin!=null) {
			LibraryMsg libraryMsg = libraryMsgService.selLibraryMsg();
			mv.addObject("libraryMsg", libraryMsg);
			mv.setViewName("admin/5_1");
			return mv;
		} else {
			mv.setViewName("redirect:/index.jsp");
			return mv;
		}
	}
	@RequestMapping("5_1xg")
	public void xg5_1(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		String name = request.getParameter("name");
		String adress = request.getParameter("author");
		String tel = request.getParameter("translator");
		Date inTime = Date.valueOf(request.getParameter("price"));
		String context = request.getParameter("page");
		if (admin!=null) {
				try {
					libraryMsgService.deleteLibraryMsg();
					libraryMsgService.insertLibraryMsg(name, tel, adress, inTime, context);
					response.getWriter().write("ok");
				} catch (Exception e) {
					response.getWriter().write("error");
					e.printStackTrace();
				}
		} else {
			response.getWriter().write("login");
		}
	}
	
	
}
//Admin admin = (Admin) request.getSession().getAttribute("admin");
//if (admin!=null) {
//	
//} else {
//	mv.setViewName("redirect:/index.jsp");
//	return mv;
//}
