package com.htc.springmvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.springmvc.model.Customer;
import com.htc.springmvc.model.Policy;
import com.htc.springmvc.repository.CustomerRepository;
import com.htc.springmvc.repository.PolicyRepository;
import com.htc.springmvc.to.PolicyTO;

@Service
public class PolicyService {

	@Autowired
	PolicyRepository policyRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Policy getPolicy(PolicyTO policyTO){
		
		Policy policy = new Policy(policyTO.getPolicyno(), policyTO.getPremium(), policyTO.getIssueDate(), policyTO.getNextPremiumDate(), policyTO.getPolicyTerm());
		return policy;
	}
	
	public boolean issuePolicy(PolicyTO policyTO) {
		try{
			Optional<Customer> cust = customerRepository.findById(policyTO.getCustomerId());
			if(cust.isPresent()){
				Policy policy = getPolicy(policyTO);
				policy.setCustomer(cust.get());
				policyRepository.save(policy);
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
			
		}
	}
	
}

