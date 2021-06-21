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

package system.diagnostics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.StackFrame;


/**
 * The base .NET class managing System.Diagnostics.StackTrace, System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.StackTrace" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.StackTrace</a>
 */
public class StackTrace extends NetObject  {
    /**
     * Fully assembly qualified name: System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e
     */
    public static final String assemblyFullName = "System.Private.CoreLib, Version=5.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
    /**
     * Assembly name: System.Private.CoreLib
     */
    public static final String assemblyShortName = "System.Private.CoreLib";
    /**
     * Qualified class name: System.Diagnostics.StackTrace
     */
    public static final String className = "System.Diagnostics.StackTrace";
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

    public StackTrace(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link StackTrace}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link StackTrace} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static StackTrace cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new StackTrace(from.getJCOInstance());
    }

    // Constructors section
    
    public StackTrace() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.PlatformNotSupportedException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StackTrace(boolean fNeedFileInfo) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.PlatformNotSupportedException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(fNeedFileInfo));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StackTrace(int skipFrames) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(skipFrames));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StackTrace(int skipFrames, boolean fNeedFileInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(skipFrames, fNeedFileInfo));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StackTrace(StackFrame frame) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(frame == null ? null : frame.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StackTrace(NetException e) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(e == null ? null : e.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StackTrace(NetException e, boolean fNeedFileInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(e == null ? null : e.getJCOInstance(), fNeedFileInfo));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StackTrace(NetException e, int skipFrames) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(e == null ? null : e.getJCOInstance(), skipFrames));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StackTrace(NetException e, int skipFrames, boolean fNeedFileInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException, system.runtime.interopservices.ExternalException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(e == null ? null : e.getJCOInstance(), skipFrames, fNeedFileInfo));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public StackFrame GetFrame(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetFrame = (JCObject)classInstance.Invoke("GetFrame", index);
            return new StackFrame(objGetFrame);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StackFrame[] GetFrames() throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<StackFrame> resultingArrayList = new ArrayList<StackFrame>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFrames");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new StackFrame(resultingObject));
            }
            StackFrame[] resultingArray = new StackFrame[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public int getFrameCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("FrameCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}