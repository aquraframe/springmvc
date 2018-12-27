package learn.kj.service.impl;

import learn.kj.dao.BookDao;
import learn.kj.domain.Book;
import learn.kj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        List<Book> list = bookDao.findAll();
        return list;
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }
}
