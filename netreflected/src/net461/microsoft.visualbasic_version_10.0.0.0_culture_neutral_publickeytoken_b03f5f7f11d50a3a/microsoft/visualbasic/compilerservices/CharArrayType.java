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

package microsoft.visualbasic.compilerservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section


/**
 * The base .NET class managing Microsoft.VisualBasic.CompilerServices.CharArrayType, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.CompilerServices.CharArrayType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.CompilerServices.CharArrayType</a>
 */
public class CharArrayType extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.VisualBasic
     */
    public static final String assemblyShortName = "Microsoft.VisualBasic";
    /**
     * Qualified class name: Microsoft.VisualBasic.CompilerServices.CharArrayType
     */
    public static final String className = "Microsoft.VisualBasic.CompilerServices.CharArrayType";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

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

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CharArrayType(Object instance) throws Throwable {
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
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CharArrayType}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CharArrayType} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CharArrayType cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CharArrayType(from.getJCOInstance());
    }

    // Constructors section
    
    public CharArrayType() throws Throwable {
    }



    
    // Methods section
    
    public static char[] FromObject(NetObject Value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("FromObject", Value == null ? null : Value.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            char[] resultingArray = new char[resultingArrayList.size()];
            for(int indexFromObject = 0; indexFromObject < resultingArrayList.size(); indexFromObject++ ) {
				resultingArray[indexFromObject] = (char)resultingArrayList.get(indexFromObject);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static char[] FromString(java.lang.String Value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("FromString", Value);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            char[] resultingArray = new char[resultingArrayList.size()];
            for(int indexFromString = 0; indexFromString < resultingArrayList.size(); indexFromString++ ) {
				resultingArray[indexFromString] = (char)resultingArrayList.get(indexFromString);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}