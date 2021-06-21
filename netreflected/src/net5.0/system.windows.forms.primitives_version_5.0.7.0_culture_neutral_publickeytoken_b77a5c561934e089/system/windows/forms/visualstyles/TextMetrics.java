/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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

package system.windows.forms.visualstyles;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.windows.forms.visualstyles.TextMetricsCharacterSet;
import system.windows.forms.visualstyles.TextMetricsPitchAndFamilyValues;


/**
 * The base .NET class managing System.Windows.Forms.VisualStyles.TextMetrics, System.Windows.Forms.Primitives, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.VisualStyles.TextMetrics" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.VisualStyles.TextMetrics</a>
 */
public class TextMetrics extends ValueType  {
    /**
     * Fully assembly qualified name: System.Windows.Forms.Primitives, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms.Primitives, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms.Primitives
     */
    public static final String assemblyShortName = "System.Windows.Forms.Primitives";
    /**
     * Qualified class name: System.Windows.Forms.VisualStyles.TextMetrics
     */
    public static final String className = "System.Windows.Forms.VisualStyles.TextMetrics";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
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

    public TextMetrics(Object instance) throws Throwable {
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
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TextMetrics}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TextMetrics} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TextMetrics cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TextMetrics(from.getJCOInstance());
    }

    // Constructors section
    
    public TextMetrics() throws Throwable {
    }



    
    // Methods section
    

    
    // Properties section
    
    public boolean getItalic() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Italic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setItalic(boolean Italic) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Italic", Italic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getStruckOut() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("StruckOut");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStruckOut(boolean StruckOut) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("StruckOut", StruckOut);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUnderlined() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Underlined");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnderlined(boolean Underlined) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Underlined", Underlined);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char getBreakChar() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (char)classInstance.Get("BreakChar");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBreakChar(char BreakChar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BreakChar", BreakChar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char getDefaultChar() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (char)classInstance.Get("DefaultChar");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultChar(char DefaultChar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DefaultChar", DefaultChar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char getFirstChar() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (char)classInstance.Get("FirstChar");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFirstChar(char FirstChar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FirstChar", FirstChar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char getLastChar() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (char)classInstance.Get("LastChar");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastChar(char LastChar) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastChar", LastChar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getAscent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Ascent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAscent(int Ascent) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Ascent", Ascent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getAverageCharWidth() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("AverageCharWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAverageCharWidth(int AverageCharWidth) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AverageCharWidth", AverageCharWidth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDescent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Descent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDescent(int Descent) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Descent", Descent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDigitizedAspectX() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("DigitizedAspectX");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDigitizedAspectX(int DigitizedAspectX) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DigitizedAspectX", DigitizedAspectX);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDigitizedAspectY() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("DigitizedAspectY");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDigitizedAspectY(int DigitizedAspectY) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DigitizedAspectY", DigitizedAspectY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getExternalLeading() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ExternalLeading");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExternalLeading(int ExternalLeading) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExternalLeading", ExternalLeading);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getHeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Height");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeight(int Height) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Height", Height);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getInternalLeading() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("InternalLeading");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInternalLeading(int InternalLeading) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InternalLeading", InternalLeading);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxCharWidth() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxCharWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxCharWidth(int MaxCharWidth) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaxCharWidth", MaxCharWidth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getOverhang() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Overhang");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOverhang(int Overhang) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Overhang", Overhang);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getWeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Weight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWeight(int Weight) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Weight", Weight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextMetricsCharacterSet getCharSet() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CharSet");
            return new TextMetricsCharacterSet(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCharSet(TextMetricsCharacterSet CharSet) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CharSet", CharSet == null ? null : CharSet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextMetricsPitchAndFamilyValues getPitchAndFamily() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PitchAndFamily");
            return new TextMetricsPitchAndFamilyValues(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPitchAndFamily(TextMetricsPitchAndFamilyValues PitchAndFamily) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PitchAndFamily", PitchAndFamily == null ? null : PitchAndFamily.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}