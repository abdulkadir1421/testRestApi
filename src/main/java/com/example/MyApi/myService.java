package com.example.MyApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class myService {
    @Autowired

    myRepository repo;

    public void del(Long id){
        repo.deleteById(id);
    }
}
