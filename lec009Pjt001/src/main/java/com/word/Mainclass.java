package com.word;

import com.word.service.WordRegisterService;
import com.word.service.WordSearchService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.GenericArrayType;

public class Mainclass {
    public static void main(String[] args) {
        String[] keyWords = {"c","c++","java","jsp", "spring"};
        String[] values ={"1","2","3","4","5"};
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");

        WordRegisterService registerService = ctx.getBean("registerService", WordRegisterService.class);
        for(int i=0;i<values.length;i++){
            WordSet wordSet = new WordSet(keyWords[i],values[i]);
            registerService.register(wordSet);
        }

        WordSearchService searchService = ctx.getBean("searchService",WordSearchService.class);

        System.out.println("\n\n=======================");

        for(int i=0;i<keyWords.length;i++){
            WordSet wordSet = searchService.searchWord(keyWords[i]);
            System.out.print(wordSet.getWordKey()+":");
            System.out.println(wordSet.getWordValue());
            System.out.println("=======================");
        }
        System.out.println("\n\n");
        ctx.close();
    }

}
