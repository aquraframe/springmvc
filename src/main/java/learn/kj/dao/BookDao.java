package learn.kj.dao;

import learn.kj.domain.Book;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface BookDao {

//    @Select("select * from book limit 0,10")
    List<Book> findAll();

//    @Update("update book set bookName=#{bookName},price=#{price} where id = #{id}")
    void update(Book book);
}
