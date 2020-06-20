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
import system.drawing.Font;
import system.drawing.Rectangle;
import system.windows.forms.DrawItemState;
import system.windows.forms.StatusBarPanel;
import system.drawing.Color;


/**
 * The base .NET class managing System.Windows.Forms.StatusBarDrawItemEventArgs, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class StatusBarDrawItemEventArgs extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.StatusBarDrawItemEventArgs";
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

    public StatusBarDrawItemEventArgs(Object instance) throws Throwable {
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

    public static StatusBarDrawItemEventArgs cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new StatusBarDrawItemEventArgs(from.getJCOInstance());
    }

    // Constructors section
    

    public StatusBarDrawItemEventArgs(Graphics g, Font font, Rectangle r, int itemId, DrawItemState itemState, StatusBarPanel panel) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(g == null ? null : g.getJCOInstance(), font == null ? null : font.getJCOInstance(), r == null ? null : r.getJCOInstance(), itemId, itemState == null ? null : itemState.getJCOInstance(), panel == null ? null : panel.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StatusBarDrawItemEventArgs(Graphics g, Font font, Rectangle r, int itemId, DrawItemState itemState, StatusBarPanel panel, Color foreColor, Color backColor) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(g == null ? null : g.getJCOInstance(), font == null ? null : font.getJCOInstance(), r == null ? null : r.getJCOInstance(), itemId, itemState == null ? null : itemState.getJCOInstance(), panel == null ? null : panel.getJCOInstance(), foreColor == null ? null : foreColor.getJCOInstance(), backColor == null ? null : backColor.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void DrawBackground() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DrawBackground");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DrawFocusRectangle() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("DrawFocusRectangle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public StatusBarPanel getPanel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Panel");
            return new StatusBarPanel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Graphics getGraphics() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Graphics");
            return new Graphics(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font getFont() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Font");
            return new Font(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getBounds() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Bounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getIndex() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Index");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DrawItemState getState() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new DrawItemState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getForeColor() throws Throwable, system.InvalidOperationException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ForeColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getBackColor() throws Throwable, system.InvalidOperationException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BackColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}