package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.services.StudentServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("repo1")
public class StudentRepositoryImp implements IStudentRepository {

    private static final Logger LOG = LoggerFactory.getLogger(StudentRepositoryImp.class);

    @Override
    public StudentEntity create(StudentEntity entity) {
        return new StudentEntity();
    }

    @Override
    public StudentEntity update(StudentEntity entity) {
        return new StudentEntity();
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        return new ArrayList<>();
    }
}
