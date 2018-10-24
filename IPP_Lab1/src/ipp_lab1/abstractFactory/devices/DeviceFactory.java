/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipp_lab1.abstractFactory.devices;

import ipp_lab1.AbstractFactory;
import ipp_lab1.abstractFactory.devices.Laptop;
import ipp_lab1.abstractFactory.devices.PC;
import ipp_lab1.abstractFactory.vehicles.Vehicle;

/**
 *
 * @author andrei
 */
public class DeviceFactory extends AbstractFactory {

    @Override
    public Device getDevice(String purpose) {
        if(purpose.equals("portable")){
            return new Laptop();
        }else if(purpose.equals("powerful")){
            return new PC();
        }
        
        return  null;
        
    }

    @Override
    public Vehicle getVehicle(int nrOfWheels) {
        return null;
    }
    
    
}
