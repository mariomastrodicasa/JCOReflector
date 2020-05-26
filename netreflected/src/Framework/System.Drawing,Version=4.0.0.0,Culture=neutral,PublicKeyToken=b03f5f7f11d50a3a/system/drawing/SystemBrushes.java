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

package system.drawing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.Brush;
import system.drawing.Color;


/**
 * The base .NET class managing System.Drawing.SystemBrushes, System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SystemBrushes extends NetObject  {
    public static final String assemblyFullName = "System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Drawing";
    public static final String className = "System.Drawing.SystemBrushes";
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

    public SystemBrushes(Object instance) throws Throwable {
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

    public static SystemBrushes castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SystemBrushes(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static Brush FromSystemColor(Color c) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            JCObject objFromSystemColor = (JCObject)classType.Invoke("FromSystemColor", (Object)c.getJCOInstance());
            return new Brush(objFromSystemColor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public static Brush getActiveBorder() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ActiveBorder");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getActiveCaption() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ActiveCaption");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getActiveCaptionText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ActiveCaptionText");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getAppWorkspace() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AppWorkspace");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getButtonFace() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ButtonFace");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getButtonHighlight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ButtonHighlight");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getButtonShadow() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ButtonShadow");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getControl() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Control");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getControlLightLight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlLightLight");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getControlLight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlLight");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getControlDark() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlDark");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getControlDarkDark() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlDarkDark");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getControlText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlText");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getDesktop() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Desktop");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getGradientActiveCaption() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("GradientActiveCaption");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getGradientInactiveCaption() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("GradientInactiveCaption");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getGrayText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("GrayText");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getHighlight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Highlight");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getHighlightText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("HighlightText");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getHotTrack() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("HotTrack");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getInactiveCaption() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InactiveCaption");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getInactiveBorder() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InactiveBorder");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getInactiveCaptionText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InactiveCaptionText");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Info");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getInfoText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InfoText");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getMenu() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Menu");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getMenuBar() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("MenuBar");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getMenuHighlight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("MenuHighlight");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getMenuText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("MenuText");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getScrollBar() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ScrollBar");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getWindow() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Window");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getWindowFrame() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WindowFrame");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getWindowText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WindowText");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}