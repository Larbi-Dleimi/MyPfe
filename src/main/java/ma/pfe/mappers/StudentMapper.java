package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {

    public StudentEntity convertToEntity(StudentDto studentDto){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDto.getId());
        studentEntity.setName(studentDto.getName());
        return studentEntity;
    }

    public StudentDto convertToDto(StudentEntity studentEntity){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(studentEntity.getId());
        studentDto.setName(studentEntity.getName());
        return studentDto;
    }

    public List<StudentEntity> convertToEntities(List<StudentDto> studentDtos){
        return studentDtos.stream().map(studentDto -> convertToEntity(studentDto)).collect(Collectors.toList());
    }

    public List<StudentDto> convertToDtos(List<StudentEntity> studentEntities){
        return studentEntities.stream().map(studentEntity -> convertToDto(studentEntity)).collect(Collectors.toList());
    }

}
