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

package system.workflow.componentmodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.ActivityExecutionContext;
import system.workflow.componentmodel.Activity;
import system.Guid;


/**
 * The base .NET class managing System.Workflow.ComponentModel.ActivityExecutionContextManager, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.ActivityExecutionContextManager" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Workflow.ComponentModel.ActivityExecutionContextManager</a>
 */
public class ActivityExecutionContextManager extends NetObject  {
    /**
     * Fully assembly qualified name: System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Workflow.ComponentModel
     */
    public static final String assemblyShortName = "System.Workflow.ComponentModel";
    /**
     * Qualified class name: System.Workflow.ComponentModel.ActivityExecutionContextManager
     */
    public static final String className = "System.Workflow.ComponentModel.ActivityExecutionContextManager";
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

    public ActivityExecutionContextManager(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ActivityExecutionContextManager}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ActivityExecutionContextManager} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ActivityExecutionContextManager cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ActivityExecutionContextManager(from.getJCOInstance());
    }

    // Constructors section
    
    public ActivityExecutionContextManager() throws Throwable {
    }



    
    // Methods section
    
    public ActivityExecutionContext CreateExecutionContext(Activity activity) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateExecutionContext = (JCObject)classInstance.Invoke("CreateExecutionContext", activity == null ? null : activity.getJCOInstance());
            return new ActivityExecutionContext(objCreateExecutionContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityExecutionContext GetExecutionContext(Activity activity) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetExecutionContext = (JCObject)classInstance.Invoke("GetExecutionContext", activity == null ? null : activity.getJCOInstance());
            return new ActivityExecutionContext(objGetExecutionContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityExecutionContext GetPersistedExecutionContext(Guid contextGuid) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.InvalidCastException, system.NullReferenceException, system.OverflowException, system.PlatformNotSupportedException, system.FormatException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetPersistedExecutionContext = (JCObject)classInstance.Invoke("GetPersistedExecutionContext", contextGuid == null ? null : contextGuid.getJCOInstance());
            return new ActivityExecutionContext(objGetPersistedExecutionContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CompleteExecutionContext(ActivityExecutionContext childContext) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CompleteExecutionContext", childContext == null ? null : childContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CompleteExecutionContext(ActivityExecutionContext childContext, boolean forcePersist) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CompleteExecutionContext", childContext == null ? null : childContext.getJCOInstance(), forcePersist);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}