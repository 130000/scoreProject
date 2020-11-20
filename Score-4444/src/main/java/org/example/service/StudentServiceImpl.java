package org.example.service;


import org.example.mapper.StudentMapper;
import org.springframework.stereotype.Service;
import org.example.entity.*;
import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Resource
    private StudentMapper studentMapper;
    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudent(Integer id) {
        return studentMapper.deleteStudent(id);
    }

    @Override
    public List<Student> findPage(Page page) {
        return studentMapper.findPage(page);
    }
}
