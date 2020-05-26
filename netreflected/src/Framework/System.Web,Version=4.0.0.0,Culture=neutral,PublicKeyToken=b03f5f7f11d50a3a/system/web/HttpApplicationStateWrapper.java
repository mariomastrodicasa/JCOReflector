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

package system.web;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.HttpApplicationState;
import system.Array;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.web.HttpApplicationStateBase;
import system.web.HttpStaticObjectsCollectionBase;


/**
 * The base .NET class managing System.Web.HttpApplicationStateWrapper, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class HttpApplicationStateWrapper extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.HttpApplicationStateWrapper";
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

    public HttpApplicationStateWrapper(Object instance) throws Throwable {
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

    public static HttpApplicationStateWrapper castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HttpApplicationStateWrapper(from.getJCOInstance());
    }

    // Constructors section
    
    
    public HttpApplicationStateWrapper(HttpApplicationState httpApplicationState) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)httpApplicationState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Add(java.lang.String name, NetObject value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            classInstance.Invoke("Add", (Object)name, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Array array, int index) throws Throwable {
        try {
            classInstance.Invoke("CopyTo", (Object)array.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Get(int index) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGet = (JCObject)classInstance.Invoke("Get", index);
            return new NetObject(objGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Get(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            JCObject objGet = (JCObject)classInstance.Invoke("Get", (Object)name);
            return new NetObject(objGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetKey(int index) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetKey", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable, system.ArgumentNullException, system.runtime.serialization.SerializationException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("GetObjectData", (Object)info.getJCOInstance(), (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Lock() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Lock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnDeserialization(NetObject sender) throws Throwable, system.runtime.serialization.SerializationException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            classInstance.Invoke("OnDeserialization", (Object)sender.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            classInstance.Invoke("Remove", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAll() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            classInstance.Invoke("RemoveAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAt(int index) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Set(java.lang.String name, NetObject value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            classInstance.Invoke("Set", (Object)name, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UnLock() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            classInstance.Invoke("UnLock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String[] getAllKeys() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("AllKeys");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexAllKeys = 0; indexAllKeys < resultingArrayList.size(); indexAllKeys++ ) {
				resultingArray[indexAllKeys] = (java.lang.String)resultingArrayList.get(indexAllKeys);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpApplicationStateBase getContents() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Contents");
            return new HttpApplicationStateBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSynchronized() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSynchronized");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getSyncRoot() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SyncRoot");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpStaticObjectsCollectionBase getStaticObjects() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StaticObjects");
            return new HttpStaticObjectsCollectionBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}