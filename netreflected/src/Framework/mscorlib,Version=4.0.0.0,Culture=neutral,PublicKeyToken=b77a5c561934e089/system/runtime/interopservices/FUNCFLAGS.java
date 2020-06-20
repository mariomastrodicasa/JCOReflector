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
 * The base .NET class managing System.Runtime.InteropServices.FUNCFLAGS, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class FUNCFLAGS extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Runtime.InteropServices.FUNCFLAGS";
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

    public FUNCFLAGS(Object instance) {
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

    public FUNCFLAGS() {
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

    final static FUNCFLAGS getFrom(JCEnum object, String value) {
        try {
            return new FUNCFLAGS(object.fromValue(value));
        } catch (JCException e) {
            return new FUNCFLAGS(object);
        }
    }

    // Enum fields section
    
    public static FUNCFLAGS FUNCFLAG_FRESTRICTED = getFrom(enumReflected, "FUNCFLAG_FRESTRICTED");
    public static FUNCFLAGS FUNCFLAG_FSOURCE = getFrom(enumReflected, "FUNCFLAG_FSOURCE");
    public static FUNCFLAGS FUNCFLAG_FBINDABLE = getFrom(enumReflected, "FUNCFLAG_FBINDABLE");
    public static FUNCFLAGS FUNCFLAG_FREQUESTEDIT = getFrom(enumReflected, "FUNCFLAG_FREQUESTEDIT");
    public static FUNCFLAGS FUNCFLAG_FDISPLAYBIND = getFrom(enumReflected, "FUNCFLAG_FDISPLAYBIND");
    public static FUNCFLAGS FUNCFLAG_FDEFAULTBIND = getFrom(enumReflected, "FUNCFLAG_FDEFAULTBIND");
    public static FUNCFLAGS FUNCFLAG_FHIDDEN = getFrom(enumReflected, "FUNCFLAG_FHIDDEN");
    public static FUNCFLAGS FUNCFLAG_FUSESGETLASTERROR = getFrom(enumReflected, "FUNCFLAG_FUSESGETLASTERROR");
    public static FUNCFLAGS FUNCFLAG_FDEFAULTCOLLELEM = getFrom(enumReflected, "FUNCFLAG_FDEFAULTCOLLELEM");
    public static FUNCFLAGS FUNCFLAG_FUIDEFAULT = getFrom(enumReflected, "FUNCFLAG_FUIDEFAULT");
    public static FUNCFLAGS FUNCFLAG_FNONBROWSABLE = getFrom(enumReflected, "FUNCFLAG_FNONBROWSABLE");
    public static FUNCFLAGS FUNCFLAG_FREPLACEABLE = getFrom(enumReflected, "FUNCFLAG_FREPLACEABLE");
    public static FUNCFLAGS FUNCFLAG_FIMMEDIATEBIND = getFrom(enumReflected, "FUNCFLAG_FIMMEDIATEBIND");


    // Flags management section

    public FUNCFLAGS add(FUNCFLAGS val) throws Throwable {
        return new FUNCFLAGS(NetEnum.add(classInstance, val.classInstance));
    }

    public FUNCFLAGS remove(FUNCFLAGS val) throws Throwable {
        return new FUNCFLAGS(NetEnum.remove(classInstance, val.classInstance));
    }

    public boolean is(FUNCFLAGS val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public boolean has(FUNCFLAGS val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}