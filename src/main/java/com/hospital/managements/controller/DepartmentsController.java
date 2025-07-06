package com.hospital.managements.controller;

import com.hospital.managements.constants.HospitalConstants;
import com.hospital.managements.dto.departmentDto.DepartmentsRequestDto;
import com.hospital.managements.dto.errorResponseDto.ResponseDto;
import com.hospital.managements.service.IDepartmentsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class DepartmentsController {

    private IDepartmentsService iDepartmentsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createDepartment(@RequestBody DepartmentsRequestDto departmentsRequestDto) {

        iDepartmentsService.createDepartment(departmentsRequestDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(HospitalConstants.STATUS_201, HospitalConstants.MESSAGE_201));
    }
}
