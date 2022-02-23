package com.codingworld.springfeign.consumers;

import com.codingworld.springfeign.bean.Book;
import com.codingworld.springfeign.bean.ResponseWithPort;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="book-service")
public interface BookConsumer {

  @GetMapping("/book/all")
  public List<Book> getAll();

  @GetMapping("/book/allbook")
  public ResponseWithPort getAllBook();
}
