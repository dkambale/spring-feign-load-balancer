package com.codingworld.springfeign;

import com.codingworld.springfeign.bean.Book;
import com.codingworld.springfeign.bean.ResponseWithPort;
import com.codingworld.springfeign.consumers.BookConsumer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("student")
public class StudentController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/allbook")
  public ResponseWithPort getAllBook() {

    return restTemplate.getForObject("http://book-service/book/allbook", ResponseWithPort.class);
  }

}
