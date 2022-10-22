package com.hcl.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

import com.hcl.model.ContactDtlsEntity;

@Repository
public interface ContactDtlsRepository extends CrudRepository<ContactDtlsEntity,Serializable> {
    //select * from contact_dtls where c_name=?
	public ContactDtlsEntity findByContactName(String contactName);
	//select * from contact_dtls where c_num=?
    public ContactDtlsEntity findByContactNumber(Long contactNumber);
   // select * from contact_dtls where c_name=? and c_num=?
    public ContactDtlsEntity findByContactNameAndContactNumber(String contactName,Long contactNumber);
    @Query("select contactName from ContactDtlsEntity where =C_ID")
    public String getContactNameByContactId(String id);
    
    
    
}
