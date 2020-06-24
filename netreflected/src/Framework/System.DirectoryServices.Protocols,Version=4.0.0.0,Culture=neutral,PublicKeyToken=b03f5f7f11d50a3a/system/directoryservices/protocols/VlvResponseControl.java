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

package system.directoryservices.protocols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.protocols.ResultCode;


/**
 * The base .NET class managing System.DirectoryServices.Protocols.VlvResponseControl, System.DirectoryServices.Protocols, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class VlvResponseControl extends NetObject  {
    public static final String assemblyFullName = "System.DirectoryServices.Protocols, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.DirectoryServices.Protocols";
    public static final String className = "System.DirectoryServices.Protocols.VlvResponseControl";
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

    public VlvResponseControl(Object instance) throws Throwable {
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

    public static VlvResponseControl cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new VlvResponseControl(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public byte[] GetValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetValue");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetValue = 0; indexGetValue < resultingArrayList.size(); indexGetValue++ ) {
				resultingArray[indexGetValue] = (byte)resultingArrayList.get(indexGetValue);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsCritical() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCritical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsCritical(boolean IsCritical) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsCritical", IsCritical);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getServerSide() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("ServerSide");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServerSide(boolean ServerSide) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ServerSide", ServerSide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getContextId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ContextId");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexContextId = 0; indexContextId < resultingArrayList.size(); indexContextId++ ) {
				resultingArray[indexContextId] = (byte)resultingArrayList.get(indexContextId);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getContentCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("ContentCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTargetPosition() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("TargetPosition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ResultCode getResult() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Result");
            return new ResultCode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Type");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}