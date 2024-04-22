package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Entity.Valids;
import com.Service.ValidService;

import jakarta.validation.Valid;

public class ValidController {
	
	@Autowired
	private ValidService validService;
	
	//Post Create User
	public ResponseEntity<Valids>createUser(@Valid @RequestBody Valids valids)
	{
		Valids createValid=this.validService.createUser(valids);
		return new ResponseEntity<>(createValid,HttpStatus.CREATED);
	}
	//Put update Usser
	@PutMapping("/{ValidsId")
	public ResponseEntity<Valid>UpdateValid(@RequestBody Valid valid, @PathVariable("user Update Successfully",true))
	{
		Valid UpdateValid=this.validService.updatevalid(valid,uid);
		return ResponseEntity.ok(updateUser);
	}
	
	//Delete user
	
	public ResponseEntity<ApiResponse>deleteuser(@PathVariable("ValidId")Integer uid){
		 this.validService.deleteUser(uid);
		 return new ResponseEntity<ApiResponse>(new ApiResponse("User delete Successfully",true));
	}

}
