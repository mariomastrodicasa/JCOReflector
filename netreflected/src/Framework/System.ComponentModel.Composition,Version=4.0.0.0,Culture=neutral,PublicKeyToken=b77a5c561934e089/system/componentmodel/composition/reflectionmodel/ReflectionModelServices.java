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

package system.componentmodel.composition.reflectionmodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.composition.primitives.ComposablePartDefinition;
import system.componentmodel.composition.primitives.ImportDefinition;
import system.componentmodel.composition.primitives.ContractBasedImportDefinition;
import system.componentmodel.composition.reflectionmodel.LazyMemberInfo;
import system.componentmodel.composition.primitives.ExportDefinition;


/**
 * The base .NET class managing System.ComponentModel.Composition.ReflectionModel.ReflectionModelServices, System.ComponentModel.Composition, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ReflectionModelServices extends NetObject  {
    public static final String assemblyFullName = "System.ComponentModel.Composition, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ComponentModel.Composition";
    public static final String className = "System.ComponentModel.Composition.ReflectionModel.ReflectionModelServices";
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

    public ReflectionModelServices(Object instance) throws Throwable {
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

    public static ReflectionModelServices castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ReflectionModelServices(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static boolean IsDisposalRequired(ComposablePartDefinition partDefinition) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        try {
            return (boolean)classType.Invoke("IsDisposalRequired", (Object)partDefinition.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsExportFactoryImportDefinition(ImportDefinition importDefinition) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classType.Invoke("IsExportFactoryImportDefinition", (Object)importDefinition.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LazyMemberInfo GetExportingMember(ExportDefinition exportDefinition) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetExportingMember = (JCObject)classType.Invoke("GetExportingMember", (Object)exportDefinition.getJCOInstance());
            return new LazyMemberInfo(objGetExportingMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static LazyMemberInfo GetImportingMember(ImportDefinition importDefinition) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetImportingMember = (JCObject)classType.Invoke("GetImportingMember", (Object)importDefinition.getJCOInstance());
            return new LazyMemberInfo(objGetImportingMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsImportingParameter(ImportDefinition importDefinition) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (boolean)classType.Invoke("IsImportingParameter", (Object)importDefinition.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ContractBasedImportDefinition GetExportFactoryProductImportDefinition(ImportDefinition importDefinition) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetExportFactoryProductImportDefinition = (JCObject)classType.Invoke("GetExportFactoryProductImportDefinition", (Object)importDefinition.getJCOInstance());
            return new ContractBasedImportDefinition(objGetExportFactoryProductImportDefinition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}