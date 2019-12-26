package travelagency.models;

import java.sql.Date;

public class TourData {
	private int idTour;
	private String nameTour;
	private String descriptionTour;
	private int idAirFlight;
	private int priceTour;
	private int idCity;
	private int idHotel;
	public int getIdTour() {
		return idTour;
	}
	public void setIdTour(int idTour) {
		this.idTour = idTour;
	}
	public String getNameTour() {
		return nameTour;
	}
	public void setNameTour(String nameTour) {
		this.nameTour = nameTour;
	}
	public String getDescriptionTour() {
		return descriptionTour;
	}
	public void setDescriptionTour(String descriptionTour) {
		this.descriptionTour = descriptionTour;
	}
	public int getIdAirFlight() {
		return idAirFlight;
	}
	public void setIdAirFlight(int idAirFlight) {
		this.idAirFlight = idAirFlight;
	}
	public int getPriceTour() {
		return priceTour;
	}
	public void setPriceTour(int priceTour) {
		this.priceTour = priceTour;
	}
	public int getIdCity() {
		return idCity;
	}
	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}
	public int getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}
	@Override
	public String toString() {
		return "TourData [idTour=" + idTour + ", nameTour=" + nameTour + ", descriptionTour=" + descriptionTour
				+ ", idAirFlight=" + idAirFlight + ", priceTour=" + priceTour + ", idCity=" + idCity + ", idHotel="
				+ idHotel + "]";
	}
	
	
}