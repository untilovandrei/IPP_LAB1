/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipp_lab1;

import ipp_lab1.abstractFactory.devices.Device;
import ipp_lab1.abstractFactory.vehicles.Vehicle;

/**
 *
 * @author andrei
 */
public abstract class AbstractFactory {
   public abstract Device getDevice(String description);
   public abstract Vehicle getVehicle(int nrOfWheels);
}
