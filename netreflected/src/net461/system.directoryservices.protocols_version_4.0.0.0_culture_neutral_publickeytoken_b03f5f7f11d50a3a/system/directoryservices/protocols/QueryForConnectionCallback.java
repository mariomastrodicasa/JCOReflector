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

package system.directoryservices.protocols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.protocols.LdapConnection;
import system.directoryservices.protocols.LdapDirectoryIdentifier;
import system.net.NetworkCredential;
import system.directoryservices.protocols.IQueryForConnectionCallback;
/**
 * The base .NET class managing System.DirectoryServices.Protocols.QueryForConnectionCallback, System.DirectoryServices.Protocols, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link JCDelegate}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.Protocols.QueryForConnectionCallback" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.Protocols.QueryForConnectionCallback</a>
 */
public class QueryForConnectionCallback extends JCDelegate implements IJCEventEmit, IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: System.DirectoryServices.Protocols, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices.Protocols, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices.Protocols
     */
    public static final String assemblyShortName = "System.DirectoryServices.Protocols";
    /**
     * Qualified class name: System.DirectoryServices.Protocols.QueryForConnectionCallback
     */
    public static final String className = "System.DirectoryServices.Protocols.QueryForConnectionCallback";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    JCObject classInstance = null;
    IQueryForConnectionCallback callerInstance = null;

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
        return this;
    }

    public JCType getJCOType() {
        return classType;
    }

    public final Object EventRaised(Object... argsFromJCOBridge) {
        try
        {
            LdapConnection primaryConnection = argsFromJCOBridge[0] == null ? null : new LdapConnection(argsFromJCOBridge[0]);
            LdapConnection referralFromConnection = argsFromJCOBridge[1] == null ? null : new LdapConnection(argsFromJCOBridge[1]);
            java.lang.String newDistinguishedName = argsFromJCOBridge[2] == null ? null : (java.lang.String)argsFromJCOBridge[2];
            LdapDirectoryIdentifier identifier = argsFromJCOBridge[3] == null ? null : new LdapDirectoryIdentifier(argsFromJCOBridge[3]);
            NetworkCredential credential = argsFromJCOBridge[4] == null ? null : new NetworkCredential(argsFromJCOBridge[4]);
            long currentUserToken = argsFromJCOBridge[5] == null ? null : (long)argsFromJCOBridge[5];


            LdapConnection retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(primaryConnection, referralFromConnection, newDistinguishedName, identifier, credential, currentUserToken);
            } else {
                retVal = Invoke(primaryConnection, referralFromConnection, newDistinguishedName, identifier, credential, currentUserToken);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
			return null;
        }
    }

    public final Object DelegateInvoked(Object... argsFromJCOBridge) {
        try
        {
            LdapConnection primaryConnection = argsFromJCOBridge[0] == null ? null : new LdapConnection(argsFromJCOBridge[0]);
            LdapConnection referralFromConnection = argsFromJCOBridge[1] == null ? null : new LdapConnection(argsFromJCOBridge[1]);
            java.lang.String newDistinguishedName = argsFromJCOBridge[2] == null ? null : (java.lang.String)argsFromJCOBridge[2];
            LdapDirectoryIdentifier identifier = argsFromJCOBridge[3] == null ? null : new LdapDirectoryIdentifier(argsFromJCOBridge[3]);
            NetworkCredential credential = argsFromJCOBridge[4] == null ? null : new NetworkCredential(argsFromJCOBridge[4]);
            long currentUserToken = argsFromJCOBridge[5] == null ? null : (long)argsFromJCOBridge[5];


            LdapConnection retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(primaryConnection, referralFromConnection, newDistinguishedName, identifier, credential, currentUserToken);
            } else {
                retVal = Invoke(primaryConnection, referralFromConnection, newDistinguishedName, identifier, credential, currentUserToken);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
			return null;
        }
    }

    public QueryForConnectionCallback() {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public QueryForConnectionCallback(IQueryForConnectionCallback instance) {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }

    public QueryForConnectionCallback(Object instance) throws Throwable {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof IQueryForConnectionCallback) {
            callerInstance = (IQueryForConnectionCallback) instance;
        } else if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new UnsupportedOperationException(
                    String.format("Class %s is not supported.", instance.getClass().getTypeName()));
    }

    protected final static <T extends IJCOBridgeReflected> Object toObjectFromArray(T[] input) {
        return JCOBridgeInstance.toObjectFromArray(input);
    }

    static protected Throwable translateException(JCNativeException ne) throws Throwable {
        return JCOBridgeInstance.translateException(ne);
    }

    public LdapConnection DynamicInvoke(LdapConnection primaryConnection, LdapConnection referralFromConnection, java.lang.String newDistinguishedName, LdapDirectoryIdentifier identifier, NetworkCredential credential, long currentUserToken) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDynamicInvoke = (JCObject)classInstance.Invoke("DynamicInvoke", primaryConnection == null ? null : primaryConnection.getJCOInstance(), referralFromConnection == null ? null : referralFromConnection.getJCOInstance(), newDistinguishedName, identifier == null ? null : identifier.getJCOInstance(), credential == null ? null : credential.getJCOInstance(), currentUserToken);
            return new LdapConnection(objDynamicInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * Methods invoked in JVM when an event is raised in CLR 
     */
    public LdapConnection Invoke(LdapConnection primaryConnection, LdapConnection referralFromConnection, java.lang.String newDistinguishedName, LdapDirectoryIdentifier identifier, NetworkCredential credential, long currentUserToken) {
        return null;
    }
}