package com.htc.springmvc.controller;

import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.htc.springmvc.services.PolicyService;
import com.htc.springmvc.to.PolicyResponse;
import com.htc.springmvc.to.PolicyTO;

@Controller
public class PolicyController {

	@Autowired
	PolicyService policyService;
	
	@PostMapping(value="/issuePolicy", consumes="application/json", produces="application/json")
	@ResponseBody
	public PolicyResponse issuePolicy(@RequestBody @Valid PolicyTO policyTO, BindingResult result){
		
		PolicyResponse response = new PolicyResponse();
		
		if(result.hasErrors()){
			System.out.println("Errors");
			Map<String, String> errors = result.getFieldErrors().stream()
		               .collect(
		                     Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage)
		                 );
			response.setValidated(false);
			response.setErrorMessages(errors);
		}
		else{
			System.out.println("Not errros");
			response.setValidated(true);
			boolean insertStatus = policyService.issuePolicy(policyTO);
			if(insertStatus){
				response.setStatusMessage("Policy Issued successfully");
			}
			else{
				response.setStatusMessage("Error while saving policy record");
			}
		}
		System.out.println(policyTO);		
		return response;
	}

}
