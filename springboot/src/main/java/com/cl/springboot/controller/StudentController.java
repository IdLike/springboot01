package com.cl.springboot.controller;

import com.cl.springboot.entity.Result;
import com.cl.springboot.repository.StrudentRepository;
import com.cl.springboot.entity.Student;
import com.cl.springboot.service.StudentService;
import com.cl.springboot.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StrudentRepository strudentRepository;
    @Autowired
    private StudentService studentService;
    @GetMapping("/list")
    public List<Student> studentList(){

        return  strudentRepository.findAll();
    }

    //添加
    @PostMapping("/save")
    public Result<Student> save(@Valid Student student, BindingResult bindingResult){

        Result result=null;
        if(bindingResult.hasErrors()){
            //System.out.println(bindingResult.getFieldError().getDefaultMessage());//打印错误信息
           result=ResultUtil.fail("error",bindingResult.getFieldError().getDefaultMessage());
        }else{
            strudentRepository.save(student);
           result=ResultUtil.success(student);
        }
        return result;
    }

    //查询
    @GetMapping("/get")
    public  Student findById(@RequestParam("id")Integer id){

        return  strudentRepository.findOne(id);
    }

    //更新
    @GetMapping("/update")
    public  Student update(@RequestParam("id")Integer id,@RequestParam("className")String classname){
        Student student=new Student();
        student.setId(id);
        student.setClassName(classname);
        strudentRepository.save(student);
        return  strudentRepository.save(student);
    }

    //删除
    @GetMapping("/delete")
    public  void delete (@RequestParam("id") Integer id){

      strudentRepository.delete(id);

    }

    //通过班级查询
    @GetMapping("/findbyClassName")
    public  List<Student> findByclassName(@RequestParam("className")String className){

        return  strudentRepository.findByClassName(className);
    }


    //批量添加

    @GetMapping("/batchSave")
    public  void  batchSave(){

        studentService.batchSave();
    }

    //获取某个学生的成绩

    @GetMapping("/getScore")
    public  void getScoreById(@RequestParam("id")Integer id) throws  Exception{

        studentService.getScoreById(id);
    }

}
