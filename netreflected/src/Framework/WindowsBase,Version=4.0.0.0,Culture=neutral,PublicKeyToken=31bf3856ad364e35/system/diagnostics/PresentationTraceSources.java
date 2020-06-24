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

package system.diagnostics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.PresentationTraceLevel;
import system.diagnostics.TraceSource;


/**
 * The base .NET class managing System.Diagnostics.PresentationTraceSources, WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class PresentationTraceSources extends NetObject  {
    public static final String assemblyFullName = "WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "WindowsBase";
    public static final String className = "System.Diagnostics.PresentationTraceSources";
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

    public PresentationTraceSources(Object instance) throws Throwable {
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

    public static PresentationTraceSources cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PresentationTraceSources(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static PresentationTraceLevel GetTraceLevel(NetObject element) throws Throwable, system.ArgumentException, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetTraceLevel = (JCObject)classType.Invoke("GetTraceLevel", element == null ? null : element.getJCOInstance());
            return new PresentationTraceLevel(objGetTraceLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Refresh() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.configuration.ConfigurationException, system.TypeLoadException, system.configuration.ConfigurationErrorsException, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Refresh");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetTraceLevel(NetObject element, PresentationTraceLevel traceLevel) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetTraceLevel", element == null ? null : element.getJCOInstance(), traceLevel == null ? null : traceLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static TraceSource getAnimationSource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("AnimationSource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getDataBindingSource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DataBindingSource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getDependencyPropertySource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DependencyPropertySource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getDocumentsSource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("DocumentsSource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getFreezableSource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("FreezableSource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getHwndHostSource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("HwndHostSource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getMarkupSource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("MarkupSource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getNameScopeSource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("NameScopeSource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getResourceDictionarySource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ResourceDictionarySource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getRoutedEventSource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("RoutedEventSource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceSource getShellSource() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.FormatException, system.OverflowException, system.security.SecurityException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("ShellSource");
            return new TraceSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}