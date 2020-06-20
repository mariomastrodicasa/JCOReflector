/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.TimeSpan;
import system.IFormatProvider;
import system.IFormatProviderImplementation;
import system.globalization.TimeSpanStyles;


/**
 * The base .NET class managing System.TimeSpan, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TimeSpan extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.TimeSpan";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan(Object instance) throws Throwable {
        super(instance);
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }

    public static TimeSpan cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TimeSpan(from.getJCOInstance());
    }

    // Constructors section
    

    public TimeSpan(long ticks) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(ticks));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan(int hours, int minutes, int seconds) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(hours, minutes, seconds));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan(int days, int hours, int minutes, int seconds) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(days, hours, minutes, seconds));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan(int days, int hours, int minutes, int seconds, int milliseconds) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(days, hours, minutes, seconds, milliseconds));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public TimeSpan Add(TimeSpan ts) throws Throwable, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", ts == null ? null : ts.getJCOInstance());
            return new TimeSpan(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Compare(TimeSpan t1, TimeSpan t2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Compare", t1 == null ? null : t1.getJCOInstance(), t2 == null ? null : t2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(NetObject value) throws Throwable, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(TimeSpan value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("CompareTo", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan FromDays(double value) throws Throwable, system.ArgumentException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromDays = (JCObject)classType.Invoke("FromDays", value);
            return new TimeSpan(objFromDays);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan Duration() throws Throwable, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDuration = (JCObject)classInstance.Invoke("Duration");
            return new TimeSpan(objDuration);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(TimeSpan obj) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", obj == null ? null : obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Equals(TimeSpan t1, TimeSpan t2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("Equals", t1 == null ? null : t1.getJCOInstance(), t2 == null ? null : t2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan FromHours(double value) throws Throwable, system.ArgumentException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromHours = (JCObject)classType.Invoke("FromHours", value);
            return new TimeSpan(objFromHours);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan FromMilliseconds(double value) throws Throwable, system.ArgumentException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromMilliseconds = (JCObject)classType.Invoke("FromMilliseconds", value);
            return new TimeSpan(objFromMilliseconds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan FromMinutes(double value) throws Throwable, system.ArgumentException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromMinutes = (JCObject)classType.Invoke("FromMinutes", value);
            return new TimeSpan(objFromMinutes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan Negate() throws Throwable, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objNegate = (JCObject)classInstance.Invoke("Negate");
            return new TimeSpan(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan FromSeconds(double value) throws Throwable, system.ArgumentException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromSeconds = (JCObject)classType.Invoke("FromSeconds", value);
            return new TimeSpan(objFromSeconds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan Subtract(TimeSpan ts) throws Throwable, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSubtract = (JCObject)classInstance.Invoke("Subtract", ts == null ? null : ts.getJCOInstance());
            return new TimeSpan(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan FromTicks(long value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromTicks = (JCObject)classType.Invoke("FromTicks", value);
            return new TimeSpan(objFromTicks);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan Parse(java.lang.String s) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", s);
            return new TimeSpan(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan Parse(java.lang.String input, IFormatProvider formatProvider) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", input, formatProvider == null ? null : formatProvider.getJCOInstance());
            return new TimeSpan(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan ParseExact(java.lang.String input, java.lang.String format, IFormatProvider formatProvider) throws Throwable, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParseExact = (JCObject)classType.Invoke("ParseExact", input, format, formatProvider == null ? null : formatProvider.getJCOInstance());
            return new TimeSpan(objParseExact);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan ParseExact(java.lang.String input, java.lang.String[] formats, IFormatProvider formatProvider) throws Throwable, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParseExact = (JCObject)classType.Invoke("ParseExact", input, formats, formatProvider == null ? null : formatProvider.getJCOInstance());
            return new TimeSpan(objParseExact);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(java.lang.String format) throws Throwable, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentNullException, system.IndexOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToString", format);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(java.lang.String format, IFormatProvider formatProvider) throws Throwable, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentNullException, system.IndexOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToString", format, formatProvider == null ? null : formatProvider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan ParseExact(java.lang.String input, java.lang.String format, IFormatProvider formatProvider, TimeSpanStyles styles) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParseExact = (JCObject)classType.Invoke("ParseExact", input, format, formatProvider == null ? null : formatProvider.getJCOInstance(), styles == null ? null : styles.getJCOInstance());
            return new TimeSpan(objParseExact);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan ParseExact(java.lang.String input, java.lang.String[] formats, IFormatProvider formatProvider, TimeSpanStyles styles) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParseExact = (JCObject)classType.Invoke("ParseExact", input, formats, formatProvider == null ? null : formatProvider.getJCOInstance(), styles == null ? null : styles.getJCOInstance());
            return new TimeSpan(objParseExact);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public long getTicks() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (long)classInstance.Get("Ticks");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDays() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Days");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getHours() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Hours");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMilliseconds() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Milliseconds");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinutes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Minutes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSeconds() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Seconds");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getTotalDays() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("TotalDays");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getTotalHours() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("TotalHours");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getTotalMilliseconds() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("TotalMilliseconds");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getTotalMinutes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("TotalMinutes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getTotalSeconds() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("TotalSeconds");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}