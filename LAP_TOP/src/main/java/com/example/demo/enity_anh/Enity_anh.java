package com.example.demo.enity_anh;

import com.example.demo.Enity.PersonEnity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "anh_laptop")
public class Enity_anh {  
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id; 
	    @ManyToOne(fetch = FetchType.LAZY) // Liên kết với Laptop
	    @JoinColumn(name = "LaptopID", referencedColumnName = "ID")
	    private PersonEnity laptop; // Đối tượng liên kết với Laptop (Entity Laptop)

	    @Column(name = "URLAnh")
	    private String tenAnh;

	    @Lob // Dùng LOB để lưu trữ dữ liệu ảnh lớn
	    @Column(name = "DuLieuAnh")
	    private byte[] duLieuAnh;

	    // Getter và Setter
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public PersonEnity getLaptop() {
	        return laptop;
	    }

	    public void setLaptop(PersonEnity laptop) {
	        this.laptop = laptop;
	    }

	    public String getTenAnh() {
	        return tenAnh;
	    }

	    public void setTenAnh(String tenAnh) {
	        this.tenAnh = tenAnh;
	    }

	    public byte[] getDuLieuAnh() {
	        return duLieuAnh;
	    }

	    public void setDuLieuAnh(byte[] duLieuAnh) {
	        this.duLieuAnh = duLieuAnh;
	    }
	

}
