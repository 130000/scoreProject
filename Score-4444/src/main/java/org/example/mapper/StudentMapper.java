package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.example.entity.*;
public interface StudentMapper{
    int insertStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(Integer id);
    List<Student> findPage(@Param("page") Page page);
}
