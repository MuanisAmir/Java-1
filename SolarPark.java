class SolarPark{

	
	//Set the Variables.
String city;
double peakpower;
  
	//set the values by constructor.
SolarPark(String newCity,double newPeakPower){
this.city= newCity;
this.peakpower = newPeakPower;}
  
	//set city by setter function
public void setCity(String newCity1){
this.city= newCity1;}


	//set peak power by setter function
public void setPeakPower(double newPeakPower1){
this.peakpower = newPeakPower1;}


	//print peak power
public double getPeakPower(){
return peakpower;}


	//print city
public String getCity(){
return city;}


}
