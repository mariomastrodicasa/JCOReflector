/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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
import system.windows.forms.Form;
import system.IServiceProvider;
import system.IServiceProviderImplementation;
import system.workflow.componentmodel.design.ITypeFilterProvider;
import system.workflow.componentmodel.design.ITypeFilterProviderImplementation;
import system.workflow.componentmodel.compiler.TypeProvider;
import system.IServiceProvider;
import system.IServiceProviderImplementation;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.TypeBrowserDialog, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.Design.TypeBrowserDialog" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.Design.TypeBrowserDialog</a>
 */
public class TypeBrowserDialog extends Form implements system.IServiceProvider {
    /**
     * Fully assembly qualified name: System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Workflow.ComponentModel
     */
    public static final String assemblyShortName = "System.Workflow.ComponentModel";
    /**
     * Qualified class name: System.Workflow.ComponentModel.Design.TypeBrowserDialog
     */
    public static final String className = "System.Workflow.ComponentModel.Design.TypeBrowserDialog";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
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

    public TypeBrowserDialog(Object instance) throws Throwable {
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
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TypeBrowserDialog}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TypeBrowserDialog} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TypeBrowserDialog cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TypeBrowserDialog(from.getJCOInstance());
    }

    // Constructors section
    
    public TypeBrowserDialog() throws Throwable {
    }

    public TypeBrowserDialog(IServiceProvider serviceProvider, ITypeFilterProvider filterProvider, java.lang.String selectedTypeName) throws Throwable, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NullReferenceException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.TypeLoadException, system.InvalidCastException, system.OutOfMemoryException, system.FormatException, system.io.IOException, system.collections.generic.KeyNotFoundException, system.io.FileNotFoundException, system.reflection.TargetParameterCountException, system.UnauthorizedAccessException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(serviceProvider == null ? null : serviceProvider.getJCOInstance(), filterProvider == null ? null : filterProvider.getJCOInstance(), selectedTypeName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeBrowserDialog(IServiceProvider serviceProvider, ITypeFilterProvider filterProvider, java.lang.String selectedTypeName, TypeProvider typeProvider) throws Throwable, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.io.FileNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.threading.AbandonedMutexException, system.reflection.TargetParameterCountException, system.RankException, system.globalization.CultureNotFoundException, system.FormatException, system.OverflowException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.InvalidEnumArgumentException, system.TypeLoadException, system.InvalidCastException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(serviceProvider == null ? null : serviceProvider.getJCOInstance(), filterProvider == null ? null : filterProvider.getJCOInstance(), selectedTypeName, typeProvider == null ? null : typeProvider.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIServiceProvider method available in IServiceProvider to obtain an object with an invocable method
     */
    @Deprecated 
    public NetObject GetService(NetType serviceType) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIServiceProvider to obtain the full interface.");
    }


    
    // Properties section
    
    public NetType getSelectedType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SelectedType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}