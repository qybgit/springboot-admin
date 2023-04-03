package example;


import com.example.BlogApplication;
import com.example.dao.mapper.CommentMapper;
import com.example.dao.pojo.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;


@SpringBootTest(classes = BlogApplication.class)
public class BlogTest {
@Resource
CommentMapper mapper;
    @Test
    public void test(){

    }

}
