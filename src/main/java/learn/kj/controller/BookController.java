package learn.kj.controller;

import learn.kj.domain.Book;
import learn.kj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/book")
//@SessionAttributes("name")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/findAll")
    public String findAll(ModelMap modelMap){
        List<Book> list = bookService.findAll();
//        ModelAndView mav = new ModelAndView("success");
//        mav.addObject("list",list);
//        mav.addObject("name","Alice");
        modelMap.addAttribute("name","Alice");
        modelMap.addAttribute("list",list);
        return "success";
    }

    @RequestMapping("update")
    public String update(Book book){
        System.out.println(book);
        bookService.update(book);
        return "success";
    }
}
