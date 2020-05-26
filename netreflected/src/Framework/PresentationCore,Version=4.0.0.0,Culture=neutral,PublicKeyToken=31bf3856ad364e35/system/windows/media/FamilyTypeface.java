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
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.windows.media;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.FamilyTypeface;
import system.windows.FontStyle;
import system.windows.FontWeight;
import system.windows.FontStretch;
import system.windows.media.CharacterMetricsDictionary;


/**
 * The base .NET class managing System.Windows.Media.FamilyTypeface, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class FamilyTypeface extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.FamilyTypeface";
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

    public FamilyTypeface(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static FamilyTypeface castFrom(IJCOBridgeReflected from) throws Throwable {
        return new FamilyTypeface(from.getJCOInstance());
    }

    // Constructors section
    
    
    public FamilyTypeface() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Equals(FamilyTypeface typeface) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)typeface.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public FontStyle getStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Style");
            return new FontStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStyle(FontStyle Style) throws Throwable {
        try {
            classInstance.Set("Style", (Object)Style.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FontWeight getWeight() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Weight");
            return new FontWeight(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWeight(FontWeight Weight) throws Throwable {
        try {
            classInstance.Set("Weight", (Object)Weight.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FontStretch getStretch() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Stretch");
            return new FontStretch(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStretch(FontStretch Stretch) throws Throwable {
        try {
            classInstance.Set("Stretch", (Object)Stretch.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getUnderlinePosition() throws Throwable {
        try {
            return (double)classInstance.Get("UnderlinePosition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnderlinePosition(double UnderlinePosition) throws Throwable {
        try {
            classInstance.Set("UnderlinePosition", UnderlinePosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getUnderlineThickness() throws Throwable {
        try {
            return (double)classInstance.Get("UnderlineThickness");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnderlineThickness(double UnderlineThickness) throws Throwable {
        try {
            classInstance.Set("UnderlineThickness", UnderlineThickness);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getStrikethroughPosition() throws Throwable {
        try {
            return (double)classInstance.Get("StrikethroughPosition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStrikethroughPosition(double StrikethroughPosition) throws Throwable {
        try {
            classInstance.Set("StrikethroughPosition", StrikethroughPosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getStrikethroughThickness() throws Throwable {
        try {
            return (double)classInstance.Get("StrikethroughThickness");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStrikethroughThickness(double StrikethroughThickness) throws Throwable {
        try {
            classInstance.Set("StrikethroughThickness", StrikethroughThickness);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getCapsHeight() throws Throwable {
        try {
            return (double)classInstance.Get("CapsHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCapsHeight(double CapsHeight) throws Throwable {
        try {
            classInstance.Set("CapsHeight", CapsHeight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getXHeight() throws Throwable {
        try {
            return (double)classInstance.Get("XHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXHeight(double XHeight) throws Throwable {
        try {
            classInstance.Set("XHeight", XHeight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDeviceFontName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DeviceFontName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeviceFontName(java.lang.String DeviceFontName) throws Throwable {
        try {
            classInstance.Set("DeviceFontName", (Object)DeviceFontName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CharacterMetricsDictionary getDeviceFontCharacterMetrics() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DeviceFontCharacterMetrics");
            return new CharacterMetricsDictionary(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}