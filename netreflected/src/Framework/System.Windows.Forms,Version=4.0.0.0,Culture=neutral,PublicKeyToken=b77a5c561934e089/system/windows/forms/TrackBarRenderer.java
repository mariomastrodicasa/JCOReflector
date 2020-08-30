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
import system.drawing.Graphics;
import system.windows.forms.visualstyles.TrackBarThumbState;
import system.drawing.Rectangle;
import system.windows.forms.visualstyles.EdgeStyle;


/**
 * The base .NET class managing System.Windows.Forms.TrackBarRenderer, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.TrackBarRenderer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.TrackBarRenderer</a>
 */
public class TrackBarRenderer extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.TrackBarRenderer
     */
    public static final String className = "System.Windows.Forms.TrackBarRenderer";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public TrackBarRenderer(Object instance) throws Throwable {
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TrackBarRenderer}, a cast assert is made to check if types are compatible.
     */
    public static TrackBarRenderer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TrackBarRenderer(from.getJCOInstance());
    }

    // Constructors section
    
    public TrackBarRenderer() throws Throwable {
    }



    
    // Methods section
    
    public static Size GetBottomPointingThumbSize(Graphics g, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetBottomPointingThumbSize = (JCObject)classType.Invoke("GetBottomPointingThumbSize", g == null ? null : g.getJCOInstance(), state == null ? null : state.getJCOInstance());
            return new Size(objGetBottomPointingThumbSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size GetLeftPointingThumbSize(Graphics g, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetLeftPointingThumbSize = (JCObject)classType.Invoke("GetLeftPointingThumbSize", g == null ? null : g.getJCOInstance(), state == null ? null : state.getJCOInstance());
            return new Size(objGetLeftPointingThumbSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size GetRightPointingThumbSize(Graphics g, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetRightPointingThumbSize = (JCObject)classType.Invoke("GetRightPointingThumbSize", g == null ? null : g.getJCOInstance(), state == null ? null : state.getJCOInstance());
            return new Size(objGetRightPointingThumbSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size GetTopPointingThumbSize(Graphics g, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTopPointingThumbSize = (JCObject)classType.Invoke("GetTopPointingThumbSize", g == null ? null : g.getJCOInstance(), state == null ? null : state.getJCOInstance());
            return new Size(objGetTopPointingThumbSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawBottomPointingThumb(Graphics g, Rectangle bounds, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawBottomPointingThumb", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawHorizontalThumb(Graphics g, Rectangle bounds, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawHorizontalThumb", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawHorizontalTicks(Graphics g, Rectangle bounds, int numTicks, EdgeStyle edgeStyle) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawHorizontalTicks", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), numTicks, edgeStyle == null ? null : edgeStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawHorizontalTrack(Graphics g, Rectangle bounds) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawHorizontalTrack", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawLeftPointingThumb(Graphics g, Rectangle bounds, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawLeftPointingThumb", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawRightPointingThumb(Graphics g, Rectangle bounds, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawRightPointingThumb", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawTopPointingThumb(Graphics g, Rectangle bounds, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawTopPointingThumb", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawVerticalThumb(Graphics g, Rectangle bounds, TrackBarThumbState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawVerticalThumb", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawVerticalTicks(Graphics g, Rectangle bounds, int numTicks, EdgeStyle edgeStyle) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawVerticalTicks", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), numTicks, edgeStyle == null ? null : edgeStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawVerticalTrack(Graphics g, Rectangle bounds) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawVerticalTrack", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getIsSupported() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("IsSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}