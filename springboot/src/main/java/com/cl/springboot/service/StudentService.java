package com.cl.springboot.service;

import com.cl.springboot.enums.ResultEnum;
import com.cl.springboot.exception.StudentException;
import com.cl.springboot.repository.StrudentRepository;
import com.cl.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class StudentService {

    @Autowired
    private StrudentRepository strudentRepository;
    //批量添加
    @Transactional  //数据库事务
    public  void batchSave(){

        Student s1=new Student();
        s1.setName("王五三");
        s1.setClassName("三班");
        strudentRepository.save(s1);

        Student s2=new Student();
        s2.setName("赵六");
        s2=null;
        s2.setClassName("四班");
        strudentRepository.save(s2);
    }

    public void getScoreById(Integer id) throws  Exception {
        Integer score=strudentRepository.findOne(id).getScore();
        if(score<60){
            throw  new StudentException(ResultEnum.COMEON);
        }
        if(score>80){
            throw  new  StudentException(ResultEnum.GOOD);
        }
    }

    public  Student findOne(Integer id){

         return  strudentRepository.findOne(id);

    }
}
