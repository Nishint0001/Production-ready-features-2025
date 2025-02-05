package com.nishintgoyal.prod_ready_features2025;

import com.nishintgoyal.prod_ready_features2025.clients.StudentClient;
import com.nishintgoyal.prod_ready_features2025.dto.ThirdPartyTestingEntityDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductionReadyFeatures2025ApplicationTests
{
	@Autowired
	private StudentClient studentClient;

	@Test
	public void getAll()
	{
		List<ThirdPartyTestingEntityDto> getA=studentClient.getAllStudent();

		for(ThirdPartyTestingEntityDto x : getA)
		{
			System.out.println(x.getId() +" "+x.getName()+" "+x.getSalary()+" ");
		}
	}

	@Test
	public void createNewStudent()
	{
		ThirdPartyTestingEntityDto ans=new ThirdPartyTestingEntityDto(null,"abc",100000.9);

		ThirdPartyTestingEntityDto createThis=studentClient.createStudent(ans);

	//	System.out.println(createThis.); will check using postman

	}
}
