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

package system.servicemodel.msmqintegration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.msmqintegration.MsmqIntegrationMessageProperty;
import system.servicemodel.channels.Message;
import system.Uri;


/**
 * The base .NET class managing System.ServiceModel.MsmqIntegration.MsmqIntegrationMessageProperty, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class MsmqIntegrationMessageProperty extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.MsmqIntegration.MsmqIntegrationMessageProperty";
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

    public MsmqIntegrationMessageProperty(Object instance) throws Throwable {
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

    public static MsmqIntegrationMessageProperty castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MsmqIntegrationMessageProperty(from.getJCOInstance());
    }

    // Constructors section
    
    
    public MsmqIntegrationMessageProperty() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static MsmqIntegrationMessageProperty Get(Message message) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objGet = (JCObject)classType.Invoke("Get", (Object)message.getJCOInstance());
            return new MsmqIntegrationMessageProperty(objGet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public NetObject getBody() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Body");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBody(NetObject Body) throws Throwable {
        try {
            classInstance.Set("Body", (Object)Body.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getAdministrationQueue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AdministrationQueue");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAdministrationQueue(Uri AdministrationQueue) throws Throwable {
        try {
            classInstance.Set("AdministrationQueue", (Object)AdministrationQueue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCorrelationId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CorrelationId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCorrelationId(java.lang.String CorrelationId) throws Throwable {
        try {
            classInstance.Set("CorrelationId", (Object)CorrelationId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getDestinationQueue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DestinationQueue");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDestinationQueue(Uri DestinationQueue) throws Throwable {
        try {
            classInstance.Set("DestinationQueue", (Object)DestinationQueue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getExtension() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Extension");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexExtension = 0; indexExtension < resultingArrayList.size(); indexExtension++ ) {
				resultingArray[indexExtension] = (byte)resultingArrayList.get(indexExtension);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExtension(byte[] Extension) throws Throwable {
        try {
            classInstance.Set("Extension", Extension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setId(java.lang.String Id) throws Throwable {
        try {
            classInstance.Set("Id", (Object)Id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLabel() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Label");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLabel(java.lang.String Label) throws Throwable {
        try {
            classInstance.Set("Label", (Object)Label);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getResponseQueue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ResponseQueue");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResponseQueue(Uri ResponseQueue) throws Throwable {
        try {
            classInstance.Set("ResponseQueue", (Object)ResponseQueue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSenderId() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SenderId");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSenderId = 0; indexSenderId < resultingArrayList.size(); indexSenderId++ ) {
				resultingArray[indexSenderId] = (byte)resultingArrayList.get(indexSenderId);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSenderId(byte[] SenderId) throws Throwable {
        try {
            classInstance.Set("SenderId", SenderId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}