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

package system.net.networkinformation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section


/**
 * The base .NET class managing System.Net.NetworkInformation.IcmpV4Statistics, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class IcmpV4Statistics extends NetObject  {
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System";
    public static final String className = "System.Net.NetworkInformation.IcmpV4Statistics";
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

    public IcmpV4Statistics(Object instance) throws Throwable {
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

    public static IcmpV4Statistics castFrom(IJCOBridgeReflected from) throws Throwable {
        return new IcmpV4Statistics(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
    public long getAddressMaskRepliesReceived() throws Throwable {
        try {
            return (long)classInstance.Get("AddressMaskRepliesReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getAddressMaskRepliesSent() throws Throwable {
        try {
            return (long)classInstance.Get("AddressMaskRepliesSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getAddressMaskRequestsReceived() throws Throwable {
        try {
            return (long)classInstance.Get("AddressMaskRequestsReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getAddressMaskRequestsSent() throws Throwable {
        try {
            return (long)classInstance.Get("AddressMaskRequestsSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getDestinationUnreachableMessagesReceived() throws Throwable {
        try {
            return (long)classInstance.Get("DestinationUnreachableMessagesReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getDestinationUnreachableMessagesSent() throws Throwable {
        try {
            return (long)classInstance.Get("DestinationUnreachableMessagesSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getEchoRepliesReceived() throws Throwable {
        try {
            return (long)classInstance.Get("EchoRepliesReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getEchoRepliesSent() throws Throwable {
        try {
            return (long)classInstance.Get("EchoRepliesSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getEchoRequestsReceived() throws Throwable {
        try {
            return (long)classInstance.Get("EchoRequestsReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getEchoRequestsSent() throws Throwable {
        try {
            return (long)classInstance.Get("EchoRequestsSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getErrorsReceived() throws Throwable {
        try {
            return (long)classInstance.Get("ErrorsReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getErrorsSent() throws Throwable {
        try {
            return (long)classInstance.Get("ErrorsSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getMessagesReceived() throws Throwable {
        try {
            return (long)classInstance.Get("MessagesReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getMessagesSent() throws Throwable {
        try {
            return (long)classInstance.Get("MessagesSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getParameterProblemsReceived() throws Throwable {
        try {
            return (long)classInstance.Get("ParameterProblemsReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getParameterProblemsSent() throws Throwable {
        try {
            return (long)classInstance.Get("ParameterProblemsSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getRedirectsReceived() throws Throwable {
        try {
            return (long)classInstance.Get("RedirectsReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getRedirectsSent() throws Throwable {
        try {
            return (long)classInstance.Get("RedirectsSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getSourceQuenchesReceived() throws Throwable {
        try {
            return (long)classInstance.Get("SourceQuenchesReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getSourceQuenchesSent() throws Throwable {
        try {
            return (long)classInstance.Get("SourceQuenchesSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getTimeExceededMessagesReceived() throws Throwable {
        try {
            return (long)classInstance.Get("TimeExceededMessagesReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getTimeExceededMessagesSent() throws Throwable {
        try {
            return (long)classInstance.Get("TimeExceededMessagesSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getTimestampRepliesReceived() throws Throwable {
        try {
            return (long)classInstance.Get("TimestampRepliesReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getTimestampRepliesSent() throws Throwable {
        try {
            return (long)classInstance.Get("TimestampRepliesSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getTimestampRequestsReceived() throws Throwable {
        try {
            return (long)classInstance.Get("TimestampRequestsReceived");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getTimestampRequestsSent() throws Throwable {
        try {
            return (long)classInstance.Get("TimestampRequestsSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}