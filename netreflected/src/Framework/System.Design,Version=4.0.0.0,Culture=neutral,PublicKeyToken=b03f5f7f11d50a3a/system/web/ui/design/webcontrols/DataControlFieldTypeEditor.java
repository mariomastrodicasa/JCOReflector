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

package system.web.ui.design.webcontrols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.ITypeDescriptorContext;
import system.componentmodel.ITypeDescriptorContextImplementation;
import system.IServiceProvider;
import system.IServiceProviderImplementation;
import system.drawing.design.UITypeEditorEditStyle;
import system.drawing.Graphics;
import system.drawing.Rectangle;
import system.drawing.design.PaintValueEventArgs;


/**
 * The base .NET class managing System.Web.UI.Design.WebControls.DataControlFieldTypeEditor, System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DataControlFieldTypeEditor extends NetObject  {
    public static final String assemblyFullName = "System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Design";
    public static final String className = "System.Web.UI.Design.WebControls.DataControlFieldTypeEditor";
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

    public DataControlFieldTypeEditor(Object instance) throws Throwable {
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

    public static DataControlFieldTypeEditor cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DataControlFieldTypeEditor(from.getJCOInstance());
    }

    // Constructors section
    

    public DataControlFieldTypeEditor() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public NetObject EditValue(ITypeDescriptorContext context, IServiceProvider provider, NetObject value) throws Throwable, system.componentmodel.Win32Exception, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.NotImplementedException, system.TypeLoadException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEditValue = (JCObject)classInstance.Invoke("EditValue", context == null ? null : context.getJCOInstance(), provider == null ? null : provider.getJCOInstance(), value == null ? null : value.getJCOInstance());
            return new NetObject(objEditValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UITypeEditorEditStyle GetEditStyle(ITypeDescriptorContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEditStyle = (JCObject)classInstance.Invoke("GetEditStyle", context == null ? null : context.getJCOInstance());
            return new UITypeEditorEditStyle(objGetEditStyle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject EditValue(IServiceProvider provider, NetObject value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEditValue = (JCObject)classInstance.Invoke("EditValue", provider == null ? null : provider.getJCOInstance(), value == null ? null : value.getJCOInstance());
            return new NetObject(objEditValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UITypeEditorEditStyle GetEditStyle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetEditStyle = (JCObject)classInstance.Invoke("GetEditStyle");
            return new UITypeEditorEditStyle(objGetEditStyle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetPaintValueSupported() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("GetPaintValueSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetPaintValueSupported(ITypeDescriptorContext context) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("GetPaintValueSupported", context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintValue(NetObject value, Graphics canvas, Rectangle rectangle) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PaintValue", value == null ? null : value.getJCOInstance(), canvas == null ? null : canvas.getJCOInstance(), rectangle == null ? null : rectangle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintValue(PaintValueEventArgs e) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PaintValue", e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsDropDownResizable() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDropDownResizable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}