package com.mrunmayi1.demo.controller;

import com.mrunmayi1.demo.model.DemoModel;
import com.mrunmayi1.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {
    @Autowired
    DemoRepository demoRepository;

    @GetMapping("/getallmodels")
    public List<DemoModel> getAllModel() {
        return demoRepository.findAll();
    }

    @PostMapping("/postallmodels")
    public DemoModel createModel(@Valid @RequestBody DemoModel demoModel){
            return demoRepository.save(demoModel);
        }


}
