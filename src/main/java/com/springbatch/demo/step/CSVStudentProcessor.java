package com.springbatch.demo.step;

import com.springbatch.demo.domain.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CSVStudentProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        student.setCreationDate(new Date());
        return student.getAge()<18?null:student;
    }
}
