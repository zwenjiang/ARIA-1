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

public class ArUtil {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArUtil(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArUtil obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArUtil(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static boolean ReturnTrue() {
    return AriaJavaJNI.ArUtil_ReturnTrue();
  }

  public static boolean ReturnFalse() {
    return AriaJavaJNI.ArUtil_ReturnFalse();
  }

  public static void sleep(long ms) {
    AriaJavaJNI.ArUtil_sleep(ms);
  }

  public static long getTime() {
    return AriaJavaJNI.ArUtil_getTime();
  }

  public static int findMin(int first, int second) {
    return AriaJavaJNI.ArUtil_findMin__SWIG_0(first, second);
  }

  public static int findMax(int first, int second) {
    return AriaJavaJNI.ArUtil_findMax__SWIG_0(first, second);
  }

  public static long findMinU(long first, long second) {
    return AriaJavaJNI.ArUtil_findMinU(first, second);
  }

  public static long findMaxU(long first, long second) {
    return AriaJavaJNI.ArUtil_findMaxU(first, second);
  }

  public static double findMin(double first, double second) {
    return AriaJavaJNI.ArUtil_findMin__SWIG_1(first, second);
  }

  public static double findMax(double first, double second) {
    return AriaJavaJNI.ArUtil_findMax__SWIG_1(first, second);
  }

  public static int sizeFile(String fileName) {
    return AriaJavaJNI.ArUtil_sizeFile__SWIG_0(fileName);
  }

  public static boolean findFile(String fileName) {
    return AriaJavaJNI.ArUtil_findFile(fileName);
  }

  public static void appendSlash(String path, long pathLength) {
    AriaJavaJNI.ArUtil_appendSlash__SWIG_0(path, pathLength);
  }

  public static void appendSlash(SWIGTYPE_p_std__string path) {
    AriaJavaJNI.ArUtil_appendSlash__SWIG_1(SWIGTYPE_p_std__string.getCPtr(path));
  }

  public static void fixSlashes(String path, long pathLength) {
    AriaJavaJNI.ArUtil_fixSlashes__SWIG_0(path, pathLength);
  }

  public static void fixSlashes(SWIGTYPE_p_std__string path) {
    AriaJavaJNI.ArUtil_fixSlashes__SWIG_1(SWIGTYPE_p_std__string.getCPtr(path));
  }

  public static void fixSlashesForward(String path, long pathLength) {
    AriaJavaJNI.ArUtil_fixSlashesForward(path, pathLength);
  }

  public static void fixSlashesBackward(String path, long pathLength) {
    AriaJavaJNI.ArUtil_fixSlashesBackward(path, pathLength);
  }

  public static char getSlash() {
    return AriaJavaJNI.ArUtil_getSlash();
  }

  public static void addDirectories(String dest, long destLength, String baseDir, String insideDir) {
    AriaJavaJNI.ArUtil_addDirectories(dest, destLength, baseDir, insideDir);
  }

  public static int strcmp(String str, String str2) {
    return AriaJavaJNI.ArUtil_strcmp__SWIG_0(str, str2);
  }

  public static int strcasecmp(String str, String str2) {
    return AriaJavaJNI.ArUtil_strcasecmp__SWIG_0(str, str2);
  }

  public static boolean strSuffixCmp(String str, String suffix) {
    return AriaJavaJNI.ArUtil_strSuffixCmp(str, suffix);
  }

  public static boolean strSuffixCaseCmp(String str, String suffix) {
    return AriaJavaJNI.ArUtil_strSuffixCaseCmp(str, suffix);
  }

  public static int strcasequotecmp(String str1, String str2) {
    return AriaJavaJNI.ArUtil_strcasequotecmp(str1, str2);
  }

  public static void escapeSpaces(String dest, String src, long maxLen) {
    AriaJavaJNI.ArUtil_escapeSpaces(dest, src, maxLen);
  }

  public static boolean stripQuotes(String dest, String src, long destLen) {
    return AriaJavaJNI.ArUtil_stripQuotes__SWIG_0(dest, src, destLen);
  }

  public static boolean stripQuotes(SWIGTYPE_p_std__string strToStrip) {
    return AriaJavaJNI.ArUtil_stripQuotes__SWIG_1(SWIGTYPE_p_std__string.getCPtr(strToStrip));
  }

  public static boolean fixBadCharacters(SWIGTYPE_p_std__string strToFix, boolean removeSpaces, boolean fixOtherWhiteSpace) {
    return AriaJavaJNI.ArUtil_fixBadCharacters__SWIG_0(SWIGTYPE_p_std__string.getCPtr(strToFix), removeSpaces, fixOtherWhiteSpace);
  }

  public static boolean fixBadCharacters(SWIGTYPE_p_std__string strToFix, boolean removeSpaces) {
    return AriaJavaJNI.ArUtil_fixBadCharacters__SWIG_1(SWIGTYPE_p_std__string.getCPtr(strToFix), removeSpaces);
  }

  public static void lower(String dest, String src, long maxLen) {
    AriaJavaJNI.ArUtil_lower(dest, src, maxLen);
  }

  public static boolean isOnlyAlphaNumeric(String str) {
    return AriaJavaJNI.ArUtil_isOnlyAlphaNumeric(str);
  }

  public static boolean isOnlyNumeric(String str) {
    return AriaJavaJNI.ArUtil_isOnlyNumeric(str);
  }

  public static boolean isStrEmpty(String str) {
    return AriaJavaJNI.ArUtil_isStrEmpty(str);
  }

  public static boolean isStrInList(String str, SWIGTYPE_p_std__listT_std__string_t list, boolean isIgnoreCase) {
    return AriaJavaJNI.ArUtil_isStrInList__SWIG_0(str, SWIGTYPE_p_std__listT_std__string_t.getCPtr(list), isIgnoreCase);
  }

  public static boolean isStrInList(String str, SWIGTYPE_p_std__listT_std__string_t list) {
    return AriaJavaJNI.ArUtil_isStrInList__SWIG_1(str, SWIGTYPE_p_std__listT_std__string_t.getCPtr(list));
  }

  public static double atof(String nptr) {
    return AriaJavaJNI.ArUtil_atof(nptr);
  }

  public static String convertBool(int val) {
    return AriaJavaJNI.ArUtil_convertBool(val);
  }

  public static void writeToFile(String str, SWIGTYPE_p_FILE file) {
    AriaJavaJNI.ArUtil_writeToFile(str, SWIGTYPE_p_FILE.getCPtr(file));
  }

  public static boolean getStringFromFile(String fileName, String str, long strLen) {
    return AriaJavaJNI.ArUtil_getStringFromFile(fileName, str, strLen);
  }

  public static boolean getStringFromRegistry(ArUtil.REGKEY root, String key, String value, String str, int len) {
    return AriaJavaJNI.ArUtil_getStringFromRegistry(root.swigValue(), key, value, str, len);
  }

  public static boolean findFirstStringInRegistry(String key, String value, String str, int len) {
    return AriaJavaJNI.ArUtil_findFirstStringInRegistry(key, value, str, len);
  }

  public static void setCOM1(String value) {
    AriaJavaJNI.ArUtil_COM1_set(value);
  }

  public static String getCOM1() {
    return AriaJavaJNI.ArUtil_COM1_get();
  }

  public static void setCOM2(String value) {
    AriaJavaJNI.ArUtil_COM2_set(value);
  }

  public static String getCOM2() {
    return AriaJavaJNI.ArUtil_COM2_get();
  }

  public static void setCOM3(String value) {
    AriaJavaJNI.ArUtil_COM3_set(value);
  }

  public static String getCOM3() {
    return AriaJavaJNI.ArUtil_COM3_get();
  }

  public static void setCOM4(String value) {
    AriaJavaJNI.ArUtil_COM4_set(value);
  }

  public static String getCOM4() {
    return AriaJavaJNI.ArUtil_COM4_get();
  }

  public static void setCOM5(String value) {
    AriaJavaJNI.ArUtil_COM5_set(value);
  }

  public static String getCOM5() {
    return AriaJavaJNI.ArUtil_COM5_get();
  }

  public static void setCOM6(String value) {
    AriaJavaJNI.ArUtil_COM6_set(value);
  }

  public static String getCOM6() {
    return AriaJavaJNI.ArUtil_COM6_get();
  }

  public static void setCOM7(String value) {
    AriaJavaJNI.ArUtil_COM7_set(value);
  }

  public static String getCOM7() {
    return AriaJavaJNI.ArUtil_COM7_get();
  }

  public static void setCOM8(String value) {
    AriaJavaJNI.ArUtil_COM8_set(value);
  }

  public static String getCOM8() {
    return AriaJavaJNI.ArUtil_COM8_get();
  }

  public static void setCOM9(String value) {
    AriaJavaJNI.ArUtil_COM9_set(value);
  }

  public static String getCOM9() {
    return AriaJavaJNI.ArUtil_COM9_get();
  }

  public static void setCOM10(String value) {
    AriaJavaJNI.ArUtil_COM10_set(value);
  }

  public static String getCOM10() {
    return AriaJavaJNI.ArUtil_COM10_get();
  }

  public static void setCOM11(String value) {
    AriaJavaJNI.ArUtil_COM11_set(value);
  }

  public static String getCOM11() {
    return AriaJavaJNI.ArUtil_COM11_get();
  }

  public static void setCOM12(String value) {
    AriaJavaJNI.ArUtil_COM12_set(value);
  }

  public static String getCOM12() {
    return AriaJavaJNI.ArUtil_COM12_get();
  }

  public static void setCOM13(String value) {
    AriaJavaJNI.ArUtil_COM13_set(value);
  }

  public static String getCOM13() {
    return AriaJavaJNI.ArUtil_COM13_get();
  }

  public static void setCOM14(String value) {
    AriaJavaJNI.ArUtil_COM14_set(value);
  }

  public static String getCOM14() {
    return AriaJavaJNI.ArUtil_COM14_get();
  }

  public static void setCOM15(String value) {
    AriaJavaJNI.ArUtil_COM15_set(value);
  }

  public static String getCOM15() {
    return AriaJavaJNI.ArUtil_COM15_get();
  }

  public static void setCOM16(String value) {
    AriaJavaJNI.ArUtil_COM16_set(value);
  }

  public static String getCOM16() {
    return AriaJavaJNI.ArUtil_COM16_get();
  }

  public static void setTRUESTRING(String value) {
    AriaJavaJNI.ArUtil_TRUESTRING_set(value);
  }

  public static String getTRUESTRING() {
    return AriaJavaJNI.ArUtil_TRUESTRING_get();
  }

  public static void setFALSESTRING(String value) {
    AriaJavaJNI.ArUtil_FALSESTRING_set(value);
  }

  public static String getFALSESTRING() {
    return AriaJavaJNI.ArUtil_FALSESTRING_get();
  }

  public static void putCurrentYearInString(String s, long len) {
    AriaJavaJNI.ArUtil_putCurrentYearInString(s, len);
  }

  public static void putCurrentMonthInString(String s, long len) {
    AriaJavaJNI.ArUtil_putCurrentMonthInString(s, len);
  }

  public static void putCurrentDayInString(String s, long len) {
    AriaJavaJNI.ArUtil_putCurrentDayInString(s, len);
  }

  public static void putCurrentHourInString(String s, long len) {
    AriaJavaJNI.ArUtil_putCurrentHourInString(s, len);
  }

  public static void putCurrentMinuteInString(String s, long len) {
    AriaJavaJNI.ArUtil_putCurrentMinuteInString(s, len);
  }

  public static void putCurrentSecondInString(String s, long len) {
    AriaJavaJNI.ArUtil_putCurrentSecondInString(s, len);
  }

  public static SWIGTYPE_p_time_t parseTime(String str, SWIGTYPE_p_bool ok, boolean toToday) {
    return new SWIGTYPE_p_time_t(AriaJavaJNI.ArUtil_parseTime__SWIG_0(str, SWIGTYPE_p_bool.getCPtr(ok), toToday), true);
  }

  public static SWIGTYPE_p_time_t parseTime(String str, SWIGTYPE_p_bool ok) {
    return new SWIGTYPE_p_time_t(AriaJavaJNI.ArUtil_parseTime__SWIG_1(str, SWIGTYPE_p_bool.getCPtr(ok)), true);
  }

  public static SWIGTYPE_p_time_t parseTime(String str) {
    return new SWIGTYPE_p_time_t(AriaJavaJNI.ArUtil_parseTime__SWIG_2(str), true);
  }

  public static boolean localtime(SWIGTYPE_p_time_t timep, SWIGTYPE_p_tm result) {
    return AriaJavaJNI.ArUtil_localtime__SWIG_0(SWIGTYPE_p_time_t.getCPtr(timep), SWIGTYPE_p_tm.getCPtr(result));
  }

  public static boolean localtime(SWIGTYPE_p_tm result) {
    return AriaJavaJNI.ArUtil_localtime__SWIG_1(SWIGTYPE_p_tm.getCPtr(result));
  }

  public static boolean matchCase(String baseDir, String fileName, String result, long resultLen) {
    return AriaJavaJNI.ArUtil_matchCase(baseDir, fileName, result, resultLen);
  }

  public static boolean getDirectory(String fileName, String result, long resultLen) {
    return AriaJavaJNI.ArUtil_getDirectory(fileName, result, resultLen);
  }

  public static boolean getFileName(String fileName, String result, long resultLen) {
    return AriaJavaJNI.ArUtil_getFileName(fileName, result, resultLen);
  }

  public static boolean changeFileTimestamp(String fileName, SWIGTYPE_p_time_t timestamp) {
    return AriaJavaJNI.ArUtil_changeFileTimestamp(fileName, SWIGTYPE_p_time_t.getCPtr(timestamp));
  }

  public static String insertSuffixBeforeExtension(String filename, String suffix) {
    return AriaJavaJNI.ArUtil_insertSuffixBeforeExtension(filename, suffix);
  }

  public static SWIGTYPE_p_FILE fopen(String path, String mode, boolean closeOnExec) {
    long cPtr = AriaJavaJNI.ArUtil_fopen__SWIG_0(path, mode, closeOnExec);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public static SWIGTYPE_p_FILE fopen(String path, String mode) {
    long cPtr = AriaJavaJNI.ArUtil_fopen__SWIG_1(path, mode);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public static int open(String pathname, int flags, boolean closeOnExec) {
    return AriaJavaJNI.ArUtil_open__SWIG_0(pathname, flags, closeOnExec);
  }

  public static int open(String pathname, int flags) {
    return AriaJavaJNI.ArUtil_open__SWIG_1(pathname, flags);
  }

  public static int open(String pathname, int flags, SWIGTYPE_p_mode_t mode, boolean closeOnExec) {
    return AriaJavaJNI.ArUtil_open__SWIG_2(pathname, flags, SWIGTYPE_p_mode_t.getCPtr(mode), closeOnExec);
  }

  public static int open(String pathname, int flags, SWIGTYPE_p_mode_t mode) {
    return AriaJavaJNI.ArUtil_open__SWIG_3(pathname, flags, SWIGTYPE_p_mode_t.getCPtr(mode));
  }

  public static int close(int fd) {
    return AriaJavaJNI.ArUtil_close(fd);
  }

  public static int creat(String pathname, SWIGTYPE_p_mode_t mode, boolean closeOnExec) {
    return AriaJavaJNI.ArUtil_creat__SWIG_0(pathname, SWIGTYPE_p_mode_t.getCPtr(mode), closeOnExec);
  }

  public static int creat(String pathname, SWIGTYPE_p_mode_t mode) {
    return AriaJavaJNI.ArUtil_creat__SWIG_1(pathname, SWIGTYPE_p_mode_t.getCPtr(mode));
  }

  public static SWIGTYPE_p_FILE popen(String command, String type, boolean closeOnExec) {
    long cPtr = AriaJavaJNI.ArUtil_popen__SWIG_0(command, type, closeOnExec);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public static SWIGTYPE_p_FILE popen(String command, String type) {
    long cPtr = AriaJavaJNI.ArUtil_popen__SWIG_1(command, type);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public static void setFileCloseOnExec(int fd, boolean closeOnExec) {
    AriaJavaJNI.ArUtil_setFileCloseOnExec__SWIG_0(fd, closeOnExec);
  }

  public static void setFileCloseOnExec(int fd) {
    AriaJavaJNI.ArUtil_setFileCloseOnExec__SWIG_1(fd);
  }

  public static void setFileCloseOnExec(SWIGTYPE_p_FILE file, boolean closeOnExec) {
    AriaJavaJNI.ArUtil_setFileCloseOnExec__SWIG_2(SWIGTYPE_p_FILE.getCPtr(file), closeOnExec);
  }

  public static void setFileCloseOnExec(SWIGTYPE_p_FILE file) {
    AriaJavaJNI.ArUtil_setFileCloseOnExec__SWIG_3(SWIGTYPE_p_FILE.getCPtr(file));
  }

  public static boolean floatIsNormal(double f) {
    return AriaJavaJNI.ArUtil_floatIsNormal(f);
  }

  public static double secToMSec(double sec) {
    return AriaJavaJNI.ArUtil_secToMSec(sec);
  }

  public static double mSecToSec(double msec) {
    return AriaJavaJNI.ArUtil_mSecToSec(msec);
  }

  public static double metersToFeet(double m) {
    return AriaJavaJNI.ArUtil_metersToFeet(m);
  }

  public static double feetToMeters(double f) {
    return AriaJavaJNI.ArUtil_feetToMeters(f);
  }

  public static int atoi(String str, SWIGTYPE_p_bool ok, boolean forceHex) {
    return AriaJavaJNI.ArUtil_atoi__SWIG_0(str, SWIGTYPE_p_bool.getCPtr(ok), forceHex);
  }

  public static int atoi(String str, SWIGTYPE_p_bool ok) {
    return AriaJavaJNI.ArUtil_atoi__SWIG_1(str, SWIGTYPE_p_bool.getCPtr(ok));
  }

  public static int atoi(String str) {
    return AriaJavaJNI.ArUtil_atoi__SWIG_2(str);
  }

  public static long availableDiskSpaceKB(String path, SWIGTYPE_p_bool ok) {
    return AriaJavaJNI.ArUtil_availableDiskSpaceKB__SWIG_0(path, SWIGTYPE_p_bool.getCPtr(ok));
  }

  public static long availableDiskSpaceKB(String path) {
    return AriaJavaJNI.ArUtil_availableDiskSpaceKB__SWIG_1(path);
  }

  public static long availableDiskSpaceMB(String path, SWIGTYPE_p_bool ok) {
    return AriaJavaJNI.ArUtil_availableDiskSpaceMB__SWIG_0(path, SWIGTYPE_p_bool.getCPtr(ok));
  }

  public static long availableDiskSpaceMB(String path) {
    return AriaJavaJNI.ArUtil_availableDiskSpaceMB__SWIG_1(path);
  }

  public ArUtil() {
    this(AriaJavaJNI.new_ArUtil(), true);
  }

  public final static class BITS {
    public final static ArUtil.BITS BIT0 = new ArUtil.BITS("BIT0", AriaJavaJNI.ArUtil_BIT0_get());
    public final static ArUtil.BITS BIT1 = new ArUtil.BITS("BIT1", AriaJavaJNI.ArUtil_BIT1_get());
    public final static ArUtil.BITS BIT2 = new ArUtil.BITS("BIT2", AriaJavaJNI.ArUtil_BIT2_get());
    public final static ArUtil.BITS BIT3 = new ArUtil.BITS("BIT3", AriaJavaJNI.ArUtil_BIT3_get());
    public final static ArUtil.BITS BIT4 = new ArUtil.BITS("BIT4", AriaJavaJNI.ArUtil_BIT4_get());
    public final static ArUtil.BITS BIT5 = new ArUtil.BITS("BIT5", AriaJavaJNI.ArUtil_BIT5_get());
    public final static ArUtil.BITS BIT6 = new ArUtil.BITS("BIT6", AriaJavaJNI.ArUtil_BIT6_get());
    public final static ArUtil.BITS BIT7 = new ArUtil.BITS("BIT7", AriaJavaJNI.ArUtil_BIT7_get());
    public final static ArUtil.BITS BIT8 = new ArUtil.BITS("BIT8", AriaJavaJNI.ArUtil_BIT8_get());
    public final static ArUtil.BITS BIT9 = new ArUtil.BITS("BIT9", AriaJavaJNI.ArUtil_BIT9_get());
    public final static ArUtil.BITS BIT10 = new ArUtil.BITS("BIT10", AriaJavaJNI.ArUtil_BIT10_get());
    public final static ArUtil.BITS BIT11 = new ArUtil.BITS("BIT11", AriaJavaJNI.ArUtil_BIT11_get());
    public final static ArUtil.BITS BIT12 = new ArUtil.BITS("BIT12", AriaJavaJNI.ArUtil_BIT12_get());
    public final static ArUtil.BITS BIT13 = new ArUtil.BITS("BIT13", AriaJavaJNI.ArUtil_BIT13_get());
    public final static ArUtil.BITS BIT14 = new ArUtil.BITS("BIT14", AriaJavaJNI.ArUtil_BIT14_get());
    public final static ArUtil.BITS BIT15 = new ArUtil.BITS("BIT15", AriaJavaJNI.ArUtil_BIT15_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static BITS swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + BITS.class + " with value " + swigValue);
    }

    private BITS(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private BITS(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private BITS(String swigName, BITS swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static BITS[] swigValues = { BIT0, BIT1, BIT2, BIT3, BIT4, BIT5, BIT6, BIT7, BIT8, BIT9, BIT10, BIT11, BIT12, BIT13, BIT14, BIT15 };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class REGKEY {
    public final static ArUtil.REGKEY REGKEY_CLASSES_ROOT = new ArUtil.REGKEY("REGKEY_CLASSES_ROOT");
    public final static ArUtil.REGKEY REGKEY_CURRENT_CONFIG = new ArUtil.REGKEY("REGKEY_CURRENT_CONFIG");
    public final static ArUtil.REGKEY REGKEY_CURRENT_USER = new ArUtil.REGKEY("REGKEY_CURRENT_USER");
    public final static ArUtil.REGKEY REGKEY_LOCAL_MACHINE = new ArUtil.REGKEY("REGKEY_LOCAL_MACHINE");
    public final static ArUtil.REGKEY REGKEY_USERS = new ArUtil.REGKEY("REGKEY_USERS");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static REGKEY swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + REGKEY.class + " with value " + swigValue);
    }

    private REGKEY(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private REGKEY(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private REGKEY(String swigName, REGKEY swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static REGKEY[] swigValues = { REGKEY_CLASSES_ROOT, REGKEY_CURRENT_CONFIG, REGKEY_CURRENT_USER, REGKEY_LOCAL_MACHINE, REGKEY_USERS };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
