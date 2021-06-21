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

package system.web.sessionstate;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.HttpContext;
import system.web.HttpStaticObjectsCollection;
import system.web.sessionstate.IHttpSessionState;
import system.web.sessionstate.IHttpSessionStateImplementation;
import system.EventArgs;
import system.runtime.serialization.ISurrogateSelector;
import system.runtime.serialization.ISurrogateSelectorImplementation;


/**
 * The base .NET class managing System.Web.SessionState.SessionStateUtility, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.SessionState.SessionStateUtility" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.SessionState.SessionStateUtility</a>
 */
public class SessionStateUtility extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.SessionState.SessionStateUtility
     */
    public static final String className = "System.Web.SessionState.SessionStateUtility";
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

    public SessionStateUtility(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SessionStateUtility}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SessionStateUtility} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SessionStateUtility cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SessionStateUtility(from.getJCOInstance());
    }

    // Constructors section
    
    public SessionStateUtility() throws Throwable {
    }

    
    // Methods section
    
    public static boolean IsSessionStateReadOnly(HttpContext context) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsSessionStateReadOnly", context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsSessionStateRequired(HttpContext context) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsSessionStateRequired", context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpStaticObjectsCollection GetSessionStaticObjects(HttpContext context) throws Throwable, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetSessionStaticObjects = (JCObject)classType.Invoke("GetSessionStaticObjects", context == null ? null : context.getJCOInstance());
            return new HttpStaticObjectsCollection(objGetSessionStaticObjects);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IHttpSessionState GetHttpSessionStateFromContext(HttpContext context) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetHttpSessionStateFromContext = (JCObject)classType.Invoke("GetHttpSessionStateFromContext", context == null ? null : context.getJCOInstance());
            return new IHttpSessionStateImplementation(objGetHttpSessionStateFromContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void AddHttpSessionStateToContext(HttpContext context, IHttpSessionState container) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("AddHttpSessionStateToContext", context == null ? null : context.getJCOInstance(), container == null ? null : container.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RaiseSessionEnd(IHttpSessionState session, NetObject eventSource, EventArgs eventArgs) throws Throwable, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.MissingMethodException, system.resources.MissingManifestResourceException, system.web.HttpException, system.ArgumentOutOfRangeException, system.io.IOException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException, system.threading.ThreadStateException, system.OutOfMemoryException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RaiseSessionEnd", session == null ? null : session.getJCOInstance(), eventSource == null ? null : eventSource.getJCOInstance(), eventArgs == null ? null : eventArgs.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RemoveHttpSessionStateFromContext(HttpContext context) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RemoveHttpSessionStateFromContext", context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static ISurrogateSelector getSerializationSurrogateSelector() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SerializationSurrogateSelector");
            return new ISurrogateSelectorImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setSerializationSurrogateSelector(ISurrogateSelector SerializationSurrogateSelector) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("SerializationSurrogateSelector", SerializationSurrogateSelector == null ? null : SerializationSurrogateSelector.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}