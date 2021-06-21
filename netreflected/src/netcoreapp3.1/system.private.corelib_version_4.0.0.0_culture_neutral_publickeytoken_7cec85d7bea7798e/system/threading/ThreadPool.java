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

package system.threading;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.interopservices.SafeHandle;
import system.threading.WaitCallback;
import system.threading.IThreadPoolWorkItem;
import system.threading.IThreadPoolWorkItemImplementation;
import system.threading.RegisteredWaitHandle;
import system.threading.WaitHandle;
import system.threading.WaitOrTimerCallback;
import system.TimeSpan;
import system.UInt32;


/**
 * The base .NET class managing System.Threading.ThreadPool, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Threading.ThreadPool" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Threading.ThreadPool</a>
 */
public class ThreadPool extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Threading.ThreadPool
     */
    public static final String className = "System.Threading.ThreadPool";
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

    public ThreadPool(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ThreadPool}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ThreadPool} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ThreadPool cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ThreadPool(from.getJCOInstance());
    }

    // Constructors section
    
    public ThreadPool() throws Throwable {
    }

    
    // Methods section
    
    public static boolean BindHandle(SafeHandle osHandle) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("BindHandle", osHandle == null ? null : osHandle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean QueueUserWorkItem(WaitCallback callBack) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.ArgumentOutOfRangeException, system.threading.LockRecursionException, system.InvalidOperationException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("QueueUserWorkItem", callBack);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean QueueUserWorkItem(WaitCallback callBack, NetObject state) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("QueueUserWorkItem", callBack, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SetMaxThreads(int workerThreads, int completionPortThreads) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("SetMaxThreads", workerThreads, completionPortThreads);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SetMinThreads(int workerThreads, int completionPortThreads) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("SetMinThreads", workerThreads, completionPortThreads);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean UnsafeQueueUserWorkItem(IThreadPoolWorkItem callBack, boolean preferLocal) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("UnsafeQueueUserWorkItem", callBack == null ? null : callBack.getJCOInstance(), preferLocal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean UnsafeQueueUserWorkItem(WaitCallback callBack, NetObject state) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("UnsafeQueueUserWorkItem", callBack, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegisteredWaitHandle RegisterWaitForSingleObject(WaitHandle waitObject, WaitOrTimerCallback callBack, NetObject state, int millisecondsTimeOutInterval, boolean executeOnlyOnce) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRegisterWaitForSingleObject = (JCObject)classType.Invoke("RegisterWaitForSingleObject", waitObject == null ? null : waitObject.getJCOInstance(), callBack, state == null ? null : state.getJCOInstance(), millisecondsTimeOutInterval, executeOnlyOnce);
            return new RegisteredWaitHandle(objRegisterWaitForSingleObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegisteredWaitHandle RegisterWaitForSingleObject(WaitHandle waitObject, WaitOrTimerCallback callBack, NetObject state, long millisecondsTimeOutInterval, boolean executeOnlyOnce) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRegisterWaitForSingleObject = (JCObject)classType.Invoke("RegisterWaitForSingleObject", waitObject == null ? null : waitObject.getJCOInstance(), callBack, state == null ? null : state.getJCOInstance(), millisecondsTimeOutInterval, executeOnlyOnce);
            return new RegisteredWaitHandle(objRegisterWaitForSingleObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegisteredWaitHandle RegisterWaitForSingleObject(WaitHandle waitObject, WaitOrTimerCallback callBack, NetObject state, TimeSpan timeout, boolean executeOnlyOnce) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRegisterWaitForSingleObject = (JCObject)classType.Invoke("RegisterWaitForSingleObject", waitObject == null ? null : waitObject.getJCOInstance(), callBack, state == null ? null : state.getJCOInstance(), timeout == null ? null : timeout.getJCOInstance(), executeOnlyOnce);
            return new RegisteredWaitHandle(objRegisterWaitForSingleObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegisteredWaitHandle RegisterWaitForSingleObject(WaitHandle waitObject, WaitOrTimerCallback callBack, NetObject state, UInt32 millisecondsTimeOutInterval, boolean executeOnlyOnce) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRegisterWaitForSingleObject = (JCObject)classType.Invoke("RegisterWaitForSingleObject", waitObject == null ? null : waitObject.getJCOInstance(), callBack, state == null ? null : state.getJCOInstance(), millisecondsTimeOutInterval == null ? null : millisecondsTimeOutInterval.getJCOInstance(), executeOnlyOnce);
            return new RegisteredWaitHandle(objRegisterWaitForSingleObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegisteredWaitHandle UnsafeRegisterWaitForSingleObject(WaitHandle waitObject, WaitOrTimerCallback callBack, NetObject state, int millisecondsTimeOutInterval, boolean executeOnlyOnce) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUnsafeRegisterWaitForSingleObject = (JCObject)classType.Invoke("UnsafeRegisterWaitForSingleObject", waitObject == null ? null : waitObject.getJCOInstance(), callBack, state == null ? null : state.getJCOInstance(), millisecondsTimeOutInterval, executeOnlyOnce);
            return new RegisteredWaitHandle(objUnsafeRegisterWaitForSingleObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegisteredWaitHandle UnsafeRegisterWaitForSingleObject(WaitHandle waitObject, WaitOrTimerCallback callBack, NetObject state, long millisecondsTimeOutInterval, boolean executeOnlyOnce) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUnsafeRegisterWaitForSingleObject = (JCObject)classType.Invoke("UnsafeRegisterWaitForSingleObject", waitObject == null ? null : waitObject.getJCOInstance(), callBack, state == null ? null : state.getJCOInstance(), millisecondsTimeOutInterval, executeOnlyOnce);
            return new RegisteredWaitHandle(objUnsafeRegisterWaitForSingleObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegisteredWaitHandle UnsafeRegisterWaitForSingleObject(WaitHandle waitObject, WaitOrTimerCallback callBack, NetObject state, TimeSpan timeout, boolean executeOnlyOnce) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUnsafeRegisterWaitForSingleObject = (JCObject)classType.Invoke("UnsafeRegisterWaitForSingleObject", waitObject == null ? null : waitObject.getJCOInstance(), callBack, state == null ? null : state.getJCOInstance(), timeout == null ? null : timeout.getJCOInstance(), executeOnlyOnce);
            return new RegisteredWaitHandle(objUnsafeRegisterWaitForSingleObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RegisteredWaitHandle UnsafeRegisterWaitForSingleObject(WaitHandle waitObject, WaitOrTimerCallback callBack, NetObject state, UInt32 millisecondsTimeOutInterval, boolean executeOnlyOnce) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objUnsafeRegisterWaitForSingleObject = (JCObject)classType.Invoke("UnsafeRegisterWaitForSingleObject", waitObject == null ? null : waitObject.getJCOInstance(), callBack, state == null ? null : state.getJCOInstance(), millisecondsTimeOutInterval == null ? null : millisecondsTimeOutInterval.getJCOInstance(), executeOnlyOnce);
            return new RegisteredWaitHandle(objUnsafeRegisterWaitForSingleObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static int getThreadCount() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("ThreadCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long getCompletedWorkItemCount() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Get("CompletedWorkItemCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long getPendingWorkItemCount() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.threading.LockRecursionException, system.InvalidOperationException, system.threading.SynchronizationLockException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Get("PendingWorkItemCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}