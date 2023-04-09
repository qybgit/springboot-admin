package example;


import com.admin.BlogApplication;
import com.admin.dao.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest(classes = BlogApplication.class)
public class BlogTest {
@Resource
CommentMapper mapper;
    @Test
    public void test(){

    }

}
