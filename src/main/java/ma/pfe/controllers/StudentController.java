package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Profile({"local","dev"})
public class StudentController {

    private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);
    //@Autowired
    StudentServiceImp studentService;

    public StudentController(@Qualifier("service1") StudentServiceImp studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentDto create(@RequestBody StudentDto dto) {
        LOG.debug("Start method create {}",dto);
        LOG.debug("End method create {}",dto);
        return studentService.create(dto);
    }

    @PutMapping
    public StudentDto update(@RequestBody StudentDto dto) {
        LOG.debug("Start method update {}",dto);
        LOG.debug("End method update {}",dto);
        return studentService.update(dto);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id) {
        LOG.debug("Start method delete {}",id);
        LOG.debug("End method delete {}",id);
        return studentService.delete(id);
    }

    @GetMapping
    public List<StudentDto> readAll() {
        LOG.debug("Start method readAll");
        LOG.debug("End method readAll");
        return studentService.readAll();
    }
}
