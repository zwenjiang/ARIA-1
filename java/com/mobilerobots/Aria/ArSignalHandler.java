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

public class ArSignalHandler extends ArASyncTask {
  private transient long swigCPtr;

  public ArSignalHandler(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.ArSignalHandler_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArSignalHandler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArSignalHandler(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static void createHandlerNonThreaded() {
    AriaJavaJNI.ArSignalHandler_createHandlerNonThreaded();
  }

  public static void createHandlerThreaded() {
    AriaJavaJNI.ArSignalHandler_createHandlerThreaded();
  }

  public static void blockCommon() {
    AriaJavaJNI.ArSignalHandler_blockCommon();
  }

  public static void unblockAll() {
    AriaJavaJNI.ArSignalHandler_unblockAll();
  }

  public static void block(ArSignalHandler.Signal sig) {
    AriaJavaJNI.ArSignalHandler_block(sig.swigValue());
  }

  public static void unblock(ArSignalHandler.Signal sig) {
    AriaJavaJNI.ArSignalHandler_unblock(sig.swigValue());
  }

  public static void handle(ArSignalHandler.Signal sig) {
    AriaJavaJNI.ArSignalHandler_handle(sig.swigValue());
  }

  public static void unhandle(ArSignalHandler.Signal sig) {
    AriaJavaJNI.ArSignalHandler_unhandle(sig.swigValue());
  }

  public static void addHandlerCB(ArFunctor1_Int func, ArListPos.Pos position) {
    AriaJavaJNI.ArSignalHandler_addHandlerCB(ArFunctor1_Int.getCPtr(func), func, position.swigValue());
  }

  public static void delHandlerCB(ArFunctor1_Int func) {
    AriaJavaJNI.ArSignalHandler_delHandlerCB(ArFunctor1_Int.getCPtr(func), func);
  }

  public static void delAllHandlerCBs() {
    AriaJavaJNI.ArSignalHandler_delAllHandlerCBs();
  }

  public static ArSignalHandler getHandler() {
    long cPtr = AriaJavaJNI.ArSignalHandler_getHandler();
    return (cPtr == 0) ? null : new ArSignalHandler(cPtr, false);
  }

  public static String nameSignal(int sig) {
    return AriaJavaJNI.ArSignalHandler_nameSignal(sig);
  }

  public static void blockCommonThisThread() {
    AriaJavaJNI.ArSignalHandler_blockCommonThisThread();
  }

  public static void blockAllThisThread() {
    AriaJavaJNI.ArSignalHandler_blockAllThisThread();
  }

  public SWIGTYPE_p_void runThread(SWIGTYPE_p_void arg) {
    long cPtr = AriaJavaJNI.ArSignalHandler_runThread(swigCPtr, this, SWIGTYPE_p_void.getCPtr(arg));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void signalCB(int sig) {
    AriaJavaJNI.ArSignalHandler_signalCB(sig);
  }

  public static void logThread() {
    AriaJavaJNI.ArSignalHandler_logThread();
  }

  public final static class Signal {
    public final static ArSignalHandler.Signal SigHUP = new ArSignalHandler.Signal("SigHUP", AriaJavaJNI.ArSignalHandler_SigHUP_get());
    public final static ArSignalHandler.Signal SigINT = new ArSignalHandler.Signal("SigINT");
    public final static ArSignalHandler.Signal SigQUIT = new ArSignalHandler.Signal("SigQUIT");
    public final static ArSignalHandler.Signal SigILL = new ArSignalHandler.Signal("SigILL");
    public final static ArSignalHandler.Signal SigTRAP = new ArSignalHandler.Signal("SigTRAP");
    public final static ArSignalHandler.Signal SigABRT = new ArSignalHandler.Signal("SigABRT");
    public final static ArSignalHandler.Signal SigBUS = new ArSignalHandler.Signal("SigBUS");
    public final static ArSignalHandler.Signal SigFPE = new ArSignalHandler.Signal("SigFPE");
    public final static ArSignalHandler.Signal SigKILL = new ArSignalHandler.Signal("SigKILL");
    public final static ArSignalHandler.Signal SigUSR1 = new ArSignalHandler.Signal("SigUSR1");
    public final static ArSignalHandler.Signal SigSEGV = new ArSignalHandler.Signal("SigSEGV");
    public final static ArSignalHandler.Signal SigUSR2 = new ArSignalHandler.Signal("SigUSR2");
    public final static ArSignalHandler.Signal SigPIPE = new ArSignalHandler.Signal("SigPIPE");
    public final static ArSignalHandler.Signal SigALRM = new ArSignalHandler.Signal("SigALRM");
    public final static ArSignalHandler.Signal SigTERM = new ArSignalHandler.Signal("SigTERM");
    public final static ArSignalHandler.Signal SigSTKFLT = new ArSignalHandler.Signal("SigSTKFLT");
    public final static ArSignalHandler.Signal SigCHLD = new ArSignalHandler.Signal("SigCHLD");
    public final static ArSignalHandler.Signal SigCONT = new ArSignalHandler.Signal("SigCONT");
    public final static ArSignalHandler.Signal SigSTOP = new ArSignalHandler.Signal("SigSTOP");
    public final static ArSignalHandler.Signal SigTSTP = new ArSignalHandler.Signal("SigTSTP");
    public final static ArSignalHandler.Signal SigTTIN = new ArSignalHandler.Signal("SigTTIN");
    public final static ArSignalHandler.Signal SigTTOU = new ArSignalHandler.Signal("SigTTOU");
    public final static ArSignalHandler.Signal SigURG = new ArSignalHandler.Signal("SigURG");
    public final static ArSignalHandler.Signal SigXCPU = new ArSignalHandler.Signal("SigXCPU");
    public final static ArSignalHandler.Signal SigXFSZ = new ArSignalHandler.Signal("SigXFSZ");
    public final static ArSignalHandler.Signal SigVTALRM = new ArSignalHandler.Signal("SigVTALRM");
    public final static ArSignalHandler.Signal SigPROF = new ArSignalHandler.Signal("SigPROF");
    public final static ArSignalHandler.Signal SigWINCH = new ArSignalHandler.Signal("SigWINCH");
    public final static ArSignalHandler.Signal SigIO = new ArSignalHandler.Signal("SigIO");
    public final static ArSignalHandler.Signal SigPWR = new ArSignalHandler.Signal("SigPWR");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Signal swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Signal.class + " with value " + swigValue);
    }

    private Signal(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Signal(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Signal(String swigName, Signal swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Signal[] swigValues = { SigHUP, SigINT, SigQUIT, SigILL, SigTRAP, SigABRT, SigBUS, SigFPE, SigKILL, SigUSR1, SigSEGV, SigUSR2, SigPIPE, SigALRM, SigTERM, SigSTKFLT, SigCHLD, SigCONT, SigSTOP, SigTSTP, SigTTIN, SigTTOU, SigURG, SigXCPU, SigXFSZ, SigVTALRM, SigPROF, SigWINCH, SigIO, SigPWR };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
