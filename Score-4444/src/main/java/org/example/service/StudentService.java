package org.example.service;


import javax.annotation.Resource;
import java.util.List;
import org.example.entity.*;
/**
 * @author wsd_02
 */
public interface StudentService{
    int insertStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(Integer id);
    List<Student> findPage(Page page);
}
