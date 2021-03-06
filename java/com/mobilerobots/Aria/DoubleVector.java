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

public class DoubleVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public DoubleVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(DoubleVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_DoubleVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DoubleVector() {
    this(AriaJavaJNI.new_DoubleVector__SWIG_0(), true);
  }

  public DoubleVector(long n) {
    this(AriaJavaJNI.new_DoubleVector__SWIG_1(n), true);
  }

  public long size() {
    return AriaJavaJNI.DoubleVector_size(swigCPtr, this);
  }

  public long capacity() {
    return AriaJavaJNI.DoubleVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AriaJavaJNI.DoubleVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AriaJavaJNI.DoubleVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AriaJavaJNI.DoubleVector_clear(swigCPtr, this);
  }

  public void add(double x) {
    AriaJavaJNI.DoubleVector_add(swigCPtr, this, x);
  }

  public double get(int i) {
    return AriaJavaJNI.DoubleVector_get(swigCPtr, this, i);
  }

  public void set(int i, double val) {
    AriaJavaJNI.DoubleVector_set(swigCPtr, this, i, val);
  }

}
