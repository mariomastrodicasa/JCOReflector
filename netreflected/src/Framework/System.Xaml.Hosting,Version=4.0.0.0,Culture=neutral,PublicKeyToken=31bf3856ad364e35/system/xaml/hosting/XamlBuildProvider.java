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

package system.xaml.hosting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.codedom.compiler.CompilerResults;
import system.web.compilation.BuildProviderResultFlags;
import system.web.compilation.AssemblyBuilder;
import system.collections.ICollection;
import system.collections.ICollectionImplementation;
import system.web.compilation.CompilerType;


/**
 * The base .NET class managing System.Xaml.Hosting.XamlBuildProvider, System.Xaml.Hosting, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class XamlBuildProvider extends NetObject  {
    public static final String assemblyFullName = "System.Xaml.Hosting, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "System.Xaml.Hosting";
    public static final String className = "System.Xaml.Hosting.XamlBuildProvider";
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

    public XamlBuildProvider(Object instance) throws Throwable {
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

    public static XamlBuildProvider cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XamlBuildProvider(from.getJCOInstance());
    }

    // Constructors section
    

    public XamlBuildProvider() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public java.lang.String GetCustomString(CompilerResults results) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetCustomString", results == null ? null : results.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetGeneratedType(CompilerResults results) throws Throwable, system.web.HttpException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.xml.XmlException, system.FormatException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.xaml.XamlSchemaException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetGeneratedType = (JCObject)classInstance.Invoke("GetGeneratedType", results == null ? null : results.getJCOInstance());
            return new NetType(objGetGeneratedType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BuildProviderResultFlags GetResultFlags(CompilerResults results) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetResultFlags = (JCObject)classInstance.Invoke("GetResultFlags", results == null ? null : results.getJCOInstance());
            return new BuildProviderResultFlags(objGetResultFlags);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateCode(AssemblyBuilder assemblyBuilder) throws Throwable, system.web.HttpException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.xml.XmlException, system.FormatException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.xaml.XamlSchemaException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GenerateCode", assemblyBuilder == null ? null : assemblyBuilder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ProcessCompileErrors(CompilerResults results) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ProcessCompileErrors", results == null ? null : results.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public ICollection getVirtualPathDependencies() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.web.HttpException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("VirtualPathDependencies");
            return new ICollectionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompilerType getCodeCompilerType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CodeCompilerType");
            return new CompilerType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}