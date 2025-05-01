package ir.maktabcw19.service;

import ir.maktabcw19.entity.Student;
import ir.maktabcw19.service.base.BaseService;

public interface StudentService extends BaseService<Student,Integer> {
    public Student showProfile(Integer studentId);
}
