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

package system.security.accesscontrol;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Security.AccessControl.ControlFlags, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ControlFlags extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Security.AccessControl.ControlFlags";
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

    public ControlFlags(Object instance) {
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

    public ControlFlags() {
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

    final static ControlFlags getFrom(JCEnum object, String value) {
        try {
            return new ControlFlags(object.fromValue(value));
        } catch (JCException e) {
            return new ControlFlags(object);
        }
    }

    // Enum fields section
    
    public static ControlFlags None = getFrom(enumReflected, "None");
    public static ControlFlags OwnerDefaulted = getFrom(enumReflected, "OwnerDefaulted");
    public static ControlFlags GroupDefaulted = getFrom(enumReflected, "GroupDefaulted");
    public static ControlFlags DiscretionaryAclPresent = getFrom(enumReflected, "DiscretionaryAclPresent");
    public static ControlFlags DiscretionaryAclDefaulted = getFrom(enumReflected, "DiscretionaryAclDefaulted");
    public static ControlFlags SystemAclPresent = getFrom(enumReflected, "SystemAclPresent");
    public static ControlFlags SystemAclDefaulted = getFrom(enumReflected, "SystemAclDefaulted");
    public static ControlFlags DiscretionaryAclUntrusted = getFrom(enumReflected, "DiscretionaryAclUntrusted");
    public static ControlFlags ServerSecurity = getFrom(enumReflected, "ServerSecurity");
    public static ControlFlags DiscretionaryAclAutoInheritRequired = getFrom(enumReflected, "DiscretionaryAclAutoInheritRequired");
    public static ControlFlags SystemAclAutoInheritRequired = getFrom(enumReflected, "SystemAclAutoInheritRequired");
    public static ControlFlags DiscretionaryAclAutoInherited = getFrom(enumReflected, "DiscretionaryAclAutoInherited");
    public static ControlFlags SystemAclAutoInherited = getFrom(enumReflected, "SystemAclAutoInherited");
    public static ControlFlags DiscretionaryAclProtected = getFrom(enumReflected, "DiscretionaryAclProtected");
    public static ControlFlags SystemAclProtected = getFrom(enumReflected, "SystemAclProtected");
    public static ControlFlags RMControlValid = getFrom(enumReflected, "RMControlValid");
    public static ControlFlags SelfRelative = getFrom(enumReflected, "SelfRelative");


    // Flags management section

    public ControlFlags add(ControlFlags val) throws Throwable {
        return new ControlFlags(NetEnum.add(classInstance, val.classInstance));
    }

    public ControlFlags remove(ControlFlags val) throws Throwable {
        return new ControlFlags(NetEnum.remove(classInstance, val.classInstance));
    }

    public boolean is(ControlFlags val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public boolean has(ControlFlags val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}