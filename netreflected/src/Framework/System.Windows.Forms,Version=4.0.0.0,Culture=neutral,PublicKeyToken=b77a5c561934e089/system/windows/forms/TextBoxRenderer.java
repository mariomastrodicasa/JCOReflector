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
import system.drawing.Graphics;
import system.drawing.Rectangle;
import system.windows.forms.visualstyles.TextBoxState;
import system.drawing.Font;
import system.windows.forms.TextFormatFlags;


/**
 * The base .NET class managing System.Windows.Forms.TextBoxRenderer, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TextBoxRenderer extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.TextBoxRenderer";
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

    public TextBoxRenderer(Object instance) throws Throwable {
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

    public static TextBoxRenderer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TextBoxRenderer(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static void DrawTextBox(Graphics g, Rectangle bounds, TextBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawTextBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawTextBox(Graphics g, Rectangle bounds, java.lang.String textBoxText, Font font, TextBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawTextBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), textBoxText, font == null ? null : font.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawTextBox(Graphics g, Rectangle bounds, java.lang.String textBoxText, Font font, Rectangle textBounds, TextBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawTextBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), textBoxText, font == null ? null : font.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawTextBox(Graphics g, Rectangle bounds, java.lang.String textBoxText, Font font, TextFormatFlags flags, TextBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawTextBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), textBoxText, font == null ? null : font.getJCOInstance(), flags == null ? null : flags.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawTextBox(Graphics g, Rectangle bounds, java.lang.String textBoxText, Font font, Rectangle textBounds, TextFormatFlags flags, TextBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawTextBox", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), textBoxText, font == null ? null : font.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), flags == null ? null : flags.getJCOInstance(), state == null ? null : state.getJCOInstance());
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