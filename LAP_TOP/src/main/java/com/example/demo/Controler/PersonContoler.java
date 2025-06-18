package com.example.demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Enity.PersonEnity;
import com.example.demo.enity.enity;
import com.example.demo.laptopservice.PersonService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/laptops")
public class PersonContoler {
	 @Autowired 
     private PersonService demo; 
     @GetMapping("/api")
     public ResponseEntity<List<PersonEnity>> allenity() {
         return new ResponseEntity<>(demo.Getalltop(), HttpStatus.OK);
     } 
     @PostMapping("/api/add")
     public String  addst(@RequestBody PersonEnity st) { 
    	 System.out.println("Gia tri nhan duoc tu client:");
    	    System.out.println("Ten laptop: " + st.getTenlaptop());
    	    System.out.println("Gia: " + st.getGia());
    	   demo.addSV(st);
    	   return "";
     }
     @DeleteMapping("/api/delete/{st}")
     public String deleteSV(@PathVariable String st) {
    	     demo.delete(st);
    	     return "";
     }
     @PutMapping("/api/{st}")
     public String upadate(@PathVariable String id,@RequestBody PersonEnity st) {
    	  demo.updatesv(id, st);
    	  return "";
     }
}
