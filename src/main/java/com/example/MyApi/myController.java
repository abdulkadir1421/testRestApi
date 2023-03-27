package com.example.MyApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class myController {
    @Autowired
    myRepository repository;
    @Autowired
    myService ser;
    @GetMapping("/find")
public List<entity> getAll(){
    return repository.findAll();
}

    @PostMapping("/product")
    public entity newPost(@RequestBody entity en) {
        return repository.save(en);
    }


//    @PutMapping("/post")
//    public void upda(@RequestBody entity en){
//    }

@DeleteMapping("/del/{id}")
public void dele(@PathVariable("id") Long id){
        ser.del(id);
}

@GetMapping("/post/{id}")
public entity getById(@PathVariable("id") Long id){
        return repository.getById(id);
}
}

