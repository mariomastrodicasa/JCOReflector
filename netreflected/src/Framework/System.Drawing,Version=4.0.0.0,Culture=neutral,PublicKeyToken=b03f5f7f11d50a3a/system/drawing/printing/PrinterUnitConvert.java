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

package system.drawing.printing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.printing.PrinterUnit;
import system.drawing.Point;
import system.drawing.printing.Margins;
import system.drawing.Rectangle;
import system.drawing.Size;


/**
 * The base .NET class managing System.Drawing.Printing.PrinterUnitConvert, System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class PrinterUnitConvert extends NetObject  {
    public static final String assemblyFullName = "System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Drawing";
    public static final String className = "System.Drawing.Printing.PrinterUnitConvert";
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

    public PrinterUnitConvert(Object instance) throws Throwable {
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

    public static PrinterUnitConvert cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PrinterUnitConvert(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static double Convert(double value, PrinterUnit fromUnit, PrinterUnit toUnit) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Convert", value, fromUnit == null ? null : fromUnit.getJCOInstance(), toUnit == null ? null : toUnit.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Convert(int value, PrinterUnit fromUnit, PrinterUnit toUnit) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Convert", value, fromUnit == null ? null : fromUnit.getJCOInstance(), toUnit == null ? null : toUnit.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Point Convert(Point value, PrinterUnit fromUnit, PrinterUnit toUnit) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objConvert = (JCObject)classType.Invoke("Convert", value == null ? null : value.getJCOInstance(), fromUnit == null ? null : fromUnit.getJCOInstance(), toUnit == null ? null : toUnit.getJCOInstance());
            return new Point(objConvert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Margins Convert(Margins value, PrinterUnit fromUnit, PrinterUnit toUnit) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objConvert = (JCObject)classType.Invoke("Convert", value == null ? null : value.getJCOInstance(), fromUnit == null ? null : fromUnit.getJCOInstance(), toUnit == null ? null : toUnit.getJCOInstance());
            return new Margins(objConvert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rectangle Convert(Rectangle value, PrinterUnit fromUnit, PrinterUnit toUnit) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objConvert = (JCObject)classType.Invoke("Convert", value == null ? null : value.getJCOInstance(), fromUnit == null ? null : fromUnit.getJCOInstance(), toUnit == null ? null : toUnit.getJCOInstance());
            return new Rectangle(objConvert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size Convert(Size value, PrinterUnit fromUnit, PrinterUnit toUnit) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objConvert = (JCObject)classType.Invoke("Convert", value == null ? null : value.getJCOInstance(), fromUnit == null ? null : fromUnit.getJCOInstance(), toUnit == null ? null : toUnit.getJCOInstance());
            return new Size(objConvert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}