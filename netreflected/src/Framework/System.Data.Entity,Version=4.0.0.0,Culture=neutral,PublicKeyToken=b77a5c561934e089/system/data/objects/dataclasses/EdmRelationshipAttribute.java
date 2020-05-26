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

package system.data.objects.dataclasses;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.metadata.edm.RelationshipMultiplicity;


/**
 * The base .NET class managing System.Data.Objects.DataClasses.EdmRelationshipAttribute, System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class EdmRelationshipAttribute extends NetObject  {
    public static final String assemblyFullName = "System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data.Entity";
    public static final String className = "System.Data.Objects.DataClasses.EdmRelationshipAttribute";
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

    public EdmRelationshipAttribute(Object instance) throws Throwable {
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

    public static EdmRelationshipAttribute castFrom(IJCOBridgeReflected from) throws Throwable {
        return new EdmRelationshipAttribute(from.getJCOInstance());
    }

    // Constructors section
    
    
    public EdmRelationshipAttribute(java.lang.String relationshipNamespaceName, java.lang.String relationshipName, java.lang.String role1Name, RelationshipMultiplicity role1Multiplicity, NetType role1Type, java.lang.String role2Name, RelationshipMultiplicity role2Multiplicity, NetType role2Type) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)relationshipNamespaceName, (Object)relationshipName, (Object)role1Name, (Object)role1Multiplicity.getJCOInstance(), (Object)role1Type.getJCOInstance(), (Object)role2Name, (Object)role2Multiplicity.getJCOInstance(), (Object)role2Type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EdmRelationshipAttribute(java.lang.String relationshipNamespaceName, java.lang.String relationshipName, java.lang.String role1Name, RelationshipMultiplicity role1Multiplicity, NetType role1Type, java.lang.String role2Name, RelationshipMultiplicity role2Multiplicity, NetType role2Type, boolean isForeignKey) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)relationshipNamespaceName, (Object)relationshipName, (Object)role1Name, (Object)role1Multiplicity.getJCOInstance(), (Object)role1Type.getJCOInstance(), (Object)role2Name, (Object)role2Multiplicity.getJCOInstance(), (Object)role2Type.getJCOInstance(), isForeignKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Match(NetObject obj) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Match", (Object)obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDefaultAttribute() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsDefaultAttribute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getRelationshipNamespaceName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RelationshipNamespaceName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRelationshipName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RelationshipName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRole1Name() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Role1Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationshipMultiplicity getRole1Multiplicity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Role1Multiplicity");
            return new RelationshipMultiplicity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getRole1Type() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Role1Type");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRole2Name() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Role2Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RelationshipMultiplicity getRole2Multiplicity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Role2Multiplicity");
            return new RelationshipMultiplicity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getRole2Type() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Role2Type");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsForeignKey() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsForeignKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTypeId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TypeId");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}