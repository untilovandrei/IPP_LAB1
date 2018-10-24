/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipp_lab1;

import ipp_lab1.abstractFactory.devices.DeviceFactory;
import ipp_lab1.abstractFactory.vehicles.VehicleFactory;

/**
 *
 * @author andrei
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if(factoryType.equals("vehicle")){
            return new VehicleFactory();
        }else if(factoryType.equals("device")){
            return new DeviceFactory();
        }
        return null;
    }
}
