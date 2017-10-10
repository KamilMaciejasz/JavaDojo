package realEstate;

import java.util.Scanner;


public class Estate {
    private String address;
    private short numberOfBedrooms;
    private int areaInSqrMeters;

    public short getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public int getAreaInSqrMeters() {
        return areaInSqrMeters;
    }

    public void setAreaInSqrMeters(int areaInSqrMeters) {
        if(areaInSqrMeters > 0) {
            this.areaInSqrMeters = areaInSqrMeters;
        }
    }

    public void setNumberOfBedrooms(short numberOfBedrooms) {
        if (numberOfBedrooms >= 0 && numberOfBedrooms <= 32000){
            this.numberOfBedrooms = numberOfBedrooms;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address != null && !address.equals("")){
            this.address = address;
        }
    }

    public int costPerSquareMeter(int base){
        return base*this.getAreaInSqrMeters();
    }

    public int costPerBedroom(int base){
        return base*this.numberOfBedrooms;
    }

    public void getDetailsPrintDetails(Scanner input){
        this.setAddress(input.nextLine());
        this.setAreaInSqrMeters(input.nextInt());
        this.setNumberOfBedrooms(input.nextShort());
        System.out.println("Estate at " + this.getAddress() + " has an area of " + this.getAreaInSqrMeters() + " and "
        + this.getNumberOfBedrooms() + " bedrooms");
    }
}