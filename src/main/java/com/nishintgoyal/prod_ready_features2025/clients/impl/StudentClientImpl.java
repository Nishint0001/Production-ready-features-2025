package com.nishintgoyal.prod_ready_features2025.clients.impl;

import com.nishintgoyal.prod_ready_features2025.clients.StudentClient;
import com.nishintgoyal.prod_ready_features2025.dto.ThirdPartyTestingEntityDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class StudentClientImpl implements StudentClient
{
    private final RestClient restClient;

    public StudentClientImpl(RestClient restClient) {
        this.restClient = restClient;
    }

    Logger logger = LoggerFactory.getLogger(StudentClientImpl.class);

    @Override
    public List<ThirdPartyTestingEntityDto> getAllStudent() {
    logger.trace("TRYING TO RETRIEVE ALL STUDENT DATA IN getALlStudent()");
        try {
            logger.info("Started");
            List<ThirdPartyTestingEntityDto> getToDto = restClient.get()
                    .uri("all")
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {
                    });
            logger.debug("Successfully Retreived the Student in getAllStudent()");
            logger.trace("Received employees list in getAllEmployee {}",getToDto);//{} fasterr than concatenation of string that why
            return getToDto;

        } catch (Exception e) {
            logger.error("Exception occurred in the getAllStudent()",e);
            throw new RuntimeException(e);
        }

    }

    @Override
    public ThirdPartyTestingEntityDto createStudent(ThirdPartyTestingEntityDto inputData) {
        try
        {
            ThirdPartyTestingEntityDto thirdPartyTestingEntityDto=restClient.post()
                    .uri("create")
                    .body(inputData)
                    .retrieve()
                    .body(new ParameterizedTypeReference<>(){

                    });

            return thirdPartyTestingEntityDto;

        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
