package com.hospital.managements.dto.errorResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ResponseDto {
    private String statusCode;
    private String statusMessage;
}
