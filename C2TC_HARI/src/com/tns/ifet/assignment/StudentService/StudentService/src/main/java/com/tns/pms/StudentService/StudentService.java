package com.tns.pms.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
    private StudentRepository studentRepository;

    // Get All Students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get Student By ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Add New Student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update Existing Student
    public Student updateStudent(Long id, Student studentDetails) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            student.setPhone(studentDetails.getPhone());
            student.setDepartment(studentDetails.getDepartment());
            student.setEnrollmentNumber(studentDetails.getEnrollmentNumber());
            student.setCgpa(studentDetails.getCgpa());
            student.setGraduationYear(studentDetails.getGraduationYear());
            return studentRepository.save(student);
        }
        return null;
    }

    // Delete Student By ID
    public String deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Student record deleted successfully!";
        } else {
            return "Student record not found!";
        }
    }
}
