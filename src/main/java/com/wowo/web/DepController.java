package com.wowo.web;

import com.wowo.entity.Dep;
import com.wowo.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dep")
public class DepController {
    @Autowired
    private DepService depService;
    @RequestMapping("findAll")
    public ResponseEntity<List<Dep>> findAll(){
        return ResponseEntity.ok(depService.findAll());
    }
    @RequestMapping("findByCondition")
    public ResponseEntity<List<Dep>>findByCondition(
            @RequestParam(value = "name",required = false) String name,
            @RequestParam(value = "tele",required = false) String tele
    ){
        List<Dep> result = depService.findByCondition(name, tele);
        return ResponseEntity.ok(result);
    }
    @RequestMapping("addDep")
    @Transactional
    public void addDep(Dep dep){
        depService.addDep(dep);
    }


}
