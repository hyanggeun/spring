package com.word.service;

import com.word.WordSet;
import com.word.dao.WordDao;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;
import javax.annotation.Resources;


public class WordSearchService {
    @Resource
    private WordDao wordDao;
    /*
    생성자가 아닌 property나 method에 어노테이션을 사용할때는 무조건 기본 생성자를 만들어줘야한다.
     */
    public WordSearchService(){

    }
    @Resource
    public void setWordDao(WordDao wordDao) {
        this.wordDao = wordDao;
    }
    //@Autowired
    public WordSearchService(WordDao wordDao){
        this.wordDao = wordDao;
    }
    public WordSet searchWord(String keyWord){
        if(verify(keyWord)){
            return wordDao.select(keyWord);
        } else{
            System.out.println("Error");
        }
        return null;
    }

    private boolean verify(String s){
        return wordDao.select(s) != null;
    }
}
