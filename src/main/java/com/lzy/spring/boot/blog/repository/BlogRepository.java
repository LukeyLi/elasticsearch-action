package com.lzy.spring.boot.blog.repository;
import com.lzy.spring.boot.blog.domain.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BlogRepository extends ElasticsearchRepository<Blog,String> {
    Page<Blog> findByTitleLikeOrContentLike(String title,String summary ,String content, Pageable pageable);
}
