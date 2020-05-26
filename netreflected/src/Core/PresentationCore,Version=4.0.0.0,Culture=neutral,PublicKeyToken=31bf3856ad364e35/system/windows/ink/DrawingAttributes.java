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

package system.windows.ink;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Guid;
import system.windows.ink.DrawingAttributes;
import system.windows.media.Color;
import system.windows.ink.StylusTip;
import system.windows.media.Matrix;
import system.windows.ink.PropertyDataChangedEventHandler;


/**
 * The base .NET class managing System.Windows.Ink.DrawingAttributes, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class DrawingAttributes extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Ink.DrawingAttributes";
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

    public DrawingAttributes(Object instance) throws Throwable {
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

    public static DrawingAttributes castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DrawingAttributes(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DrawingAttributes() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OverflowException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void AddPropertyData(Guid propertyDataId, NetObject propertyData) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        try {
            classInstance.Invoke("AddPropertyData", (Object)propertyDataId.getJCOInstance(), (Object)propertyData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemovePropertyData(Guid propertyDataId) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("RemovePropertyData", (Object)propertyDataId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetPropertyData(Guid propertyDataId) throws Throwable, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objGetPropertyData = (JCObject)classInstance.Invoke("GetPropertyData", (Object)propertyDataId.getJCOInstance());
            return new NetObject(objGetPropertyData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid[] GetPropertyDataIds() throws Throwable, system.ArgumentOutOfRangeException {
        try {
            ArrayList<Guid> resultingArrayList = new ArrayList<Guid>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetPropertyDataIds");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Guid(resultingObject));
            }
            Guid[] resultingArray = new Guid[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsPropertyData(Guid propertyDataId) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        try {
            return (boolean)classInstance.Invoke("ContainsPropertyData", (Object)propertyDataId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DrawingAttributes Clone() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.OverflowException, system.NotSupportedException, system.InvalidOperationException, system.MulticastNotSupportedException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new DrawingAttributes(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Color getColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Color");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColor(Color Color) throws Throwable {
        try {
            classInstance.Set("Color", (Object)Color.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StylusTip getStylusTip() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StylusTip");
            return new StylusTip(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStylusTip(StylusTip StylusTip) throws Throwable {
        try {
            classInstance.Set("StylusTip", (Object)StylusTip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Matrix getStylusTipTransform() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StylusTipTransform");
            return new Matrix(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStylusTipTransform(Matrix StylusTipTransform) throws Throwable {
        try {
            classInstance.Set("StylusTipTransform", (Object)StylusTipTransform.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getHeight() throws Throwable {
        try {
            return (double)classInstance.Get("Height");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeight(double Height) throws Throwable {
        try {
            classInstance.Set("Height", Height);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getWidth() throws Throwable {
        try {
            return (double)classInstance.Get("Width");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWidth(double Width) throws Throwable {
        try {
            classInstance.Set("Width", Width);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFitToCurve() throws Throwable {
        try {
            return (boolean)classInstance.Get("FitToCurve");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFitToCurve(boolean FitToCurve) throws Throwable {
        try {
            classInstance.Set("FitToCurve", FitToCurve);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnorePressure() throws Throwable {
        try {
            return (boolean)classInstance.Get("IgnorePressure");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnorePressure(boolean IgnorePressure) throws Throwable {
        try {
            classInstance.Set("IgnorePressure", IgnorePressure);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsHighlighter() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsHighlighter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsHighlighter(boolean IsHighlighter) throws Throwable {
        try {
            classInstance.Set("IsHighlighter", IsHighlighter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addAttributeChanged(PropertyDataChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AttributeChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAttributeChanged(PropertyDataChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AttributeChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPropertyDataChanged(PropertyDataChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PropertyDataChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePropertyDataChanged(PropertyDataChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PropertyDataChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}