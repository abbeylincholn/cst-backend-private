package com.hospital.managements.service.impl;

import com.hospital.managements.dto.departmentDto.DepartmentsRequestDto;
import com.hospital.managements.entity.Departments;
import com.hospital.managements.exception.DepartmentAlreadyExistsException;
import com.hospital.managements.mapper.DepartmentsMapper;
import com.hospital.managements.repository.DepartmentsRepository;
import com.hospital.managements.service.IDepartmentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
//@Transactional
public class DepartmentsServiceImpl implements IDepartmentsService{

    private final DepartmentsRepository departmentsRepository;

    private String formatDepartmentId(Long id) {
        return String.format("DEPT-%03d", id);
    }

    @Override
    public  void createDepartment(DepartmentsRequestDto departmentsRequestDto) {

        if (departmentsRepository.findByName(departmentsRequestDto.getName()).isPresent()) {
            throw new DepartmentAlreadyExistsException("Department with name " + departmentsRequestDto.getName() + " already exists.");
        }
        Departments department = DepartmentsMapper.mapToDepartments(departmentsRequestDto, new Departments());
        Departments saved = departmentsRepository.save(department);
        saved.setDepartmentId(formatDepartmentId(saved.getId()));
        departmentsRepository.save(saved);
    }

    /**
     * Creates a new department in the hospital management system.
     *
     * @param departmentsRequestDto the DTO containing the details of the department to be created
     */


    /**
     * Creates a new department in the hospital management system.
     *
     * @param departmentsRequestDto the DTO containing the details of the department to be created
     */
    /*@Override
    public void createDepartments(DepartmentsRequestDto departmentsRequestDto) {

    }*/

/*
     * Creates a new department in the hospital management system.
     *
     * @param departmentsRequestDto the DTO containing the details of the department to be created


    @Override
    public void createDepartments(DepartmentsRequestDto departmentsRequestDto) {

    }

*
     * Creates a new department in the hospital management system.
     *
     * @param departmentsRequestDto the DTO containing the details of the department to be created


   @Override
    public void createDepartments(DepartmentsRequestDto departmentsRequestDto) {

    }

 // Update an existing department using department code
    @Override
    public DepartmentsResponseDto updateDepartment(DepartmentsUpdateDto dto) {
        // Step 1: Look for department using code
        Optional<Departments> optional = departmentsRepository.findByCode(dto.getCode());

        if (optional.isEmpty()) {
            throw new RuntimeException("Department with code " + dto.getCode() + " not found.");
        }

        // Step 2: Get the department
        Departments department = optional.get();

        // Step 3: Update its fields using the mapper
        DepartmentsMapper.updateEntityFromDto(dto, department);

        // Step 4: Save the updated department
        Departments updated = departmentsRepository.save(department);

        // Step 5: Return updated data as a response DTO
        return DepartmentsMapper.mapToResponseDto(updated);
    }

    // Get a department by code
    @Override
    public DepartmentsResponseDto getDepartmentByCode(String code) {
        Departments department = departmentsRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Department not found with code: " + code));

        return DepartmentsMapper.mapToResponseDto(department);
    }




*
     * Creates a new department in the hospital management system.
     *
     * @param departmentsRequestDto the DTO containing the details of the department to be created

    @Override
    public void createDepartments(DepartmentsRequestDto departmentsRequestDto) {

    } */

}
