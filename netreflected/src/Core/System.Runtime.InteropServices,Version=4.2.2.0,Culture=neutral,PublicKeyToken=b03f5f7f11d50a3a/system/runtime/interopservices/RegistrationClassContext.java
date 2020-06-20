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

package system.runtime.interopservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Runtime.InteropServices.RegistrationClassContext, System.Runtime.InteropServices, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class RegistrationClassContext extends NetObject  {
    public static final String assemblyFullName = "System.Runtime.InteropServices, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Runtime.InteropServices";
    public static final String className = "System.Runtime.InteropServices.RegistrationClassContext";
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

    public RegistrationClassContext(Object instance) {
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

    public RegistrationClassContext() {
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

    final static RegistrationClassContext getFrom(JCEnum object, String value) {
        try {
            return new RegistrationClassContext(object.fromValue(value));
        } catch (JCException e) {
            return new RegistrationClassContext(object);
        }
    }

    // Enum fields section
    
    public static RegistrationClassContext InProcessServer = getFrom(enumReflected, "InProcessServer");
    public static RegistrationClassContext InProcessHandler = getFrom(enumReflected, "InProcessHandler");
    public static RegistrationClassContext LocalServer = getFrom(enumReflected, "LocalServer");
    public static RegistrationClassContext InProcessServer16 = getFrom(enumReflected, "InProcessServer16");
    public static RegistrationClassContext RemoteServer = getFrom(enumReflected, "RemoteServer");
    public static RegistrationClassContext InProcessHandler16 = getFrom(enumReflected, "InProcessHandler16");
    public static RegistrationClassContext Reserved1 = getFrom(enumReflected, "Reserved1");
    public static RegistrationClassContext Reserved2 = getFrom(enumReflected, "Reserved2");
    public static RegistrationClassContext Reserved3 = getFrom(enumReflected, "Reserved3");
    public static RegistrationClassContext Reserved4 = getFrom(enumReflected, "Reserved4");
    public static RegistrationClassContext NoCodeDownload = getFrom(enumReflected, "NoCodeDownload");
    public static RegistrationClassContext Reserved5 = getFrom(enumReflected, "Reserved5");
    public static RegistrationClassContext NoCustomMarshal = getFrom(enumReflected, "NoCustomMarshal");
    public static RegistrationClassContext EnableCodeDownload = getFrom(enumReflected, "EnableCodeDownload");
    public static RegistrationClassContext NoFailureLog = getFrom(enumReflected, "NoFailureLog");
    public static RegistrationClassContext DisableActivateAsActivator = getFrom(enumReflected, "DisableActivateAsActivator");
    public static RegistrationClassContext EnableActivateAsActivator = getFrom(enumReflected, "EnableActivateAsActivator");
    public static RegistrationClassContext FromDefaultContext = getFrom(enumReflected, "FromDefaultContext");


    // Flags management section

    public RegistrationClassContext add(RegistrationClassContext val) throws Throwable {
        return new RegistrationClassContext(NetEnum.add(classInstance, val.classInstance));
    }

    public RegistrationClassContext remove(RegistrationClassContext val) throws Throwable {
        return new RegistrationClassContext(NetEnum.remove(classInstance, val.classInstance));
    }

    public boolean is(RegistrationClassContext val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public boolean has(RegistrationClassContext val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}