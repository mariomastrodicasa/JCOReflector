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

package system.diagnostics.symbolstore;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.symbolstore.ISymbolNamespace;
import system.diagnostics.symbolstore.ISymbolNamespaceImplementation;
import system.diagnostics.symbolstore.ISymbolScope;
import system.diagnostics.symbolstore.ISymbolScopeImplementation;
import system.diagnostics.symbolstore.ISymbolVariable;
import system.diagnostics.symbolstore.ISymbolVariableImplementation;
import system.diagnostics.symbolstore.ISymbolMethod;
import system.diagnostics.symbolstore.ISymbolMethodImplementation;


/**
 * The base .NET class managing System.Diagnostics.SymbolStore.ISymbolScope, System.Diagnostics.StackTrace, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.SymbolStore.ISymbolScope" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.SymbolStore.ISymbolScope</a>
 */
public class ISymbolScopeImplementation extends NetObject implements ISymbolScope {
    /**
     * Fully assembly qualified name: System.Diagnostics.StackTrace, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Diagnostics.StackTrace, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Diagnostics.StackTrace
     */
    public static final String assemblyShortName = "System.Diagnostics.StackTrace";
    /**
     * Qualified class name: System.Diagnostics.SymbolStore.ISymbolScope
     */
    public static final String className = "System.Diagnostics.SymbolStore.ISymbolScope";
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

    public ISymbolScopeImplementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ISymbolScope}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ISymbolScope} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ISymbolScope ToISymbolScope(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ISymbolScopeImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public ISymbolNamespace[] GetNamespaces() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ISymbolNamespace> resultingArrayList = new ArrayList<ISymbolNamespace>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetNamespaces");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ISymbolNamespaceImplementation(resultingObject));
            }
            ISymbolNamespace[] resultingArray = new ISymbolNamespace[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolScope[] GetChildren() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ISymbolScope> resultingArrayList = new ArrayList<ISymbolScope>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetChildren");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ISymbolScopeImplementation(resultingObject));
            }
            ISymbolScope[] resultingArray = new ISymbolScope[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolVariable[] GetLocals() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ISymbolVariable> resultingArrayList = new ArrayList<ISymbolVariable>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetLocals");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ISymbolVariableImplementation(resultingObject));
            }
            ISymbolVariable[] resultingArray = new ISymbolVariable[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getEndOffset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("EndOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getStartOffset() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("StartOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolMethod getMethod() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Method");
            return new ISymbolMethodImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolScope getParent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new ISymbolScopeImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}