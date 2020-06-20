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

package system.web;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Web.RequestNotification, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class RequestNotification extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.RequestNotification";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
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

    public RequestNotification(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public RequestNotification() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
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

    final static RequestNotification getFrom(JCEnum object, String value) {
        try {
            return new RequestNotification(object.fromValue(value));
        } catch (JCException e) {
            return new RequestNotification(object);
        }
    }

    // Enum fields section
    
    public static RequestNotification BeginRequest = getFrom(enumReflected, "BeginRequest");
    public static RequestNotification AuthenticateRequest = getFrom(enumReflected, "AuthenticateRequest");
    public static RequestNotification AuthorizeRequest = getFrom(enumReflected, "AuthorizeRequest");
    public static RequestNotification ResolveRequestCache = getFrom(enumReflected, "ResolveRequestCache");
    public static RequestNotification MapRequestHandler = getFrom(enumReflected, "MapRequestHandler");
    public static RequestNotification AcquireRequestState = getFrom(enumReflected, "AcquireRequestState");
    public static RequestNotification PreExecuteRequestHandler = getFrom(enumReflected, "PreExecuteRequestHandler");
    public static RequestNotification ExecuteRequestHandler = getFrom(enumReflected, "ExecuteRequestHandler");
    public static RequestNotification ReleaseRequestState = getFrom(enumReflected, "ReleaseRequestState");
    public static RequestNotification UpdateRequestCache = getFrom(enumReflected, "UpdateRequestCache");
    public static RequestNotification LogRequest = getFrom(enumReflected, "LogRequest");
    public static RequestNotification EndRequest = getFrom(enumReflected, "EndRequest");
    public static RequestNotification SendResponse = getFrom(enumReflected, "SendResponse");


    // Flags management section

    public RequestNotification add(RequestNotification val) throws Throwable {
        return new RequestNotification(NetEnum.add(classInstance, val.classInstance));
    }

    public RequestNotification remove(RequestNotification val) throws Throwable {
        return new RequestNotification(NetEnum.remove(classInstance, val.classInstance));
    }

    public boolean is(RequestNotification val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public boolean has(RequestNotification val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}