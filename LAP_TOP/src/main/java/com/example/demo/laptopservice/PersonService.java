package com.example.demo.laptopservice;

 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Enity.PersonEnity;
import com.example.demo.Enityjpa.laptopjpa;

@Service
public class PersonService {
      private laptopjpa demo;
      @Autowired 
      public PersonService(laptopjpa demo) {
    	   this.demo=demo;
      }
      public List<PersonEnity>  Getalltop(){
    	   List<PersonEnity> ans= demo.findAll();
    	   
    	   return demo.findAll();
      } 
      public void  addSV(PersonEnity st) {
    	   PersonEnity tmp=new PersonEnity();
    	   tmp.setGia(st.getGia());
    	   tmp.setTenlaptop(st.getTenlaptop());
    	   demo.save(tmp);
      }
      public void delete(String st) {
    	    try {
    	        int tmp = Integer.parseInt(st);
    	        Optional<PersonEnity> ans = demo.findById(tmp);
    	        if (ans.isPresent()) {
    	            demo.deleteById(tmp);
    	            System.out.println("Xóa thành công!");
    	        } else {
    	            System.out.println("Không tìm thấy người dùng có ID = " + tmp);
    	        }
    	    } catch (NumberFormatException e) {
    	        System.out.println("ID không hợp lệ: " + st);
    	    }
    	}
      public void updatesv(String st, PersonEnity enity) {
    	     int tmp=Integer.parseInt(st);
    	     Optional<PersonEnity> ans=demo.findById(tmp);
    	     if(ans.isPresent()) {
    	    	  PersonEnity ht=new PersonEnity();
    	    	  ht.setGia(enity.getGia());
    	    	  ht.setTenlaptop(enity.getTenlaptop());
    	    	  System.out.print("thanh cong"); 
    	     }
    	     else {
    	    	  System.out.print("khong thanh cong");
    	     }
      } 
}
