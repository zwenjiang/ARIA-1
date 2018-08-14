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

public class ArMapGPSCoords extends ArENUCoords {
  private transient long swigCPtr;

  public ArMapGPSCoords(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.ArMapGPSCoords_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArMapGPSCoords obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArMapGPSCoords(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArMapGPSCoords(ArLLACoords org) {
    this(AriaJavaJNI.new_ArMapGPSCoords__SWIG_0(ArLLACoords.getCPtr(org), org), true);
  }

  public ArMapGPSCoords() {
    this(AriaJavaJNI.new_ArMapGPSCoords__SWIG_1(), true);
  }

  public boolean convertMap2LLACoords(double ea, double no, double up, SWIGTYPE_p_double lat, SWIGTYPE_p_double lon, SWIGTYPE_p_double alt) {
    return AriaJavaJNI.ArMapGPSCoords_convertMap2LLACoords(swigCPtr, this, ea, no, up, SWIGTYPE_p_double.getCPtr(lat), SWIGTYPE_p_double.getCPtr(lon), SWIGTYPE_p_double.getCPtr(alt));
  }

  public boolean convertLLA2MapCoords(double lat, double lon, double alt, SWIGTYPE_p_double ea, SWIGTYPE_p_double no, SWIGTYPE_p_double up) {
    return AriaJavaJNI.ArMapGPSCoords_convertLLA2MapCoords__SWIG_0(swigCPtr, this, lat, lon, alt, SWIGTYPE_p_double.getCPtr(ea), SWIGTYPE_p_double.getCPtr(no), SWIGTYPE_p_double.getCPtr(up));
  }

  public boolean convertLLA2MapCoords(ArLLACoords lla, SWIGTYPE_p_double ea, SWIGTYPE_p_double no, SWIGTYPE_p_double up) {
    return AriaJavaJNI.ArMapGPSCoords_convertLLA2MapCoords__SWIG_1(swigCPtr, this, ArLLACoords.getCPtr(lla), lla, SWIGTYPE_p_double.getCPtr(ea), SWIGTYPE_p_double.getCPtr(no), SWIGTYPE_p_double.getCPtr(up));
  }

  public void setOrigin(ArLLACoords org) {
    AriaJavaJNI.ArMapGPSCoords_setOrigin(swigCPtr, this, ArLLACoords.getCPtr(org), org);
  }

  public void setMyOriginECEF(ArECEFCoords value) {
    AriaJavaJNI.ArMapGPSCoords_myOriginECEF_set(swigCPtr, this, ArECEFCoords.getCPtr(value), value);
  }

  public ArECEFCoords getMyOriginECEF() {
    long cPtr = AriaJavaJNI.ArMapGPSCoords_myOriginECEF_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ArECEFCoords(cPtr, false);
  }

  public void setMyOriginLLA(ArLLACoords value) {
    AriaJavaJNI.ArMapGPSCoords_myOriginLLA_set(swigCPtr, this, ArLLACoords.getCPtr(value), value);
  }

  public ArLLACoords getMyOriginLLA() {
    long cPtr = AriaJavaJNI.ArMapGPSCoords_myOriginLLA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ArLLACoords(cPtr, false);
  }

  public void setMyOriginSet(boolean value) {
    AriaJavaJNI.ArMapGPSCoords_myOriginSet_set(swigCPtr, this, value);
  }

  public boolean getMyOriginSet() {
    return AriaJavaJNI.ArMapGPSCoords_myOriginSet_get(swigCPtr, this);
  }

}
