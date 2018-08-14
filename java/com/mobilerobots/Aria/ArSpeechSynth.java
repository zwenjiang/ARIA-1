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

public class ArSpeechSynth {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArSpeechSynth(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArSpeechSynth obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArSpeechSynth(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean init() {
    return AriaJavaJNI.ArSpeechSynth_init(swigCPtr, this);
  }

  public void addToConfig(ArConfig config) {
    AriaJavaJNI.ArSpeechSynth_addToConfig(swigCPtr, this, ArConfig.getCPtr(config), config);
  }

  public boolean speak(String str, String voiceParams, SWIGTYPE_p_ArRetFunctor2T_bool_short_p_int_t audioOutputCB, int sampleRate) {
    return AriaJavaJNI.ArSpeechSynth_speak__SWIG_0(swigCPtr, this, str, voiceParams, SWIGTYPE_p_ArRetFunctor2T_bool_short_p_int_t.getCPtr(audioOutputCB), sampleRate);
  }

  public boolean speak(String str, String voiceParams, SWIGTYPE_p_ArRetFunctor2T_bool_short_p_int_t audioOutputCB) {
    return AriaJavaJNI.ArSpeechSynth_speak__SWIG_1(swigCPtr, this, str, voiceParams, SWIGTYPE_p_ArRetFunctor2T_bool_short_p_int_t.getCPtr(audioOutputCB));
  }

  public boolean speak(String str, String voiceParams) {
    return AriaJavaJNI.ArSpeechSynth_speak__SWIG_2(swigCPtr, this, str, voiceParams);
  }

  public boolean speak(String str) {
    return AriaJavaJNI.ArSpeechSynth_speak__SWIG_3(swigCPtr, this, str);
  }

  public boolean speakf(String fmt) {
    return AriaJavaJNI.ArSpeechSynth_speakf(swigCPtr, this, fmt);
  }

  public void interrupt() {
    AriaJavaJNI.ArSpeechSynth_interrupt(swigCPtr, this);
  }

  public SWIGTYPE_p_ArRetFunctorCT_bool_ArSpeechSynth_t getInitCallback() {
    long cPtr = AriaJavaJNI.ArSpeechSynth_getInitCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArRetFunctorCT_bool_ArSpeechSynth_t(cPtr, false);
  }

  public SWIGTYPE_p_ArRetFunctor2CT_bool_ArSpeechSynth_char_const_p_char_const_p_t getSpeakCallback() {
    long cPtr = AriaJavaJNI.ArSpeechSynth_getSpeakCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArRetFunctor2CT_bool_ArSpeechSynth_char_const_p_char_const_p_t(cPtr, false);
  }

  public SWIGTYPE_p_ArFunctorCT_ArSpeechSynth_t getInterruptCallback() {
    long cPtr = AriaJavaJNI.ArSpeechSynth_getInterruptCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArFunctorCT_ArSpeechSynth_t(cPtr, false);
  }

  public void setAudioCallback(SWIGTYPE_p_ArRetFunctor2T_bool_short_p_int_t cb) {
    AriaJavaJNI.ArSpeechSynth_setAudioCallback(swigCPtr, this, SWIGTYPE_p_ArRetFunctor2T_bool_short_p_int_t.getCPtr(cb));
  }

  public void setAudioSampleRate(int rate) {
    AriaJavaJNI.ArSpeechSynth_setAudioSampleRate(swigCPtr, this, rate);
  }

  public int getAudioSampleRate() {
    return AriaJavaJNI.ArSpeechSynth_getAudioSampleRate(swigCPtr, this);
  }

  public void lock() {
    AriaJavaJNI.ArSpeechSynth_lock(swigCPtr, this);
  }

  public void unlock() {
    AriaJavaJNI.ArSpeechSynth_unlock(swigCPtr, this);
  }

  public boolean setVoice(String name) {
    return AriaJavaJNI.ArSpeechSynth_setVoice(swigCPtr, this, name);
  }

  public String getCurrentVoiceName() {
    return AriaJavaJNI.ArSpeechSynth_getCurrentVoiceName(swigCPtr, this);
  }

  public SWIGTYPE_p_std__listT_std__string_t getVoiceNames() {
    return new SWIGTYPE_p_std__listT_std__string_t(AriaJavaJNI.ArSpeechSynth_getVoiceNames(swigCPtr, this), true);
  }

}
