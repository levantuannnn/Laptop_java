	package com.example.demo.Enity;

import java.util.Set;

import com.example.demo.enity_anh.Enity_anh;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table; 
@Entity
@Table(name="laptops")
public class PersonEnity {
     @Id
     @Column(name="ID")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int  id;  
     @Column(name="ten_laptop")
     private String tenlaptop;
     @Column(name="Gia")
     private int gia;
     @Column(name = "Anh", columnDefinition = "LONGBLOB") 
     private byte[] Anh;
  
     @OneToMany(mappedBy = "laptop", fetch = FetchType.LAZY) 
     @JsonIgnore// Quan hệ 1-n (Laptop -> AnhLaptop)
     private Set<Enity_anh>  anhLapTops; // Liên kết với ảnh (Bảng anh_laptop)
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		 id= iD;
	}
	public String getTenlaptop() {
		return tenlaptop;
	}
	public void setTenlaptop(String tenLaptop) {
		tenlaptop = tenLaptop;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public byte[] getAnh() {
		return Anh;
	}
	public void setAnh(byte[] anh) {
		Anh = anh;
	}
 
	public PersonEnity(int iD, String tenLaptop, int gia, byte[] anh ) {
		super();
		id = iD; 
		gia = gia;
		Anh = anh;
		tenlaptop= tenLaptop;
	 
	}
	public PersonEnity() {
		super();
		// TODO Auto-generated constructor stub
	}
  
}
