package com.hcl;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hcl.model.ContactDtlsEntity;
import com.hcl.repository.ContactDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		ContactDtlsRepository dtlsRepo = ctx.getBean(ContactDtlsRepository.class);
		System.out.println("Name::"+dtlsRepo.getContactNameByContactId("150"));
		//System.out.println(dtlsRepo.findByContactNameAndContactNumber("balaraju",988865456l));
		//System.out.println(dtlsRepo.findByContactNumber(98886554l));
		
		//System.out.println(dtlsRepo.findByContactName("ravi"));
		
		
		/*
		 * long count = dtlsRepo.count(); System.out.println(count);
		 */
		// dtlsRepo.deleteById("143");

		/*
		 * Iterable<ContactDtlsEntity> findAll = dtlsRepo.findAll();
		 * for(ContactDtlsEntity cde:findAll) { System.out.println(cde); }
		 */
		/*
		 * Optional<ContactDtlsEntity> findById=dtlsRepo.findById("158");
		 * if(findById.isPresent()) { System.out.println(findById.get()); }else {
		 * System.out.println("NO recored found"); }
		 */
		/*
		 * Optional<ContactDtlsEntity> findById=dtlsRepo.findById("150");
		 * System.out.println(findById);
		 */
		
		/*
		 * ContactDtlsEntity entity=new ContactDtlsEntity(); entity.setId("159");
		 * entity.setContact_NAME("basha"); entity.setContact_NUMBER(987456231l);
		 * dtlsRepo.save(entity);
		 */
		 

	}

}
