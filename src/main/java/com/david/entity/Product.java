package com.david.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6690224294398503184L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "BRAND")
	private String brand;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private BigDecimal price;
	@Column(name = "STORE")
	private Integer store;

}
