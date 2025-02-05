package com.nishintgoyal.prod_ready_features2025.clients;

import com.nishintgoyal.prod_ready_features2025.dto.ThirdPartyTestingEntityDto;

import java.util.List;

public interface StudentClient
{
    List<ThirdPartyTestingEntityDto> getAllStudent();

    ThirdPartyTestingEntityDto createStudent(ThirdPartyTestingEntityDto inputData);
}
