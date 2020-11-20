package org.example.controller;

import org.example.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.example.entity.*;
import javax.annotation.Resource;

@RestController
@RequestMapping("/score")
public class StudentController {
    @Resource
    private StudentService studentService;

    @PostMapping("/insert")
    public CommonResult<?> insert(@RequestBody(required = false) Student student) {
        if (student == null) {
            return new CommonResult<>(3002, "学生信息不能为空");
        } else if (student.getName() == null) {
            return new CommonResult<>(3002, "学生姓名不能为空");
        } else if (student.getScore() == null) {
            return new CommonResult<>(3002, "学生成绩不能为空");
        } else {
            int i = studentService.insertStudent(student);
            if (i > 0) {
                return new CommonResult<>(200, "插入成功");
            } else {
                return new CommonResult<>(3003, "未知错误，插入失败");
            }
        }
    }

    @PutMapping("/update")
    public CommonResult<?> update(@RequestBody(required = false) Student student) {
        if (student == null) {
            return new CommonResult<>(3002, "学生信息不能为空");
        }
        else {
            int i = studentService.updateStudent(student);
            if (i > 0) {
                return new CommonResult<>(200, "更新成功");
            } else {
                return new CommonResult<>(3001, "没有找到id是" + student.getId() + "的记录");
            }
        }
    }

    @DeleteMapping("/delete")
    public CommonResult<?> delete(@RequestBody(required = false) Student student) {
        if (student == null) {
            return new CommonResult<>(3002, "学生信息不能为空");
        } else {
            int i = studentService.deleteStudent(student.getId());
            if (i > 0) {
                return new CommonResult<>(200, "删除成功");
            } else {
                return new CommonResult<>(3001, "没有找到id是" + student.getId() + "的记录");
            }
        }
    }
    @PostMapping("/find/page")
    public CommonResult<?> findPage(@RequestBody(required = false) Page page){
        if(page!=null){
            if(page.getCurrentPage()==null){
                return new CommonResult<>(3002,"currentPage不能为空");
            }
            else if(page.getPageSize()==null){
                return new CommonResult<>(3002,"pageSize不能为空");
            }
            else{
                page.setCurrentPage((page.getCurrentPage()-1)*page.getPageSize());
                List<Student> list=studentService.findPage(page);
                if(list.isEmpty()){
                    return new CommonResult<>(3001,"未查询到结果");
                }
                else{
                    return new CommonResult<>(200,"查询成功",list);
                }
            }
        }
        else{
            List<Student> list=studentService.findPage(null);
            return new CommonResult<>(200,"查询成功",list);
        }
    }
}
