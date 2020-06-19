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
 *      This code was generated from a template using JCOReflector version 1.1.0.0
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
import system.diagnostics.symbolstore.ISymbolDocument;
import system.diagnostics.symbolstore.ISymbolDocumentImplementation;
import system.Guid;
import system.diagnostics.symbolstore.ISymbolMethod;
import system.diagnostics.symbolstore.ISymbolMethodImplementation;
import system.diagnostics.symbolstore.SymbolToken;
import system.diagnostics.symbolstore.ISymbolVariable;
import system.diagnostics.symbolstore.ISymbolVariableImplementation;
import system.diagnostics.symbolstore.ISymbolNamespace;
import system.diagnostics.symbolstore.ISymbolNamespaceImplementation;


/**
 * The base .NET class managing System.Diagnostics.SymbolStore.ISymbolReader, System.Diagnostics.StackTrace, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ISymbolReaderImplementation extends NetObject implements ISymbolReader {
    public static final String assemblyFullName = "System.Diagnostics.StackTrace, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Diagnostics.StackTrace";
    public static final String className = "System.Diagnostics.SymbolStore.ISymbolReader";
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

    public ISymbolReaderImplementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static ISymbolReader ToISymbolReader(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ISymbolReaderImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public ISymbolDocument GetDocument(java.lang.String url, Guid language, Guid languageVendor, Guid documentType) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDocument = (JCObject)classInstance.Invoke("GetDocument", url, language == null ? null : language.getJCOInstance(), languageVendor == null ? null : languageVendor.getJCOInstance(), documentType == null ? null : documentType.getJCOInstance());
            return new ISymbolDocumentImplementation(objGetDocument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolDocument[] GetDocuments() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ISymbolDocument> resultingArrayList = new ArrayList<ISymbolDocument>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetDocuments");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ISymbolDocumentImplementation(resultingObject));
            }
            ISymbolDocument[] resultingArray = new ISymbolDocument[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolMethod GetMethod(SymbolToken method) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMethod = (JCObject)classInstance.Invoke("GetMethod", method == null ? null : method.getJCOInstance());
            return new ISymbolMethodImplementation(objGetMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolMethod GetMethod(SymbolToken method, int version) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMethod = (JCObject)classInstance.Invoke("GetMethod", method == null ? null : method.getJCOInstance(), version);
            return new ISymbolMethodImplementation(objGetMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ISymbolVariable[] GetVariables(SymbolToken parent) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ISymbolVariable> resultingArrayList = new ArrayList<ISymbolVariable>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetVariables", parent == null ? null : parent.getJCOInstance());
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

    public ISymbolVariable[] GetGlobalVariables() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ISymbolVariable> resultingArrayList = new ArrayList<ISymbolVariable>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetGlobalVariables");
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

    public ISymbolMethod GetMethodFromDocumentPosition(ISymbolDocument document, int line, int column) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetMethodFromDocumentPosition = (JCObject)classInstance.Invoke("GetMethodFromDocumentPosition", document == null ? null : document.getJCOInstance(), line, column);
            return new ISymbolMethodImplementation(objGetMethodFromDocumentPosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetSymAttribute(SymbolToken parent, java.lang.String name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetSymAttribute", parent == null ? null : parent.getJCOInstance(), name);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetSymAttribute = 0; indexGetSymAttribute < resultingArrayList.size(); indexGetSymAttribute++ ) {
				resultingArray[indexGetSymAttribute] = (byte)resultingArrayList.get(indexGetSymAttribute);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

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


    
    // Properties section
    
    public SymbolToken getUserEntryPoint() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("UserEntryPoint");
            return new SymbolToken(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}