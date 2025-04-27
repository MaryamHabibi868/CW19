package ir.maktabcw19.service;

import ir.maktabcw19.entity.Teacher;
import ir.maktabcw19.repository.TeacherRepository;
import ir.maktabcw19.service.base.BaseServiceImpl;

public class TeacherServiceImpl extends BaseServiceImpl<Teacher,
        Integer, TeacherRepository>  implements TeacherService{
    public TeacherServiceImpl(TeacherRepository repository) {
        super(repository);
    }
}
