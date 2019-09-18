package com.word.dao;

import com.word.WordSet;
import com.word.service.WordSearchService;

import java.util.HashMap;
import java.util.Map;

public class WordDao {
    private Map<String, WordSet> map = new HashMap<String,WordSet>();

    public void insert(WordSet w){
        map.put(w.getWordKey(),w);
    }
    public WordSet select(String s){
        return map.get(s);
    }
    public void delete(String s){
        map.remove(s);
    }
    public void update(WordSet w){
        map.put(w.getWordKey(),w);
    }

    public Map<String,WordSet> getWordDB(){
        return map;
    }
}
