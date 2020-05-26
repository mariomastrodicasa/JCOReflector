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

package system.web.ui.webcontrols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.webcontrols.HotSpotMode;


/**
 * The base .NET class managing System.Web.UI.WebControls.RectangleHotSpot, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class RectangleHotSpot extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.WebControls.RectangleHotSpot";
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

    public RectangleHotSpot(Object instance) throws Throwable {
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

    public static RectangleHotSpot castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RectangleHotSpot(from.getJCOInstance());
    }

    // Constructors section
    
    
    public RectangleHotSpot() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public java.lang.String GetCoordinates() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetCoordinates");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getBottom() throws Throwable {
        try {
            return (int)classInstance.Get("Bottom");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBottom(int Bottom) throws Throwable {
        try {
            classInstance.Set("Bottom", Bottom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLeft() throws Throwable {
        try {
            return (int)classInstance.Get("Left");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLeft(int Left) throws Throwable {
        try {
            classInstance.Set("Left", Left);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getRight() throws Throwable {
        try {
            return (int)classInstance.Get("Right");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRight(int Right) throws Throwable {
        try {
            classInstance.Set("Right", Right);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTop() throws Throwable {
        try {
            return (int)classInstance.Get("Top");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTop(int Top) throws Throwable {
        try {
            classInstance.Set("Top", Top);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAccessKey() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("AccessKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAccessKey(java.lang.String AccessKey) throws Throwable {
        try {
            classInstance.Set("AccessKey", (Object)AccessKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAlternateText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("AlternateText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAlternateText(java.lang.String AlternateText) throws Throwable {
        try {
            classInstance.Set("AlternateText", (Object)AlternateText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HotSpotMode getHotSpotMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HotSpotMode");
            return new HotSpotMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHotSpotMode(HotSpotMode HotSpotMode) throws Throwable {
        try {
            classInstance.Set("HotSpotMode", (Object)HotSpotMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPostBackValue() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PostBackValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPostBackValue(java.lang.String PostBackValue) throws Throwable {
        try {
            classInstance.Set("PostBackValue", (Object)PostBackValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNavigateUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("NavigateUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNavigateUrl(java.lang.String NavigateUrl) throws Throwable {
        try {
            classInstance.Set("NavigateUrl", (Object)NavigateUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short getTabIndex() throws Throwable {
        try {
            return (short)classInstance.Get("TabIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTabIndex(short TabIndex) throws Throwable {
        try {
            classInstance.Set("TabIndex", TabIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTarget() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Target");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTarget(java.lang.String Target) throws Throwable {
        try {
            classInstance.Set("Target", (Object)Target);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}