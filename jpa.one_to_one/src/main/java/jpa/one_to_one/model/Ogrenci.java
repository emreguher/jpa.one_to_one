package jpa.one_to_one.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Ogrenci implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=30, nullable = false)
	private String ad;
	@Column(length=30, nullable = false)
	private String soyad;
	private Cinsiyet cinsiyet;
	@Temporal(TemporalType.DATE)
	private Date dogumTarihi;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private OgrenciKimlik kimlik;
	
	public OgrenciKimlik getKimlik() {
		return kimlik;
	}

	public void setKimlik(OgrenciKimlik kimlik) {
		this.kimlik = kimlik;
	}

	public Ogrenci() {}

	public Ogrenci(String ad, String soyad, Cinsiyet cinsiyet, Date dogumTarihi) {
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.dogumTarihi = dogumTarihi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public Date getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", cinsiyet=" + cinsiyet + ", dogumTarihi="
				+ dogumTarihi + ", kimlik=" + kimlik + "]";
	}
	
	
}
