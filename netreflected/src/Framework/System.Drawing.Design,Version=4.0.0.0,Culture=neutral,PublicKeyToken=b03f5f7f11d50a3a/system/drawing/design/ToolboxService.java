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

package system.drawing.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.design.ToolboxItem;
import system.collections.ICollection;
import system.collections.ICollectionImplementation;
import system.reflection.Assembly;
import system.reflection.AssemblyName;


/**
 * The base .NET class managing System.Drawing.Design.ToolboxService, System.Drawing.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ToolboxService extends NetObject  {
    public static final String assemblyFullName = "System.Drawing.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Drawing.Design";
    public static final String className = "System.Drawing.Design.ToolboxService";
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

    public ToolboxService(Object instance) throws Throwable {
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

    public static ToolboxService cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ToolboxService(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static ToolboxItem GetToolboxItem(NetType toolType) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.FormatException, system.io.IOException, system.io.FileNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetToolboxItem = (JCObject)classType.Invoke("GetToolboxItem", toolType == null ? null : toolType.getJCOInstance());
            return new ToolboxItem(objGetToolboxItem);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ToolboxItem GetToolboxItem(NetType toolType, boolean nonPublic) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.TypeLoadException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.configuration.ConfigurationErrorsException, system.io.FileNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetToolboxItem = (JCObject)classType.Invoke("GetToolboxItem", toolType == null ? null : toolType.getJCOInstance(), nonPublic);
            return new ToolboxItem(objGetToolboxItem);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICollection GetToolboxItems(Assembly a, java.lang.String newCodeBase) throws Throwable, system.ArgumentNullException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetToolboxItems = (JCObject)classType.Invoke("GetToolboxItems", a == null ? null : a.getJCOInstance(), newCodeBase);
            return new ICollectionImplementation(objGetToolboxItems);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICollection GetToolboxItems(Assembly a, java.lang.String newCodeBase, boolean throwOnError) throws Throwable, system.ArgumentNullException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.FormatException, system.NotSupportedException, system.io.FileNotFoundException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetToolboxItems = (JCObject)classType.Invoke("GetToolboxItems", a == null ? null : a.getJCOInstance(), newCodeBase, throwOnError);
            return new ICollectionImplementation(objGetToolboxItems);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICollection GetToolboxItems(AssemblyName an) throws Throwable, system.ArgumentNullException, system.FormatException, system.NotSupportedException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NullReferenceException, system.IndexOutOfRangeException, system.TypeLoadException, system.ArgumentOutOfRangeException, system.OverflowException, system.threading.WaitHandleCannotBeOpenedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.UriFormatException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.reflection.ReflectionTypeLoadException, system.runtime.serialization.SerializationException, system.UnauthorizedAccessException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetToolboxItems = (JCObject)classType.Invoke("GetToolboxItems", an == null ? null : an.getJCOInstance());
            return new ICollectionImplementation(objGetToolboxItems);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICollection GetToolboxItems(AssemblyName an, boolean throwOnError) throws Throwable, system.ArgumentNullException, system.FormatException, system.NotSupportedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotImplementedException, system.NullReferenceException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OverflowException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.resources.MissingManifestResourceException, system.security.SecurityException, system.MemberAccessException, system.UriFormatException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.reflection.ReflectionTypeLoadException, system.runtime.serialization.SerializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetToolboxItems = (JCObject)classType.Invoke("GetToolboxItems", an == null ? null : an.getJCOInstance(), throwOnError);
            return new ICollectionImplementation(objGetToolboxItems);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void UnloadToolboxItems() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NullReferenceException, system.CannotUnloadAppDomainException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("UnloadToolboxItems");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}