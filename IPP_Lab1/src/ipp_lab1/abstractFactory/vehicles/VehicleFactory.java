/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipp_lab1.abstractFactory.vehicles;

import ipp_lab1.AbstractFactory;
import ipp_lab1.abstractFactory.devices.Device;

/**
 *
 * @author andrei
 */
public class VehicleFactory extends AbstractFactory{

    

    @Override
    public Vehicle getVehicle(int nrOfWheels) {
        if(nrOfWheels==2){
            return new Motocycle();
        }else if(nrOfWheels==4){
            return new Car();
        }
        return null;
    }

    @Override
    public Device getDevice(String description) {
        return null;
    }

   




   
    
}
