package ma.pfe.services;

import ma.pfe.controllers.StudentController;
import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepositoryImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")
public class StudentServiceImp implements IStudentService{

    private static final Logger LOG = LoggerFactory.getLogger(StudentServiceImp.class);

    /*
    * remplacé par l'appel du constructeur
    */
    //@Autowired
    StudentRepositoryImp studentRepository;

    //@Autowired
    StudentMapper studentMapper;



    public StudentServiceImp(@Qualifier("repo1") StudentRepositoryImp studentRepository,StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }


    @Override
    public StudentDto create(StudentDto dto) {
        LOG.debug("Start method create {}",dto);
        LOG.debug("End method create {}",dto);
        return studentMapper.convertToDto(studentRepository.create(studentMapper.convertToEntity(dto)));
    }

    @Override
    public StudentDto update(StudentDto dto) {
        LOG.debug("Start method update {}",dto);
        LOG.debug("End method update {}",dto);
        return studentMapper.convertToDto(studentRepository.update(studentMapper.convertToEntity(dto)));
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("Start method delete {}",id);
        LOG.debug("End method delete {}",id);
        return studentRepository.delete(id);
    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug("Start method readAll");
        LOG.debug("End method readAll");
        return studentMapper.convertToDtos(studentRepository.readAll());
    }
}
