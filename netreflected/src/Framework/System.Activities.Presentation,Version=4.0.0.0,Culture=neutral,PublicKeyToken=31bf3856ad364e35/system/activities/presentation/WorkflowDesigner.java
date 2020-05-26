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

package system.activities.presentation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.UIElement;
import system.activities.presentation.EditingContext;
import system.windows.controls.ContextMenu;
import system.windows.controls.TextChangedEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Activities.Presentation.WorkflowDesigner, System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WorkflowDesigner extends NetObject  {
    public static final String assemblyFullName = "System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities.Presentation";
    public static final String className = "System.Activities.Presentation.WorkflowDesigner";
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

    public WorkflowDesigner(Object instance) throws Throwable {
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

    public static WorkflowDesigner castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WorkflowDesigner(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WorkflowDesigner() throws Throwable, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.RankException, system.NotSupportedException, system.security.SecurityException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.OutOfMemoryException, system.io.IOException, system.collections.generic.KeyNotFoundException, system.reflection.AmbiguousMatchException, system.windows.markup.XamlParseException, system.SystemException, system.net.WebException, system.xaml.XamlParseException, system.OverflowException, system.windows.ResourceReferenceKeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean IsInErrorState() throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("IsInErrorState");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.collections.generic.KeyNotFoundException, system.xml.XmlException, system.MulticastNotSupportedException, system.xaml.XamlException, system.threading.ThreadAbortException, system.xaml.XamlSchemaException, system.NotSupportedException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.io.EndOfStreamException, system.io.IOException, system.OutOfMemoryException, system.OverflowException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException {
        try {
            classInstance.Invoke("Load");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(java.lang.String fileName) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.security.XmlSyntaxException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.threading.ThreadAbortException, system.FormatException, system.io.EndOfStreamException, system.io.IOException, system.OverflowException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.xml.XmlException, system.xaml.XamlException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.security.SecurityException, system.UnauthorizedAccessException {
        try {
            classInstance.Invoke("Load", (Object)fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(NetObject instance) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.NotSupportedException, system.NullReferenceException, system.MissingMethodException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.threading.ThreadAbortException, system.FormatException, system.io.EndOfStreamException, system.io.IOException, system.OverflowException {
        try {
            classInstance.Invoke("Load", (Object)instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(java.lang.String fileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NotSupportedException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.NullReferenceException, system.collections.generic.KeyNotFoundException, system.xaml.XamlException, system.OutOfMemoryException, system.io.PathTooLongException {
        try {
            classInstance.Invoke("Save", (Object)fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadAbortException, system.xaml.XamlException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public UIElement getView() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("View");
            return new UIElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UIElement getPropertyInspectorView() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PropertyInspectorView");
            return new UIElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UIElement getOutlineView() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OutlineView");
            return new UIElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EditingContext getContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Context");
            return new EditingContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenu getContextMenu() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContextMenu");
            return new ContextMenu(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Text");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setText(java.lang.String Text) throws Throwable {
        try {
            classInstance.Set("Text", (Object)Text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPropertyInspectorFontAndColorData(java.lang.String PropertyInspectorFontAndColorData) throws Throwable {
        try {
            classInstance.Set("PropertyInspectorFontAndColorData", (Object)PropertyInspectorFontAndColorData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addTextChanged(TextChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("TextChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTextChanged(TextChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("TextChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addModelChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ModelChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeModelChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ModelChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}