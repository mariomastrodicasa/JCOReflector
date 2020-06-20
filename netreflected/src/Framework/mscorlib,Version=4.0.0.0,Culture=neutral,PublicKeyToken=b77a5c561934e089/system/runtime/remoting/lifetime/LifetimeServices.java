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

package system.runtime.remoting.lifetime;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.TimeSpan;


/**
 * The base .NET class managing System.Runtime.Remoting.Lifetime.LifetimeServices, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class LifetimeServices extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Runtime.Remoting.Lifetime.LifetimeServices";
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

    public LifetimeServices(Object instance) throws Throwable {
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }

    public static LifetimeServices cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new LifetimeServices(from.getJCOInstance());
    }

    // Constructors section
    

    public LifetimeServices() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public static TimeSpan getLeaseTime() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("LeaseTime");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setLeaseTime(TimeSpan LeaseTime) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("LeaseTime", LeaseTime == null ? null : LeaseTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan getRenewOnCallTime() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("RenewOnCallTime");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setRenewOnCallTime(TimeSpan RenewOnCallTime) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("RenewOnCallTime", RenewOnCallTime == null ? null : RenewOnCallTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan getSponsorshipTimeout() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("SponsorshipTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setSponsorshipTimeout(TimeSpan SponsorshipTimeout) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("SponsorshipTimeout", SponsorshipTimeout == null ? null : SponsorshipTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeSpan getLeaseManagerPollTime() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("LeaseManagerPollTime");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setLeaseManagerPollTime(TimeSpan LeaseManagerPollTime) throws Throwable, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("LeaseManagerPollTime", LeaseManagerPollTime == null ? null : LeaseManagerPollTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}