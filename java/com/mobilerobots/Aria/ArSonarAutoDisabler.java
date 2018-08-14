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

public class ArSonarAutoDisabler {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArSonarAutoDisabler(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArSonarAutoDisabler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArSonarAutoDisabler(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArSonarAutoDisabler(ArRobot robot) {
    this(AriaJavaJNI.new_ArSonarAutoDisabler(ArRobot.getCPtr(robot), robot), true);
  }

  public void supress() {
    AriaJavaJNI.ArSonarAutoDisabler_supress(swigCPtr, this);
  }

  public ArFunctor getSupressCallback() {
    long cPtr = AriaJavaJNI.ArSonarAutoDisabler_getSupressCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public void unsupress() {
    AriaJavaJNI.ArSonarAutoDisabler_unsupress(swigCPtr, this);
  }

  public ArFunctor getUnsupressCallback() {
    long cPtr = AriaJavaJNI.ArSonarAutoDisabler_getUnsupressCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public void setAutonomousDriving() {
    AriaJavaJNI.ArSonarAutoDisabler_setAutonomousDriving(swigCPtr, this);
  }

  public ArFunctor getSetAutonomousDrivingCallback() {
    long cPtr = AriaJavaJNI.ArSonarAutoDisabler_getSetAutonomousDrivingCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public void clearAutonomousDriving() {
    AriaJavaJNI.ArSonarAutoDisabler_clearAutonomousDriving(swigCPtr, this);
  }

  public ArFunctor getClearAutonomousDrivingCallback() {
    long cPtr = AriaJavaJNI.ArSonarAutoDisabler_getClearAutonomousDrivingCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

}
