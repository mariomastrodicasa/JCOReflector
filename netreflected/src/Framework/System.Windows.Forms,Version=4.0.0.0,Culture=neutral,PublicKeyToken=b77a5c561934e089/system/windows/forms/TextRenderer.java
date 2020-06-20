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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.Size;
import system.drawing.Font;
import system.windows.forms.TextFormatFlags;
import system.drawing.IDeviceContext;
import system.drawing.IDeviceContextImplementation;
import system.drawing.Point;
import system.drawing.Color;
import system.drawing.Rectangle;


/**
 * The base .NET class managing System.Windows.Forms.TextRenderer, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TextRenderer extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.TextRenderer";
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

    public TextRenderer(Object instance) throws Throwable {
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

    public static TextRenderer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TextRenderer(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static Size MeasureText(java.lang.String text, Font font) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", text, font == null ? null : font.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(java.lang.String text, Font font, Size proposedSize, TextFormatFlags flags) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", text, font == null ? null : font.getJCOInstance(), proposedSize == null ? null : proposedSize.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Point pt, Color foreColor) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), pt == null ? null : pt.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Point pt, Color foreColor, Color backColor) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), pt == null ? null : pt.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), backColor == null ? null : backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Point pt, Color foreColor, TextFormatFlags flags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), pt == null ? null : pt.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Point pt, Color foreColor, Color backColor, TextFormatFlags flags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), pt == null ? null : pt.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), backColor == null ? null : backColor.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Rectangle bounds, Color foreColor) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Rectangle bounds, Color foreColor, Color backColor) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), backColor == null ? null : backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Rectangle bounds, Color foreColor, TextFormatFlags flags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawText(IDeviceContext dc, java.lang.String text, Font font, Rectangle bounds, Color foreColor, Color backColor, TextFormatFlags flags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), backColor == null ? null : backColor.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(java.lang.String text, Font font, Size proposedSize) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", text, font == null ? null : font.getJCOInstance(), proposedSize == null ? null : proposedSize.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(IDeviceContext dc, java.lang.String text, Font font) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(IDeviceContext dc, java.lang.String text, Font font, Size proposedSize) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), proposedSize == null ? null : proposedSize.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size MeasureText(IDeviceContext dc, java.lang.String text, Font font, Size proposedSize, TextFormatFlags flags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMeasureText = (JCObject)classType.Invoke("MeasureText", dc == null ? null : dc.getJCOInstance(), text, font == null ? null : font.getJCOInstance(), proposedSize == null ? null : proposedSize.getJCOInstance(), flags == null ? null : flags.getJCOInstance());
            return new Size(objMeasureText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}