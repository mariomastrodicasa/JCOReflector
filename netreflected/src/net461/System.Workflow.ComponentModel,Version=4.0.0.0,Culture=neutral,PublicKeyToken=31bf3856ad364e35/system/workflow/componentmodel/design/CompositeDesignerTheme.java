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

package system.workflow.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.design.ActivityDesignerTheme;
import system.workflow.componentmodel.design.WorkflowTheme;
import system.drawing.Brush;
import system.drawing.Rectangle;
import system.workflow.componentmodel.design.AmbientProperty;
import system.drawing.Image;
import system.drawing.Size;
import system.workflow.componentmodel.design.DesignerContentAlignment;
import system.workflow.componentmodel.design.LineAnchor;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.CompositeDesignerTheme, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.Design.CompositeDesignerTheme" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.Design.CompositeDesignerTheme</a>
 */
public class CompositeDesignerTheme extends ActivityDesignerTheme  {
    /**
     * Fully assembly qualified name: System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Workflow.ComponentModel
     */
    public static final String assemblyShortName = "System.Workflow.ComponentModel";
    /**
     * Qualified class name: System.Workflow.ComponentModel.Design.CompositeDesignerTheme
     */
    public static final String className = "System.Workflow.ComponentModel.Design.CompositeDesignerTheme";
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

    public CompositeDesignerTheme(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CompositeDesignerTheme}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CompositeDesignerTheme} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CompositeDesignerTheme cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CompositeDesignerTheme(from.getJCOInstance());
    }

    // Constructors section
    
    public CompositeDesignerTheme() throws Throwable {
    }

    public CompositeDesignerTheme(WorkflowTheme theme) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(theme == null ? null : theme.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public Brush GetExpandButtonBackgroundBrush(Rectangle rectangle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.runtime.interopservices.ExternalException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetExpandButtonBackgroundBrush = (JCObject)classInstance.Invoke("GetExpandButtonBackgroundBrush", rectangle == null ? null : rectangle.getJCOInstance());
            return new Brush(objGetExpandButtonBackgroundBrush);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize() throws Throwable, system.ArgumentNullException, system.collections.generic.KeyNotFoundException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.xml.XmlException, system.NotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.FormatException, system.MulticastNotSupportedException, system.NullReferenceException, system.InvalidCastException, system.workflow.componentmodel.serialization.WorkflowMarkupSerializationException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Initialize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnAmbientPropertyChanged(AmbientProperty ambientProperty) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("OnAmbientPropertyChanged", ambientProperty == null ? null : ambientProperty.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getShowDropShadow() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ShowDropShadow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowDropShadow(boolean ShowDropShadow) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ShowDropShadow", ShowDropShadow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Image getWatermarkImage() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WatermarkImage");
            return new Image(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getConnectorSize() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.collections.generic.KeyNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.FormatException, system.IndexOutOfRangeException, system.xml.XmlException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.NullReferenceException, system.InvalidCastException, system.workflow.componentmodel.serialization.WorkflowMarkupSerializationException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConnectorSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getExpandButtonSize() throws Throwable, system.ArgumentNullException, system.collections.generic.KeyNotFoundException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.security.SecurityException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.FormatException, system.IndexOutOfRangeException, system.xml.XmlException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.NullReferenceException, system.InvalidCastException, system.workflow.componentmodel.serialization.WorkflowMarkupSerializationException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExpandButtonSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWatermarkImagePath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("WatermarkImagePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWatermarkImagePath(java.lang.String WatermarkImagePath) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.FormatException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WatermarkImagePath", WatermarkImagePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerContentAlignment getWatermarkAlignment() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WatermarkAlignment");
            return new DesignerContentAlignment(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWatermarkAlignment(DesignerContentAlignment WatermarkAlignment) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WatermarkAlignment", WatermarkAlignment == null ? null : WatermarkAlignment.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LineAnchor getConnectorEndCap() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConnectorEndCap");
            return new LineAnchor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnectorEndCap(LineAnchor ConnectorEndCap) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ConnectorEndCap", ConnectorEndCap == null ? null : ConnectorEndCap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LineAnchor getConnectorStartCap() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ConnectorStartCap");
            return new LineAnchor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnectorStartCap(LineAnchor ConnectorStartCap) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ConnectorStartCap", ConnectorStartCap == null ? null : ConnectorStartCap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}