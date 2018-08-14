/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2015 Adept Technology, Inc.
Copyright (C) 2016-2018 Omron Adept Technologies, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArGPSConnector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArGPSConnector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArGPSConnector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArGPSConnector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArGPSConnector(ArArgumentParser argParser) {
    this(AriaJavaJNI.new_ArGPSConnector(ArArgumentParser.getCPtr(argParser), argParser), true);
  }

  public boolean parseArgs() {
    return AriaJavaJNI.ArGPSConnector_parseArgs(swigCPtr, this);
  }

  public ArGPS createGPS(ArRobot robot) {
    long cPtr = AriaJavaJNI.ArGPSConnector_createGPS__SWIG_0(swigCPtr, this, ArRobot.getCPtr(robot), robot);
    return (cPtr == 0) ? null : new ArGPS(cPtr, false);
  }

  public ArGPS createGPS() {
    long cPtr = AriaJavaJNI.ArGPSConnector_createGPS__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new ArGPS(cPtr, false);
  }

  public ArGPS create(ArRobot robot) {
    long cPtr = AriaJavaJNI.ArGPSConnector_create__SWIG_0(swigCPtr, this, ArRobot.getCPtr(robot), robot);
    return (cPtr == 0) ? null : new ArGPS(cPtr, false);
  }

  public ArGPS create() {
    long cPtr = AriaJavaJNI.ArGPSConnector_create__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new ArGPS(cPtr, false);
  }

  public ArGPSConnector.GPSType getGPSType() {
    return ArGPSConnector.GPSType.swigToEnum(AriaJavaJNI.ArGPSConnector_getGPSType(swigCPtr, this));
  }

  public final static class GPSType {
    public final static ArGPSConnector.GPSType Standard = new ArGPSConnector.GPSType("Standard");
    public final static ArGPSConnector.GPSType Novatel = new ArGPSConnector.GPSType("Novatel");
    public final static ArGPSConnector.GPSType Trimble = new ArGPSConnector.GPSType("Trimble");
    public final static ArGPSConnector.GPSType Invalid = new ArGPSConnector.GPSType("Invalid");
    public final static ArGPSConnector.GPSType NovatelSPAN = new ArGPSConnector.GPSType("NovatelSPAN");
    public final static ArGPSConnector.GPSType Simulator = new ArGPSConnector.GPSType("Simulator");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static GPSType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + GPSType.class + " with value " + swigValue);
    }

    private GPSType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private GPSType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private GPSType(String swigName, GPSType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static GPSType[] swigValues = { Standard, Novatel, Trimble, Invalid, NovatelSPAN, Simulator };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
