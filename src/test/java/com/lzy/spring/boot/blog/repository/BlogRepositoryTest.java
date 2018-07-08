package com.lzy.spring.boot.blog.repository;

import com.lzy.spring.boot.blog.domain.Blog;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogRepositoryTest {
    @Autowired
    private BlogRepository blogRepository;
    @Before
    public void initRepositoryData(){
        //清楚所有数据
        blogRepository.deleteAll();

        blogRepository.save(new Blog("佚名","越人歌",
                        "山有木兮木有枝，心悦君兮君不知。"));
        blogRepository.save(new Blog("新凉","徐玑",
                "水满田畴稻叶齐，日光穿树晓烟低。"));
        blogRepository.save(new Blog("相思","王维的相思",
                "此物最相思")); // 关键字"酒"

        blogRepository.save(new Blog("静夜思","李白的静夜思",
                "低头思故乡"));

    }
    @Test
    public void testFindByTitleLikeOrContentLike() throws Exception {
        Pageable pageable = new PageRequest(0,20);
        String title = "思";
        String summary = "相思";
        String content = "相思";
        Page<Blog> page = blogRepository.findByTitleLikeOrContentLike(title,summary,content,pageable);
        assertThat(page.getTotalElements()).isEqualTo(2);

        for(Blog blog : page.getContent()){
            System.out.println(blog.toString());
        }



    }

}