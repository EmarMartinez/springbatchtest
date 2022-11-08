package com.springbatch.demo.step;

import com.springbatch.demo.domain.Student;
import com.springbatch.demo.repository.StudentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentItemWriter implements ItemWriter<Student> {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void write(List<? extends Student> list) throws Exception {
        studentRepository.saveAll(list);
    }
}
