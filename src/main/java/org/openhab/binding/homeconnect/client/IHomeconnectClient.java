/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.homeconnect.client;

import java.util.List;
import java.util.Map;

/**
 * Provides an interface to the Home Connect API.
 *
 * @author scrosby
 *         adapted to Home Connect: Stefan Foydl
 *
 */
public interface IHomeconnectClient {
    /**
     * Get a list of all devices connected to the Home Connect account
     *
     * @return List<IHomeconnectDevice> unordered list of devices connected to the Home Connect account
     */
    public List<IHomeconnectDevice> listDevices();

    /**
     * Retrieves a specific device identified by the device HAID (E-number at the physical device)
     *
     * @param type = Supported Home Connect Device
     * @param Id = HAID of the device to retrieve
     * @return IHomeconnectDevice object representing the device specified
     */
    public IHomeconnectDevice getDevice(HomeconnectSupportedDevice type, String Id);

    /**
     * Retrieves the status of a specific device identified by the device HAID (E-number at the physical device)
     *
     * @param type = Supported Home Connect Device
     * @param Id = HAID of the device to retrieve
     * @return IHomeconnectDevice object representing the device specified
     */
    public IHomeconnectDevice getDeviceState(IHomeconnectDevice device, String statuskey);

    /**
     * Updates the state of a specified device.
     *
     * @param device Current device object
     * @param updatedState A Map of states as strings to be updated and their new values
     * @return IHomeconnectDevice the updated result of the change.
     */
    public IHomeconnectDevice updateDeviceState(IHomeconnectDevice device, Map<String, String> updatedState);

    /**
     * Retrieves the setting of a specific device identified by the device HAID (E-number at the physical device)
     *
     * @param type = Supported Home Connect Device
     * @param Id = HAID of the device to retrieve
     * @return IHomeconnectDevice object representing the device specified
     */
    public IHomeconnectDevice getDeviceSetting(IHomeconnectDevice device, String settingkey);
}