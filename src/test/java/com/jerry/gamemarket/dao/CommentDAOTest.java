package com.jerry.gamemarket.dao;

import com.jerry.gamemarket.entity.ArticleComment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Random;

/**
 * @author 叶俊晖
 * @date 2019/1/3 0003 0:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentDAOTest {
    @Autowired
    CommentDao commentDao;

    @Test
    public void createData(){
        String s1="fnsfgvoifnvlnreofireghpafjjflwendflfhihrgtgybv";
        for(int i=1;i<=100;i++){
            ArticleComment articleComment=new ArticleComment();
            articleComment.setArticleId(new Random().nextInt(101)+1);
            articleComment.setUserId("testUser_"+i);
            articleComment.setUserName("testUserName_"+i);
            articleComment.setUpdateTime(new Timestamp(System.currentTimeMillis()));
            articleComment.setDislikes(0);
            articleComment.setLikes(0);
            articleComment.setRole(0);
            int a=new Random().nextInt(s1.length());
            int b=new Random().nextInt(s1.length());
            int min=0;
            int max=s1.length();
            if(a>b){
                max=a;
                min=b;
            }else{
                max=b;
                max=a;
            }
            articleComment.setCommentText(s1.substring(min,max));
            commentDao.save(articleComment);
        }
    }
}