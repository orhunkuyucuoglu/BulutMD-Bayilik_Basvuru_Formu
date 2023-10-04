package com.app.entity; 

import jakarta.persistence.Entity; 

import jakarta.persistence.Table; 

import lombok.AllArgsConstructor; 

import lombok.Data; 

import lombok.NoArgsConstructor;
 
@Data
@AllArgsConstructor 
@NoArgsConstructor 
@Entity 
@Table(name="user") 

public class User{ 

	private String isim; 
	private String tc; 
	private String adres; 
	private String telefon_no; 
	private String e_posta; 
	private String dogum_tarihi; 
	private String ticaret_durumu; 
	private String tercih_sebebi; 
	private String konum; 
	private String yatirim_miktari; 
	private String ekler; 
	
}

	 