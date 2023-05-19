package com.sf.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sf.employee.dao.PlaceDao;
import com.sf.employee.bean.Country;
import com.sf.employee.bean.Location;
import com.sf.employee.bean.RoleBean;
import com.sf.employee.bean.State;
import com.sf.employee.bean.BranchBean;
import com.sf.employee.bean.City;



@Service
public class PlaceService {
	@Autowired
	private PlaceDao pldao;
	
	
	 public  List<Country> getCountry(){
			return pldao.getCountry();
		}
	 
	 public ArrayList<State> getStateBycountryid(String countryid) {
		 return pldao.getStateBycountryid(countryid);
	 }
	 
	 public ArrayList<City> getCityBystateid(String stateid) {
		 return pldao.getCityBystateid(stateid);
	 }
	 
	 public ArrayList<Location> getLocationBycityid(String cityid) {
		 return pldao.getLocationBycityid(cityid);
	 }
	 
	 public String addCountry(Country country) {
			return pldao.addCountry(country);

	}
	 public String addState(State state) {
			return pldao.addState(state);

	}
	 public String addCity(City city) {
			return pldao.addCity(city);

	}
	 public String addLocation(Location location) {
			return pldao.addLocation(location);

	}
	 public Location viewlocationbyId(String locationid) {
		 return pldao.viewlocationbyId(locationid);
	 }
	 public boolean modifyCountry(Country country) {
			return pldao.modifyCountry(country);
		}
	 public boolean modifyState(State state) {
			return pldao.modifyState(state);
		}
	 public boolean modifyCity(City city) {
			return pldao.modifyCity ( city);
		}
	 public boolean modifyLocation(Location location) {
			return pldao.modifyLocation( location);
		}
	 public Country ViewCountrybyid(String countryid) {
		   return pldao.viewCountrybyId(countryid);
	 }
	 public State viewStatebyId(String stateid) {
		   return pldao.viewStatebyId(stateid);
	 }
	 public City viewCitybyId(String cityid) {
		   return pldao.viewCitybyId(cityid);
	 }
	
}
